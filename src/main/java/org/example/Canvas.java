package org.example;

public class Canvas extends ArtToolKit {

    @Override
    void draw() {
        System.out.println("Drawing a scenery on Canvas");
    }

    public static void main(String[] args) {
        ArtToolKit myCanvas = new Canvas();
        myCanvas.colours = new String[]{"Red", "Blue", "Green"};
        myCanvas.chooseColours();
        myCanvas.draw();
    }
    
}
