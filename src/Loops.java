import java.util.Scanner;

public class Loops {


         public static void main (String[] args) {

             Scanner input = new Scanner(System.in);
             System.out.print("Please enter a integer value greater than 0:");

             int value = 1;
             int num1 = input.nextInt() ;
             int sum = 0;

             while (num1<=0){
                 System.out.println("Please enter a number greater than 0");
                 num1= input.nextInt();
             }

             do {
                 //System.out.print("Please enter a integer value greater than 0:");
                 //String next = input.next();

                  if (num1% value==0) {
                      sum+=value;

                      System.out.println(value);
                  }
                     //num1 = Integer.parseInt(next);
                     //System.out.println(value);
                     value++;



             }
             while (value <= num1) ;
             System.out.println(sum);
         }
}

