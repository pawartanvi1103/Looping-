import java.util.Scanner;
public class PrimeChecker{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number :");
  int n = sc.nextInt();

  int i =2 ;
  int count = 0;
  while(i <= n){
     if(n % i == 0)
      count++;
      i++;
}
  if(n > 1 && count == 1)
     System.out.println("Prime");
  else
      System.out.println("Not prime");
}
}