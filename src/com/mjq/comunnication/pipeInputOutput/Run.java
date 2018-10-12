package com.mjq.comunnication.pipeInputOutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
    public static void main(String [] args){
        try{
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

            inputStream.connect(outputStream);
            //outputStream.connect(inputStream);

            ThreadRead read = new ThreadRead(readData,inputStream);
            ThreadWrite write = new ThreadWrite(writeData,outputStream);

            read.start();
            Thread.sleep(2000);

            write.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
