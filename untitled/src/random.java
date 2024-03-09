import java.util.*;
interface a{
     int senior();
     int junior();
     int manager();
}
class b implements a{

    int basic_pay = 0;
    public int senior()
    {
        return basic_pay;

    }
    public int junior()
    {
        return basic_pay;

    }
    public int manager()
    {
        return basic_pay;
    }
}

public class random {
    public static void main(String[] args) {
        b obj = new b();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the candidate: ");
        String name = sc.next();
        System.out.println("Enter the age of the candidate: ");
        int age = sc.nextInt();
        System.out.println("Enter the mobile number of the candidate: ");
        int mobno = sc.nextInt();
        System.out.println(""" 
                Enter the position of the candidate
                1.Manager
                2.Senior
                3.Junior
                """);
        String choice = sc.next().toLowerCase();
        System.out.println("Enter the basic pay for the candidate: ");
        int baspay = sc.nextInt();
        System.out.println("Enter the work years of the candidate: ");
        int workyr = sc.nextInt();
        obj.basic_pay += baspay;


        if (choice.equals("manager")) {
            if(obj.basic_pay >=30000 && workyr>=3) {
                int bonus = 40000;
                int pf = 20000;
                int tot_salary = bonus - pf + baspay;
                System.out.println("The total salary is "+tot_salary);
            }
            else {
                int bonus = 25000;
                int pf = 10000;
                int tot_salary = bonus - pf + baspay;
                System.out.println("The total salary is "+tot_salary);
            }
        }
        else if (choice.equals("senior")) {
            if(obj.basic_pay >=25000 && workyr>=3) {
                int bonus = 35000;
                int pf = 20000;
                int tot_salary = bonus - pf + baspay;
                System.out.println("The total salary is "+tot_salary);
            }
            else {
                int bonus = 20000;
                int pf = 5000;
                int tot_salary = bonus - pf + baspay;
                System.out.println("The total salary is "+tot_salary);
            }
        }
        else  {
            if(obj.basic_pay >=20000 && workyr>=3) {
                int bonus = 20000;
                int pf = 10000;
                int tot_salary = bonus - pf + baspay;
                System.out.println("The total salary is "+tot_salary);
            }
            else {
                int bonus = 15000;
                int pf = 5000;
                int tot_salary = bonus - pf + baspay;
                System.out.println("The total salary is "+tot_salary);
            }
        }
    }
}