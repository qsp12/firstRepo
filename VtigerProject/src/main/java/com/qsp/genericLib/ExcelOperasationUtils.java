package com.qsp.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperasationUtils {
	FileInputStream fis;
	Workbook book;
	DataFormatter df;
public String fetchSingleData(String path,int cell,int row,String sheetName)
{
    	try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			book=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	df=new DataFormatter();
    	return df.formatCellValue(book.getSheet(sheetName).getRow(row).getCell(cell));
}
public List fetchMultiRowData(String path,int cell,int row,String sheetName,int lastrow)
{
	   List l=new ArrayList();
    	try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			book=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	df=new DataFormatter();
    	Sheet sh=book.getSheet(sheetName);
    	for(int i=0;i<lastrow;i++)
    	{    
    		String data=df.formatCellValue(sh.getRow(row).getCell(cell));
    		l.add(data);
    	}
    	return l;
    	}
}
 