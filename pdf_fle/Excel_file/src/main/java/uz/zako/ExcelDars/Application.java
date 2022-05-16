package uz.zako.ExcelDars;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

//        Excel ga yozish
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet();
        XSSFRow row=sheet.createRow(0);
        row.createCell(0).setCellValue("N");
        row.createCell(1).setCellValue("Ism");
        row.createCell(2).setCellValue("Familya");


        for (int i = 0; i < 5; i++) {

            row=sheet.createRow(i+1);
            row.createCell(0).setCellValue(i+1);
            row.createCell(1).setCellValue("Ali");
            row.createCell(2).setCellValue("Valiyev");
        }

        FileOutputStream outputStream= null;
        try {
            outputStream = new FileOutputStream("D:\\Java\\Zako\\lesson23\\test.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Exceldan oqish

//        FileInputStream inputStream= null;
//        try {
//            inputStream = new FileInputStream("D:\\Java\\Zako\\lesson23\\test.xlsx");
//            XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
//            Sheet sheet=workbook.getSheetAt(0);
//            Iterator<Row> iterator=sheet.iterator();
//
//            while (iterator.hasNext()){
//
//                Row row=iterator.next();
//                Iterator<Cell> celIterator=row.iterator();
//
//                while (celIterator.hasNext()){
//
//                    Cell cell=celIterator.next();
//
//                    System.out.println(cell
//                    );
//
//                }
//
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
