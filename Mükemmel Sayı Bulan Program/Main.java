import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int sum = 0;

        for(int i = 1; i < number; i++) 
            if(number % i == 0) sum += i;
        if(sum == number)
            System.out.printf("%d Mükemmel sayıdır", number);
        else
            System.out.printf("%d Mükemmel sayı değildir.", number);
    }
}
