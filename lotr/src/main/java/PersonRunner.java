import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by jonsnow on 14/06/16.
 */
public class PersonRunner {
    public static void main(String[] args) {

        TreeSet<Person> persons = new TreeSet<>();


        persons.add(new Person("Jimi", "Hendrickx"));
        persons.add(new Person("Kurt", "Cobain"));
        persons.add(new Person("Jaris", "John"));
        persons.add(new Person("Amy", "Winehouse"));
        persons.add(new Person("Jim", "Morrison"));


        System.out.println(persons);


        List<Person> pl = new ArrayList<Person>();
        pl.add(new Person("John", "Doe"));

        if(pl.contains(new Person("Jane", "Doe"))) {
            System.out.println("YES YES");
        } else {
            System.out.println("No No");
        }




        if (persons.contains(new Person("Jimi", "Hendrickx"))) {
            System.out.println("yes");
        }


    }
}





