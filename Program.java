public class Program {

    public String name;
    public double price;
    public int quantity;

    public doouble totalValue InStock() {
        return price * quantity;
    }
    public void addProduts(int quantity){
        this.quantity += quantity;
    }
    public void removeProduts(int quantity){
        this.quantity -= quantity;
    }
}
