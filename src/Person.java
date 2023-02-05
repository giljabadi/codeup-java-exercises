public class Person {

    public String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello my name is %s\n", this.name);
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//        Person anthony = new Person("Anthony");
//        anthony.sayHello();
//        anthony.setName("Anthony Stevens");
//        anthony.sayHello();

    }
}