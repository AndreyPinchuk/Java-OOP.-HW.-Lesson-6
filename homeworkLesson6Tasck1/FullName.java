package homeworkLesson6Tasck1;

public class FullName implements FullNameParser {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public FullName() {
    }

    public FullName parse(String s) {
//        String s1;
        String[] sArr = s.split(" ");
        try {
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
        } catch (IllegalFirstNameException | IllegalLastNameException e) {
            System.out.println(e);
        }
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
