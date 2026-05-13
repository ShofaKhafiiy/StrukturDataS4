package org.demo4.task1;

import java.util.LinkedList;
import java.util.Queue;

public class StationHierarchy {


    private StationNode root;

    public void setRoot(StationNode root) {

        this.root = root;
    }


    public StationNode getRoot() {

        return root;
    }



    public StationNode findStation(String stationCode) {

        return findRecursive(root, stationCode);
    }

    private StationNode findRecursive(StationNode current,
                                      String stationCode) {

        // Base Case
        if (current == null) {
            return null;
        }

        // Ketemu
        if (current.getStationCode()
                .equalsIgnoreCase(stationCode)) {

            return current;
        }

        // Recursive Search ke semua child
        for (StationNode child : current.getChildren()) {

            StationNode found =
                    findRecursive(child, stationCode);

            if (found != null) {
                return found;
            }
        }

        return null;
    }



    public void addStation(String parentCode,
                           StationNode newStation) {

        // CEK DUPLIKAT
        if (findStation(newStation.getStationCode()) != null) {

            System.out.println(
                    "\n[FAILED] Station Code already exists!"
            );

            return;
        }

        // CEK SELF PARENT
        if (parentCode.equalsIgnoreCase(
                newStation.getStationCode())) {

            System.out.println(
                    "\n[FAILED] Station cannot be its own parent!"
            );

            return;
        }

        // CARI PARENT
        StationNode parent =
                findStation(parentCode);

        if (parent != null) {

            parent.addChild(newStation);

            System.out.println(
                    "\n[SUCCESS] Station added!"
            );

        } else {

            System.out.println(
                    "\n[FAILED] Parent not found!"
            );
        }
    }



    public void removeStation(String stationCode) {

        StationNode target =
                findStation(stationCode);

        if (target == null) {

            System.out.println("\n[FAILED] Station not found!");
            return;
        }

        // Root tidak boleh dihapus
        if (target == root) {

            System.out.println("\n[FAILED] Root cannot be removed!");
            return;
        }

        StationNode parent =
                target.getParent();

        // Pindahkan child ke parent
        for (StationNode child : target.getChildren()) {

            parent.addChild(child);
        }

        // Hapus target
        parent.removeChild(target);

        System.out.println("\n[SUCCESS] Station removed!");
    }

    public void preOrderTraversal() {

        preOrderRecursive(root);
    }

    private void preOrderRecursive(StationNode current) {

        if (current == null) {
            return;
        }

        System.out.println(current);

        for (StationNode child : current.getChildren()) {

            preOrderRecursive(child);
        }
    }



    public void postOrderTraversal() {

        postOrderRecursive(root);
    }

    private void postOrderRecursive(StationNode current) {

        if (current == null) {
            return;
        }

        for (StationNode child : current.getChildren()) {

            postOrderRecursive(child);
        }

        System.out.println(current);
    }



    public void levelOrderTraversal() {

        if (root == null) {
            return;
        }

        Queue<StationNode> queue =
                new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            StationNode current =
                    queue.poll();

            System.out.println(current);

            for (StationNode child : current.getChildren()) {

                queue.offer(child);
            }
        }
    }



    public int countStations() {

        return countRecursive(root);
    }

    private int countRecursive(StationNode current) {

        if (current == null) {
            return 0;
        }

        int count = 1;

        for (StationNode child : current.getChildren()) {

            count += countRecursive(child);
        }

        return count;
    }



    public int treeHeight() {

        return heightRecursive(root);
    }

    private int heightRecursive(StationNode current) {

        if (current == null) {
            return 0;
        }

        int maxHeight = 0;

        for (StationNode child : current.getChildren()) {

            int childHeight =
                    heightRecursive(child);

            maxHeight =
                    Math.max(maxHeight, childHeight);
        }

        return maxHeight + 1;
    }



    public void showTreeStructure() {

        System.out.println("\n=== TREE VISUALIZATION ===");

        printTree(root, 0);
    }

    private void printTree(StationNode current,
                           int level) {

        if (current == null) {
            return;
        }

        // Indentasi
        for (int i = 0; i < level; i++) {

            System.out.print("   ");
        }

        System.out.println("|-- " + current);

        // Recursive ke child
        for (StationNode child : current.getChildren()) {

            printTree(child, level + 1);
        }
    }


    public void showTreeStats() {

        System.out.println("\n=== TREE STATS ===");

        System.out.println("Total Stations: "
                + countStations());

        System.out.println("Tree Height: "
                + treeHeight());

        showTreeStructure();
    }
}