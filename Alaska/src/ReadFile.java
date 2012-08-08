import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.supercsv.cellprocessor.constraint.StrMinMax;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.exception.SuperCSVReflectionException;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class ReadFile {
	static List<AlaskaRowBean> masterList = new ArrayList<AlaskaRowBean>();
	static String[] writeHeaderArr;

	public static void main(String[] args) throws SuperCSVReflectionException, IOException, NumberFormatException, ParseException {
		final CellProcessor[] processors = new CellProcessor[] {
				//Make this a little more useful later
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				new StrMinMax(0, 100),
				null
		};

		CsvBeanReader aReaderBean = new CsvBeanReader(new FileReader("/Users/fsimon/Desktop/JENB/AK Project/allvars.csv"), CsvPreference.EXCEL_PREFERENCE);
		try {
			final String[] header = aReaderBean.getCSVHeader(true);
			writeHeaderArr = header.clone();
			AlaskaRowBean aRowBean;
			while( (aRowBean = aReaderBean.read(AlaskaRowBean.class, header, processors)) != null) {
				masterList.add(aRowBean);
			}
		} finally {
			aReaderBean.close();
		}
		gen_uIDsAndURLs();
		permuter();
		beanWriter();
		System.out.println("done");
		Toolkit.getDefaultToolkit().beep();
	}

	public static void gen_uIDsAndURLs(){
		Integer id = 1;
		for (AlaskaRowBean ubean : masterList) {
			ubean.setUID(id.toString());
			id++;
			if(!ubean.getLongitude().equals("")){
				ubean.setGmapURL(ubean.makeGMapURL());
			}
		}
	}

	public static void permuter() throws NumberFormatException, ParseException{
		for (AlaskaRowBean ibean : masterList) {
			System.out.println(ibean.getUID());
			for (AlaskaRowBean jbean : masterList) {
				if(!ibean.getLocation().equals("") && !jbean.getLocation().equals("")){
					//********
					// Distance: Add jbean.uID to ibeanSet
					if(ibean.distFrom(jbean) < 100){
						ibean.setofDistanceUIDs.add(jbean.getUID());
					}
					//********

					//********
					//EnhancedNeighbor: In ADL and uID form
					String [] enhArr = ibean.enhancedIsNeighbor(jbean);
					if(enhArr[0].equals("true")){
						ibean.setOfADLs.add(jbean.getAdlnumber());
						ibean.setofUIDs.add(jbean.getUID());
					}
					//********
					
					//********
					//Remove self from set
					ibean.setofDistanceUIDs.remove(ibean.getUID());
					ibean.setOfADLs.remove(ibean.getAdlnumber());
					ibean.setofUIDs.remove(ibean.getUID());
					//********

					//********
					//Make 3 sets into 3 Strings.
					String distUID = Arrays.toString(ibean.setofDistanceUIDs.toArray()).replaceAll("[\\[\\],]", "");
					String enhADL = Arrays.toString(ibean.setOfADLs.toArray()).replaceAll("[\\[\\],]", "");
					String enhUID = Arrays.toString(ibean.setofUIDs.toArray()).replaceAll("[\\[\\],]", "");
					//********

					//********
					//Store these strings as the column strings
					ibean.setCoordNeighbors(distUID);
					ibean.setAdlneighbors(enhADL);
					ibean.set_uIDNeighbors(enhUID);
					//********
				}
			}
		}
	}

	public static void beanWriter () throws IOException{
		//******
		//This is the first few column headers which I am adding
		String writeHeader = "uID,Neighs by uID (using PLSS),Neighs by ADL (using PLSS)," +
				"distance_uIDNeighbors (using coordinates),MapURL,";
		//******

		//******
		//Make the header array that superCSV made into a String
		for (String head : writeHeaderArr){
			writeHeader += head + ", ";
		}
		//******

		//******
		//Create the output file and output file writer(s)
		File tstWrtFl = new File("/Users/fsimon/Desktop/JENB/AK Project/iTestxxx.csv");
		FileWriter aFileWriter = new FileWriter(tstWrtFl);
		CsvBeanWriter aBeanWriter = new CsvBeanWriter(aFileWriter, CsvPreference.EXCEL_PREFERENCE);
		//******

		//******
		//Write the headers
		aFileWriter.write(writeHeader + "\n");
		//******

		//******
		//Iterate over all beans and write all the columns in each row.
		for (AlaskaRowBean iBean : masterList){
			aBeanWriter.write(iBean, "uID", "_uIDNeighbors", "adlneighbors", "coordNeighbors", "gmapURL", "auctiondate","adlnumber", "padplatform","salenumber","filetype",
					"royaltytype","biddeposit","totalbonus","royaltyshare","netprofitshare","slidingroyalty",
					"termlength","bidtype","bidreceived","acresofferedsale","acresleasedsale",
					"tractsofferedsale","bidvariable","minbid","fixedtermssale","econinccredits",
					"totalacres","typeclose","closingdate","caseclosed","relinquished","geographicarea",
					"location","section","meridian","currentclass","currentstatus","permittedclass",
					"permittedstatus","statusdate","datecompleted","twp","twpd","rng","rngd","ftns",
					"ns","ftew","ew","td","tvd","field","fieldpool","longitude","latitude",
					"offshore","ownership1","ownership2","locationcode");
		}
		//******

		aBeanWriter.close();
		aFileWriter.close();
	}
}
