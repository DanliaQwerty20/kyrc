package io.project.task3.present;

abstract class Sweet {
    protected String name;
    protected double weight;
    protected double price;

    public Sweet(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public abstract String getUniqueParameter();

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (Weight: " + weight + ", Price: " + price + ", Unique Parameter: " + getUniqueParameter() + ")";
    }
}
