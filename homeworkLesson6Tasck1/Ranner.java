package homeworkLesson6Tasck1;
import java.util.Scanner;

public class Ranner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Введиде пожалуйста своё Имя и Фамилию");
            String name = sc.nextLine();
            FullName fullName1 = new FullName();
            fullName1.parse(name);

            System.out.println(fullName1.toString());


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
