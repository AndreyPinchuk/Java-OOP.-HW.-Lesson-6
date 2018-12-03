package homeworkLesson6Tasck4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileLineNumerator file1 = new FileLineNumerator("c:\\Program Files\\Java\\OOP Java\\src\\homeworkLesson6Tasck4\\hamlet.txt", "c:\\Program Files\\Java\\OOP Java\\src\\homeworkLesson6Tasck4\\hamlet-with-line-nums.txt").runLineNumeration();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
