package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 02/10/2020.
 */
public class SuperCar extends Car {

    private String carChar;

    public SuperCar(Position pos){
        super(pos);
        this.carChar = "S";
    }

    @Override
    public String toString(){
        return this.carChar;
    }

    @Override
    public void move() {
        if(!super.isCrashed()) {
            Movement randomMovement = Movement.values()[(int) (Math.random() * Movement.values().length)];
            switch (randomMovement) {
                case FORWARD:
                    super.getPos().setRow(super.getPos().getRow() + 2);
                    break;
                case BACKWARD:
                    super.getPos().setRow(super.getPos().getRow() - 2);
                    break;
                case LEFT:
                    super.getPos().setCol(super.getPos().getCol() - 2);
                    break;
                case RIGHT:
                    super.getPos().setCol(super.getPos().getCol() + 2);
                    break;
            }
        }
    }

}
