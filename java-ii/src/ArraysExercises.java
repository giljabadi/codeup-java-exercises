import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Mia"), new Person("Arri"), new Person("Mikhah")};
        for (Person person: people) {
            System.out.print(person.getName() + " ");
        }

        System.out.println("");

        people = addPerson(people, new Person("David"));
        for (Person person: people) {
            System.out.print(person.getName() + " ");
        }
    }

    public static Person[] addPerson(Person[] people, Person person){
        ArrayList<Person> arrayList = new ArrayList<Person>(Arrays.asList(people));
        arrayList.add(person);
        return arrayList.toArray(people);
    }

}
