// package knhel7.jd14.jpat4.task11;

public class PersonBuilder implements PersonBuilderable {

    protected String name;
    protected String surname;
    protected int age;
    protected String city;

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
        try {
            // Возраст недопустимый
            this.age = age;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        this.city = address;
        return  this;
    }

    @Override
    public Person build() {
        Person person = new Person(name, surname);
        person.age = this.age;
        person.city = this.city;
        return person;
    }

}
