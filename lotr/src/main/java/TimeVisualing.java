import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by jonsnow on 22/06/16.
 */
public class TimeVisualing {
    public static void main(String[] args) {
        long start = System.nanoTime();
        long current = System.nanoTime();

        long delta = current - start;

        while (delta <= 10000000000L) {

            current = System.nanoTime();
            delta = current - start;
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd MM YYYY HH:MM:ss");

            String value = formatter.format(LocalDateTime.now());

            Logger logger = (Logger) LoggerFactory.getLogger(TimeVisualing.class);
            logger.info("Time is:"+value);
            logger.debug("Delta: " + delta);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
