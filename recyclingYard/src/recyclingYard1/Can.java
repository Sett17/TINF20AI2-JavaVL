package recyclingYard1;

public class Can {
    public double getWeight() {
        return weight;
    }

    private double weight;

    public Can(double weight) {
        this.weight = weight;
        System.out.println("starting weight: " + weight);
    }

    protected void melt() {
        System.out.println("melted! weight now: " + weight);
    }
}
