package utils;

public class ExcelUtilSetup {
public static void main(String[] args) {
	
	String projectPath= System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"/Excel/data.xlsx", "Sheet1");
	excel.getRowcount();
	excel.getColCount();
	excel.getNumericCellData(1, 0);
	excel.getStringCellData(0, 0);
	  
	
	
	
}
}
