package org.example;

import org.example.config.Figure;
import org.example.config.FigureRepository;
import org.example.config.FigureRepositoryImpl;
import org.example.figures.Cube;
import org.example.figures.Cuboid;
import org.example.figures.Cylinder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create  Repository to fill in it with any Figure
        FigureRepository<Figure> figureRepository = new FigureRepositoryImpl<>();

        //Declare figure's value
        Cuboid cuboid = new Cuboid();
        cuboid.setLength(2);
        cuboid.setWidth(3);
        cuboid.setHeight(4);

        Cube cube = new Cube();
        cube.setSideLength(5);

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2);
        cylinder.setHeight(3);

        //Save All entered figures
        figureRepository.save(cylinder);
        figureRepository.save(cuboid);
        figureRepository.save(cube);

        //Use Findall list for forEach loop to give us answer every period of loop
        List<Figure> figures = figureRepository.findAll();

        for (Figure figure : figures){
            System.out.println("Volume: " + figure.getVolume());
            System.out.println("Sphere Area: " + figure.getSphereArea());
            System.out.println();
        }
    }
}