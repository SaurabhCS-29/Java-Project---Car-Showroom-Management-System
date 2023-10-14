import java.util.Scanner;

public class Showroom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employee;
    int total_cars_stock;
    String manager_name;

    public void get_details(){
        System.out.println("Showroom Name : "+showroom_name);
        System.out.println("Showroom Address : "+showroom_address);
        System.out.println("Manager Name : "+manager_name);
        System.out.println("Total Employee : "+total_employee);
        System.out.println("Total Cars In Stock : "+total_cars_stock);
    }

    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("************** <<< ENTER SHOWROOM DETAILS >>> **************");
        System.out.println();
        System.out.println("Showroom Name : ");
        showroom_name = sc.nextLine();
        System.out.println("Showroom Address : ");
        showroom_address = sc.nextLine();
        System.out.println("Manager Name : ");
        manager_name = sc.nextLine();
        System.out.println("Total Employee : ");
        total_employee = sc.nextInt();
        System.out.println("Total Cars In Stock : ");
        total_cars_stock = sc.nextInt();
}
}