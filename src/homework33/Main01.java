package homework33;

public class Main01 {
  //Разработать метод, изменяющий знаки всех элементов целочисленного массива на противоположные
//Продемострировать работу метода в свободной форме
//Пример:
//    Вводные данные: 1 5 7 -4 8 -3 -6
//    Результат: -1 -5 -7 4 -8 3 6

  public static void changeSign(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = - arr[i];
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {1, 5, 7, -4, 8, -3, -6};
    changeSign(arr);
  }
}

