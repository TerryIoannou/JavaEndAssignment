import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DepotTest {

    @Test
    void getPostmen() {
        // Arrange
        Depot depot = new Depot();
        Postman postman1 = new Postman("John Doe", 8,1.0);
        Postman postman2 = new Postman("Jane Smith", 7, 2.0);
        depot.addPostman(postman1);
        depot.addPostman(postman2);

        // Act
        List<Postman> postmen = depot.getPostmen();

        // Assert
        assertEquals(2, postmen.size());
        assertTrue(postmen.contains(postman1));
        assertTrue(postmen.contains(postman2));
    }

    @Test
    void setPostmen() {
        // Arrange
        Depot depot = new Depot();
        Postman postman1 = new Postman("John Doe", 8,2.0);
        Postman postman2 = new Postman("Jane Smith", 7,2.0);
        List<Postman> newPostmen = List.of(postman1, postman2);

        // Act
        depot.setPostmen(newPostmen);

        // Assert
        assertEquals(2, depot.getPostmen().size());
        assertTrue(depot.getPostmen().contains(postman1));
        assertTrue(depot.getPostmen().contains(postman2));
    }

    @Test
    void getPackages() {
        // Arrange
        Depot depot = new Depot();
        Package package1 = new Package(2.0,PackageType.REGULAR);
        Package package2 = new Package(3.0,PackageType.FRAGILE);
        depot.addPackage(package1);
        depot.addPackage(package2);

        // Act
        List<Package> packages = depot.getPackages();

        // Assert
        assertEquals(2, packages.size());
        assertTrue(packages.contains(package1));
        assertTrue(packages.contains(package2));
    }

}
