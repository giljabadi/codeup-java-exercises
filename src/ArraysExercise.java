import java.util.Arrays;
public class ArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        ////////////////////
        Person[] people = new Person[3];

        people[0] = new Person("Gil");
        people[1] = new Person("Andre");
        people[2] = new Person("Kaylee");

        for (Person p : people) {
            System.out.println(p.getName());
        }
        ///////////////////////////////////

    }
    public static Person[] addPerson(Person[] oldArr, Person newPerson) {
        Person[] newArr = Arrays.copyOf(oldArr, oldArr.length+1);
        newArr[oldArr.length - 1] = newPerson;
        System.out.println(newArr[oldArr.length - 1].getName());
        return newArr;

    }

}
