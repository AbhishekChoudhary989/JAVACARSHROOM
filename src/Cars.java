import java.util.Scanner;


public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;


    @Override
    public void get_details()
    {
        System.out.println("NAME:"+car_name);
        System.out.println("COLOR:"+car_color);
        System.out.println("FUEL_TYPE:"+car_fuel_type);
        System.out.println("PRICES:"+car_price);
        System.out.println("CAR TYPE:"+car_type);
        System.out.println("TRANSMISSION:"+car_transmission);
    }

    public void set_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("====================== *** ENTER CARS DETAILS *** ================");
        System.out.println();
        System.out.println("CAR NAME");
        car_name=sc.nextLine();
        System.out.println("CARS FUEL TYPE(DIESEL/PETROL)");
        car_fuel_type= sc.nextLine();
        System.out.println("CARS PRICE");
        car_price=sc.nextInt();
        sc.nextLine();
        System.out.println("CARS TYPE(SEDAN/SUV/HATCHBACK)");
        car_type=sc.nextLine();
        System.out.println("transmission TYPE(AUTOMATE/MANUAL)");
        car_transmission=sc.nextLine();
        total_cars_in_stock++;
    }
}
