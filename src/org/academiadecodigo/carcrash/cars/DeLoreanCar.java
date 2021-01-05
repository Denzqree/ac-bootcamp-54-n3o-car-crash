package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 02/10/2020.
 */
public class DeLoreanCar extends Car {

    private String carChar;
    private int isTeleporting;

    public DeLoreanCar(Position pos) {
        super(pos);
        this.carChar = "D";
    }


    //THIS METHOD SHOULD BE IN THE SUPER CLASS (if crashed - return "C" - else return Character.toString(type.name().charat(0))
    @Override
    public String toString() {
        return this.carChar;
    }

    @Override
    public void move() {
        if (!super.isCrashed()) {
            isTeleporting = (int) Math.round(Math.random());
            System.out.println("DeLorean's teleporter is : "+isTeleporting);
            Movement randomMovement = Movement.values()[(int) (Math.random() * Movement.values().length)];
            switch (randomMovement) {
                case FORWARD:
                    if(isTeleporting == 0) {
                        super.getPos().setRow(super.getPos().getRow() + 1);
                        break;
                    }else if(isTeleporting == 1){
                        super.getPos().setRow(super.getPos().getRow() + 10);
                        break;
                    }else {
                        break;
                    }
                case BACKWARD:
                    if(isTeleporting == 0) {
                        super.getPos().setRow(super.getPos().getRow() - 1);
                        break;
                    }else if(isTeleporting == 1){
                        super.getPos().setRow(super.getPos().getRow() - 10);
                        break;
                    }else {
                        break;
                    }
                case LEFT:
                    if(isTeleporting == 0) {
                        super.getPos().setCol(super.getPos().getCol() - 1);
                        break;
                    }else if(isTeleporting == 1){
                        super.getPos().setCol(super.getPos().getCol() - 10);
                        break;
                    }else {
                        break;
                    }
                case RIGHT:
                    if(isTeleporting == 0) {
                        super.getPos().setCol(super.getPos().getCol() + 1);
                        break;
                    }else if(isTeleporting == 1){
                        super.getPos().setCol(super.getPos().getCol() + 10);
                        break;
                    }else {
                        break;
                    }
            }
        }
    }

}
