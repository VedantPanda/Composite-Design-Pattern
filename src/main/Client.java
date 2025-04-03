package main;

import main.fileSystem.component.FileSystem;
import main.fileSystem.composite.Directory;
import main.fileSystem.leaf.File;

public class Client {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");
        FileSystem missionImpossible = new File("Mission Impossible");
        movieDirectory.add(missionImpossible);
        Directory superHeroMovies = new Directory("Super Hero Movies");
        FileSystem avengers = new File("Avengers Endgame");
        superHeroMovies.add(avengers);
        movieDirectory.add(superHeroMovies);
        movieDirectory.ls();
    }
}
