package MyOnlineShop;
public class Main {
    public static void main(String[] args) {

        ChildernBook p1[] = new ChildernBook[3];
        p1[0]=new ChildernBook(15);
        p1[1]=new ChildernBook(10);
        p1[2]=new ChildernBook(20);
        int sum=0;
        for (int i = 0; i <3 ; i++) {
           sum += p1[i].getPrice();
        }
        System.out.println(sum);

    }
}