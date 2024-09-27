public class Pharmacy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Person owner = new Person("Ahmed Khan", "1234567890");
        Address address = new Address("123 Health St", "Karachi", "75000");
        PharmacyShop pharmacy = new PharmacyShop(owner, address);
        
        Date currentDate = new Date(27, 9, 2024); 
        
        while (true) {
            System.out.println("\nPharmacy Shop Management System");
            System.out.println("1. Add Medicine");
            System.out.println("2. Update Medicine");
            System.out.println("3. Remove Medicine");
            System.out.println("4. Sell Medicine");
            System.out.println("5. Display All Medicines");
            System.out.println("6. Search Medicine");
            System.out.println("7. Print Total Revenue");
            System.out.println("8. List Expired Medicines