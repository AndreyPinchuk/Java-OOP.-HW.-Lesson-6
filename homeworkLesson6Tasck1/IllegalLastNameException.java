package homeworkLesson6Tasck1;

public class IllegalLastNameException extends IllegalFullNameException{
    @Override
    public String getMessage() {
        return "Некорректная фамилия";
    }
}
