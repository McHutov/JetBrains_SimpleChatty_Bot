import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        char operation = s.next().charAt(0);
        long b = s.nextLong();

        if(b != 0) {
            switch (operation) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                default:
                    System.out.println("Unknown operator");
                    break;
            }
        }else{
            System.out.println("Division by 0!");
        }
    }
}