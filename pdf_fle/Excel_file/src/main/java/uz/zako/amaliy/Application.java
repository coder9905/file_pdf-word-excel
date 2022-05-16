package uz.zako.amaliy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.*;
import uz.zako.amaliy.json.Cource;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try {

//            List<Cource> courceList=gson.fromJson(new FileReader("D:\\Java\\Zako\\Lesson23\\cource.txt"),new TypeToken<List<Cource>>(){}.getType());

//            word ga yozish
//            XWPFDocument document=new XWPFDocument();
//            XWPFTable table=document.createTable();
//            XWPFTableRow row=table.getRow(0);
//            row.getCell(0).setText("id");
//            row.addNewTableCell().setText("Code");
//            row.addNewTableCell().setText("Ccy");
//            row.addNewTableCell().setText("CcyNm_UZ");
//            row.addNewTableCell().setText("Rate");
//
//            System.out.println(courceList.size());
//            for (int i = 0; i < courceList.size(); i++) {
//
//                XWPFTableRow row1=table.createRow();
//                row1.getCell(0).setText(String.valueOf(i+1));
//                row1.getCell(1).setText(courceList.get(i).getCode());
//                row1.getCell(2).setText(courceList.get(i).getCcy());
//                row1.getCell(3).setText(courceList.get(i).getCcyNm_UZ());
//                row1.getCell(4).setText(courceList.get(i).getDate());
//
//            }
//
//            FileOutputStream outputStream=new FileOutputStream("D:\\Java\\Zako\\lesson23\\cource.docx");
//            try {
//                document.write(outputStream);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

//            word dan tableni oqish

            try {
//                XWPFDocument document=new XWPFDocument(Files.newInputStream(Paths.get("D:\\Java\\Zako\\lesson23\\cource.docx")));

//                hammasini oqib beradi.
//                XWPFWordExtractor extractor=new XWPFWordExtractor(document);
//                System.out.println(extractor.getText());

//                Word ga paragrif yozish
//                XWPFParagraph paragraph=document.createParagraph();
//                XWPFRun run=paragraph.createRun();
//                paragraph.setAlignment(ParagraphAlignment.CENTER);
//                run.setText("Salom Baxtiyor");
//                run.setBold(true);
//                run.setFontSize(50);

//                word da nima borligini korish
//                XWPFWordExtractor extractor=new XWPFWordExtractor(document);
//                System.out.println(extractor.getText());

//                Paragriflarni oqib beradi
//                List<XWPFParagraph> paragraphList=document.getParagraphs();
//                for (int i = 0; i < paragraphList.size(); i++) {
//                    System.out.println(paragraphList.get(i).getText());
//                }

//                wordda nima borligini oqib beradi
//                Iterator<IBodyElement> bodyElementIterator=document.getBodyElementsIterator();
//                while (bodyElementIterator.hasNext()){
//                    IBodyElement element=bodyElementIterator.next();
//                    System.out.println(element.getElementType().name());
//                }

//                worddan tableni list orqali oqish
//                Iterator<IBodyElement> bodyElementIterator=document.getBodyElementsIterator();
//                while (bodyElementIterator.hasNext()){
//                    IBodyElement element=bodyElementIterator.next();
//
//                    if (element.getElementType().name().equals("TABLE")){
//                        List<XWPFTable> tables=element.getBody().getTables();
//                        for (XWPFTable table : tables) {
//                            List<XWPFTableRow> rows=table.getRows();
//                            for (XWPFTableRow row : rows) {
//                                List<XWPFTableCell> cells=row.getTableCells();
//                                for (XWPFTableCell cell : cells) {
//                                    System.out.println(cell.getText());
//                                }
//                                System.out.println();
//                            }
//                        }
//                        System.out.println(tables.get(0).getElementType().name());
//                    }
//                }

//                PAsm joylash
//                String imgFile="D:\\Java\\Zako\\lesson23\\java.png";
//                XWPFDocument document=new XWPFDocument();
//                XWPFParagraph paragraph=document.createParagraph();
//                XWPFRun run=paragraph.createRun();
//                run.setText(imgFile);
//                paragraph.setAlignment(ParagraphAlignment.CENTER);
//                run.addBreak();
//
//                FileInputStream inputStream=new FileInputStream(imgFile);
//                run.addPicture(inputStream,
//                        Document.PICTURE_TYPE_PNG,    // png file
//                        imgFile,
//                        Units.toEMU(400),
//                        Units.toEMU(200));
//
//                FileOutputStream fileOutputStream=new FileOutputStream("D:\\Java\\Zako\\lesson23\\java.docx");
//                document.write(fileOutputStream);

//                Wordaga rasm jowlash

                String img = "D:\\Java\\Zako\\lesson23\\java.png";

                XWPFDocument document = new XWPFDocument();
                XWPFParagraph paragraph = document.createParagraph();
                XWPFRun run = paragraph.createRun();
                paragraph.setAlignment(ParagraphAlignment.CENTER);
                run.setText(img);
                run.addBreak();

                FileInputStream inputStream = new FileInputStream(img);
                run.addPicture(inputStream,
                        Document.PICTURE_TYPE_PNG,
                        img,
                        Units.toEMU(400),
                        Units.toEMU(200));

                FileOutputStream outputStream = new FileOutputStream("D:\\Java\\Zako\\lesson23\\img.docx");
                document.write(outputStream);
                document.close();


//                FileOutputStream outputStream=new FileOutputStream("D:\\Java\\Zako\\lesson23\\cource.docx");
//                document.write(outputStream);

                document.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
