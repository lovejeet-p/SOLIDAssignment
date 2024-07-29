package net.media.training.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileSystemEntity {
    private final String name;

    private List<FileSystemEntity> fileSystemEntities;

    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<File> files, List<Directory> directories) {
        this.name = name;

        this.fileSystemEntities = new ArrayList<FileSystemEntity>();
        this.fileSystemEntities.addAll(files);
        this.fileSystemEntities.addAll(directories);

        for(FileSystemEntity fileSystemEntity: this.fileSystemEntities) {
            fileSystemEntity.setParent(this);
        }
    }

    @Override
    public void delete() {

        while(this.fileSystemEntities.size() > 0) {
            FileSystemEntity fileSystemEntity = this.fileSystemEntities.get(0);
            fileSystemEntity.delete();
        }

        if(this.getParent() != null) this.getParent().removeEntry(this);
    }

    public void removeEntry(FileSystemEntity fileSystemEntity) {
        this.fileSystemEntities.remove(fileSystemEntity);
    }

    public void add(FileSystemEntity fileSystemEntity) {
        this.fileSystemEntities.add(fileSystemEntity);
    }

    @Override
    public int getSize() {
        int sum = 0;
        for (FileSystemEntity fileSystemEntity : this.fileSystemEntities) {
            sum += fileSystemEntity.getSize();
        }
        return sum;
    }

    @Override
    public boolean exists(String name) {
        if (this.name.equals(name))
            return true;

        for (FileSystemEntity fileSystemEntity : this.fileSystemEntities) {
            if (fileSystemEntity.exists(name)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Directory getParent() {
        return this.parent;
    }

    @Override
    public void setParent(Directory directory) {
        this.parent = directory;
    }
}
