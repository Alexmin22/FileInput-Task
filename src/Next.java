import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Next {
    //3. Самые частые байты
    //Ввести с консоли имя файла
    //Найти байт или байты с максимальным количеством повторов
    //Вывести их на экран через пробел.
    //Закрыть поток ввода-вывода

    //4. Самые редкие байты
    //Ввести с консоли имя файла
    //Найти байт или байты с минимальным количеством повторов
    //Вывести их на экран через пробел
    //Закрыть поток ввода-вывода

    //5. Сортировка байт
    //Ввести с консоли имя файла
    //Считать все байты из файла.
    //Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
    //Вывести на экран
    //Закрыть поток ввода-вывода
    //
    //Пример байт входного файла
    //44 83 44
    //Пример вывода
    //44 83
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/test.txt");
        List<Integer> al = new ArrayList<>();
        Map<Integer, Integer> mapa = new HashMap<>();

        while (fis.available() > 0) {
            al.add(fis.read());
        }
        fis.close();

        for (Integer integer : al) {
            int count = 0;
            for (int i = 0; i < al.size(); i++) {
                if (integer == al.get(i)) {
                    count++;
                    mapa.put(integer, count);
                }
            }
        }

        al.clear();
            int max = 0;
            int min = 100;
            int maxCount = 0;
            int minCount = 0;

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            System.out.println(entry);      //для ручной проверки результата
            al.add(entry.getKey());
            if (entry.getValue()>max) {
                max = entry.getValue();
                maxCount = entry.getKey();
            } else if (entry.getValue()<min) {
                min = entry.getValue();
                minCount = entry.getKey();
            }
        }
        Collections.sort(al);

        System.out.println("Самый частый размер: " + maxCount + ", он повторяется "+ max + " раз");
        System.out.println("Самый редкий размер: " + minCount + ", он повторяется "+ min + " раз");
        System.out.println("Байты без дублей по возрастанию: " + al);
    }
}
