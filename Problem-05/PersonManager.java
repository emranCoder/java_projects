class PersonManager {
    public void displayPersonDetails(Person person) {
        try {
            if (person == null || person.getName() == null) {
                throw new NullPointerException("Person not found!.");
            }
            System.out.println("Persons Details: ");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("--------------------------------");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}