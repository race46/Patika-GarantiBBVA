import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.print("Armut Kaç Kilo ? :");
        total += 2.14 * scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        total += 3.67 * scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        total += 1.11 * scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        total += 0.95 * scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        total += 5 * scanner.nextDouble();
        scanner.close();
        
        System.out.printf("Toplam Tutar : %.2f TL", total);
    }
}
