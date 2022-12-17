import java.util.*;
public class Main{

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int [][] array= new int[2][col];
        System.out.println("Please enter "+ row*col+ " integers");
        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                array[i][j]= input.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Maximum number in the row is "+ max);
        System.out.println();
    }
}