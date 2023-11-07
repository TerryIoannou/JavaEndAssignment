import java.util.ArrayList;
import java.util.List;

/**
 * The Depot class represents a depot for managing postmen, packages, and letters.
 */
public class Depot {
    private List<Postman> postmen = new ArrayList<>(); // List to store postmen
    private List<Package> packages = new ArrayList<>(); // List to store packages
    private List<Package> letters = new ArrayList<>(); // List to store letters

    /**
     * Gets the list of postmen.
     *
     * @return The list of postmen.
     */
    public List<Postman> getPostmen() {
        return postmen;
    }

    /**
     * Sets the list of postmen.
     *
     * @param postmen The list of postmen to set.
     */
    public void setPostmen(List<Postman> postmen) {
        this.postmen = postmen;
    }

    /**
     * Gets the list of packages.
     *
     * @return The list of packages.
     */
    public List<Package> getPackages() {
        return packages;
    }

    /**
     * Sets the list of packages.
     *
     * @param packages The list of packages to set.
     */
    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    /**
     * Gets the list of letters.
     *
     * @return The list of letters.
     */
    public List<Package> getLetters() {
        return letters;
    }

    /**
     * Sets the list of letters.
     *
     * @param letters The list of letters to set.
     */
    public void setLetters(List<Package> letters) {
        this.letters = letters;
    }

    /**
     * Adds a postman to the list of postmen.
     *
     * @param postman The postman to add.
     */
    public void addPostman(Postman postman) {
        postmen.add(postman);
    }

    /**
     * Adds a package to the list of packages.
     *
     * @param pack The package to add.
     */
    public void addPackage(Package pack) {
        packages.add(pack);
    }

    /**
     * Adds a letter to the list of letters.
     *
     * @param letter The letter to add.
     */
    public void addLetter(Package letter) {
        letters.add(letter);
    }

    /**
     * Tracks deliveries for each postman, showing the number of packages and letters delivered.
     */
    public void trackDeliveries() {
        for (Postman postman : postmen) {
            int packagesDelivered = 0;
            int lettersDelivered = 0;

            // Checking if each package can be delivered by the postman
            for (Package pack : packages) {
                if (pack.getWeight() <= postman.calculateMaxCarryingCapacity()) {
                    packagesDelivered++;
                }
            }

            // Checking if each letter can be delivered by the postman
            for (Package letter : letters) {
                if (letter.getWeight() <= postman.calculateMaxCarryingCapacity()) {
                    lettersDelivered++;
                }
            }

            // Printing delivery statistics for the postman
            System.out.println("Postman: " + postman.getName());
            System.out.println("Packages Delivered: " + packagesDelivered);
            System.out.println("Letters Delivered: " + lettersDelivered);
        }
    }
}
