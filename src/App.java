import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        int a,b,s=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first Number");
        a=sc.nextInt();
        System.out.println("Enter the second Number");
        b=sc.nextInt();
        s=a+b;
        System.out.println("The sum  of 2 numbers is: "+s);
        sc.close();
    }
}