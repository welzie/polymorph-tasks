package org.launchcode;

public class CopyFiles implements Runnable {

    private String source;
    private String destination;

    public CopyFiles(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }


    @Override
    public void run() {
        System.out.println("Copying files from: " + this.source + " to: " + this.destination);
    }
}
