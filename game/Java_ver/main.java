import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Scanner; 

public class Main{
    public static void main(String[] args) throws Exception {
        String user_name;
        Scanner scanner = new Scanner(System.in);

        slow_print("Loading .........",TimeUnit.MILLISECONDS, 100);
        String long_mes = "Today you become an honorable Officer serving for New Seattle State Police Dapartment. If you want to, serving the people of New Seattle is also an option.";
        slow_print(long_mes,TimeUnit.MILLISECONDS, 50);
        System.out.println("What is your name? Officer ");
        user_name = scanner.nextLine();
        // combine two string using concat though I don't need to
        System.out.println("\nWelcome, Officer ".concat(user_name) + ".");

    }

// slow_print is complete with help from stack overflow 
// intend to slow print on the same line 
    public static void slow_print(String whatever, TimeUnit unit, long time_take) throws InterruptedException {
        for (char c: whatever.toCharArray()){
            System.out.print(c);
            unit.sleep(time_take);
        }
        // println cause print in new line
        // print cause print in same line 
        System.out.println("\n");
    }
}

