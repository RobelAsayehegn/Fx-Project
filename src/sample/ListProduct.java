package sample;

public class ListProduct {
//    String id,question,a,b,c,d,answer;
//    ListProduct("1","roba", "ethio", 1,1);

    private String id;
    private String name;
    private String made_in;
    private int quantity;
    private double price;
    public ListProduct(String id,String name,int quantity,String made_in,double price){
        this.setId(id);
        this.setName(name);
        this.setMade_in(made_in);
        this.setQuantity(quantity);
        this.setPrice(price);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMade_in() {
        return made_in;
    }

    public void setMade_in(String made_in) {
        this.made_in = made_in;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
