import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
        String user_name;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("loading .........");
        slow_print("loading .........",TimeUnit.MILLISECONDS, 100);
        System.out.println("Enter the name you wish to have: ");
        user_name = scanner.nextLine();
        System.out.println(user_name);

    }

// complete with help from stack overflow 

    public static void slow_print(String whatever, TimeUnit unit, long time_take) throws InterruptedException {
        for (char c: whatever.toCharArray()){
            System.out.println(c);
            unit.sleep(time_take);
        }
    }
}

