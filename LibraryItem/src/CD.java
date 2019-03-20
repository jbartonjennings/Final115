public class CD extends LibraryItem {
	private String lyrics;
	
	public CD() {
	
	super();
	}
		
	    public void itemNumber() {
	        System.out.println("4714");
	    }
	    
	    public void itemTitle() {
	        System.out.println("Pink Floyd: Echoes.");
	        
	    }
	    
	    public void checkIn() {
	        System.out.println("03.12.19");
	    }
	    
	    public void checkOut() {
	        System.out.println("03.03.19");
	    }
	    
	    public void lyrics() {
	    	System.out.println("explicit lyrics");
	    }
	}
