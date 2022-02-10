// package knhel7.jd14.jpat4.task11;

public interface PersonBuilderable {

    PersonBuilderable setName(String name);
    PersonBuilderable setSurname(String surname);
    PersonBuilderable setAge(int age);
    PersonBuilderable setAddress(String address);
    Person build();

}
