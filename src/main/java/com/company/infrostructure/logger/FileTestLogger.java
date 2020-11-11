package com.company.infrostructure.logger;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTestLogger extends TestLogger {
    private String filename;

    public FileTestLogger(String filename){

        this.filename=filename;
    }

    @Override
    public void log(String msg) {

        try {
            FileWriter fw= new FileWriter(new File(filename),true);
            fw.write(formatMessage(msg+"\n"));

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
