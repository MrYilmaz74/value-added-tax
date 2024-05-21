import java.util.Scanner;
public class Tax {
    public static void main(String[]args)
    {
        double amount,vax=0.18,wthVax,totalVax;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an amount: ");
        amount=input.nextDouble();

        wthVax= amount * vax;
        totalVax=amount + wthVax;

        System.out.println(amount>1000 ? vax=0.8 : vax);
        System.out.println("Without Vax Amount: " + amount);
        System.out.println("With Vax Amount : " + totalVax);


    }
}
