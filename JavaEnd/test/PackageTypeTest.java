import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PackageTypeTest {

    @Test
    void getWeightMultiplier() {
        // Arrange
        PackageType regular = PackageType.REGULAR;
        PackageType express = PackageType.EXPRESS;
        PackageType fragile = PackageType.FRAGILE;

        // Act & Assert
        assertEquals(1.0, regular.getWeightMultiplier());
        assertEquals(1.2, express.getWeightMultiplier());
        assertEquals(1.5, fragile.getWeightMultiplier());
    }

    @Test
    void values() {
        // Arrange & Act
        PackageType[] values = PackageType.values();

        // Assert
        assertEquals(3, values.length);
        assertEquals(PackageType.REGULAR, values[0]);
        assertEquals(PackageType.EXPRESS, values[1]);
        assertEquals(PackageType.FRAGILE, values[2]);
    }

    @Test
    void valueOf() {
        // Arrange & Act
        PackageType regular = PackageType.valueOf("REGULAR");
        PackageType express = PackageType.valueOf("EXPRESS");
        PackageType fragile = PackageType.valueOf("FRAGILE");

        // Assert
        assertEquals(PackageType.REGULAR, regular);
        assertEquals(PackageType.EXPRESS, express);
        assertEquals(PackageType.FRAGILE, fragile);
    }
}
