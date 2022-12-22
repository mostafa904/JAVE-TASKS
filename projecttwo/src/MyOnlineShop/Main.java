package MyOnlineShop;
public class Main {
    public static void main(String[] args) {

        Book p1[] = new Book[4];
       // Cartoon c1 = new Cartoon(50);
        p1[0]=new Book(15);
        p1[1]=new Book(10);
        p1[2]=new Book(20);
        p1[3]=new Cartoon(50);



        int sum=0;
        for (int i = 0; i <4 ; i++) {
            sum += p1[i].getPrice();
        }
        System.out.println(sum);

    }
}