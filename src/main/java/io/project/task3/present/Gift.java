package io.project.task3.present;


import java.util.ArrayList;
import java.util.List;

public class Gift {
    public static void main(String[] args) {
        List<Sweet> gift = new ArrayList<>();
        gift.add(new Candy("Chocolate", 100, 50, "Milk"));
        gift.add(new Jellybean("Jelly", 50, 20, "Red"));
        gift.add(new Candy("Lollipop", 75, 30, "Strawberry"));

        double totalWeight = 0;
        double totalPrice = 0;

        System.out.println("Сладости в подарке:");
        for (Sweet sweet : gift) {
            System.out.println(sweet);
            totalWeight += sweet.getWeight();
            totalPrice += sweet.getPrice();
        }

        System.out.println("Общий вес подарка: " + totalWeight);
        System.out.println("Общая стоимость подарка: " + totalPrice);
    }
}