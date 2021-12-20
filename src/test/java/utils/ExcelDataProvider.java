package utils;

public class ExcelDataProvider {

	public void testData(String excelPath, String sheetName) {
		ExcelUtils excel = new  ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowcount();
		int colCount = excel.getColCount();
	}

}
