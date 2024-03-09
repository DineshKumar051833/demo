import java.util.*;
public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Table number: ");
        int number = sc.nextInt();
        int count = 20;
        for(int n =1;n<=count;n++){
            System.out.println(number+" * "+n+" = "+number*n);
        }
    }
}
