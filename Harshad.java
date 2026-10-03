import java.util.Scanner;
public class Harshad{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.println("ENter the number :");
  int n = sc.nextInt();

  int num = 1;
  while(num <= n){
  int temp = num;
  int sum = 0;

  while(temp != 0){
  sum = sum + temp % 10;
  temp = temp / 10;
}
  if(num % sum == 0)
     System.out.println(num + "");
     num++;
}
}
}