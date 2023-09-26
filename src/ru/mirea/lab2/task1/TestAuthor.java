package ru.mirea.lab2.task1;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args){
        Author author_1 = new Author("Nikolay", "nikolay@yandex.ru", 'M');
        System.out.println(author_1.toString());

        Scanner sc = new Scanner(System.in);
        String new_email;
        System.out.println("enter new email");
        new_email = sc.next();
        author_1.setEmail(new_email);

        System.out.println("name: " + author_1.getName() + ", email: " + author_1.getEmail() + ", gender: " + author_1.getGender());
    }
}


