import  java.util.Scanner;

public class Showroom implements utility{
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock=0;
    String manager_name;

    @Override
    public void get_details()
    {
        System.out.println("Showroom Name"+showroom_name);
        System.out.println("Showroom Address"+showroom_address);
        System.out.println("Manager Name"+manager_name);
        System.out.println("Total Employees"+total_employees);
        System.out.println("Total Cars in Stock"+total_cars_in_stock);


    }
    public void set_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("===============*** Enter Showroom Details ***==============");
        System.out.println();
        System.out.println("SHOWROOM NAME");
        showroom_name=sc.nextLine();
        System.out.println("SHOWROOM ADDRESS");
        showroom_address=sc.nextLine();
        System.out.println("MANAGER NAME");
        manager_name=sc.nextLine();
        System.out.println("TOTAL NO OF EMPLOYEE:");
        total_employees=sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK ");
        total_cars_in_stock=sc.nextInt();
    }
}
