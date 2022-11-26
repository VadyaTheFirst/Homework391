import java.util.Objects;

public class Product {
    private final String name;
    private final int weight;
    private final int price;

    public Product(String name, int weight, int price) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException("Нельзя ввести пустые данные в поле name");
        } else {
            this.name = name;
        }


        this.weight = weight;
        this.price = price;
    }




    public String getName() {
        return name;
    }



    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}