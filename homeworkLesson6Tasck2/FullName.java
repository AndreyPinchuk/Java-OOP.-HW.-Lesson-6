package homeworkLesson6Tasck1;

import java.util.Scanner;

public class FullName implements FullNameParser,FullNameConsoleReader {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public FullName() {
    }

    @Override
    public FullName parse(String s) {
        String[] sArr = s.split(" ");
            if (!isParseProbel(s)) {
                throw new IllegalFullNameException();
            } else {

                if (!isParseName(sArr[0])) {
                    throw new IllegalFirstNameException();
                } else if (!isParseName(sArr[1])) {
                    throw new IllegalLastNameException();
                } else {
                    sArr[0] = parseName(sArr[0]);
                    sArr[1] = parseName(sArr[1]);
                }
            }
            setFirstName(sArr[0]);
            setLastName(sArr[1]);
            FullName fullName = new FullName(sArr[0], sArr[1]);
            return fullName;
    }

    @Override
    public FullName read() {

        return null;
    }

    private boolean isParseProbel(String s) { //просмотр количество пробелов в стринге
        String[] sArr = s.split(" ");
        if (sArr.length != 2) {
            return false;
        }
        return true;
    }

    private String parseName(String s) {
        String s2;
        s2 = String.valueOf(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            s2 += Character.toLowerCase(s.charAt(i));
        }
        return s2;
    }

    private boolean isParseName(String s) { //просмотр чтоби вся стринга была с текста
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                counter++;
            }
        }
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" + firstName + " " + lastName + '}';
    }
}

class FullNameConsoleReaderImpl implements FullNameConsoleReader {
    @Override
    public FullName read() {
        Scanner sc = new Scanner(System.in);
        int a=0;
        FullName fullName = new FullName();
        do{
            System.out.println("Введиде пожалуйста своё Имя и Фамилию");
            String name = sc.nextLine();

        try {
            fullName.parse(name);
            a=0;
        }
        catch (IllegalFirstNameException | IllegalLastNameException e) {
            System.out.println("Sorry, first name is illegal. "+e+"\n Try again");
            a=1;
        }
        }while (a==1);
        return fullName;
    }
}
