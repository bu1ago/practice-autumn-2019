package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна дважды считать данные c клавиатуры.
 * 2.	Программа должна использовать команду System.out.println() или System.out.print().
 * 3.	Если возраст меньше 18 вывести только сообщение "Подрасти еще".
 * 4.	Если возраст больше либо равно 18 ничего не выводить.
 */

public class Task22 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18) System.out.println("Подрасти ещё");
    }
}
