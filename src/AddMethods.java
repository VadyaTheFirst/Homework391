import java.util.Set;

public class AddMethods {
    public static void addProduct(Set<Product> products, Product product) throws RuntimeException {
        for (Product product1 : products) {
            if (product1.getName().equals(product.getName())) {
                throw new RuntimeException("Товар с таким именем уже есть в корзине");
            }
        }
        System.out.println(product.getName() + " добавлено");
        products.add(product);

    }
}
