import java.util.Scanner;

public class next {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = ++a;
        int c = --a;
        if (a>10000)
            System.out.println("No");
        else
            System.out.println("The next number for the number " + a + " is " + b);
            System.out.println("The previous number for the number " + a +" is " + --c);
    }
}
