package testData;

import com.excel.reader.Xls_Reader;

public class ReadExcel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\old files\\madhuri\\Drivers_selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Xls_Reader excel = new Xls_Reader("F:\\Project\\FirstProject\\src\\main\\java\\testData\\testData.xlsx");
		
		excel.getRowCount("sheet1");
		

	}

}
