import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int upPerDay = scanner.nextInt();
        int downPerDay = scanner.nextInt();
        int day = 0;
        for(int i = 0; i < height; i = i + upPerDay - downPerDay){
            day++;
        }

        System.out.println(day);

    }
}