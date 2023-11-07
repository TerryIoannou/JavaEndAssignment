/**
 * The Postman class represents a person who works for a postal service and has a maximum carrying capacity based on their weight.
 * Extends the Person class to inherit name and age attributes.
 */
public class Postman extends Person {
    private double weight; // Stores the weight of the postman in kilograms

    /**
     * Constructs a new Postman with the specified name, age, and weight.
     *
     * @param name   The name of the postman.
     * @param age    The age of the postman.
     * @param weight The weight of the postman in kilograms.
     */
    public Postman(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    /**
     * Gets the weight of the postman.
     *
     * @return The weight of the postman in kilograms.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the postman.
     *
     * @param weight The new weight of the postman in kilograms.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Calculates and returns the maximum carrying capacity of the postman based on their weight.
     *
     * @return The maximum carrying capacity of the postman in kilograms.
     */
    public double calculateMaxCarryingCapacity() {
        return weight * 5;
    }
}
