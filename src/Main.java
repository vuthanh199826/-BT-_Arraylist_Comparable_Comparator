import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageProduct manageProduct = new ManageProduct();
        int choice;
        while (true){
            System.out.println("Nhap lua chon");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhap id");
                    int iD = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ten sp");
                    String name = sc.nextLine();
                    System.out.println("Nhap gia sp");
                    int cost = sc.nextInt();
                    sc.nextLine();
                    Product product = new Product(iD,name,cost);
                    manageProduct.add(product);
                    break;
                case 2:
                    System.out.println("Nhap id ");
                    iD = sc.nextInt();
                    sc.nextLine();
                    if(manageProduct.search(iD)!=-1){
                        System.out.println("nhap ten moi:");
                        name =sc.nextLine();
                        System.out.println("nhap gia moi:");
                        cost = sc.nextInt();
                        sc.nextLine();
                        manageProduct.edit(iD,name,cost);
                        System.out.println("Success");
                    }else {
                        System.out.println("invalid");
                    }
                    break;
                case 3:
            }
        }
    }
}
