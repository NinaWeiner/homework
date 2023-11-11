package homework25.task02;

public class Main {
  /*
  Создать класс Pen (ручка). Сделать свойство количество чернил, установить значение 1000
  Описать метод write(String), который принимает строку и выводит ее в консоль.
  При этом количество чернил должно уменьшаться на количество написанных символов.
  Если в ручке недостаточно чернил, ручка не должна написать в консоль вообще ничего.
  Описать метод refill(), который установит количество чернил обратно на 1000.
  Описать метод checkInk(), который напишет в консоль, сколько в ручке осталось чернил.

  Продемонстрировать работу объекта класса Pen в методе main() класса Main в свободной форме.
  Главное условие - должны быть вызваны все методы класса.
  */
  public static void main(String[] args) {
    Pen pen = new Pen();
    pen.checkInk();
    pen.write("Hello, im writing with this pen");
    pen.checkInk();
    pen.write("And now gonna refill it");
    pen.checkInk();
    pen.refill();
    pen.checkInk();
  }
}