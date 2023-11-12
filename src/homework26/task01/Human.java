package homework26.task01;

public class Human {

  public String name;
  int age;
  public Human(String name,int age) {  // KONSTRUKTIOR
    this.name = name;
    this.age = age;
  }
  public void introduce() {
    System.out.println("Hello, my name is " + name + " i am " + age + " yers old.");
  }

}
