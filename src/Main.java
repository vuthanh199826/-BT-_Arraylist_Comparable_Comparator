import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageProduct manageProduct = new ManageProduct();
        int choice;
        while (true){
            displayMenu();
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
                    System.out.println("Nhap id muon xoa");
                    iD = sc.nextInt();
                    sc.nextLine();
                    manageProduct.delete(iD);
                    break;
                case 4:
                    System.out.println("Nhap ten muon tim ");
                    name = sc.nextLine();
                    manageProduct.searchName(name);
                    break;
                case 5:
                    System.out.println("1. Sap xep theo gia tang dan   2. Sap xep theo gia giam dan");
                    int option = sc.nextInt();
                    sc.nextLine();
                    manageProduct.sort(option);
                    break;
                case 6:
                    manageProduct.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhap lai");
            }
        }
    }
    public static void displayMenu(){
        System.out.println("=================Menu==================");
        System.out.println("1. Add");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Search");
        System.out.println("5. Sort");
        System.out.println("6. Display");
        System.out.println("0. Exit");
        System.out.println("----------------------------------------");
    }
}
