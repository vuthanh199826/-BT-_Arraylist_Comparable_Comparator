import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManageProduct{
    List<Product> list;

    public ManageProduct() {
        list = new ArrayList<>();
    }
    public void add(Product product){
        list.add(product);
    }
    public int search(int iD){
        for (Product product: list){
            if(product.getiD()==iD){
                return list.indexOf(product);
            }
        }
        return -1;
    }
    public void delete(int iD){
        if(search(iD)!= -1){
            list.remove(search(iD));
            System.out.println("Success");
        }else {
            System.out.println("Invalid");
        }
    }
    public void edit(int iD,String name,int cost){
       for (Product product:list){
           if(product.getiD()==iD){
               product.setName(name);
               product.setCost(cost);
           }
       }
    }
    public void display(){
        if(list.size()!=0) {
            for (Product product : list) {
                System.out.println(product);
            }
        }else {
            System.out.println("Khong co phan tu nao");
        }
    }
    public void searchName(String name){
        for (Product product:list){
            if(product.getName().equals(name)){
                System.out.println(product);
            }
        }
    }
    public void sort(int option){
        if(option==1){
            Collections.sort(list, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o1.getCost()-o2.getCost();
                }
            });
            display();
        }else if(option==2){
            Collections.sort(list, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o2.getCost()-o1.getCost();
                }
            });
            display();
        }
    }


}
