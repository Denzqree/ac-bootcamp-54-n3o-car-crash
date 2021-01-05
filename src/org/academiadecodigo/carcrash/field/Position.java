package org.academiadecodigo.carcrash.field;

public class Position {

    private int col;
    private int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public void setCol(int col) {
        if(col>Field.getWidth()-1){
            this.col = 0;
        }else if(col < 0){
            this.col = Field.getWidth();
        }else {
            this.col = col;
        }
    }

    public void setRow(int row) {
        if(row>Field.getHeight()-1){
            this.row = 0;
        }else if(row < 0){
            this.row = Field.getHeight();
        }else{
            this.row = row;
        }
    }

    public Position returnRandomPosition(){
        col = (int) Math.floor(Math.random()*Field.getWidth());
        row = (int) Math.floor(Math.random()*Field.getHeight());
        return this;
    }
}
