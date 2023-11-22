package homework25.task01;
//Создать класс Human. Для него указать свойства имя и возраст
//В классе, описать метод introduce(), где объект представится, выведя информацию про себя в консоль
//Создать класс Main, в нем, в методе main(), создать три экземпляра класса Human,
//для них задать разные имена и возраста.
//Вызвать метод introduce() для каждого объекта по очереди.

public class Main01 {

  public static void main(String[] args) {

    Human anastasia = new Human();
    anastasia.name = "Anastasia";
    anastasia.agg = 36;

    Human wadim = new Human();
    wadim.name = "Wadim";
    wadim.agg = 19;

    Human marie = new Human();
    marie.name = "Marie";
    marie.agg = 28;

    anastasia.introduce();
    wadim.introduce();
    marie.introduce();
  }
}
