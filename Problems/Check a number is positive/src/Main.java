import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a <= 0){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}