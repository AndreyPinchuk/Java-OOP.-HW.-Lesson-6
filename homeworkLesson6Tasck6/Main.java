package homeworkLesson6Tasck6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ReSaveFile r1 = (ReSaveFile) new ReSaveFile("c:\\Program Files\\Java\\OOP Java\\src\\homeworkLesson6Tasck6\\births.csv", "c:\\Program Files\\Java\\OOP Java\\src\\homeworkLesson6Tasck6\\births2.csv").reSaveFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
