

public class Product {
    private int iD;
    private String name;
    private int cost;

    public Product(int iD, String name, int cost) {
        this.iD = iD;
        this.name = name;
        this.cost = cost;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
