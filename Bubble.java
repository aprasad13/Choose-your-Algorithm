import java.util.Arrays;

public class Bubble {
	
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

	public String BubbleString(String s1){
//    	results = null;
         String tempStr;
         String results = "";
        String[] t1 = s1.split(",");
        
        start_time_String = System.nanoTime();
        
        int count = 0;
        
        for (int t = 0; t < t1.length - 1; t++) {
        	
        	
        	count = 0;
            for (int i= 0; i < t1.length - t -1; i++) {
                if(t1[i+1].compareTo(t1[i])<0) {
                    tempStr = t1[i];
                    t1[i] = t1[i + 1];
                    t1[i + 1] = tempStr;
                    count ++;
                }
            }
            sumString = sumString + count;
        }
        end_time_String = System.nanoTime();
        
        for (int i = 0; i < t1.length; i++) {
//            results = System.out.println(t1[i]);
            results += t1[i];
            results += ",";
        }
        return results;
    }

    public String BubbleInteger(String s1){
        int tempStr;
        String results = "";
        String[] t1 = s1.split(",");

        int[] intArray = Arrays.asList(t1).stream().mapToInt(Integer::parseInt).toArray();
        
        start_time_Integer = System.nanoTime();
//        sumString = 0;
        int count = 0;
        
        for (int t = 0; t < intArray.length; t++) {
        	
        	count = 0;
            for (int i= 0; i < (intArray.length - t) -1; i++) {
                if(intArray[i+1]<(intArray[i])) {
                    tempStr = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tempStr;
                    count ++;
                }
            }
            sumInteger = sumInteger + count;
        }
        end_time_Integer = System.nanoTime();
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(" "+intArray[i]);
            results += intArray[i];
            results += ",";
        }
        return results;
    }

    public String BubbleDouble(String s1){
        double tempStr;
        String results = "";
        String[] t1 = s1.split(",");

        double[] doubleArray = Arrays.asList(t1).stream().mapToDouble(Double::parseDouble).toArray();

        start_time_Double = System.nanoTime();
        
        int count = 0;
        
        for (int t = 0; t < doubleArray.length; t++) {
        	
        	count = 0;
            for (int i= 0; i < (doubleArray.length - t) -1; i++) {
                if(doubleArray[i+1]<(doubleArray[i])) {
                    tempStr = doubleArray[i];
                    doubleArray[i] = doubleArray[i + 1];
                    doubleArray[i + 1] = tempStr;
                    count ++;
                }
            }
            sumDouble = sumDouble + count;
        }
        end_time_Double = System.nanoTime();
        
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
            results += doubleArray[i];
            results += ",";
        }
        return results;
    }

}
