package core;

import java.awt.*;
import java.util.Random;

/**
 * Created by Simon M. Lucas
 * sml@essex.ac.uk
 * Date: 26/12/11
 * Time: 12:00
 */
public interface Constants {
    double saucerProb = 0.005;
    int width = 1024;
    int height = 768;
    Dimension size = new Dimension(width, height);
    int safeRadius = height/20;
    Color bg = Color.black;
    Font font = new Font("Courier", Font.PLAIN, 20);

    Color[] pColors = {Color.green, Color.blue};

    int delay = 20;
    double ac = 0.01;
    double t = 1.0;
    Random rand = new Random();
    int[] radii = {30, 20, 10};
    int[] asteroidScore = {50, 100, 200};
    int largeShipScore = 500;
    int smallSaucerScore = 1000;
    int firstLevel = 50;
    int increasePerLevel = firstLevel / 4;
    int lifeThreshold = 1000;

    double missileMinVelocity = 2;
    int missileRadius = 2;
    int missileTTL = 140;

    // how many smaller asteroids an asteroid splits into
    int nSplits = 3;

    int clockwise = 1;
    int antiClockwise = -1;
    int noRotate = 0;

    int nStars = 500;


    // scaling factor applied to random asteroid speed
    double speedScale = 0.5;

}
