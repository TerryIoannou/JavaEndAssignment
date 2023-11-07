/**
 * The Package class represents a package with a specific weight and type.
 */
public class Package {
    private double weight; // Stores the weight of the package in kilograms
    private PackageType type; // Stores the type of the package (e.g., REGULAR, EXPRESS, FRAGILE)

    /**
     * Constructs a new Package with the specified weight.
     *
     * @param weight The weight of the package in kilograms.
     */
    public Package(double weight) {
        this.weight = weight;
        this.type = type;
    }

    /**
     * Gets the weight of the package.
     *
     * @return The weight of the package in kilograms.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets the type of the package.
     *
     * @return The type of the package (e.g., REGULAR, EXPRESS, FRAGILE).
     */
    public PackageType getType() {
        return type;
    }
}
