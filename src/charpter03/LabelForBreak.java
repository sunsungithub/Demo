package charpter03;

public class LabelForBreak {
	
	public static void main(String[] args) 
	{
	    int i=10;
	    label_for_break:
	    while(i>0) {
	    	//System.out.println("Test break label");
	    	System.out.printf("i==%d",i);
	    	System.out.println();
	    	
	    	if(i<5) {
	    		System.out.println("End by i==4");
	    		break label_for_break;
	    	}
	    	i--;
	    }
		
	}

}
