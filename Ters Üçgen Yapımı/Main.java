import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayısı : ");
        int number = scanner.nextInt();
        scanner.close();
        
        for(int i = number; i > 0; i--){
            System.out.println(" ".repeat(number - i) + "*".repeat(i * 2 - 1));
        }
    }
}
