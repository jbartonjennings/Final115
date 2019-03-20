public class DVD extends LibraryItem {
		private String rating;
		
		public DVD() {
		
		super();
		}
		
	    public void itemNumber() {
	        System.out.println("4713");
	    }
	    
	    public void itemTitle() {
	        System.out.println("My Life as a Dog.");
	        
	    }
	    
	    public void checkIn() {
	        System.out.println("03.13.19");
	    }
	    
	    public void checkOut() {
	        System.out.println("03.02.19");
	    }
	    
	    public void rating() {
	    	System.out.println("R rated");
	    }
	}
