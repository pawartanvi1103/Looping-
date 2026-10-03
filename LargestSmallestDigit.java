import java.util.Scanner;
public class LargestSmallestDigit{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   System.out.println("Enter the number :");
   int n = sc.nextInt();

  int largest = 0;
  int smallest = 9;

  while(n != 0){
     int digit = n % 10;

  if(digit > largest)
      largest = digit;

 if(digit < smallest)
      smallest = digit;

 n = n / 10;
}

 System.out.println("Largest =" + largest);
 System.out.println("Smallest =" + smallest);
}
}