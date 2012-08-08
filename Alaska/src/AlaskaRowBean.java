import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public class AlaskaRowBean {
	public String getAuctiondate() {
		return auctiondate;
	}

	public void setAuctiondate(String auctiondate) {
		this.auctiondate = auctiondate;
	}

	public String getAdlnumber() {
		return adlnumber;
	}

	public void setAdlnumber(String adlnumber) {
		this.adlnumber = adlnumber;
	}

	public String getPadplatform() {
		return padplatform;
	}

	public void setPadplatform(String padplatform) {
		this.padplatform = padplatform;
	}

	public String getSalenumber() {
		return salenumber;
	}

	public void setSalenumber(String salenumber) {
		this.salenumber = salenumber;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getRoyaltytype() {
		return royaltytype;
	}

	public void setRoyaltytype(String royaltytype) {
		this.royaltytype = royaltytype;
	}

	public String getBiddeposit() {
		return biddeposit;
	}

	public void setBiddeposit(String biddeposit) {
		this.biddeposit = biddeposit;
	}

	public String getTotalbonus() {
		return totalbonus;
	}

	public void setTotalbonus(String totalbonus) {
		this.totalbonus = totalbonus;
	}

	public String getRoyaltyshare() {
		return royaltyshare;
	}

	public void setRoyaltyshare(String royaltyshare) {
		this.royaltyshare = royaltyshare;
	}

	public String getNetprofitshare() {
		return netprofitshare;
	}

	public void setNetprofitshare(String netprofitshare) {
		this.netprofitshare = netprofitshare;
	}

	public String getSlidingroyalty() {
		return slidingroyalty;
	}

	public void setSlidingroyalty(String slidingroyalty) {
		this.slidingroyalty = slidingroyalty;
	}

	public String getTermlength() {
		return termlength;
	}

	public void setTermlength(String termlength) {
		this.termlength = termlength;
	}

	public String getBidtype() {
		return bidtype;
	}

	public void setBidtype(String bidtype) {
		this.bidtype = bidtype;
	}

	public String getBidreceived() {
		return bidreceived;
	}

	public void setBidreceived(String bidreceived) {
		this.bidreceived = bidreceived;
	}

	public String getAcresofferedsale() {
		return acresofferedsale;
	}

	public void setAcresofferedsale(String acresofferedsale) {
		this.acresofferedsale = acresofferedsale;
	}

	public String getAcresleasedsale() {
		return acresleasedsale;
	}

	public void setAcresleasedsale(String acresleasedsale) {
		this.acresleasedsale = acresleasedsale;
	}

	public String getTractsofferedsale() {
		return tractsofferedsale;
	}

	public void setTractsofferedsale(String tractsofferedsale) {
		this.tractsofferedsale = tractsofferedsale;
	}

	public String getBidvariable() {
		return bidvariable;
	}

	public void setBidvariable(String bidvariable) {
		this.bidvariable = bidvariable;
	}

	public String getMinbid() {
		return minbid;
	}

	public void setMinbid(String minbid) {
		this.minbid = minbid;
	}

	public String getFixedtermssale() {
		return fixedtermssale;
	}

	public void setFixedtermssale(String fixedtermssale) {
		this.fixedtermssale = fixedtermssale;
	}

	public String getEconinccredits() {
		return econinccredits;
	}

	public void setEconinccredits(String econinccredits) {
		this.econinccredits = econinccredits;
	}

	public String getTotalacres() {
		return totalacres;
	}

	public void setTotalacres(String totalacres) {
		this.totalacres = totalacres;
	}

	public String getTypeclose() {
		return typeclose;
	}

	public void setTypeclose(String typeclose) {
		this.typeclose = typeclose;
	}

	public String getClosingdate() {
		return closingdate;
	}

	public void setClosingdate(String closingdate) {
		this.closingdate = closingdate;
	}

	public String getCaseclosed() {
		return caseclosed;
	}

	public void setCaseclosed(String caseclosed) {
		this.caseclosed = caseclosed;
	}

	public String getRelinquished() {
		return relinquished;
	}

	public void setRelinquished(String relinquished) {
		this.relinquished = relinquished;
	}

	public String getGeographicarea() {
		return geographicarea;
	}

	public void setGeographicarea(String geographicarea) {
		this.geographicarea = geographicarea;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getMeridian() {
		return meridian;
	}

	// Umiat, Seward, Copper River
	public void setMeridian(String meridian) {
		this.meridian = meridian;
	}

	public String getCurrentclass() {
		return currentclass;
	}

	public void setCurrentclass(String currentclass) {
		this.currentclass = currentclass;
	}

	public String getCurrentstatus() {
		return currentstatus;
	}

	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}

	public String getPermittedclass() {
		return permittedclass;
	}

	public void setPermittedclass(String permittedclass) {
		this.permittedclass = permittedclass;
	}

	public String getPermittedstatus() {
		return permittedstatus;
	}

	public void setPermittedstatus(String permittedstatus) {
		this.permittedstatus = permittedstatus;
	}

	public String getStatusdate() {
		return statusdate;
	}

	public void setStatusdate(String statusdate) {
		this.statusdate = statusdate;
	}

	public String getDatecompleted() {
		return datecompleted;
	}

	public void setDatecompleted(String datecompleted) {
		this.datecompleted = datecompleted;
	}

	public String getTwp() {
		return twp;
	}

	public void setTwp(String twp) {
		this.twp = twp;
	}

	public String getTwpd() {
		return twpd;
	}

	public void setTwpd(String twpd) {
		this.twpd = twpd;
	}

	public String getRng() {
		return rng;
	}

	public void setRng(String rng) {
		this.rng = rng;
	}

	public String getRngd() {
		return rngd;
	}

	public void setRngd(String rngd) {
		this.rngd = rngd;
	}

	public String getFtns() {
		return ftns;
	}

	public void setFtns(String ftns) {
		this.ftns = ftns;
	}

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}

	public String getFtew() {
		return ftew;
	}

	public void setFtew(String ftew) {
		this.ftew = ftew;
	}

	public String getEw() {
		return ew;
	}

	public void setEw(String ew) {
		this.ew = ew;
	}

	public String getTd() {
		return td;
	}

	public void setTd(String td) {
		this.td = td;
	}

	public String getTvd() {
		return tvd;
	}

	public void setTvd(String tvd) {
		this.tvd = tvd;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFieldpool() {
		return fieldpool;
	}

	public void setFieldpool(String fieldpool) {
		this.fieldpool = fieldpool;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getOffshore() {
		return offshore;
	}

	public void setOffshore(String offshore) {
		this.offshore = offshore;
	}

	public String getOwnership1() {
		return ownership1;
	}

	public void setOwnership1(String ownership1) {
		this.ownership1 = ownership1;
	}

	public String getOwnership2() {
		return ownership2;
	}

	public void setOwnership2(String ownership2) {
		this.ownership2 = ownership2;
	}

	public String getLocationcode() {
		return locationcode;
	}

	public void setLocationcode(String locationcode) {
		this.locationcode = locationcode;
	}

	private String uID, auctiondate,adlnumber,padplatform,salenumber,filetype,royaltytype,biddeposit,
	totalbonus,royaltyshare,netprofitshare,slidingroyalty,termlength,bidtype,bidreceived,
	acresofferedsale,acresleasedsale,tractsofferedsale,bidvariable,minbid,fixedtermssale,
	econinccredits,totalacres,typeclose,closingdate,caseclosed,relinquished,geographicarea,
	location,section,meridian,currentclass,currentstatus,permittedclass,permittedstatus,
	statusdate,datecompleted,twp,twpd,rng,rngd,ftns,ns,ftew,ew,td,tvd,field,fieldpool,longitude,
	latitude,offshore,ownership1,ownership2,locationcode;


	public String get_uIDNeighbors() {
		return _uIDNeighbors;
	}

	public void set_uIDNeighbors(String uIDNeighbors) {
		this._uIDNeighbors = uIDNeighbors;
	}

	public String getUID() {
		return uID;
	}

	public void setUID(String uID) {
		this.uID = uID;
	}

	String theseAreMySectNeighbors = "$";
	String adlneighbors = "";
	String _uIDNeighbors = "";
	String coordNeighbors = "";
	String gmapURL = "";
	public Set <String> setofDistanceUIDs = new TreeSet<String>();
	public Set <String> setOfADLs = new TreeSet<String>();
	public Set <String> setofUIDs = new TreeSet<String>();

	public String makeGMapURL(){
		return "https://maps.google.com/maps?q=" + this.latitude + ",+" 
				+ this.longitude + "+("+ "This tract's ADL is: " + 
				this.adlnumber+ " and was auctioned on: "+ this.auctiondate + ")"+"&iwloc=A&hl=en";
	}

	public String getGmapURL() {
		return gmapURL;
	}

	public void setGmapURL(String gmapURL) {
		this.gmapURL = gmapURL;
	}

	public String getCoordNeighbors() {
		return coordNeighbors;
	}

	public void setCoordNeighbors(String coordNeighbors) {
		this.coordNeighbors = coordNeighbors;
	}

	public String getAdlneighbors() {
		return adlneighbors;
	}

	public void setAdlneighbors(String adlneighbors) {
		this.adlneighbors = adlneighbors;
	}

	public String getTheseAreMyNeighbors() {
		return theseAreMySectNeighbors;
	}

	public void setTheseAreMyNeighbors(String theseAreMyNeighbors) {
		this.theseAreMySectNeighbors = theseAreMyNeighbors;
	}

	public String[] isSectionNeighborWithinSameLocation (AlaskaRowBean aTract){

		boolean merCheck = checkMeridian(aTract);
		boolean townCheck = checkTownship(aTract);
		boolean secCheck = checkSection(aTract);

		if(merCheck && townCheck && secCheck){
			String [] tar = {"true", aTract.section, aTract.adlnumber, aTract.uID};
			return tar;
		}

		else if (!merCheck || !townCheck || !secCheck){
			String [] far = {"false", aTract.section, aTract.adlnumber, aTract.uID};
			return far;
		}
		throw new IllegalStateException("Not Neighbor nor not LOCATION neighbor"); 
	}

	public boolean checkSection(AlaskaRowBean aTract){
		//Checks if they're section neighbors
		String theNs = returnNineNeighs(this);
		if (theNs.equals("x")){
			throw new IllegalStateException("no correct neighbors"); 
		}
		if(theNs.contains("-"+aTract.section+"-")) return true;
		return false;
	}

	public String returnNineNeighs (AlaskaRowBean aTract){
		// Nine because it includes itself. Since tracts may not fill all of section there may be two per section.
		if (this.section.isEmpty() || aTract.section.isEmpty()){ return "-"; }

		int theSection = Integer.parseInt(aTract.section);
		switch(theSection){
		case 1: 
			return "-1-2-11-12-";
		case 2:
			return "-1-2-3-10-11-12-";
		case 3:
			return "-2-3-4-9-10-11-";
		case 4:
			return "-3-4-5-8-9-10-";
		case 5:
			return "-4-5-6-7-8-9-";
		case 6:
			return "-5-6-7-8-";
		case 7:
			return "-6-5-7-8-18-17-";
		case 8:
			return "-6-5-4-7-8-9-18-17-16-";
		case 9:
			return "-3-4-5-8-9-10-17-16-15-";
		case 10:
			return "-2-3-4-9-10-11-16-15-14-";
		case 11:
			return "-1-2-3-10-11-12-15-14-13-";
		case 12:
			return "-1-2-11-12-14-13-";
		case 13:
			return "-12-11-13-14-23-24-";
		case 14:
			return "-10-11-12-14-15-13-22-23-24-";
		case 15:
			return "-9-10-11-15-16-14-21-22-23-";
		case 16:
			return "-8-9-10-17-16-15-20-21-22-";
		case 17:
			return "-7-8-9-18-16-17-19-20-21-";
		case 18:
			return "-7-8-17-18-19-20-";
		case 19:
			return "-18-17-19-20-30-29-";
		case 20:
			return "-18-17-16-19-20-21-30-29-28-";
		case 21:
			return "-17-16-15-20-21-22-29-28-27-";
		case 22:
			return "-16-15-14-21-22-23-28-27-26-";
		case 23:
			return "-13-14-15-22-23-24-27-26-25-";
		case 24:
			return "-13-14-23-24-25-26-";
		case 25:
			return "-24-23-25-26-35-36-";
		case 26:
			return "-22-23-24-26-27-25-34-35-36-";
		case 27:
			return "-21-22-23-27-28-26-33-34-35-";
		case 28:
			return "-20-21-22-27-28-29-32-33-34-";
		case 29:
			return "-19-20-21-29-30-28-31-32-33-";
		case 30:
			return "-19-20-29-30-31-32-";
		case 31:
			return "-30-29-31-32-";
		case 32:
			return "-30-29-28-31-32-33-";
		case 33:
			return "-29-28-27-32-33-34-";
		case 34:
			return "-28-27-26-33-34-35-";
		case 35:
			return "-27-26-25-34-35-36-";
		case 36:
			return "-25-26-35-36-";
		}
		return "x";
	}

	public boolean checkTownship (AlaskaRowBean aTract){
		String thisTownship = this.location.substring(2,this.location.length());
		String thatTownship = aTract.location.substring(2,aTract.location.length());

		if (this.location.isEmpty() || aTract.location.isEmpty()){ return false; }

		if(thisTownship.equals(thatTownship)){ return true;}
		return false;
	}

	public boolean checkMeridian (AlaskaRowBean aTract){
		char thisMeridian = this.meridian.charAt(0);
		char thatMeridian = aTract.meridian.charAt(0);

		//*Check Empty
		if (this.meridian.isEmpty() || aTract.meridian.isEmpty()){ return false; }

		if (thisMeridian == thatMeridian){return true;}
		return false;
	}	

	public void main(String[] args) {
	}

	public int daysBetween(Date d1, Date d2){
		return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}

	public boolean checkTime (AlaskaRowBean aTract) throws NumberFormatException, ParseException{

		if(this.auctiondate.split("-").length > 1 && aTract.closingdate.length() > 1){
			
			//******
			//Prepare thatAucDate
			String[] thisCalArr = this.auctiondate.split("-");
			SimpleDateFormat monthParse = new SimpleDateFormat("MMM");
			SimpleDateFormat monthDisplay = new SimpleDateFormat("MM");
			SimpleDateFormat yearParse = new SimpleDateFormat("yy");
			SimpleDateFormat yearDisplay = new SimpleDateFormat("yyyy");

			int thisMonth = Integer.parseInt(monthDisplay.format(monthParse.parse(thisCalArr[1])));		    
			int thisYear = Integer.parseInt(yearDisplay.format(yearParse.parse(thisCalArr[2])));
			int thisDay = Integer.parseInt(thisCalArr[0]);
			Calendar thisAucDate = new GregorianCalendar(thisYear, thisMonth, thisDay);
			//******

			//******
			//Prepare thatCloDate
			SimpleDateFormat allParse = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat allDisplay = new SimpleDateFormat("dd-MM-yyyy");
			String [] thatCalArr = allDisplay.format(allParse.parse(aTract.closingdate)).split("-");

			int thatMonth = Integer.parseInt(thatCalArr[1]);		    
			int thatYear = Integer.parseInt(thatCalArr[2]);
			int thatDay = Integer.parseInt(thatCalArr[0]);
			Calendar thatCloDate = new GregorianCalendar(thatYear, thatMonth, thatDay);
			//******
			
			//*******
			//Prepare thatAucDate
			String[] thatAucDateArr = aTract.auctiondate.split("-");
			int thatAMonth = Integer.parseInt(monthDisplay.format(monthParse.parse(thatAucDateArr[1])));		    
			int thatAYear = Integer.parseInt(yearDisplay.format(yearParse.parse(thatAucDateArr[2])));
			int thatADay = Integer.parseInt(thatAucDateArr[0]);
			Calendar thatAucDate = new GregorianCalendar(thatAYear, thatAMonth, thatADay);
			//*******

			//*******
			//Final BoolTest:
			//If this auction date is after the closing time of that well then false. 
			//If this auction date is before that auction date then false.
			if(thisAucDate.after(thatCloDate) || thisAucDate.before(thatAucDate)){ 		
				return false;
			}
			//*******
		}
		return true;
	}

	public boolean vertNeighs (AlaskaRowBean aTract){
		int thisSect = Integer.parseInt(this.getSection());
		int thatSect = Integer.parseInt(aTract.getSection());

		switch(thisSect){
		case 1:
			if(thatSect == 36 || thatSect == 35){return true;}
			break;
		case 2: 
			if(thatSect == 36 || thatSect == 35 || thatSect == 34){return true;}
			break;
		case 3:
			if(thatSect == 33 || thatSect == 34 || thatSect == 35){return true;}
			break;
		case 4:
			if(thatSect == 33 || thatSect == 34 || thatSect == 32){return true;}
			break;
		case 5:
			if(thatSect == 33 || thatSect == 31 || thatSect == 32){return true;}
			break;
		case 6:
			if(thatSect == 31 || thatSect == 32){return true;}
			break;
		case 36:
			if(thatSect == 1 || thatSect == 2){return true;}
			break;
		case 35:
			if(thatSect == 1 || thatSect == 2 || thatSect == 3){return true;}
			break;
		case 34:
			if(thatSect == 4 || thatSect == 2 || thatSect == 3){return true;}
			break;
		case 33:
			if(thatSect == 5 || thatSect == 4 || thatSect == 3){return true;}
			break;
		case 32:
			if(thatSect == 5 || thatSect == 4 || thatSect == 6){return true;}
			break;
		case 31:
			if(thatSect == 5 || thatSect == 6){return true;}
			break;
		}
		return false;
	}

	public boolean horizNeighs (AlaskaRowBean aTract){
		int thisSect = Integer.parseInt(this.getSection());
		int thatSect = Integer.parseInt(aTract.getSection());

		switch(thisSect){
		case 1:
			if(thatSect == 6 || thatSect == 7) { return true; }
			break;
		case 12:
			if(thatSect == 18 || thatSect == 7 || thatSect == 18) { return true; }
			break;
		case 13:
			if(thatSect == 18 || thatSect == 7 || thatSect == 19) { return true; }
			break;
		case 24:
			if(thatSect == 18 || thatSect == 19 || thatSect == 25){ return true; }
			break;
		case 25:
			if(thatSect == 19 || thatSect == 30 || thatSect == 31){ return true; }
			break;
		case 36:
			if(thatSect == 30 || thatSect == 31){ return true; }
			break;
		case 6:
			if(thatSect == 1 || thatSect == 12){ return true; }
			break;
		case 7:
			if(thatSect == 1 || thatSect == 12 || thatSect == 13){ return true; }
			break;
		case 18:
			if(thatSect == 12 || thatSect == 13 || thatSect == 24){ return true; }
			break;
		case 19:
			if(thatSect == 13 || thatSect == 24 || thatSect == 25){ return true; }
			break;
		case 30:
			if(thatSect == 24 || thatSect == 25 || thatSect == 36){ return true; }
			break;
		case 31:
			if(thatSect == 25 || thatSect == 36){ return true; }
			break;
		}
		return false;
	}

	public String[] enhancedIsNeighbor (AlaskaRowBean aTract) throws NumberFormatException, ParseException{
		String [] truarr = {"true", aTract.section, aTract.adlnumber, aTract.uID};
		String [] falarr = {"false", aTract.section, aTract.adlnumber, aTract.uID};

		// Not neighbors if time doesn't match
		if (checkTime(aTract) == false){
			return falarr;
		}

		//Not neighbors if they're on different meridians
		if(!this.getMeridian().equals(aTract.getMeridian())){
			return falarr;
		}

		int thisNSnum = Integer.parseInt(this.getTwp());
		int thatNSnum = Integer.parseInt(aTract.getTwp());
		int thisEWnum = Integer.parseInt(this.getRng());
		int thatEWnum = Integer.parseInt(aTract.getRng());
		String thisNScha = this.getTwpd();
		String thatNScha = aTract.getTwpd();
		String thisEWcha = this.getRngd();
		String thatEWcha = aTract.getRngd();

		//If they are horizontal neighbors
		int ewDist = Math.abs(thisEWnum - thatEWnum);
		if(ewDist <= 1 && thisNSnum == thatNSnum && thisNScha.equals(thatNScha)
				&& thisEWcha.equals(thatEWcha)){
			if(horizNeighs(aTract) == true){
				return truarr;
			}
		}

		//If they are vertical neighbors.
		int nsDist = Math.abs(thisNSnum - thatNSnum);
		if(thisEWnum == thatEWnum && nsDist <= 1 && thisEWcha.equals(thatEWcha)
				&& thisNScha.equals(thatNScha)){
			if(vertNeighs(aTract) == true){
				return truarr;
			}
		}
		//if they're not horizontal nor vertical neighbors.
		return this.isSectionNeighborWithinSameLocation(aTract);
	}

	public float distFrom(AlaskaRowBean aBean) {
		double lat2 = Float.parseFloat(aBean.latitude);
		double lng2 = Float.parseFloat(aBean.longitude);
		double earthRadius = 3958.75;
		double dLat = Math.toRadians(lat2 - Float.parseFloat(this.latitude));
		double dLng = Math.toRadians(lng2 - Float.parseFloat(this.longitude));

		double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
				Math.cos(Math.toRadians(Float.parseFloat(this.latitude))) * Math.cos(Math.toRadians(lat2)) *
				Math.sin(dLng/2) * Math.sin(dLng/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		double dist = earthRadius * c;

		int meterConversion = 1609;

		return new Float(dist * meterConversion).floatValue();
	}
}