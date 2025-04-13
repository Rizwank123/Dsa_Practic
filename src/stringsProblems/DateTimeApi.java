package stringsProblems;
import java.util.*;
import java.text.*;
public class DateTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Date date=new Date();
	       
	        SimpleDateFormat dtateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm ");
	        System.out.println(date);
	        System.out.println("Current Date and Time (Legacy): " + dtateformat.format(date));
	        System.out.println("Current Date and Time (Legacy): " + dtateformat.format(date.getTime()));

	}

}
