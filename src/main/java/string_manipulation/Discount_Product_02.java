package string_manipulation;

//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400
//   tk will be discounted. After your purchase what will be your total cost?

import java.util.Scanner;

public class Discount_Product_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter shirt quantity");
        int shirtquantity = sc.nextInt();
        System.out.println("Enter sharee quantity");
        int shareequantity = sc.nextInt();
        int shirt = 1200;
        int sharee = 3500;
        if (shirtquantity == 2 && shareequantity == 1){
            int  discountprice = ((shirt * shirtquantity)+(sharee)) - 400;
            System.out.println("You have got 400 tk discount.After discount the price is "+discountprice);
        }else {
            int nodiscount = (shirt*shirtquantity) + (sharee*shareequantity);
            System.out.println("Regular price is "+nodiscount);
        }
    }
}

