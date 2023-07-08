import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk Kaç Sayı : ");
        int number = scanner.nextInt();
        scanner.close();

        int l = 0, r = 1;
        
        System.out.printf("%d Elemanlı Fibonacci Serisi :", number);
        for(int i = 0; i < number; i++){
            System.out.printf(" %d", l);
            r += l;
            l = r - l;
        }
    }
}
