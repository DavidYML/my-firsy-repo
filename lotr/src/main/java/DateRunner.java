import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.Period.*;
import static java.time.temporal.ChronoUnit.ERAS;

/**
 * Created by jonsnow on 14/06/16.
 */
public class DateRunner {
    public static void main(String[] args) {

//        Date d= new Date();
//        d.setHours(12); //streng aangeraden om dit niet te gebruiken, is nog wel beschikbaar
//
//        String s= new String("Hello");
//        s.toLowerCase();
//
//        System.out.println(d);

//        LocalDate
//        LocalTime
//        LocalDateTime
//
//        Instant
//
//        Duration
//        Period

        ZonedDateTime z= ZonedDateTime.now();
        System.out.println(z.getYear());
//
//        Instant from=Instant.from(z);
//        System.out.println(from);

//        Duration d= Duration.between(from, Instant.now());

        LocalDate now= LocalDate.now();
        LocalDate then= now.with(ChronoField.DAY_OF_WEEK,7);
        System.out.println(then);

        LocalDate a= LocalDate.of(2016, Month.JANUARY,1);
        LocalDate b= LocalDate.of(2017, Month.JANUARY,1);

        Period period= Period.between(a,b);

        System.out.println(period.normalized());

        DateTimeFormatter df= DateTimeFormatter.ofPattern("d MMMM yyyy");
                String s =df.format(a);

        DateTimeFormatter g=DateTimeFormatter.BASIC_ISO_DATE;

        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String t = "01/12/1978"; // Via scanner

        LocalDate d= LocalDate.from(f.parse(t));

        d= d.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(f.format(d));
//        d.plus(7, ChronoUnit.ERAS);

        System.out.println(s);
        System.out.println(a);
        System.out.println(f);
        System.out.println(d.getDayOfWeek());
//        System.out.println(g);


    }
}
