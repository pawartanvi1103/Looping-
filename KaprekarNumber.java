import java.util.Scanner;
public class KaprekarNumber{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter the number :");
   int n = sc.nextInt();

   int square = n * n;
   int temp = n;
   int power = 1;

   while(temp != 0){
     power = power * 10;
     temp = temp / 10;
 }
    int right =  square % power;
    int left = square / power;

   if(left + right == n)
      System.out.println("Kaprekar Number");
   else
      System.out.println(" Not Kaprekar Number");
}
}
   