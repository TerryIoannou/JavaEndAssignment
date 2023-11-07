/**
 * The PackageType enum represents different types of packages along with their respective weight multipliers.
 */
public enum PackageType {
    REGULAR(0.1),      // Example: Regular packages have a weight multiplier of 0.1
    EXPRESS(0.2),      // Example: Express packages have a weight multiplier of 0.2
    FRAGILE(0.3);      // Example: Fragile packages have a weight multiplier of 0.3

    private final double weightMultiplier; // The weight multiplier associated with the package type

    /**
     * Constructor to initialize a PackageType with a specific weight multiplier.
     *
     * @param weightMultiplier The weight multiplier for the package type.
     */
    PackageType(double weightMultiplier) {
        this.weightMultiplier = weightMultiplier;
    }

    /**
     * Gets the weight multiplier for the package type.
     *
     * @return The weight multiplier.
     */
    public double getWeightMultiplier() {
        return weightMultiplier;
    }
}
