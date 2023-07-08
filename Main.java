import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        int kilo = scanner.nextInt();
        
        double index = kilo / boy / boy;
        System.out.println("Vücut Kitle İndeksiniz : " + index);

        scanner.close();
    }
}