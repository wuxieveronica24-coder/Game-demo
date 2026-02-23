import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
        String user_name;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("loading .........");

        System.out.println("Enter the name you wish to have: ");
        user_name = scanner.nextLine();
        System.out.println(user_name);

    }
}