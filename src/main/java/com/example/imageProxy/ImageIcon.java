package com.example.imageProxy;

public class ImageIcon implements Icon{

    @Override
    public int getIconWidth() {
        return 10;
    }

    @Override
    public int getIconHeight() {
        return 5;
    }

    @Override
    public void paintIcon(int width, int height) {
        System.out.println("here is a placeholder with width " +  getIconWidth()+ " and height "+ getIconHeight());
    }
}
