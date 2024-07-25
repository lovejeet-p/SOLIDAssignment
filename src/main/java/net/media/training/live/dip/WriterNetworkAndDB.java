package net.media.training.live.dip;

public class WriterNetworkAndDB implements Writer{
    public void write(String input) {
        Database database = new MyDatabase();
        database.write(input);
    }
}
