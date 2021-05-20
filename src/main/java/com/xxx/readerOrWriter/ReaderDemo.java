package com.xxx.readerOrWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    public static void main(String[] args) {
        try(Reader reader = new FileReader("abc.txt")) {

            int read = reader.read(); // 读取单个字符
            System.out.println(read);
            System.out.print((char)read);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
