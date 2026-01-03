package org.example;
abstract class ArtToolKit {

    String[] colours;   // data (shared idea)

    void chooseColours() {
        System.out.println("Choosing colours");
    }

    abstract void draw();  // action, but incomplete
}
