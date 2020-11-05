package ru.geekbrains.java;

import java.util.Scanner;

public class FirstAdd {

    public static Scanner scanner = new Scanner(System.in);                         //Объявил общий сканер для всех методов

    public static void main(String[] args) {
        System.out.println("Цель игры - угадать число с трех попыток.");
        int range = 9;
        int number = (int) (Math.random() * range);

        play(range, number);                                                        //Игру обернул в метод, чтобы к нему можно было вновь вернуться
        System.out.println("Конец игры.");

        System.out.println("Еще раз съиграем? 1-да, 2-нет");
        int input = scanner.nextInt();
        if(input == 1){play(range, number);}                                        //Если игрок выберет 1, то игра заново начнется, иначе прощаемся
        else System.out.println("До новых встреч!!!");
        scanner.close();
    }
        private static void play( int range, int number) {
            System.out.println("Угадай число от 0 до " + range);
            for (int i = 3; i > 0; i--) {                                           //Цикл для трех попыток угадать число
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Великолепно! Ты угадал!");
                    break;
                } else if (input_number > number && input_number <= range) {
                    System.out.println("Неверно! Загаданное число меньше.");
                } else if (input_number < number) {
                    System.out.println("Неверно! Загаданное число больше.");
                } else {                                                            //Если ввести число иное от предложенного варианта
                    System.out.println("Это не по-правилам!");
                }
            }

        }
    }