import java.util.Arrays;

public class LinearSearch {
	
	private int sumString;
	private int sumInteger;
	private int sumDouble;

	public String totalCountString() {
		String s1 = String.valueOf(sumString);
		return s1;
	}
	
	public String totalCountInteger() {
		String s1 = String.valueOf(sumInteger);
		return s1;
	}
	
	public String totalCountDouble() {
		String s1 = String.valueOf(sumDouble);
		return s1;
	}

    private int intValue;
    private String stringValue;
    private double doubleValue;
    
    private long start_time_String;
    private long end_time_String;
    private String time_complexity_String;
    
    private long start_time_Integer;
    private long end_time_Integer;
    private String time_complexity_Integer;

    private long start_time_Double;
    private long end_time_Double;
    private String time_complexity_Double;
    
    public String timeComplexityString(){
        long timeString = end_time_String - start_time_String;
        time_complexity_String = String.valueOf(timeString);
        return time_complexity_String;
    }

    public String timeComplexityInteger(){
        long timeInteger = end_time_Integer - start_time_Integer;
        time_complexity_Integer = String.valueOf(timeInteger);
        return time_complexity_Integer;
    }

    public String timeComplexityDouble(){
        long timeDouble = end_time_Double - start_time_Double;
        time_complexity_Double = String.valueOf(timeDouble);
        return time_complexity_Double;
    }
    

    public void setIntValue(String str) {
    	
        this.intValue = Integer.parseInt(str);
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setDoubleValue(String str) {
    	
        this.doubleValue = Double.parseDouble(str);
    }

    public String linearSearchInteger(String s1){
        String[] t1 = s1.split(",");
        int i;
        int flag = 0;
        int[] intArray = Arrays.asList(t1).stream().mapToInt(Integer::parseInt).toArray();
        int count = 0;
        start_time_Integer = System.nanoTime();
        
        for (i= 0; i<intArray.length; i++) {
        	count++;
        	sumInteger = sumInteger + count;
        	count = 0;
            if (intArray[i] == intValue) {
            	flag =1;
            	break;
            }
            
        }
        end_time_Integer = System.nanoTime();
        if(flag == 1)
        	return "Based on Textbox 1 entered input found at position " +(i+1);
        else
        	return "Entered input not Found";
    }


    public String linearSearchDouble(String s1){
        String[] t1 = s1.split(",");
        int i;
        int flag = 0;
        double[] doubleArray = Arrays.asList(t1).stream().mapToDouble(Double::parseDouble).toArray();
        int count = 0;
        start_time_Double = System.nanoTime();
      
        for (i= 0; i<doubleArray.length; i++) {
        	count++;
        	
            if (doubleArray[i] == doubleValue) {
            	flag =1;
            	break;
            	
            }
            
        }
        sumDouble = sumDouble + count;
        end_time_Double = System.nanoTime();    
        if(flag == 1)
        	return "Based on Textbox 1 entered input found at position " +(i+1);
        else
        	return "Entered input not Found";
    }
        
        
    

    public String linearSearchString(String s1){
        String[] t1 = s1.split(",");
        
        int i;
        int flag = 0;
        
        int count = 0;
        start_time_String = System.nanoTime();
        for(i = 0; i<t1.length; i++)
        {	count++;
            if (stringValue.equals(t1[i]))
            {
                flag = 1;
                
                
                break;
            }
            
        }
        sumString = sumString + count;
        end_time_String = System.nanoTime();
        
        if (flag ==1){
            return "Based on Textbox 1 entered input found at position " +(i+1);
        }
        else
        	return "Entered input not Found";
    }

}
