package nosi.core.webapp.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Emanuel Pereira
 * 14 Aug 2017
 */
public class DateHelper {

	public static String convertDate(String date, String formatIn, String formatOut) {
		String myDateString = null;
		try {
			SimpleDateFormat newDateFormat = new SimpleDateFormat(formatIn);
			Date myDate = newDateFormat.parse(date);
			newDateFormat.applyPattern(formatOut);
			myDateString = newDateFormat.format(myDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myDateString;
	}
	
	public static Date formatDate(String data,String outputFormat){ 
		if (data == null || data.equals(""))
			return null;
        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat(outputFormat);
            date = (java.util.Date)formatter.parse(data);
        } catch (ParseException e) {   
        	e.printStackTrace();
        	return null;
        }
        return date;
	}
}
