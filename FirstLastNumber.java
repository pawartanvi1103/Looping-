import java.util.Scanner;
public class FirstLastNumber{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter the number:");
   int n = sc.nextInt();
 
   int last = n % 10;
   int first = n;

   while(first >= 10){
      first = first/10;
}
    System.out.println("First =" + first);
    System.out.println("Last =" + last);
}
}