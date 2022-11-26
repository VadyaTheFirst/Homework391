import java.lang.reflect.Array;
import java.util.*;


public class Prescription {
    private String prescriptionName;
   HashMap <Product,Integer> products = new HashMap<>();



    public Prescription(String name,HashMap<Product,Integer> products) {
        this.prescriptionName = name;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if(entry.getValue()<1){
                products.replace(entry.getKey(),entry.getValue(),1);
        }
            this.products = products;
        }
    }


    public void getPrescription() {
        var b=products.values().toArray();
        int i=0;
        Integer sum=0;
        for (Product product : products.keySet()) {
            sum=product.getPrice() * ((Integer) b[i]);
            i++;
        }
        System.out.println(getPrescriptionName());
        System.out.println(products);
        System.out.println("Сумма равна ="+sum);
    }




    public String getPrescriptionName() {
        return prescriptionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return prescriptionName.equals(that.prescriptionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescriptionName);
    }


}
