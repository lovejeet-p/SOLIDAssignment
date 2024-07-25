package net.media.training.live.dip;

import java.util.Base64;

public class Base64Encoder implements Encoder {
    public String encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }
}
