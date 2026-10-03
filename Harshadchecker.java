import java.util.Scanner;
public class Harshadchecker{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.println("ENter the number :");
  int n = sc.nextInt();

  int sum =0;
  while(n != 0){
   sum = sum + n % 10;
   n = n / 10;
}
  if(n % sum == 0)
  System.out.println("Harshad number");
  else 
   System.out.println("NOt harshad");

}
}