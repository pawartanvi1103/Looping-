import java.util.Scanner;
public class PowerBaseNumber{

  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enetr the base :");
  int base = sc.nextInt();

  System.out.println("Enter the power :");
  int power = sc.nextInt();

  int result = 1;
  int i = 1;

  while(i <= power){
    result = result * base;
    i++;
}
  System.out.println("Answer=" + result);
}
}

