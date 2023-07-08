import java.util.Scanner;

class Main {

    static int power(int taban, int us){
        if(us == 0) return 1;
        return taban * power(taban, us - 1);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int us = scanner.nextInt();
        scanner.close();

        System.out.printf("Sonuç : %d", power(taban, us));
    }
}
