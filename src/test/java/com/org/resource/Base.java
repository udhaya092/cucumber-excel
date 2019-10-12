package com.org.resource;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.org.stepdefinition.Hook;



public class Base {
	
	public void launch(String url) {
		Hook.d.get(url);
	}
		
	public void key(WebElement e, String name)
	{
		e.sendKeys(name);
	}
	public void bn(WebElement e1)
	{
		e1.click();
	}
	
	public static List<HashMap<String, String>> readvaluefromexcelsheet()
	{
		List<HashMap<String,String>> m=new ArrayList<HashMap<String,String>>();
		try
		{
			File loc=new File("C:\\Users\\udhaya\\Documents\\CumcumberExcel\\Data\\testdata.xlsx");
			String sheetname="Sheet1";
			FileInputStream f=new FileInputStream(loc);
			Workbook w=new XSSFWorkbook(f);
			Sheet sh=w.getSheet(sheetname);
			Row row1 = sh.getRow(0);
			for(int i=0;i<sh.getPhysicalNumberOfRows();i++)
			{
				Row currow = sh.getRow(i);
				HashMap<String, String> md=new HashMap<String, String>();
				for (int j=0;j<row1.getPhysicalNumberOfCells();j++)
				{
					Cell curcel = currow.getCell(j);
					switch (curcel.getCellType())
					{
					case Cell.CELL_TYPE_STRING:
						md.put(row1.getCell(j).getStringCellValue(), curcel.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						md.put(row1.getCell(j).getStringCellValue(), String.valueOf(curcel.getNumericCellValue()));
						break;
					
						
					}
				}
				m.add(md);
				
			}
			
			
		
	}catch(Throwable e) {
		e.printStackTrace();
	}
		return m;
	
	
	}
}
