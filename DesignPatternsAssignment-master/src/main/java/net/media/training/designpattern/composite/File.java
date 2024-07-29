package net.media.training.designpattern.composite;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:04 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class File implements FileSystemEntity {
    private final String name;
    private int size;
    private Directory parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void setParent(Directory directory) {
        this.parent = directory;
    }

    @Override
    public Directory getParent() {
        return parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean exists(String name) {
        return Objects.equals(name, this.name);
    }

    @Override
    public void delete() {
        if(this.getParent() != null) this.getParent().removeEntry(this);
    }
}
