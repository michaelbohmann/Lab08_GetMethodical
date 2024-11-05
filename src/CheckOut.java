import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {

            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalCost += itemPrice;


            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to enter?");
        } while (moreItems);


        System.out.printf("\nThe total cost of your items is: $%.2f\n", totalCost);
    }
}
