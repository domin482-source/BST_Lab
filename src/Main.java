import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int search(ArrayList<Integer> list, int target) {
        int nodesVisited = 0;

        for (int i = 0; i < list.size(); i++) {
            nodesVisited++;

            if (list.get(i) == target) {
                return i;
            }
        }

        System.out.println("Not found. Visited " + nodesVisited + " nodes.");
        return -1;
    }

    public static double avgNodes(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i< list.size(); i++){
            sum += search(list, list.get(i));
        }
        return ((double) sum / list.size());
    }

    static void main() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        BST<Integer> bst = new BST<>();
        ArrayList<Integer> intArray = new ArrayList<>();

        for (int i = 0; i < size; i++){
            int num = rand.nextInt(10000);
            bst.insert(num);
            intArray.add(num);
        }
        System.out.println("Tree height = " + bst.height());
        System.out.println("Avg nodes searched = " + avgNodes(intArray));
    }
}
