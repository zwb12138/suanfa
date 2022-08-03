package linkedList;

public class GoodsNode {
    public int id;
    public String name;
    public int price;
    public GoodsNode next;

    public GoodsNode(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodsNote{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                '}';
    }

}
