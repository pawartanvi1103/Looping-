import java.util.Scanner;
public class  PerfectNumbers1ton{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int n = sc.nextInt();

    int num = 1;
    int count = 0;
    while(count < n){
       int i = 1;
       int sum = 0;

    while(i < num){
      if(num % i == 0)
         sum = sum + i;
         i++;

  }
   if(sum == num){
      System.out.println(num + " ");
      count++;
}
  num++;
}
}
}