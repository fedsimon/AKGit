
public class Tract {
	
	private String meridian;
	private String township;
	private String section;
	
	public Tract (String aMer, String aTown, String aSect){
		// The constructor
		this.meridian = aMer;
		this.township = aTown;
		this.section = aSect;
	}
	
 	public String getLocation(int whichLayer){
		switch(whichLayer){
			case 1:
				return this.meridian;
			case 2:
				return this.township;
			case 3:
				return this.section;
		}
		return null;
	}
	
	public void setMeridian (String aMeridian){
		// Meridians will be either C, K, F, S, U
		if (!aMeridian.matches("(C|K|F|S|U)")){
			debugger(1);
		}
		else{
			this.meridian = aMeridian;
		}
	}

	public void setTownship (String aTownship){
		this.township = aTownship;
	}
	
	public void setSection (String aSection){
		if(!aSection.matches("[0-36]")){
			debugger(2);
		}
		else{
			this.section = aSection;
		}
	}

	public boolean isNeighbor (Tract aTract){
		boolean merCheck = checkMeridian(aTract);
		boolean townCheck = checkTownship(aTract);
		boolean secCheck = checkSection(aTract);
	
		if(merCheck && townCheck && secCheck){
			return true;
		}
		
		else if (!merCheck || !townCheck || !secCheck){
			return false;
		}
		
		throw new IllegalStateException("Not Neighbor nor not LOCATION neighbor"); 
	}
	
	public boolean checkSection(Tract aTract){
		//Checks if they're section neighbors
		String theNs = returnNineNeighs(aTract);
		if (theNs.equals("x")){
			debugger(3);
			throw new IllegalStateException("no correct neighbors"); 
		}
		
		if(theNs.contains(this.section)) return true;
		else if (!theNs.contains(this.section)) return false;
		
		return false;
	}
	
	public String returnNineNeighs (Tract aTract){
		// Nine because it includes itself. Since tracts may not fill all of section there may be two per section.
		int theSection = Integer.parseInt(aTract.section);
		switch(theSection){
			case 1: 
				return "1-2-11-12";
			case 2:
				return "1-2-3-10-11-12";
			case 3:
				return "2-3-4-9-10-11";
			case 4:
				return "3-4-5-8-9-10";
			case 5:
				return "4-5-6-7-8-9";
			case 6:
				return "5-6-7-8";
			case 7:
				return "6-5-7-8-18-17";
			case 8:
				return "6-5-4-7-8-9-18-17-16";
			case 9:
				return "3-4-5-8-9-10-17-16-15";
			case 10:
				return "2-3-4-9-10-11-16-15-14";
			case 11:
				return "1-2-3-10-11-12-15-14-13";
			case 12:
				return "1-2-11-12-14-13";
			case 13:
				return "12-11-13-14-23-24";
			case 14:
				return "10-11-12-14-15-13-22-23-24";
			case 15:
				return "9-10-11-15-16-14-21-22-23";
			case 16:
				return "8-9-10-17-16-15-20-21-22";
			case 17:
				return "7-8-9-18-16-17-19-20-21";
			case 18:
				return "7-8-17-18-19-20";
			case 19:
				return "18-17-19-20-30-29";
			case 20:
				return "18-17-16-19-20-21-30-29-28";
			case 21:
				return "17-16-15-20-21-22-29-28-27";
			case 22:
				return "16-15-14-21-22-23-28-27-26";
			case 23:
				return "13-14-15-22-23-24-27-26-25";
			case 24:
				return "13-14-23-24-25-26";
			case 25:
				return "24-23-25-26-35-36";
			case 26:
				return "22-23-24-26-27-25-34-35-36";
			case 27:
				return "21-22-23-27-28-26-33-34-35";
			case 28:
				return "20-21-22-27-28-29-32-33-34";
			case 29:
				return "19-20-21-29-30-28-31-32-33";
			case 30:
				return "19-20-29-30-31-32";
			case 31:
				return "30-29-31-32";
			case 32:
				return "30-29-28-31-32-33";
			case 33:
				return "29-28-27-32-33-34";
			case 34:
				return "28-27-26-33-34-35";
			case 35:
				return "27-26-25-34-35-36";
			case 36:
				return "25-26-35-36";
		}
		return "x";
	}
	
	public boolean checkTownship (Tract aTract){
		if(this.township.equals(aTract.township)){
			return true;
		}
		else if (!this.township.equals(aTract.township)){
			return false;
		}
		throw new IllegalStateException("Not Neighbor nor not TOWNSHIP neighbor"); 
	}
	
	public boolean checkMeridian (Tract aTract){
		if (this.meridian.equals(aTract.meridian)){
			return true;
		}
		else if (!this.meridian.equals(aTract.meridian)){
			return false;
		}
		throw new IllegalStateException("Not Neighbor nor not meridian neighbor"); 
	}
	
	public static void main (String[] args){
		
	}
	
	public static void debugger (int num){
		switch (num){
			case 1:
				System.out.println("setMeridian input not C, K, F, S, U");
				break;
			case 2:
				System.out.println("setSection input not 1-36");
				break;
			case 3:
				System.out.println("the Eight Neighs returned x");
		}
	}

}
