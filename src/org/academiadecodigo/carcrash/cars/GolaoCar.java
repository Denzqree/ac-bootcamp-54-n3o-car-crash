package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 02/10/2020.
 */
public class GolaoCar extends Car{

    private String carChar;

    public GolaoCar(Position pos){
        super(pos);
        this.carChar = "G";
    }

    @Override
    public String toString(){
        return this.carChar;
    }

}
