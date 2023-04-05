public class Product {
    private int id;
    private static int count;
    private String productName;
    private int price;
    private int quantity;
    private String detail;

    public Product(String productName, int price, int quantity, String detail) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.detail = detail;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    @Override
    public String toString() {
        return id + productName + price + quantity + detail;
    }
}
