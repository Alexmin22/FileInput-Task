import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    //Ввести с консоли имя файла
    //Найти максимальный байт в файле, вывести его на экран.
    //Найти минимальный байт в файле, вывести его на экран.
    //Закрыть поток ввода-вывода
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/test.txt");
        int max = 0;
        int min = 50;
        while (fis.available()>0) {
            int current = fis.read();
            System.out.print(current+" ");  //для проверки работоспособности кода
            if (current>max) {
                max = current;
            } else if (current<min) {
                min = current;
            }
        }
        fis.close();
        System.out.println("\nMAX= "+max);
        System.out.println("MIN= "+ min);
    }
}