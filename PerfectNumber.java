import java.util.Scanner;
public class PerfectNumber{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number :");
  int n = sc.nextInt();

  int i = 1;
  int sum = 0;
  while(i < n){
    if(i % n == 0)
    sum = sum + i;
    i++;
}
  if(sum == n)
  System.out.println("Perfect number");
else
   System.out.println("Not perfect number");
}
}