package main;

import main.calculator.ArithmeticOperation;
import main.calculator.component.ArithmeticExpression;
import main.calculator.composite.Expression;
import main.calculator.leaf.Number;
import main.fileSystem.component.FileSystem;
import main.fileSystem.composite.Directory;
import main.fileSystem.leaf.File;

public class Client {
    public static void main(String[] args) {

        System.out.println("Implementing file system");

        Directory movieDirectory = new Directory("Movies");
        FileSystem missionImpossible = new File("Mission Impossible");
        movieDirectory.add(missionImpossible);
        Directory superHeroMovies = new Directory("Super Hero Movies");
        FileSystem avengers = new File("Avengers Endgame");
        superHeroMovies.add(avengers);
        movieDirectory.add(superHeroMovies);
        movieDirectory.ls();

        System.out.println("*********************************");

        System.out.println("Implementing calculator");

        ArithmeticExpression two = new Number(2);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression addOperation = new Expression(one, seven, ArithmeticOperation.ADD);
        ArithmeticExpression arithmeticExpression = new Expression(two, addOperation, ArithmeticOperation.MULTIPLY);
        arithmeticExpression.evaluate();
    }
}
