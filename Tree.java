import java.util.Arrays;

public class Tree {

    private TreeNode root;
    private int value1;
    
    
    public String getCounter() {
    	String s2 = String.valueOf(root.totalCountInteger());
    	System.out.println(s2);
		return s2;
	}
    
    

	private long start_time_Integer;
    private long end_time_Integer;
    private String time_complexity_Integer;
    
    
    
    public String timeComplexityInteger(){
        long timeInteger = end_time_Integer - start_time_Integer;
        time_complexity_Integer = String.valueOf(timeInteger);
        return time_complexity_Integer;
    }

    public void setSearchValue(String search) {
        this.value1 = Integer.parseInt(search);
    }

    public void insertBST(String s1){
        String[] t1 = s1.split(",");

        int[] intArray = Arrays.asList(t1).stream().mapToInt(Integer::parseInt).toArray();

        for (int i=0; i<intArray.length; i++){
            insert(intArray[i]);
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }


    public String get() {
    	start_time_Integer = System.nanoTime();
        if (root != null) {
            return String.valueOf(root.get(this.value1));
        }
        end_time_Integer = System.nanoTime();

        return null;
    }
    

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max() {
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
