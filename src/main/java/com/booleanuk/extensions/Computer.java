package com.booleanuk.extensions;

public class Computer {
    public String make = "Mac";
    public String model = "Air";
    public byte numberOfProcessors = 4;
    public byte ramGigabytes = 64;
    public String processorName = "Apple Silicon";
    public String type = "Laptop";
    public Dimensions displayDimensions = new Dimensions(1920, 1080);
}

class Dimensions {
    private int width;
    private int height;

    public Dimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
