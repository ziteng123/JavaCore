package com.xxx.readerOrWriter;

import java.io.*;
// 读取图片，音频等文件用字节流读取
public class CopyPicture {
    public static void main(String[] args) {
        File file = new File("1.jpg");
        try(FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream("2.jpg")
        ){
            byte[] buffer = new byte[1024];
            while(fileInputStream.read(buffer) !=-1){
                fileOutputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
