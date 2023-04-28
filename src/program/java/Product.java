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
}

