import java.util.Scanner;
public class Automorphic{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number :");
  int n = sc.nextInt();

  int num = 1;
  while(num <= n){
  int square = num * num;
  int temp = num;
  boolean auto = true;

  while(temp != 0){
  if(temp % 10 != square % 10){
  auto = false;
  break;

}
 temp = temp / 10;
 square = square / 10;
}
 if(auto)
   System.out.println(num + "");
   num++;
}
}
}
  
  