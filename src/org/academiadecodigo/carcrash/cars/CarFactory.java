package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    public static Car getNewCar() {


        //TRANSFORM CARTYPE.VALUES RANDOM TO CARTYPE.RANDOM()
        CarType[] carTypes = CarType.values();

        CarType randomCarType = carTypes[(int) (Math.random()*carTypes.length)];

        switch(randomCarType){
            case DELOREAN:
                return new DeLoreanCar(fetchRandomPosition());
            case SUPER:
                return new SuperCar(fetchRandomPosition());
            case GOLAO:
                return new GolaoCar(fetchRandomPosition());
        }
        return null;
    }


    //THIS METHOD SHOULD BE CREATEPOSITION(), creating a new position with random col and row
    private static Position fetchRandomPosition(){
        return new Position(0,0).returnRandomPosition();
    }
}
