package OOP.Unit;


import java.util.ArrayList;

public class Vector2D {
    protected int posX;
    protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected Double getDistance(Vector2D opponent){
        return Math.sqrt(Math.pow(posX - opponent.posX,2) + Math.pow(posY - opponent.posY,2));
    }
    protected boolean getLeft(Vector2D opponent) {
        return opponent.posX < posX;
    }
    protected boolean getDown(Vector2D opponent) {
        return opponent.posY < posY;
    }

    protected boolean getEmpty(ArrayList <Human> team, int posX, int posY) {
        boolean bool = true;
        for (Human human: team) {
            if (human.coords.posX == posX & human.coords.posY == posY) {
                bool = false;
                break;
            }
        }
        return bool;
    }
}
