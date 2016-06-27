import java.time.LocalDate;
import java.time.Month;

import static java.time.DayOfWeek.FRIDAY;

/**
 * Created by jonsnow on 15/06/16.
 */
public class Superstition {

    public static void main(String[] args) {

        LocalDate a = LocalDate.of(2000, Month.JANUARY, 13);
        LocalDate b = LocalDate.of(2099, Month.DECEMBER, 13);

//        Period period = Period.between(a, b);

        LocalDate s = a;
        while (s.isBefore(b)) {
            s = s.plusMonths(1);

//            System.out.println(s);



            if (s.getDayOfWeek().equals(FRIDAY)){
                System.out.println(s);
            }


        }


    }
}