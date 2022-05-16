package uz.Baxtiyor.VazifaPdf;


import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApplicationVazifa {
    public static void main(String[] args) {

        Document document=new Document();
        try {

            PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream("D:\\zako\\vazifa.pdf"));
            Chunk chunk=new Chunk("Assalomu Aleykum. ");
            Color color=new Color(125465);
            chunk.setLineHeight(170);

            Image image=Image.getInstance("D://Java//Zako//lesson24//logo.jpg");
            image.setAlignment(Element.ALIGN_CENTER);
            image.setBorderWidth(50);
            BaseColor color1=new BaseColor(240,220,204,5);
            image.setBorderColor(color1);
            image.setBorder(54653);
            Font redFont = FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(255, 255, 255, 1));
            Paragraph paragraph=new Paragraph(" talabalar",redFont);
            paragraph.add(chunk);
            paragraph.add(image);
            paragraph.setAlignment(Element.ALIGN_CENTER);

            document.open();
            document.add(paragraph);
//            Paragraph paragraphOne = new Paragraph("Ergashev Baxtiyor",redFont);
//            document.add(paragraph);

            document.close();
            writer.close();

        } catch (BadElementException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
