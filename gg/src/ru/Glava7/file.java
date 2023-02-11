//package ru.Glava7;
//
//import java.io.*;
//
//public class file {
//    File file = new File("File.bin");
//    InputStream is = new FileInputStream(file);
//
//    long length = file.length();
//
//    if (length > Integer.MAX_VALUE) {
//        throw new IOException("Файл " + file.getName() + "слишком длинный!");
//
//    }
//
//    byte[] bytes = new byte[(int)length];
//
//    int offset = 0;
//    int numRead = 0;
//    while(offset < bytes.length && (numRead = is_read(bytes, offset, bytes.lenght-ofset)) >= 0){
//        offset += numRead;
//    }
//
//    if(offset < bytes.lenght) {
//        throw new IOException("Не удалось прочитать файл " + file.getName() + " целиком");
//    }
//
//    is.close();
//}
