import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your bound = ");
        int bound = scn.nextInt();
        int arr[] = new int[bound];
        int i = 0;
        do {
            System.out.println("Enter your " + (i + 1) + " element : ");
            int element = scn.nextInt();
            arr[i] = element;
            i++;
        } while (i < bound);

        Arrays.sort(arr);
        System.out.print("Your order : ");
        for (int w : arr) {
            System.out.print(w + " ");

        }
    }
}


