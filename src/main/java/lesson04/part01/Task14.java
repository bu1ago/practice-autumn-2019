package lesson04.part01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 * 3. Выведи результат на экран, каждое значение с новой строки.
 *
 * Требования:
 * 1.	Проинициализируй переменную типа список строк.
 * 2.	Считай 10 строк с клавиатуры и добавь их в список.
 * 3.	Метод doubleValues должен удваивать элементы списка
 * по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
 * 4.	Выведи получившийся список на экран, каждый элемент с новой строки.
 */

public class Task14 {
  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i=0; i<10; i++)
      list.add(reader.readLine());

    for (String str: doubleValues(list))
      System.out.println(str);
  }

  public static ArrayList<String> doubleValues(ArrayList<String> list) {
    for (int i=0; i<list.size();) {
      list.add(i, list.get(i));
      i+=2;
    }
    return list;
  }
}
