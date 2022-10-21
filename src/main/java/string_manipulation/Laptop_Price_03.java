package string_manipulation;

//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

public class Laptop_Price_03 {
    public static void main(String[] args) {
        int price = 76000;
        int discount = 10;
        System.out.println("Laptop price " +price);
        System.out.println("Discount " +discount+"%");
        double s = 100-discount;
        double amount = (s*price)/100;
        System.out.println("Purchase price "+amount);

    }
}

