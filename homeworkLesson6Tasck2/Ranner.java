package homeworkLesson6Tasck1;
import java.util.Scanner;

public class Ranner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            FullNameConsoleReader reader = new FullNameConsoleReaderImpl();
            FullName fullName = reader.read();
            System.out.println("Object is successfully created: " + fullName);

    }
}
