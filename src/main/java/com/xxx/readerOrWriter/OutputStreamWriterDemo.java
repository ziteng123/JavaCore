package com.xxx.readerOrWriter;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        File file = new File("out.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter out = new OutputStreamWriter(fileOutputStream,"utf-8")) {
            out.write("999");
            out.write("张三");
            out.write("adfsa");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
