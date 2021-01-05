package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public abstract class Car {

    /**
     * The position of the car on the grid
     */
    private final Position pos;
    private boolean isCrashed;

    public Car(Position pos) {
        this.pos = pos;
        this.isCrashed = false;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void hasCrashed() {
        this.isCrashed = true;
    }

    public void move() {
        if(!isCrashed) {
            Movement randomMovement = Movement.values()[(int) (Math.random() * Movement.values().length)];
            switch (randomMovement) {
                case FORWARD:
                    pos.setRow(pos.getRow() + 1);
                    break;
                case BACKWARD:
                    pos.setRow(pos.getRow() - 1);
                    break;
                case LEFT:
                    pos.setCol(pos.getCol() - 1);
                    break;
                case RIGHT:
                    pos.setCol(pos.getCol() + 1);
                    break;
            }
        }
    }
}
