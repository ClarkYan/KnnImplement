package knnAlgorithm;

import java.io.File;
import jxl.*;

public class ReadFile {

	public void readExlFile()
	{
		int i;
		boolean j = false;
		//Define an object called sheet in excel
		Sheet sheet;
		//Define an object called book to read a file
		Workbook book;
		//Define an object called cell in excel
		Cell cell1, cell2, cell3;
		try
		{
			//get the test excel file
			//System.out.println("Start!");
			book = Workbook.getWorkbook(new File("src/data/test.xls"));
			//System.out.println("Start!");
			//get the first sheet in excel
			sheet = book.getSheet(0);
			//get the first cell in excel
			cell1 = sheet.getCell(0,0);
			//System.out.println("!!!"+cell1.getContents()+"!!!"+j+"!!!");
			i = 0;
			while(!j)
			{
				//get the whole contents of this sheet
				j = "".equals(cell1.getContents());
				cell1 = sheet.getCell(0,i);
				cell2 = sheet.getCell(1,i);
				cell3 = sheet.getCell(2,i);
				System.out.println(cell1.getContents()+"\t"+cell2.getContents()+"\t"+cell3.getContents()); 
                i++;
			}
			book.close();
		}
		catch(Exception e)
		{
			
		}
		
	}
}
