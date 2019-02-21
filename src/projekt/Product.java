package projekt;

public class Product {

    private int ID;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;

    public Product(int pid, String pname, float pprice, String pAddDate, byte[] pimg) {

        this.ID = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = pAddDate;
        this.picture = pimg;

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDate() {
        return addDate;
    }

    public byte[] getImage() {
        return picture;
    }
}
