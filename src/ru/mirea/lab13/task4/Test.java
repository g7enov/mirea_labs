package ru.mirea.lab13.task4;

public class Test {
    public static void main(String[] args) {
        String[] shirts = new String[]{ "S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L",
                                        "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M",
                                        "S005,Tan Polo Shirt,Tan,XL", "S006,Black T-Shirt,Black,XL",
                                        "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L"};
        Shirt[] shirtObjects = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            shirtObjects[i] = new Shirt(shirts[i]);
            System.out.println(shirtObjects[i].toString() + "\n");
        }
    }
}
