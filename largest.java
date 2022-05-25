

import java.util.*;
public class largestnum {
    public static void main(String[] args) {
        int largest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int x = sc.nextInt();
        System.out.print("Enter the second number");
        int y = sc.nextInt();
        System.out.print( "Enter the thired number");
        int z= sc.nextInt();

         if(x>y && x>z)
            largest=x;
       else  if(y>x && y>z)
            largest=y;
       else
           largest=z;
        System.out.print("largest number is" +largest);

    }
}
