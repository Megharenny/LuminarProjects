package webproject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class ResponseCodePgm {
	String link="https://www.facebook.com";
	
	@Test
	public void responseCodeFb() {
	try {       //to handle exception
		
	
		URL u=new URL(link);    //URL class object creation
		HttpURLConnection con=(HttpURLConnection)u.openConnection(); //format look in note
		int code=con.getResponseCode();     
		System.out.println(code);  
		if(code==200) {
			System.out.println("successful link");
		}else {
			System.out.println("not successful link");
		}
	}
	catch(Exception e)
	{
		
	}
	}

}
