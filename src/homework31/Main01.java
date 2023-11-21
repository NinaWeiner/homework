package homework31;

import java.util.Scanner;

public class Main01 {
//Скопировать код из задания 30 задачи 02 (там где формула).
//Сделать так, чтобы числа вводились пользователем в консоли.
//Пример выполнения:
//    Ввод:
//    5
//    7
//    2
//    3
//    Вывод:
//    46.6666666

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextInt();
    double b = scanner.nextInt();
    double c = scanner.nextInt();
    double d = scanner.nextInt();

    // Вычисление результата выражения
    double result = a * (b - d) + c * a / d;

    // Вывод результата в консоль
    System.out.println(a + " * " + "(" + b + " - " + d + ")" + " + " + c +
        " * " + a + " / " + d + " = " + result);
  }
}
