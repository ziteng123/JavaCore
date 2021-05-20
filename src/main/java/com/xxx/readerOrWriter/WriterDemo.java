package com.xxx.readerOrWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("write.txt");
        try(Writer writer = new FileWriter(file)){
            writer.write("abc");
            writer.write("asfas");
            writer.flush(); // 刷新缓冲区
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
