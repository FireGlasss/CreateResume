package org.example;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FileInputStream file = null;
        try {
            file = new FileInputStream("путь_к_исходному_файлу.docx");
            XWPFDocument doc = new XWPFDocument(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}