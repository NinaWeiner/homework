package homework27.task01;

public class Main {
  public static void main(String[] args) {
    Human human = new Human("Anastasia" , 36);
    System.out.println("Hello, my name is " + human.getName() + ", i am "
        + human.getAge() + " years old.");

    Human human1 = new Human("Wadim", 19);
    System.out.println("Hello, my name is " + human.getName() + ", i am " +
        human1.getAge() + " years old.");

    Human human2 = new Human("Marie" , 28);
    System.out.println("Hello, my name is " + human2.getName() + ", i am " +
        human2.getAge() + " years old.");
  }
}


