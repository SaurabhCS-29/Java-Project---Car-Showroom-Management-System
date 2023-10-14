import java.util.*;
import java.lang.*;
import java.io.*;

interface utility{
    public void get_details();
    public void set_details();
}

public class Main{
    static void main_menu(){
        System.out.println();
        System.out.println(" ************* <<< WELCOME TO SHOWROOM MANEGMENT SYSTEM >>> ************* ");
        System.out.println();
        System.out.println("* 1] ADD SHOWROOM \t\t\t 2] ADD EMPLOYES \t\t\t 3] ADD CARS");
        System.out.println();
        System.out.println("* 4] GET SHOWROOM \t\t\t 5] GET EMPLOYES \t\t\t 6] GET CARS");
        System.out.println();
        System.out.println(" ************* <<< ENTER 0 TO EXIT >>> ************* ");
    }

    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employe[] = new Employee[5];
        Car car[] = new Car[5];
        int car_counter=0;
        int showroom_counter=0;
        int employe_counter=0;
        int choice=100;
        
        while(choice!=0){
            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        showroom[showroom_counter]=new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1] ADD NEW SHWROOM");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employe[employe_counter]=new Employee();
                        employe[employe_counter].set_details();
                        employe_counter++;
                        System.out.println();
                        System.out.println("1] ADD NEW EMPLOYEE");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                    case 3:
                        car[car_counter]=new Car();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("1] ADD NEW CAR");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt(); 
                    case 4:
                        for(int i=0; i<showroom_counter;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }     
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice=sc.nextInt();
                    case 5:
                          for(int i=0; i<employe_counter;i++){
                            employe[i].get_details();
                            System.out.println();
                            System.out.println();
                        }     
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice=sc.nextInt(); 
                    case 6:
                        for(int i=0; i<car_counter;i++){
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }     
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice=sc.nextInt(); 
                    default:
                        System.out.println("ENTER VALID CHOICE.");
                        break;
                }
            }
        }
    }
}