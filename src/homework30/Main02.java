package homework30;

public class Main02 {

  //Создать переменные a, b, c и d и задать им какие-то значения из головы.
//Посчитать результат выражения (записано математически): a(b-d)+ca/d
//Вывести результат в консоль.
//Пример вывода:
//    Результат: 2,23
  public static void main(String[] args) {
    double a = 2.0;
    double b = 3.0;
    double c = 1.5;
    double d = 0.5;

    double res = a * (b - d) + c * a / d;

    System.out.println("Результат: " + res);
  }
}

