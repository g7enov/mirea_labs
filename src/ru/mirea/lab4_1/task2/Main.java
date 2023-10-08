package ru.mirea.lab4_1.task2;

public class Main {
    static String[] numbers = new String[]{"897654321", "880012345", "812345679"};

    public static void main(String[] args) {
        //1
        Phone phone1 = new Phone();
        phone1.setNumber("890909090");
        Phone phone2 = new Phone("890000000","Model_B");
        Phone phone3 = new Phone("88112233", "Model_C", 200);
        //6
        System.out.println(phone1.getNumber());
        phone1.receiveCall("Ivan");

        System.out.println("\n");

        System.out.println(phone2.getNumber());
        phone2.receiveCall("Alex");

        System.out.println("\n");

        System.out.println(phone3.getNumber());
        phone3.receiveCall("Victor", "1234567890");

        System.out.println("\n");
        //13-14
        phone1.sendMessage(numbers);
    }
}
