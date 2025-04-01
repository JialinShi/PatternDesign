package com.example.imageProxy;

import java.net.URL;

public class ImageProxy implements Icon{
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url){
        this.imageURL = url;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else return 600; //默认占位宽度
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }else return 400;
    }

    @Override
    public void paintIcon(int width, int height) {
        if(imageIcon != null){
            imageIcon.paintIcon(width,height);
        }else{
            if(!retrieving){
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Icon icon = new ImageIcon();
                        System.out.println(icon.getIconWidth());
                        System.out.println(icon.getIconHeight());
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
