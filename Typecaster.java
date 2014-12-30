import java.util.Scanner;
public class Typecaster
{
	public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double x = keyboard.nextDouble();
        System.out.println("Please enter a decimal.");
        int y = (int) x;
        byte z = (byte) x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}