
import java.util.Arrays;

public class TreeDouble {

    private TreeNodeDouble root;
    private double value1;
    private double array;
    
    private long start_time_Double;
    private long end_time_Double;
    private String time_complexity_Double;
    
    public String getCounter() {
    	String s2 = String.valueOf(root.totalCountDouble());
    	System.out.println(s2);
		return s2;
	}
    
    public String timeComplexityDouble(){
        long timeDouble = end_time_Double - start_time_Double;
        time_complexity_Double = String.valueOf(timeDouble);
        return time_complexity_Double;
    }


    public void setSearchValue(String search) {
        this.value1 = Double.parseDouble(search);
    }

    public void insertBST(String s1){
        String[] t1 = s1.split(",");

        double[] doubleArray = Arrays.asList(t1).stream().mapToDouble(Double::parseDouble).toArray();

        for (int i=0; i<doubleArray.length; i++){
            insert(doubleArray[i]);
        }
    }

    public void insert(double value) {
        if (root == null) {
            root = new TreeNodeDouble(value);
        }
        else {
            root.insert(value);
        }
    }


    public String get() {
    	start_time_Double = System.nanoTime();
        if (root != null) {
            return String.valueOf(root.get(this.value1));
        }
        end_time_Double = System.nanoTime();
        return null;
    }


    public double min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public double max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

}
