package homework31;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
  //"Кости"
//Сделать программу, которая будет выкидывать кости.
//Сначала программа должна спросить сколько костей выкидывать.
//Если пользователь вводит 1 или 2, программа кидает соответствующее количество костей.
//В противном случае, программа должна написать, что у нее нет такого количества костей.
//В качестве "выкидывания костей" просто вывести нужное количество значений от 1 до 6.
//
//Напоминание: игральные кости - кубик, на каждой стороне которого написаны числа в какой-либо форме.
//Обычно это числа от 1 до 6
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Сколько кидать костей? 1 или 2 ?");
    int input = scanner.nextInt();
    if (input == 1) {
      int number = 1 + random.nextInt(6 - 1);
      System.out.println("Выпало число " + number);
    } else {
      int number1 = 1 + random.nextInt(6 - 1);
      int number2 = 1 + random.nextInt(6 - 1);
      System.out.println("Выпало 2 числа " + number1 + " и " + number2);
    }
  }
}
