package loops;
import java.util.Scanner;
/**
 *
 * @author Dustin Hayden
 */
public class Loops 
{
    public static void main(String[] args) 
    {
        // The sum of all even numbers between 2 and 100 (inclusive)
        int sum = 0;
        for (int i = 2; i <= 100; i += 2)
        {
           sum = sum + i;
        }
        System.out.println("The sum of all even numbers between 2 and 100 (inclusive) is " + sum);
        
        // The sum of all squares between 1 and 100 (inclusive)
        int sum1 = 0;
        for (int counter1 = 1; counter1 <= 100; counter1++)
        {
            sum1 = sum1 + (int)Math.pow(counter1,2);   
        }
        System.out.println("The sum of all squares between 1 and 100 (inclusive) is " + sum1);
        
        // All powers of 2 from 2^0 up to 2^20
        int sqr = 0;
        for (int s = 0; s <= 20; s++)
        {
            sqr = (int)Math.pow(2,s);
            System.out.println("2^" + s + " = " + sqr);
        }
        
        // The sum of all odd numbers between a and b (inclusive), where a and b are inputs
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers for calculation-> "); 
        int sum2 = 0;
        int VarA = s.nextInt();
        int VarB = s.nextInt();
        for (int n = VarA; n <= VarB; n++)
        {
            if(n%2 == 1)
            {
                sum2 = sum2 + n;
            }
        }
        System.out.println("The sum of all odd numbers between a and b (inclusive), where a and b are inputs is " + sum2);
        
        
        
    }
    
}
