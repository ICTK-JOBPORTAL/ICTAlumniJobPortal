package com.qa.alumnijobportal.utilities;

import java.io.IOException;

public class RandomEmail {
public String randomNum() throws IOException
	
	{
		int min=100;
		int max=999;
		int rand = (int)(Math.random()*(max-min+1)+min);  
		String At="@gmail.com";
		String RandomMail=rand+At;
		return RandomMail;
	}

}
