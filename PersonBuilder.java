// package knhel7.jd14.jpat4.task11;

import java.util.OptionalInt;

public class PersonBuilder implements PersonBuilderable {

    protected String name;
    protected String surname;
    protected OptionalInt age;
    protected String city;

    PersonBuilder() { initialBuilder(); }

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        this.age = OptionalInt.of(age);
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    @Override
    public Person build() throws IllegalArgumentException, IllegalStateException {
        if (name.isEmpty() || surname.isEmpty())
            throw new IllegalStateException("The necessary data is missing!");
        Person person = new Person(name, surname);
        if (age.orElse(0) < 0)
            throw new IllegalArgumentException("Unacceptable age!");
        person.age = age;
        person.city = this.city;

        initialBuilder();
        
        return person;
    }

    private void initialBuilder() {
        this.name = "";
        this.surname = "";
        this.age = OptionalInt.empty();
        this.city = "";
    }

}

