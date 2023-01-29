import java.io.*;

public class HalfFile {
    //4. Реверс файла
    //
    //Считать с консоли 2 имени файла: файл1, файл2.
    //Записать в файл2 все байты из файл1, но в обратном порядке
    //Закрыть потоки. Не использовать try-with-resources
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        char[] buff = new char[(int) file.length()];

        try (FileReader fr = new FileReader("data.txt");
             FileWriter fw = new FileWriter("file2.txt", true);)  {
            int ch;
            StringBuilder st = new StringBuilder(" ");
            while ((ch = fr.read()) != -1) {
                    st.append((char) ch);
            }
            fw.write(st.toString());
        }


    }

    }
