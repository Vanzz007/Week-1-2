public class q3 {
    public class ProfitCalculator {
    public static void main(String[] args) {
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Using a single print statement for multiline output
        System.out.printf("The Cost Price is INR %.0f and Selling Price is INR %.0f%n" +
                          "The Profit is INR %.0f and the Profit Percentage is %.2f%%", 
                          costPrice, sellingPrice, profit, profitPercentage);
    }
}
}
