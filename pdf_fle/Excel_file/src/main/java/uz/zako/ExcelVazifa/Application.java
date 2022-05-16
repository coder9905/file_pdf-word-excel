package uz.zako.ExcelVazifa;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import uz.zako.ExcelVazifa.classes.Cource;

import java.io.*;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Gson gson=new Gson();
//            Excel ga yozish
        try {

            List<Cource> courceList=gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson23\\cource.txt"),new TypeToken<List<Cource>>(){}.getType());


            XSSFWorkbook workbook=new XSSFWorkbook();
            XSSFSheet xssfSheet=workbook.createSheet();

            XSSFRow xssfRow=xssfSheet.createRow(0);
            xssfRow.createCell(0).setCellValue("Id");
            xssfRow.createCell(1).setCellValue("Code");
            xssfRow.createCell(2).setCellValue("CCy");
            xssfRow.createCell(3).setCellValue("CCy_Uz");
            xssfRow.createCell(4).setCellValue("CCy_RU");
            xssfRow.createCell(5).setCellValue("CCy_EN");
            xssfRow.createCell(6).setCellValue("Rate");
            xssfRow.createCell(7).setCellValue("Diff");
            xssfRow.createCell(8).setCellValue("DAte");

            for (int i = 1; i <= courceList.size(); i++) {

                for (int j = 0; j < courceList.size(); j++) {
                    if (i==courceList.get(j).getId()){

                        xssfRow=xssfSheet.createRow(i);
                        xssfRow.createCell(0).setCellValue(courceList.get(j).getId());
                        xssfRow.createCell(1).setCellValue(courceList.get(j).getCode());
                        xssfRow.createCell(2).setCellValue(courceList.get(j).getCcy());
                        xssfRow.createCell(3).setCellValue(courceList.get(j).getCcyNm_UZ());
                        xssfRow.createCell(4).setCellValue(courceList.get(j).getCcyNm_RU());
                        xssfRow.createCell(5).setCellValue(courceList.get(j).getCcyNm_EN());
                        xssfRow.createCell(6).setCellValue(courceList.get(j).getRate());
                        xssfRow.createCell(7).setCellValue(courceList.get(j).getDiff());
                        xssfRow.createCell(8).setCellValue(courceList.get(j).getDate());

                    }
                }

            }

            FileOutputStream outputStream=new FileOutputStream("D:\\Java\\Zako\\lesson23\\vazifa.xlsx");
            try {
                workbook.write(outputStream);
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        Exceldan o'qish
//        try {
//            FileInputStream inputStream=new FileInputStream("D:\\Java\\Zako\\lesson23\\vazifa.xlsx");
//
//            XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
//            XSSFSheet sheet=workbook.getSheetAt(0);
//
//            Iterator<Row> rowIterator=sheet.iterator();
//
//            while (rowIterator.hasNext()){
//
//                Row row=rowIterator.next();
//                Iterator<Cell> cellIterator=row.iterator();
//
//                while (cellIterator.hasNext()){
//
//                    Cell cell=cellIterator.next();
//                    System.out.print(cell+" \t ");
//
//                }
//                System.out.println();
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//                e.printStackTrace();
//            }
    }
}
