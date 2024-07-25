package net.media.training.live.dip;

import java.io.*;

public class WriterFile implements Writer {
    private String outputFile;
    public WriterFile(String outputFile) {
        this.outputFile = outputFile;
    }
    public void write(String input) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.outputFile));
            writer.write(input);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
