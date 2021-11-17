package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author girija
 *
 */
public class FileUtil {
	
	/***
	 * this method is used to get String data from excel
	 * @param sheetName is used to enter the sheetName of the excel
	 * @param rowNum is used to enter the row number of the excelSheet
	 * @param cellNum is used to enter the cell number of the excelSheet
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
 
		public static String readStringFromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException{
			File abspath=new File("./resources/Book1.xlsx");
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook = WorkbookFactory.create(fis);
			String data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			return data;
		}
		/***
		 * this method is used to get boolean data from excel
		 * @param sheetName is used to enter the sheetName of the excel
		 * @param rowNum is used to enter the row number of the excelSheet
		 * @param cellNum is used to enter the cell number of the excelSheet
		 * @return boolean
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		
		public static boolean readBooleanFromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException{
			File abspath=new File("./resources/Book1.xlsx");
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook = WorkbookFactory.create(fis);
			boolean data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
			return data;
		}
		/***
		 * this method is used to get localDateTime data from excel
		 * @param sheetName is used to enter the sheetName of the excel
		 * @param rowNum is used to enter the row number of the excelSheet
		 * @param cellNum is used to enter the cell number of the excelSheet
		 * @return LocalDateTime
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		
		public static LocalDateTime readDateFromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException{
			File abspath=new File("./resources/Book1.xlsx");
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook = WorkbookFactory.create(fis);
			LocalDateTime data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();
			return data;
		}
		/***
		 * this method is used to get the numeric data from excel
		 * @param sheetName is used to enter the sheetName of the excel
		 * @param rowNum is used to enter the row number of the excelSheet
		 * @param cellNum is used to enter the cell number of the excelSheet
		 * @return double
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		
		public static double readNumericFromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException{
			File abspath=new File("./resources/Book1.xlsx");
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook = WorkbookFactory.create(fis);
			double data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
			return data;
		}
		/***
		 * this method is used to get the multiple data from excel
		 * @param sheetName is used to enter the sheetName of the excel
		 * @return String[][]
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		
		public static String[][] readMultipleDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException{
			File abspath=new File("./resources/Book1.xlsx");
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet multipleData = workbook.getSheet(sheetName);
			int rowCount = multipleData.getPhysicalNumberOfRows();
			int cellCount = multipleData.getRow(0).getPhysicalNumberOfCells();
			String[][] sarr = new String[rowCount][cellCount];
		
		  for(int i=0;i<rowCount;i++) { 
			  for(int j=0;j<cellCount;j++) {
		  sarr[i][j]=multipleData.getRow(i).getCell(j).toString();
		  } 
		  }
		 return sarr;
		}
		/**
		 * this method is used to get data from property file
		 * @param value is used to enter the value from property file
		 * @return String
		 * @throws IOException
		 */
		 public String readPropertyFile(String value) throws IOException {
			 File abspath=new File("./src/test/resources/Testdata.properties");
			 FileInputStream fis=new FileInputStream(abspath);
			 
			 Properties properties=new Properties();
			 properties.load(fis);
			 String data = properties.getProperty(value);
			 return data;
		 }


}
