import java.util.*;
class game{
    int My_score = 0;
    int bot_score = 0;
    int target = 0;

    void batting(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean bat = true;
        int[] runs = {1,2,3,4,6};
        while(bat){
            int run = rand.nextInt(runs.length);
            System.out.println("Enter runs: ");
            int batt = sc.nextInt();
            System.out.println(runs[run]);
            if(batt == runs[run]){
                System.out.println("Out!!");
                bat = false;
            }else {
                My_score += batt;
            }
        }
        System.out.println("Score is: "+My_score+ "runs");
        target = My_score;
        System.out.println("Your Target is: "+ (target+1) +"runs");
        boolean bot=true;
        while(bot){
            System.out.println("enter ball: ");
            int ball=sc.nextInt();
            int randd= rand.nextInt(runs.length-1);
            System.out.println(runs[randd]);
            if(bot_score<target){
                if(ball==runs[randd]){
                    System.out.println("Out ");
                    bot=false;
                }else{
                    bot_score+=runs[randd];
                }
            }else{
                bot=false;
            }
        }
        if(target<bot_score){
            System.out.println("You lost by "+ (My_score - bot_score) + " runs");
        }else {
            System.out.println("You win ");
        }
    }
    void bowling(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean bat = true;
        int[] runs = {1,2,3,4,6};
        boolean bot=true;
        while(bot){
            System.out.println("enter ball: ");
            int ball=sc.nextInt();
            int randd= rand.nextInt(runs.length-1);
            System.out.println(runs[randd]);
            if(ball==runs[randd]){
                System.out.println("Out ");
                bot=false;
            }else{
                bot_score+=runs[randd];
            }
        }
        System.out.println("Score is: "+bot_score +" runs");
        target = bot_score;
        System.out.println("Target is: "+ (target+1) +" runs");
        while(bat){
            int run = rand.nextInt(runs.length-1);
            System.out.println("Enter runs: ");
            int batt = sc.nextInt();
            System.out.println(runs[run]);
            if(My_score<target){
                if(batt == runs[run]){
                    System.out.println("Out!!");
                    bat = false;
                }else {
                    My_score += batt;
                }
            }else {
                bat=false;
            }
        }
        if(target>My_score){
            System.out.println("You lost by "+(bot_score-My_score )+ "runs");
        }else {
            System.out.println("You win");
        }
    }
}
public class Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        game match = new game();
        String[] arr = {"head", "tail"};
        System.out.println("Call the Toss ");
        String toss = sc.next().toLowerCase();
        int index = rand.nextInt(2);
        System.out.println(arr[index]);
        if (toss.equals(arr[index])) {
            System.out.println("You won the toss ");
            System.out.println("""
                    CHOOSE TO:
                              BAT
                              BOWL
                    """);
            String choice = sc.next().toLowerCase();
            if (choice.equals("bat")) {
                match.batting();
            } else {
                match.bowling();
            }
        } else {
            System.out.println("You Lost The Toss!!!");
            String[] choice = {"bat", "bowl"};
            int randd = rand.nextInt(2);
            String bot_choice = choice[randd];
            System.out.println("Your Opponent Choose to " + bot_choice);
            if (bot_choice.equals("bat")) {
                match.bowling();
            } else {
                match.batting();
            }
        }
    }
}