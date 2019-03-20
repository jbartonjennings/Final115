public class Book extends LibraryItem {
	
	private String review;
	
	public Book() {
	
	super();
	}
		
	    public void itemNumber() {
	        System.out.println("4717");
	    }
	    
	    public void itemTitle() {
	        System.out.println("Molloy, Malone Dies, The Unnameable.");
	        
	    }
	    
	    public void checkIn() {
	        System.out.println("03.18.19");
	    }
	    
	    public void checkOut() {
	        System.out.println("03.07.19");
	    }
	    
	    public void review() {
	    	System.out.println("best book ever");
	    }
	}
