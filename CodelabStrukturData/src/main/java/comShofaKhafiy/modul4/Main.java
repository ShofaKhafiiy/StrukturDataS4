package comShofaKhafiy.modul4;

public class Main {

    public static void main(String[] args) {

        MajapahitBST bst = new MajapahitBST();


        System.out.println(">>> KITAB NEGARAKERTAGAMA: MAJAPAHIT DYNASTY <<<");
        System.out.println("[Theory] Root: Founding Father, Leaves: The Legacy...\n");



        bst.insert("Raden Wijaya");
        bst.insert("Jayanegara");
        bst.insert("Tribhuwana");
        bst.insert("Gajah Mada");
        bst.insert("Kertanegara");
        bst.insert("Hayam Wuruk");



        bst.printStructure();



        System.out.println("\n1. InOrder (Alphabetical Sort):");
        bst.inorder();



        System.out.println("\n2. PreOrder (Royal Decree Structure):");
        bst.preorder();



        System.out.println("\n3. PostOrder (Historical Archives):");
        bst.postorder();



        System.out.println("\n>>> UPDATING CHRONICLES (SEARCH & DELETE) <<<");

        System.out.println("Is 'Gajah Mada' in the tree? " +
                (bst.search("Gajah Mada") ? "YES" : "NO"));

        System.out.println("Is 'Lembu Sora' in the tree? " +
                (bst.search("Lembu Sora") ? "YES" : "NO"));



        System.out.println("First Alphabetical Name: " + bst.findMin());
        System.out.println("Last Alphabetical Name: " + bst.findMax());



        System.out.println("\nRemoving 'Jayanegara' from history...");

        bst.delete("Jayanegara");

        System.out.println("\n1. InOrder (Alphabetical Sort):");
        bst.inorder();
    }
}