package homeworkLesson6Tasck1;

public class IllegalFirstNameException extends IllegalFullNameException{
    @Override
    public String getMessage() {
        return "Некорректное имя";
    }
}