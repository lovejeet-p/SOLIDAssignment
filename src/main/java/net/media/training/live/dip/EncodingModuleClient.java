package net.media.training.live.dip;

import java.io.IOException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule fileEncodingModule  = new EncodingModule(
                new ReaderFile("/Users/lovejeet.p/Documents/training/SolidLiveAsignment-master/src/main/java/net/media/training/live/dip/beforeEncryption.txt"),
                new Base64Encoder(),
                new WriterFile("/Users/lovejeet.p/Documents/training/SolidLiveAsignment-master/src/main/java/net/media/training/live/dip/afterEncryption.txt")
        );
        fileEncodingModule.runEncoding();

        EncodingModule netowrkAndDBEncodingModule  = new EncodingModule(
                new ReaderNetwordAndDB(new URL("http", "myfirstappwith.appspot.com", "index.html")),
                new Base64Encoder(),
                new WriterNetworkAndDB()
        );
        netowrkAndDBEncodingModule.runEncoding();
    }
}
