public class Main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();

        // Person add
        Person person1 = new Person("John Doe", 25);
        personManager.displayPersonDetails(person1);

        //Attempt with null person
        Person person2 = null;
        personManager.displayPersonDetails(person2);

        // Attempt to print null person
        Person person3 = new Person(null, 30);
        personManager.displayPersonDetails(person3);
    }
}