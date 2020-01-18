import java.util.Arrays;

public class QuickSort {
	
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


	public String printQSortInteger(String s1) {
        String[] t1 = s1.split(",");
        int[] intArray = Arrays.asList(t1).stream().mapToInt(Integer::parseInt).toArray();
        String result = "";
        quicksortInteger(intArray, 0, intArray.length);
        for (int i =0; i<intArray.length; i++) {
            result += intArray[i];
            result +=",";
        }
        return result;
    }

    public String printQSortDouble(String s1) {
        String[] t1 = s1.split(",");
         
        double[] doubleArray = Arrays.asList(t1).stream().mapToDouble(Double::parseDouble).toArray();

        String result = "";
        quicksortDouble(doubleArray, 0, doubleArray.length);
        for (int i =0; i<doubleArray.length; i++) {
            result += doubleArray[i];
            result +=",";
        }
        return result;
    }


    public String printQSortString(String s1) {
        String result = "";
        String[] stringArray = s1.split(",");
        qSortString(stringArray);
        for (int i =0; i<stringArray.length; i++) {
            result += stringArray[i];
            result +=",";
        }
        return result;
    }
	
	//****************************************************************************************Integer
	
    public void quicksortInteger(int[] input, int start,int end){
    	
    	start_time_Integer = System.nanoTime();
    	
        if (end - start <2)
            return;
        int pivotIndex = partition (input, start, end);
        quicksortInteger(input, start, pivotIndex);
        for (int i=0; i<input.length; i++)
            System.out.println(input[i]);
        quicksortInteger(input,pivotIndex+1,end);
        
        end_time_Integer = System.nanoTime();
    }

    public int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;
        
        int count1=0 ,count2 = 0;
        
        while (i < j) {
        	
        	count1 = 0;
        	count2= 0;

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
                count1 ++;
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
                count2++;
            }
            sumInteger = sumInteger + count1 + count2;
        }

        input[j] = pivot;
        return j;

    }
    //*************************************************************************Double
    public void quicksortDouble(double[] input, int start,int end){
    	
    	start_time_Double = System.nanoTime();
        if (end - start <2)
            return;
        int pivotIndex = partition (input, start, end);
        quicksortDouble(input, start, pivotIndex);
        for (int i=0; i<input.length; i++)
            System.out.println(input[i]);
        quicksortDouble(input,pivotIndex+1,end);
        
        end_time_Double = System.nanoTime();
    }

    public int partition(double[] input, int start, int end) {
        // This is using the first element as the pivot
        double pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
        	int count1=0 ,count2 = 0;

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
                count1++;
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
                count2++;
            }
            sumDouble = sumDouble + count1 + count2;
        }

        input[j] = pivot;
        return j;

    }
    
    //***********************************************************************************String

    String names[];
    int length;

    public void qSortString(String array[]) {
    	
    	start_time_String = System.nanoTime();
    	
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
        
        end_time_String = System.nanoTime();
    }

    public void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
        	int count1 =0, count2 =0;
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
                count1++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
                count2++;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
            
            sumString = sumString + count1 + count2;
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    public void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}

