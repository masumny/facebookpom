package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelRead;



public class CreatAccountTeast extends BaseTest {
	@Test(dataProvider="fb")
	public void creataccounttest(String s,String t, String u, String q, String v) throws InterruptedException {
		gethomepage();
		hp.clickonbutton();
		getaccountpage();
		ca.typefirstname(s);
		ca.typelaststname(t);
		ca.typemobilenumber(u);
		ca.typemonth(q);
		ca.selectgender(v);
	}
	@DataProvider(name="fb")
	public Object [][] getdata() throws IOException {
		Object[][] t;
		String filename = "data/sample.xls";
		String sheatname = "Sheet3";
		
		ExcelRead er = new ExcelRead(filename,sheatname);
				t = er.excelToArray();
				
		return t;	
}
}
