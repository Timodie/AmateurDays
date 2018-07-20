import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class TImeConverter {
	
//	private String getDate(long time) {
//	    Calendar cal = Calendar.getInstance(Locale.ENGLISH);
//	    cal.setTimeInMillis(time);
//	    String date = DateFormat.format("dd-MM-yyyy", cal).toString();
//	    return date;
//	}
	public static String convertTime (String renewalTime){


        long time = Long.parseLong(renewalTime);
        Date date = new Date(time);
        String dateString = date.toString();
        String [] arr = dateString.split(" ");

        String finDate  = arr[1]+" "+arr[2]+" "+arr[3];
        return finDate;
    }
	
	@SuppressWarnings("deprecation")
	public static void main(String [] args){
		/*
		long t =Long.parseLong("1496447589961");
        SimpleDateFormat sfd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        sfd.format(new Date(t));
        System.out.println(sfd.getDateInstance());*/
		
		System.out.println(convertTime("1496461210892"));
	}

}
