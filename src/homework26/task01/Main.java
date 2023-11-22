package homework26.task01;

public class Main {

  public static void main(String[] args) {
    Human anastasia = new Human("Anastasia",36);
    /* anastasia.name = "Anastasia";
    anastasia.age = 36
     */
    Human wadim = new Human("Wadim",19);
    /* wadim.name = "Wadim";
    wadim.age = 19;
     */
    Human maria = new Human("Maria", 28);
    /* maria.name = "Maria";
    maria.age = 28;
     */
    anastasia.introduce();
    wadim.introduce();
    maria.introduce();
  }
}
