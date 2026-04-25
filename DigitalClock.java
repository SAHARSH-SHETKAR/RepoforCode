import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {
        // Format the time as HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Digital Clock Started (Press Ctrl+C to stop):");

        while (true) {
            LocalTime now = LocalTime.now();
            // \r returns the cursor to the start of the line to overwrite the time
            System.out.print("\rCurrent Time: " + now.format(formatter));
            Thread.sleep(1000); 
        }
    }
}
