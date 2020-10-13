import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int begin = s.nextInt();
        int end = s.nextInt();
        long sum = 1;
        for(int i = begin; i < end;i++){
            sum*= i;
        }

        System.out.println(sum);
    }
}