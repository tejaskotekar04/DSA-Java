package arrays;
public class Stock {
    public int maxProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price: prices){
            if(price<minPrice){
                minPrice=price;

            }else if (price-minPrice>maxProfit){
                maxProfit=price-minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Stock stock = new Stock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + stock.maxProfit(prices)); // Output: 5
    }
}
