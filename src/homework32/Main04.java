package homework32;

import java.util.Scanner;

public class Main04 {

  //Сложность: средне (4/10)
//
//Запросить у пользователя размер массива, потом сам массив целых чисел.
//Проверить, является ли массив посортированым по возрастанию.
//Пример 1:
//    Ввод:
//    5
//    1 6 7 89 123
//    Вывод:
//    Массив отсортирован
//Пример 2:
//    Ввод:
//    6
//    1 5 3 7 88 4
//    Вывод:
//    Массив не отсортирован
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[scanner.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
      System.out.print(arr[i] + " ");
    }
    // проверим, отсортирован ли массив:
    for (int i = 0; i < arr.length; i++) {
      if (arr[i-1] < arr[i]) {
        System.out.println("da");
      }else {
        System.out.println("net");
      }
    }// я не знаю, почему то не работает код
  }
}

