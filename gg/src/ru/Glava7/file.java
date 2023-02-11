package ru.Glava7;

import java.io.File;
import java.io.IOException;

public class file {
    File file = new File("file.bin");
    long lenght = file.length();

    if (lenght > Integer.MAX_VALUE){
        throw new IOException("Файл "+file.getName() + "Слишком длинный!");
    }

    byte[] bytes = new byte[(int)lenght];

    int offset = 0;
    int numRead = 0;
    while (offset < bytes.leng)
}
