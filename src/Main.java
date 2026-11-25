import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {



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
        System.out.println(bst.height());
        System.out.println();
    }
}
