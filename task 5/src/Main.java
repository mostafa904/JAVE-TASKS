import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("plz enter the line ");

        String s = input.next();
        System.out.println("THE OLD LINE "+s);

        String n = s.replace("," , " ");
        System.out.println(" the NEW line "+n);
    }
}