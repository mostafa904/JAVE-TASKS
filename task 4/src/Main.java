import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Please enter " + r * c + " integers");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = input.nextInt();
            }
        }

        int[][] t = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                t[i][j] = array[j][i];
            }
        }

        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();//new line
        }

    }
}
