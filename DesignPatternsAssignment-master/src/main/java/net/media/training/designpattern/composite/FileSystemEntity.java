package net.media.training.designpattern.composite;

public interface FileSystemEntity {
    public int getSize();
    public FileSystemEntity getParent();
    public void setParent(Directory directory);
    public String getName();
    public boolean exists(String name);
    public void delete();
}
