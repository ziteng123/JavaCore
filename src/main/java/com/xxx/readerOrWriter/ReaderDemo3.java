package com.xxx.readerOrWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo3 {
    public static void main(String[] args) {
        try(Reader reader = new FileReader("abc.txt")) {
           int length = 0;
           char[] chars = new char[1024];
           // 添加缓冲区
           while((length = reader.read(chars))!=-1){
               System.out.println(new String(chars,0,length));
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
