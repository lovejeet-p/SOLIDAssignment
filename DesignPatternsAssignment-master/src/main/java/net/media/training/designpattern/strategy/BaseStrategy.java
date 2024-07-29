package net.media.training.designpattern.strategy;

public interface BaseStrategy {
    default void validateLength(String val, int allowedLength) {
        if (val.length() > allowedLength)
            throw new RuntimeException("Invalid length:" + allowedLength);
    }

    default void notEmpty(String val) {
        if (val == null || val.length() == 0)
            throw new RuntimeException("not empty check failed for value:" + val);
    }

    default void atLeast(int val, int min) {
        if (val < min)
            throw new RuntimeException("at least check failed:" + val);
    }

    default void atMost(int val, int max) {
        if (val > max)
            throw new RuntimeException("at least check failed:" + val);
    }
}
