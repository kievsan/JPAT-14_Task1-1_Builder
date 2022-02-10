// package knhel7.jd14.jpat4.task11;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public boolean hasAge() {
        return age > 0;
    }
    public boolean hasAddress() {
        return !city.isEmpty();
    }
    public int happyBirthday() {
        return hasAge() ? age++ : age;
    }
    public String setAddress(String address) {
        city = address;
        return city;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getAge() { return age; }
    public String getAddress() { return city; }

    public PersonBuilder newFamilyMemberBuilder() {
        return new PersonBuilder().setSurname(getSurname()).setAddress(getAddress());
    }

    @Override
    public String toString() {
        return surname + " " + name +
                (hasAge() ? ", " + age + "y." : "") +
                (hasAddress() ? ", " + city : "");
    }

    @Override
    public int hashCode() {
        return hashCode();
    }

}
