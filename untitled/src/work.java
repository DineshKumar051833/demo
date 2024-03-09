import java.util.*;
interface company{
    void manager(int basic_pay, int work_years);
    void senior(int basic_pay, int work_years);
    void junior(int basic_pay, int work_years);
}
class salary implements company{


    public void senior(int basic_pay, int work_years)
    {
        int bonus =  work_years>=3 ? 30000:20000;
        int pf = 10000;
        System.out.println("Salary is "+(bonus+pf+basic_pay));
    }
    public void junior(int basic_pay, int work_years)
    {
        int bonus = work_years>=3 ? 25000:15000;
        int pf = 10000;
        System.out.println("Salary is "+(bonus+pf+basic_pay));
    }
    public void manager(int basic_pay, int work_years)
    {
        int bonus = work_years>=3 ? 20000:10000;
        int pf = 10000;
        System.out.println("Salary is "+(bonus+pf+basic_pay));
    }
}
public class work {
    public static void main(String[] args) {
        salary obj = new salary();
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
        if (choice.equals("manager")){
            obj.manager(baspay,workyr);
        } else if (choice.equals("senior")) {
            obj.senior(baspay,workyr);
        }else {
            obj.junior(baspay,workyr);
        }

    }
}
