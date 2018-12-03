package homeworkLesson6Tasck4;

import java.io.*;

public class FileLineNumerator {
    private String inFileName;
    private String outFileName;

    public FileLineNumerator(String inFileName, String outFileName) {
        this.inFileName = inFileName;
        this.outFileName = outFileName;
    }

    public FileLineNumerator runLineNumeration() throws IOException {
        BufferedReader bufIn = null;
        BufferedWriter bufOut = null;
        try {
            FileReader in = new FileReader(inFileName);
            bufIn = new BufferedReader(in);
            FileWriter out = new FileWriter(outFileName);
            bufOut = new BufferedWriter(out);
            String s;
            int i = 0;
            while ((s = bufIn.readLine()) != null) {
                i++;
                bufOut.write(i + ": ");
                bufOut.write(s);
                bufOut.write("\n");
            }
            bufIn.close();
            bufOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
