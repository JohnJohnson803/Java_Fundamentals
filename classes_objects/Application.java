class Person{

    //Instance variables (data or "state")
    String name;
    int age;

    //classes can contain data

    // 1. Data
    // 2. Subroutines (methods)

    void speak()
    {
        System.out.println("My name is " + name);
    }
}

public class Application{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.name = "Johnathan";
        person1.age = 27;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Jermar";
        person2.age = 19;
        person2.speak();

        System.out.println(person1.name + "\n" + "age: " + person1.age + "\n");
        System.out.println(person2.name + "\n" + "age: " + person2.age);
    }
}