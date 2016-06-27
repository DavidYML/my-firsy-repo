import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by jonsnow on 15/06/16.
 */
public class MijnVerjaardag {
    public static DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yyyy");



        public static void main(String[] args) {

        String bd= "15/07/1983";

        LocalDate birthDate= LocalDate.from(f.parse("15/07/1983"));

        LocalDate now= LocalDate.now();

        LocalDate nextBirthday = birthDate.with(ChronoField.YEAR,now.getYear());

            if (nextBirthday.isBefore(now)) {
                nextBirthday= nextBirthday.plus(1, ChronoUnit.YEARS);
            }

            System.out.println(nextBirthday);

            long output = ChronoUnit.DAYS.between(now, nextBirthday);
            System.out.println(output);
    }
    }

