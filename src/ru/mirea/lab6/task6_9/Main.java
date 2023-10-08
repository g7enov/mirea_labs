package ru.mirea.lab6.task6_9;

public class Main {
    static Printable[] book_shop = new Printable[]{new Book("1984", 300), new Magazine("Science", "January"),
            new Book("Война и мир", 100000), new Magazine("Forbes", "May")};

    public static void main(String[] args) {
        for (int i = 0; i < book_shop.length; i++){
            book_shop[i].print();
        }
        //
        System.out.println("Далее вывод для 7 работы 7 пункта");
        Magazine.printMagazines(book_shop);
    }
}
