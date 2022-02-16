// package knhel7.jd14.jpat4.task11;

import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected OptionalInt age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public boolean hasAge() {
        return age.isPresent();
    }
    public boolean hasAddress() {
        return !city.isEmpty();
    }

    public Person happyBirthday() {
        if (hasAge()) {
            int intAge = getIntAge();
            this.age = OptionalInt.of(++intAge);
        }
        return this;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public OptionalInt getAge() { return age; }
    public int getIntAge() { return  age.orElse(0); }
    public String getStrAge() { return  hasAge() ? ", " + getIntAge() + "y." : ""; }
    public String getAddress() { return city; }

    public PersonBuilder newFamilyMemberBuilder() {
        return new PersonBuilder().setSurname(getSurname()).setAddress(getAddress());
    }

    @Override
    public String toString() {
        return surname + " " + name +
                getStrAge() +
                (hasAddress() ? ", " + city : "");
    }

    @Override
    public int hashCode() {
        return hashCode();
    }

}
