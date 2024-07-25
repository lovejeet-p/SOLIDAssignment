package net.media.training.live.dip;

import java.io.*;

public class ReaderFile implements Reader {
    private String inputFile;
    public ReaderFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public String read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.inputFile));
            String aLine;
            String result = "";
            while ((aLine = reader.readLine()) != null) {
                result += aLine;
            }
            reader.close();
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
