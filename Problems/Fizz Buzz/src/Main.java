import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int begin = s.nextInt();
        int end = s.nextInt();

        for(int i = begin; i <= end;i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
                continue;
            }else{
                if(i%5 == 0){
                    System.out.println("Buzz");
                    continue;
                }else
                {
                    if(i % 3 == 0){
                        System.out.println("Fizz");
                        continue;
                    }
                }
            }
            System.out.println(i);
        }
    }
}