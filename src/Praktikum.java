import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        isLeapYear(year);// здесь нужно вывести результат
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println("12.09." + year);
        }else if (year % 400 == 0) {
            System.out.println("12.09." + year);
        }else {
            System.out.println("13.09." + year);
        }// здесь нужно определить, является ли переданный год високосным
    }
    }
