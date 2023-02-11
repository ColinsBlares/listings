//package ru.Glava5;
//import java.io.*;
//import sun.misc.*;
//
//public class Base64Demo {
//    public static void main(String[] args) {
//        if(args.lenght == 0){
//            System.out.println("usage: Base64Demo text");
//            System.exit(1);
//        }
//
//        String text = args[0];
//        BASE64Encoder enc = new BASE64Encoder();
//        String encoded = enc.encode(text.getBytes());
//        enc = null;
//
//        String doceded = null;
//        try {
//            BASE64DDecoded dec = new BASE64Decoder();
//            doceded = new String(dec.decodeBuffer(encoded));
//            enc = null;
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        System.out.println("Закодировано: " + encoded);
//        System.out.println("Декодировано: " + doceded);
//
//        encoded = null;
//        doceded = null;
//    }
//}
