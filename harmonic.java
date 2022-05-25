
import java.util.*;

public class harmoinc {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
         int num;
        double sum=0.0;
        System.out.println("Enter num value : ");
         num= s.nextInt();

        while(num>0)
        {
            sum+=(1.0)/num;
            num--;
        }

        System.out.println("harmonic sum is"+sum);
    }
}