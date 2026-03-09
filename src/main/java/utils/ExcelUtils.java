package utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtils {

public static String getCellData(int row,int col){

String path="src/test/resources/testdata/TestData.xlsx";

try{

FileInputStream fis=new FileInputStream(path);

XSSFWorkbook wb=new XSSFWorkbook(fis);

XSSFSheet sheet=wb.getSheet("Sheet1");

return sheet.getRow(row).getCell(col).getStringCellValue();

}
catch(Exception e){

return "";

}

}

}