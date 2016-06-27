/**
 * Created by jonsnow on 14/06/16.
 */
public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;


    }
    public boolean equals (Object person){
        if (compareTo((Person)person)==0 ) {
            return true;
        }
        return false;
    }

    public String getFullName(){
        return firstName+ " "+lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person that) {
//        return (this.lastName+this.firstName).compareTo(that.lastName+that.firstName);
        return (this.lastName).compareTo(that.lastName);
    }



}
