
import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {
        int[][] jaggedArray;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int nor = sc.nextInt();
        jaggedArray = new int[nor][];

        
        for (int i = 0; i < nor; i++) {
            System.out.println("Enter number of columns for row " + i + ":");
            int noc = sc.nextInt();
            jaggedArray[i] = new int[noc]; 
        }

        
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.println("Enter elements at [" + i + "][" + j + "]:");
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
