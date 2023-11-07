import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        // Arrange
        Person person = new Person("Jayjay", 25);

        // Act
        String name = person.getName();

        // Assert
        assertEquals("Jarry", name);
    }

    @Test
    void setName() {
        // Arrange
        Person person = new Person("Johnny", 20);

        // Act
        person.setName("Jane Smith");

        // Assert
        assertEquals("Jane Smith", person.getName());
    }

    @Test
    void getAge() {
        // Arrange
        Person person = new Person("Parry", 40);

        // Act
        int age = person.getAge();

        // Assert
        assertEquals(30, age);
    }

    @Test
    void setAge() {
        // Arrange
        Person person = new Person("Perry", 280);

        // Act
        person.setAge(35);

        // Assert
        assertEquals(35, person.getAge());
    }
}
