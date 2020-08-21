package politeh;

public class Product {
    private String productName;
    private String manufacturerName;
    private int amount = 0;
    private int guarantee;
    private int retailPrice; // розница
    private int tradePrice; // опт
    private int profit; // ожидаемая прибыль

    public Product(String productName, String manufacturerName, int amount, int guarantee, int retailPrice, int tradePrice) {
        this.productName = productName;
        this.manufacturerName = manufacturerName;
        this.amount = amount;
        this.guarantee = guarantee;
        this.retailPrice = retailPrice;
        this.tradePrice = tradePrice;
        profit = retailPrice * amount;
        try {
            if (tradePrice > retailPrice){
                throw new IllegalPriceException("Trade price cannot be more than retail");
            }
            if(guarantee < 1){
                throw new IllegalGuaranteeException("Guarantee cannot be less than 1 month");
            }
        }catch (IllegalPriceException e){
            e.printStackTrace();
        }catch (IllegalGuaranteeException e){
            e.printStackTrace();
        }
    }

    public String getProductName() {
        return productName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getAmount() {
        return amount;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getTradePrice() {
        return tradePrice;
    }

    public int getProfit() {
        return profit;
    }
}
