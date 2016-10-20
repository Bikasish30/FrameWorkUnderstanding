package genericLib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataReader {

	private FileInputStream fis;
	private XSSFWorkbook xssfWB;
	private DataFormatter df;
	private Sheet sheet;

	String url = "Z:\\Eclipse Neon 11-08-2016\\EclipseNeonWorkSpace\\LoginApp\\TestData\\ImmidartTestData.xlsx";

	public int getTotalNumberOfRows(String urlPath, String sheetName) throws IOException {
		fis = new FileInputStream(urlPath);
		xssfWB = new XSSFWorkbook(fis);
		sheet = xssfWB.getSheet(sheetName);
		int totalNoOfRows = sheet.getPhysicalNumberOfRows();
		xssfWB.close();
		fis.close();
		return totalNoOfRows;
	}

	public String getData(String urlPath, String sheetName, int rowNumber, int cellNumber) throws IOException {
		fis = new FileInputStream(urlPath);
		xssfWB = new XSSFWorkbook(fis);
		sheet = xssfWB.getSheet(sheetName);
		df = new DataFormatter();
		String cellData = df.formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		xssfWB.close();
		fis.close();
		return cellData;
	}
}
