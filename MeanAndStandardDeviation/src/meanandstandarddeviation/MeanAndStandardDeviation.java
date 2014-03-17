package meanandstandarddeviation;
import java.util.Scanner;
/**
 *
 * @author Dustin Hayden
 */
public class MeanAndStandardDeviation 
{
    public static void main(String[] args) 
    {
        double sum = 0;
        double sqr = 0;
        double n = 0;
        double currentNum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a floating point number, or type q to quit:");
        while(s.hasNextDouble())
        {
            currentNum = s.nextDouble();
            sum = sum + currentNum;
            sqr = sqr + Math.pow(currentNum, 2);
            n += 1;
        }
        double mean = sum / n;
        double stdv = Math.sqrt((sqr - (1/n) * Math.pow(sum, 2)) / (n - 1.0));
        System.out.printf("Mean = %.2f\n", mean);
        System.out.printf("Standard Deviation = %.2f\n", stdv);
    }
    
}
