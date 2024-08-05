
public class Main {
    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird genericBird = new Bird();
        makeBirdFly(genericBird); // Output: The bird is flying.

        Bird penguin = new Penguin();
        makeBirdFly(penguin); // Throws UnsupportedOperationException: Penguins can't fly.
    }
}
