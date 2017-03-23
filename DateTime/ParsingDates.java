package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParsingDates {

	public static void main(String[] args) {
		 SimpleDateFormat ft=new SimpleDateFormat("yyyy-mm-dd");
		 String input=args.length==0?"1818-11-11":args[0];
		 System.out.println(input +"Parse as ");
		 Date t;
		 try{
			 t=ft.parse(input);
			 System.out.println(t);
		 }catch(ParseException e){
			 System.out.println("Unparseable using " +ft);
		 }

	}

}
