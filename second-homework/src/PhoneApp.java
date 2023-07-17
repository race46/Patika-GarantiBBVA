public class PhoneApp {
    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray){
        double total = 0;
        for(SmartPhone sp: smartPhoneArray) total += sp.price;
        return total;
    }
    public static void main(String[] args) {
        //String id, String name, double price, String phoneNumber, int storage, int ram, int camera
        SmartPhone smartPhones[] = {
                new SmartPhone("id-1", "samsung", 1234, "+905123456789", 4, 8, 120),
                new SmartPhone("id-2", "nokia", 332, "+905123456789", 42, 16, 120),
                new SmartPhone("id-3", "xiaomi", 43, "+905123456789", 512, 32, 32),
                new SmartPhone("id-4", "huawei", 34352, "+905123456789", 425, 8, 5454),
                new SmartPhone("id-5", "apple", 56, "+905123456789", 553, 8, 4)
        };

        System.out.println(calculateTotalPrice(smartPhones));
    }
}
