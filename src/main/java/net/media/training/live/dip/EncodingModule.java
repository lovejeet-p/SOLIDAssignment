package net.media.training.live.dip;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    private Reader reader;
    private Encoder encoder;
    private Writer writer;

    public EncodingModule(Reader reader, Encoder encoder, Writer writer) {
        this.reader = reader;
        this.encoder = encoder;
        this.writer = writer;
    }

    public void runEncoding() {
        String read = this.reader.read();
        String encoded = this.encoder.encode(read);
        this.writer.write(encoded);
    }
}

