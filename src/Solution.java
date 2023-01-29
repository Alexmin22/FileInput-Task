import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
1. Исправить ошибки

Исправить функциональность в соответствии с требованиями
Программа должна:
1. переписать все байты одного файла в другой одним куском.
2. закрывать потоки ввода-вывода

Подсказка: 4 ошибки
*/

    public class Solution {
        public static void main(String[] args) throws IOException {
            FileInputStream inputStream = new FileInputStream("data.txt");
            FileOutputStream outputStream = new FileOutputStream("result.txt");

            byte[] buffer = new byte[1000];
            while (inputStream.available()>0) {
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }

            inputStream.close();
            outputStream.close();
        }
    }
//ИСПРАВЛЕНО!