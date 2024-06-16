import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            switch (string) {
                case "Понедельник":
                case "Вторник":
                case "Среда":
                case "Четверг":
                case "Пятница":
                    System.out.println("Рабочий день");
                    break;
                case "Суббота":
                case "Воскресенье":
                    System.out.println("Выходной");
                    break;
                default:
                    set.add(string);
                    System.out.println("Ошибка");
                    break;

            }
        }
    }
}


//1. Вводится 5 чисел. Напишите "Yes", если они не все равны между собой.
//    1.1 Нужно использовать Set
//    1.2 Запрещено писать в if условие (1 == 2 и 2 == 3 и 3 == 4), contains использовать нельзя
//
//    2. Вводится день недели. Напишите тип это дня (выходной или рабочий). Используйте для этого set.
//    2.1 Если такого дня не существует - напишите "Ошибка".
