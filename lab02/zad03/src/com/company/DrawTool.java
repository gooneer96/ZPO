package com.company;

public class DrawTool {

    public static void drawOneTick (int tickLength,int lengthMax)
    {
        drawOneTick(tickLength,-1,lengthMax);
    }

    public static void drawOneTick(int tickLength, int tickLabel, int lengthMax) {
        for(int i =lengthMax;i>=tickLength;i--)
            System.out.print(" ");
        for (int j = 0; j < tickLength ; j++)
            System.out.print("--");
        if (tickLabel >= 0) System.out.print(" " + tickLabel);
        System.out.print("\n");
    }
    public static void drawTicks(int tickLength, int lengthMax) {
        if (tickLength > 0) {
            drawTicks(tickLength- 1,lengthMax);

            drawOneTick(tickLength,lengthMax);

            drawTicks(tickLength- 1,lengthMax);
        }
    }
    public static void drawRuler(int nInches, int majorLength) {
        drawOneTick(majorLength, 0,majorLength); // tick 0
        for (int i = 1; i <= nInches; i++) {
            drawTicks(majorLength- 1,majorLength); // podziałka
            drawOneTick(majorLength, i,majorLength); // tick x
        }
    }


}
