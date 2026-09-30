import java.util.Scanner;
public class Duck{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number :");
  int n = sc.nextInt();

  boolean duck = false;
  while(n != 0){
    if(n % 10 == 0)
       duck = true;
       n = n/10;
}
  if(duck)
     System.out.println("Duck number");
 else
     System.out.println("Not duck");
}
}