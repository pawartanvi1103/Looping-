import java.util.Scanner;

class Strong1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;
        int count = 0;

        while (count < n) {
            int temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                int fact = 1;
                int i = 1;

                while (i <= digit) {
                    fact = fact * i;
                    i++;
                }

                sum = sum + fact;
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}