package recyclingYard2;

abstract public class Trash {
    public double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    private double weight;

    public Trash(double weight) {
        this.weight = weight;
        System.out.println("starting weight: " + weight);
    }

    abstract public void recycle();
}
