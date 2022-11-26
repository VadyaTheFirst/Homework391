import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product eggs = new Product("Яйцо", 10, 38);
        AddMethods.addProduct (products,eggs);
        Product butter = new Product("Масло", 1,  48);
        AddMethods.addProduct (products,butter);
        AddMethods.addProduct (products,new Product("Вода", 2,  2));
        //AddMethods.addProduct (products,new Product("Вода", 1, 1, 2));
        AddMethods.addProduct (products,new Product("Кофе", 2,  2));
        Product cheese= new Product("Сыр", 1,  48);
        AddMethods.addProduct (products, cheese);


        HashMap<Product,Integer> saladProducts1 = new HashMap<>();
        saladProducts1.put(new Product("Хрен", 2,  2),-2);
        saladProducts1.put(butter,3);

        Set<Product> saladProducts2 = new HashSet<>();
        saladProducts2.add(eggs);
        saladProducts2.add(butter);
        saladProducts2.add(cheese);





        Prescription salad1 = new Prescription("Хрен с маслом}", saladProducts1);
        salad1.getPrescription();





    }
}