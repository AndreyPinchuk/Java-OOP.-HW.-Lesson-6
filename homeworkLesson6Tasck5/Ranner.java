package homeworkLesson6Tasck5;

public class Ranner {
    public static void main(String[] args) {
        Cloner cloner1 = new Cloner();
        Cat cat = new Cat(12,155,"Musa");
        Cat cat1 = cloner1.clone(cat);
        System.out.println(cat.toString());
        System.out.println(cat1.toString());
    }
}
