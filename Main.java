public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Monisha Talukder", 21);
        Person person2 = new Person("Mou Talukder", 30);

        System.out.println("Person 1 - Name: " + person1.getName() + ", Age is " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age is " + person2.getAge());
    }
}