import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int begin = s.nextInt();
        int end = s.nextInt();
        double sum = 0.0;
        double index = 0.0;
        for(int i = begin; i <= end; i++){
            if(i % 3 == 0){
                sum+=i;
                index++;
            }
        }
        System.out.println(sum/ index);
    }
}