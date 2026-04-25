import java.time.LocalTime;
import java.util.Scanner;

public class SimpleAlarm {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Set alarm time (HH:mm, e.g., 08:30): ");
        String alarmTime = scanner.nextLine();

        System.out.println("Alarm set for " + alarmTime + ". Waiting...");

        while (true) {
            // Get current time in HH:mm format
            String currentTime = LocalTime.now().toString().substring(0, 5);
            
            if (currentTime.equals(alarmTime)) {
                System.out.println("\n⏰ ALARM! Wake up! ⏰");
                break;
            }
            
            // Check every 10 seconds to save CPU resources
            Thread.sleep(10000); 
        }
        scanner.close();
    }
}
