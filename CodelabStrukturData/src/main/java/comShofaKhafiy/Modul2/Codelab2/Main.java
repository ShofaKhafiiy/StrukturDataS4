package comShofaKhafiy.Modul2.Codelab2;

import java.util.LinkedList;

class IslandRoute {

    private LinkedList<String> islands;

    public IslandRoute() {
        islands = new LinkedList<>();
    }


    public void addIsland(String name) {
        islands.add(name);
    }


    public void busterCall(String name) {
        islands.remove(name);
    }


    public void printLogbook() {

        System.out.print("Grand Line Route: ");

        for (int i = 0; i < islands.size(); i++) {

            if (i == islands.size() - 1) {
                System.out.print(islands.get(i) + " (End)");
            } else {
                System.out.print(islands.get(i) + " -> ");
            }

        }

        System.out.println();
    }


    public boolean isIslandOnRoute(String name) {
        return islands.contains(name);
    }


    public int countIslands() {
        return islands.size();
    }
}

public class Main {

    public static void main(String[] args) {

        IslandRoute route = new IslandRoute();

        route.addIsland("Alabasta");
        route.addIsland("Skypiea");
        route.addIsland("Water 7");
        route.addIsland("Enies Lobby");

        route.printLogbook();

        System.out.println("Visited Fishman Island? " + route.isIslandOnRoute("Fishman Island"));

        System.out.println("Buster Call initiated on Enies Lobby!");
        route.busterCall("Enies Lobby");

        route.printLogbook();

        System.out.println("Total Islands visited: " + route.countIslands());
    }
}