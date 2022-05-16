package uz.Baxtiyor.VazifaPdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Application {

        public static void main(String[] args) {

            try {
            Document document = new Document();
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D://zako//test.pdf"));
                document.open();
                Paragraph paragraph = new Paragraph();
                Chunk chunk = new Chunk("salom bu kichkina matn");
                chunk.setFont(new Font(Font.FontFamily.HELVETICA));
                chunk.setBackground(BaseColor.BLUE);
                chunk.setNewPage();
                chunk.setLineHeight(200);
                chunk.setWordSpacing(5);
                chunk.setHorizontalScaling(3);
//            chunk.setUnderline(150,160);
                paragraph.add(chunk);
//            Image image = new FileInputStream("D://avatar.png");
                paragraph.add("salom");
                paragraph.setAlignment(Element.ALIGN_CENTER);
                paragraph.setPaddingTop(150);
//            Font font = new Font(BaseFont.createFont("f.ttf","UTF-8",true));
//            paragraph.setFont(font);

                BaseColor color = new BaseColor(70, 70, 70);
                paragraph.setIndentationLeft(200);
                document.add(paragraph);

//                Image image = Image.getInstance("https://media.istockphoto.com/photos/alberta-wilderness-near-banff-picture-id583809524?b=1&k=20&m=583809524&s=170667a&w=0&h=mYDDTesIuWZc0w0iQu0QrHPm7COlBt3QFsHU2vgxfIU=");
//            image.setAbsolutePosition(100,500);
//            image.setAlignment(Element.ALIGN_BOTTOM);
//            image.setAlt("Image bor edi");
//                image.setRotation(500);
//                image.setBorderColor(BaseColor.RED);
//                image.setBorder(1000);
//                document.add(paragraph);
//                document.add(image);
//                document.newPage();
//                document.addAuthor("Test");
//                document.addLanguage("EN");
//                document.setPageSize(new Rectangle(1200, 300));
//                document.top(150);
//
//                PdfPTable table = new PdfPTable(10);
//                for (int i = 0; i < 10; i++) {
//                    for (int j = 0; j < 10; j++) {
//                        table.addCell("test");
//                    }
//                    table.completeRow();
//                }
//            System.out.println(table.getRows().size());

//                document.add(table);
//                List<PdfPRow> row = table.getRows();
//
                document.close();
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (DocumentException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
