package org.example;

public class App 
{
    public static void main( String[] args ) {

        Race race = new Race();

        RadioControlledCar dacia = new RadioControlledCar();

        dacia.name = "Dacia";
        dacia.color = "Red";
        dacia.doorCount = 4;
        dacia.wheelCount = 4;
        dacia.mileage = 8.5;

        Engine daciaEngine = new Engine();
        daciaEngine.manufacture = "Renault";

        dacia.engine = daciaEngine;

        RadioControlledCar lada = new RadioControlledCar();

        lada.name = "Lada";
        lada.color = "blue";
        lada.doorCount = 4;
        lada.wheelCount = 4;
        lada.mileage = 8;

        Engine ladaEngine = new Engine();
        ladaEngine.manufacture = "lada";

        lada.engine = ladaEngine;

        race.firstCar = dacia;
        race.secondCar = lada;
    }
}
