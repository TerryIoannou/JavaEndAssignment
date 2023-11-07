/**
 * The Person class represents an individual with a name and age.
 */
public class Person {
    private String name; // Stores the name of the person
    private int age; // Stores the age of the person

    /**
     * Constructs a new Person with the specified name and age.
     *
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age The new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }
}
