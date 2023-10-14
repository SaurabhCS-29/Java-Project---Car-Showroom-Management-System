import java.util.Scanner;

public class Car extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_fule_type;
    int car_price;
    String car_type;
    String car_transmission;

    public void get_details(){
         System.out.println("Name : "+car_name);
        System.out.println("Color : "+car_color);
        System.out.println("Fule Type : "+car_fule_type);
        System.out.println("Type : "+car_type);
        System.out.println("Transmission : "+car_transmission);
        System.out.println("Price : "+car_price);
    }

    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("************** <<< ENTER CAR DETAILS >>> **************");
        System.out.println();
        System.out.println("Car Name : ");
        car_name = sc.nextLine();
        System.out.println("Color : ");
        car_color = sc.nextLine();
        System.out.println("Fule Type : ");
        car_fule_type = sc.nextLine();
        System.out.println("Car Type(Sedan/SUV/Hatchback) : ");
        car_type = sc.nextLine();
        System.out.println("Transmission : ");
        car_transmission = sc.nextLine();
        System.out.println("Price : ");
        car_price = sc.nextInt();
        total_cars_stock++;
}
}