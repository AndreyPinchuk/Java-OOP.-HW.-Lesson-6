package homeworkLesson6Tasck1;

public class IllegalFullNameException extends RuntimeException {
    @Override
    public String getMessage() {
        return "ошибка: например, отсутствует пробел или пробелов больше, чем один";
    }
}