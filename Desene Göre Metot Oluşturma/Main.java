import java.util.Scanner;

class Main {

    static void design(int start, int direction, int current){
        if(current > start) return;
        System.out.print(" " + current);
        current += direction * 5;
        if(current <= 0) direction = 1;

        design(start, direction, current);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.print("Çıktısı :");
        design(number, -1, number);

    }
}
