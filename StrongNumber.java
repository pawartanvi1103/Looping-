import java.util.Scanner;
public class StrongNumber{
  public static void  main(String args[]){
  Scanner sc = new Scanner(System.in);

  System.out.println("ENter the number :");
  int n = sc.nextInt();

  int original = n;
  int sum = 0;
  while(n != 0){
      int digit = n % 10;
      int fact = 1;
      int i = 1;
  while(i <= digit){
       fact = fact * i;
        i++;
}
  sum = sum + fact;
  n = n /10;
}
if(sum == original)
    System.out.println("Strong number");
 else
    System.out.println("Not strong number");
}
}