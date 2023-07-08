import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int distance = scanner.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int age = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int type = scanner.nextInt();
        scanner.close();

        if(distance < 1 || age < 1 || type < 1 || type > 2){
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double fee = type == 1 ? 0.10 * distance : 0.2 * distance;

        if(age < 12) fee /= 2;
        else if (age < 25) fee *= 0.9;
        else if (age > 65) fee *= 0.7;

        if(type == 2) fee *= 0.8;

        System.out.printf("Toplam Tutar = %d TL", (int) fee);
        
    }
}
