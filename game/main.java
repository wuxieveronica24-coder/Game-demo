import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
        String user_name;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("loading .........");
        
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1); // 1 is the size of the thread pool being created

        System.out.println("Scheduling a task with a 3-second delay");

        scheduler.schedule(() -> {
            System.out.println("Task executed after 3 seconds"); // Task to be executed after the delay
        }, 3, TimeUnit.SECONDS); // Adding the 3-second delay

        scheduler.shutdown();


        System.out.println("Enter the name you wish to have: ");
        user_name = scanner.nextLine();
        System.out.println(user_name);

    }
}