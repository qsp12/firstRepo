 package com.qsp.genericLib;

import java.util.Date;

public class JavaUtils {
	
  public String generateDate()
  {
	  Date da=new Date();
	  String[] x=da.toString().split(" ");
	  return x[2]+"-"+x[1]+"-"+x[5];
  }
  public String generateTime()
  {
	  Date da=new Date();
	  String[] x=da.toString().split(" ");
	  String time=x[3];
	  return time.replace(":","-");
  
}
  public static void main(String[] args) {
	JavaUtils ju=new JavaUtils();
	
	System.out.println(ju.generateDate());
}
  
}
