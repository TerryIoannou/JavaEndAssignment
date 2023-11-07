import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PackageTest {

    @Test
    void getWeight() {
        // Arrange
        Package package1 = new Package(2.0,PackageType.EXPRESS);

        // Act
        double weight = package1.getWeight();

        // Assert
        assertEquals(2.0, weight);
    }

    @Test
    void getType() {
        // Arrange
        PackageType type = PackageType.REGULAR;
        Package package1 = new Package(2.0, type);

        // Act
        PackageType retrievedType = package1.getType();

        // Assert
        assertEquals(type, retrievedType);
    }
}
