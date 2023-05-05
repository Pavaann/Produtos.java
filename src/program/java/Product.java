package program.java;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProduts(int quantity){
        this.quantity += quantity;
    }
    public void removeProduts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + totalValueInStock();

    }

    public void addProducts(int quantity) {
    }
}

