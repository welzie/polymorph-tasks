package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<CopyFiles> tasks = new ArrayList<>();
        tasks.add(new CopyFiles("/home/etc/movies", "/home/backup"));

        for(CopyFiles copy : tasks) {
            copy.run();
        }
    }
}
