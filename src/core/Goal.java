package core;

import utils.Vector2d;
import java.awt.*;

import static core.Constants.*;

public class Goal extends GameObject {

    Color color;

    public Goal(Vector2d s, Vector2d v) {
        super(s, v);
        color = Color.GREEN; 
        r = 50;
    }

    @Override
    public void update() {
    }

    @Override
    public Goal copy() {
        Goal copy = new Goal(s, v);
        updateClone(copy);
        copy.color = color;
        return copy;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval((int) (s.x-r), (int) (s.y-r), (int) r * 2, (int) r * 2);
    }

    @Override
    public boolean dead() {
        return false;
    }

    public String toString() {
        return "goal";
    }

}
