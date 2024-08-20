package io.project.task3.present;

class Jellybean extends Sweet {
    private String color;

    public Jellybean(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    @Override
    public String getUniqueParameter() {
        return color;
    }
}