package homeworkLesson6Tasck6;


public class BabyStatistics implements Comparable {
    private int year;
    private int births;

    public BabyStatistics(int year, int births) {
        this.year = year;
        this.births = births;
    }

    public BabyStatistics() {

    }

    public int getYear() {
        return year;
    }

    public int getBirths() {
        return births;
    }

    @Override
    public int compareTo(Object o) {
        BabyStatistics obj = (BabyStatistics) o;
        if (this.year > obj.year) {
            return 1;
        } else if (this.year < obj.year) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return year +
                ", " + births +
                "\n";
    }
}
