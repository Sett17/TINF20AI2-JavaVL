package recyclingYard1;

public class Carton {
    public double getWeight() {
        return weight;
    }

    private double weight;

    public Carton(double weight) {
        this.weight = weight;
        System.out.println("starting weight: " + weight);
    }

    protected void soak() {
        weight = (weight + Math.pow(weight, 1.5));
        System.out.println("soaked! weight now: " + String.format("%,.2f", weight));
    }
}
