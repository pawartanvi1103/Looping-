import java.util.Scanner;

class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1;
        int i = 1;

        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0)
                hcf = i;

            i++;
        }

        System.out.println("HCF = " + hcf);
    }
}