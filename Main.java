import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*a + b*b;
        if (a>1000 || b>1000)
        System.out.println("No");
        else
            System.out.println(Math.sqrt(c));
    }
}
