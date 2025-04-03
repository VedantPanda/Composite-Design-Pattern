package main.fileSystem.composite;

import main.fileSystem.component.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private final String directoryName;

    private final List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Inside directory "+directoryName);
        fileSystems.forEach(FileSystem::ls);
    }
}
