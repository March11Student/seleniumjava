package Common;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class ExcelUtility {

    public void writeDataFromExcel(){

        FileOutputStream fos = null;

        File file = new File("/Users/vishalu/Downloads/Class2023/seleniumjava/src/test/resources/TestData/testData.xls");
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {

        }
        Workbook wb = new HSSFWorkbook();
        Sheet sh = wb.createSheet("UserCred");
        Row rw = sh.createRow(2);
        Cell cl = rw.createCell(3);

        cl.setCellType(CellType.STRING);
        cl.setCellValue("Musa");
        try {
            wb.write(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readDataFromExcel() {

        File file = new File("/Users/vishalu/Downloads/Class2023/seleniumjava/src/test/resources/TestData/testData.xls");
        FileInputStream fis = null;
        Workbook wb = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
        }

        try {
           wb = WorkbookFactory.create(fis);
        } catch (IOException e) {
        }
         Sheet sh = wb.getSheetAt(0);

        System.out.println("rowName "+ sh.getRow(2).getCell(0).getStringCellValue());
        System.out.println("CellValue "+ sh.getRow(2).getCell(1).getStringCellValue());


        System.out.println("Total Sheet Data:");
        for (int i = 0; i <= sh.getLastRowNum(); i++) {

            Row rw = sh.getRow(i);


            for (int j = 0; j < rw.getLastCellNum(); j++) {
                Cell cl = rw.getCell(j);

                System.out.print(cl.getStringCellValue() +" " );

            }
            System.out.println( );
        }

    }

    public static void main(String[] args){

        ExcelUtility ex = new ExcelUtility();
        ex.readDataFromExcel();
    }
}
