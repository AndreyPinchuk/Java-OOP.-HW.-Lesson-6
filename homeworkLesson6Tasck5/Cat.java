package homeworkLesson6Tasck5;

public class Cat {
    private int year;
    private int higth;
    private String name;

    public Cat(int year, int higth, String name) {
        this.year = year;
        this.higth = higth;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHigth() {
        return higth;
    }

    public void setHigth(int higth) {
        this.higth = higth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "year=" + year +
                ", higth=" + higth +
                ", name='" + name + '\'' +
                '}';
    }
}
