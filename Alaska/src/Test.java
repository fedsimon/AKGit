import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//I want thisauctiondate to be before closingdate: 19640101

public class Test {
	public static void main(String[] args) throws IOException, ParseException{
		Set <String> seta = new TreeSet<String>();
		
		seta.add("1");
		seta.add("2");
		seta.add("3");
		seta.add("4");
		seta.add("5");
		seta.add("1");
		
		System.out.println(Arrays.toString(seta.toArray()).replaceAll("[\\[\\],]", ""));
	}
}