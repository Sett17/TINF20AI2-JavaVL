package recyclingYard3;

public class Trash{
    public double getWeight() {
        return weight;
    }

    private final double weight;

    public Trash(double weight) {
        this.weight = weight;
//        System.out.println("starting weight: " + weight);
    }
}
