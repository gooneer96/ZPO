package com.company;


/**
 * Class <code>DrawTool</code>> enable us to use object of this class to draw a ruler.
 */
public class DrawTool {

    /**
     *
     *
     * @param tickLength value telling us how much "--" to draw
     * @param lengthMax  is max of nesting
     */
    public static void drawOneTick (int tickLength,int lengthMax)
    {
        drawOneTick(tickLength,-1,lengthMax);
    }

    /**
     *
     *
     * @param tickLength value telling us how much "--" to draw
     * @param tickLabel  value of current drawn label
     * @param lengthMax  is max of nesting
     */
    public static void drawOneTick(int tickLength, int tickLabel, int lengthMax) {
        for(int i =lengthMax;i>=tickLength;i--)
            System.out.print(" ");
        for (int j = 0; j < tickLength ; j++)
            System.out.print("--");
        if (tickLabel >= 0) System.out.print(" " + tickLabel);
        System.out.print("\n");
    }

    /**
     *
     *
     * @param tickLength value telling us how much "--" to draw
     * @param lengthMax  is max of nesting, value needed in <code>drawOneTick</code> to fill blank spaces from left in each row in output
     */
    public static void drawTicks(int tickLength, int lengthMax) {
        if (tickLength > 0) {
            drawTicks(tickLength- 1,lengthMax);

            drawOneTick(tickLength,lengthMax);

            drawTicks(tickLength- 1,lengthMax);
        }
    }

    /**
     * 
     *
     * @param nLabels     value represent max value on ruler, from 0 to nLabels
     * @param majorLength is max of nesting, value needed in <code>drawOneTick</code> to fill blank spaces from left in each rowin output
     */
    public static void drawRuler(int nLabels, int majorLength) {
        drawOneTick(majorLength, 0,majorLength); // tick 0
        for (int i = 1; i <= nLabels; i++) {
            drawTicks(majorLength- 1,majorLength); // podziałka
            drawOneTick(majorLength, i,majorLength); // tick x
        }
    }


}
