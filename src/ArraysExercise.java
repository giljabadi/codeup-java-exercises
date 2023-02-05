import java.util.Arrays;

public class ArraysExercise {
    public static Person[] addPerson(Person[] persons, Person person){
        Person[] temp = new Person[persons.length+1];

        for(int i=0; i< persons.length; i++){
            temp[i] = persons[i];
        }

        temp[temp.length-1] = person;

        return temp;
    }
    @
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];
        persons[0] = new Person("Anthony");
        persons[1] = new Person("Susan");
        persons[2] = new Person("Bob");

        for(Person person: persons){
            System.out.printf("%s\n",person.name);
        }
        System.out.println("\nAdding 2  new people...\n");
        persons = addPerson(persons,new Person("Shawn"));
        persons = addPerson(persons, new Person("Pam"));

        for(Person person: persons){
            System.out.printf("%s\n",person.name);
        }

    }
}