package homeworkLesson6Tasck6;

import java.io.*;
import java.util.*;

public class ReSaveFile extends BabyStatistics {
    private String inFail;
    private String outFile;

    public ReSaveFile(String inFail, String outFile) {
        super();
        this.inFail = inFail;
        this.outFile = outFile;
    }

    public BabyStatistics reSaveFile() throws IOException {
        BufferedReader bufin = null;
        BufferedWriter bufout = null;
        try {
            FileReader in = new FileReader(inFail);
            bufin = new BufferedReader(in);
            FileWriter out = new FileWriter(outFile);
            bufout = new BufferedWriter(out);

            int year;
            int births;
            String s;
            String[] s1;
            List<BabyStatistics> s2 = new ArrayList<>();

            while ((s = bufin.readLine()) != null) {    //чтения из файла и компоновка в масив
                s1 = s.split(",");

                if (isSimbol(s1[0])) {
                    bufout.write(s1[0] + ", " + s1[3] + "\n");
                } else {
                    year = Integer.parseInt(s1[0]);
                    births = Integer.parseInt(s1[3]);
                    s2.add(new BabyStatistics(year, births));
                }
            }

            Collections.sort(s2);  //сортировка по годам

            List<BabyStatistics> babyStat = compozitionYear(s2);

            for (BabyStatistics babyStatistics : babyStat) {
                bufout.write(babyStatistics.toString() + "\n");
            }

            bufin.close();
            bufout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean isSimbol(String s) { //проверка для отсортировки шапки списка
        if (Character.isAlphabetic(s.charAt(1))) {
            return true;
        }
        return false;
    }

    public List compozitionYear(List<BabyStatistics> s2) {  //метод для обединения всех рождённых детей в один год
        List<BabyStatistics> babyStatistics1 = new ArrayList<>();
        int year = 0;
        int birthd = 0;
        for (int j = 0; j < s2.size(); j++) {
            birthd = s2.get(j).getBirths();
            year = s2.get(j).getYear();

            for (int i = j + 1; i < s2.size(); i++) {
                if (s2.get(j).getYear() == s2.get(i).getYear()) {
                    birthd += s2.get(i).getBirths();
                } else {
                    babyStatistics1.add(new BabyStatistics(year, birthd));
                    j = i - 1;
                    break;
                }
                j = i;
            }
        }
        babyStatistics1.add(new BabyStatistics(year, birthd));
        return babyStatistics1;
    }

}
