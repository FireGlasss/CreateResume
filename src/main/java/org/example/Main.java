package org.example;

import org.apache.poi.xwpf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream file = null;
        try {
            file = new FileInputStream("C:\\Users\\maidanovt\\Desktop\\AutoResume\\Хусаинов_Максим_Маратович.docx");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XWPFDocument doc = new XWPFDocument(file);
        XWPFTable table = doc.getTable().; // получение первого параграфа
        String text = table.getText();

        XWPFDocument newDoc = new XWPFDocument();

        XWPFParagraph newParagraph = newDoc.createParagraph(); // создание нового параграфа
        XWPFRun run = newParagraph.createRun(); // создание нового текстового блока в параграфе
        run.setText(text); // установка текста

        run.setFontSize(12);
        run.setFontFamily("Arial");
        run.setBold(true);

        run.setItalic(true);
        run.setUnderline(UnderlinePatterns.SINGLE);

        newParagraph.setAlignment(ParagraphAlignment.CENTER);
        FileOutputStream out = new FileOutputStream("C:\\Users\\maidanovt\\Desktop\\AutoResume\\new.docx");
        newDoc.write(out);
        out.close();
    }
}