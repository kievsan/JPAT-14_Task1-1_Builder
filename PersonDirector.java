// package knhel7.jd14.jpat4.task11;

// Task11
// Домашнее задание к занятию 1.1.
// Порождающие шаблоны.
// Builder (Строитель).
// Задача 1. Люди

public class PersonDirector {

    public static void main(String[] args) {

        PersonBuilderable builder = new PersonBuilder();
        Person headPerson1 = builder
                .setName("Alex").setSurname("First").setAge(47).setAddress("Moscow")
                .build();
        Person houseWifePerson1 = headPerson1.newFamilyMemberBuilder()
                .setName("Lisa").setAge(39)
                .build();
        Person daughterPerson1 = headPerson1.newFamilyMemberBuilder()
                .setName("Kate").setAge(14)
                .build();

        System.out.println("\nthe head of the family-1: " + headPerson1);
        System.out.println("the hostess there: " + houseWifePerson1);
        System.out.println("the child there: " + daughterPerson1);
        System.out.println("Happy birthday to you: " + daughterPerson1.happyBirthday());

        Person headPerson2 = builder
                .setName("Ostin").setSurname("Next").setAddress("Rostov")
                .build();
        Person houseWifePerson2 = headPerson2.newFamilyMemberBuilder()
                .setName("Anny")
                .build();

        System.out.println("\nthe head of the family-2: " + headPerson2);
        System.out.println("the hostess there: " + houseWifePerson2);
        System.out.println("Happy birthday to you: " + houseWifePerson2.happyBirthday());

    }

}
