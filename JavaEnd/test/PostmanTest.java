import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    @Test
    void getWeight() {
        // Arrange
        Postman postman = new Postman("John Doe", 8, 1.0);

        // Act
        double weight = postman.getWeight();

        // Assert
        assertEquals(80, weight);
    }

    @Test
    void setWeight() {
        // Arrange
        Postman postman = new Postman("John Doe", 8, 2.0);

        // Act
        postman.setWeight(85);

        // Assert
        assertEquals(85, postman.getWeight());
    }

    @Test
    void calculateMaxCarryingCapacity() {
        // Arrange
        Postman postman = new Postman("John Doe", 80,2.5);

        // Act
        double maxCapacity = postman.calculateMaxCarryingCapacity();

        // Assert
        assertEquals(400, maxCapacity);
    }

    @Test
    void getName() {
        // Arrange
        Postman postman = new Postman("John Doe", 80,1.0);

        // Act
        String name = postman.getName();

        // Assert
        assertEquals("John Doe", name);
    }

    @Test
    void setName() {
        // Arrange
        Postman postman = new Postman("John Doe", 8,4.0);

        // Act
        postman.setName("Jane Smith");

        // Assert
        assertEquals("Jane Smith", postman.getName());
    }

    @Test
    void getAge() {
        // Arrange
        Postman postman = new Postman("John Doe", 80,1.2);

        // Act
        int age = postman.getAge();

        // Assert
        assertEquals(80, age);
    }

    @Test
    void setAge() {
        // Arrange
        Postman postman = new Postman("John Doe", 80, 2.7);

        // Act
        postman.setAge(35);

        // Assert
        assertEquals(35, postman.getAge());
    }
}