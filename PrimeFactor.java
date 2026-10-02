import java.util.Scanner;
public class PrimeFactor{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the number :");
   int n = sc.nextInt();

   int i = 2;
   while(i <= n){
    if(n % i ==0){
    int count = 0;
    int j = 2;
 
   while(j < i){
    if(i % j == 0)
    count++;
     j++;
}
  if(count == 0)
     System.out.println(i + "");
}
 i++;
}
}
}