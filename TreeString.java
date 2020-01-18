public class TreeString {

    private TreeNodeString root;
    private String value1;
    
    private long start_time_String;
    private long end_time_String;
    private String time_complexity_String;
    
    public String getCounter() {
    	String s2 = String.valueOf(root.totalCountString());
    	System.out.println(s2);
		return s2;
	}
    
    public String timeComplexityString(){
        long timeString = end_time_String - start_time_String;
        time_complexity_String = String.valueOf(timeString);
        return time_complexity_String;
    }

    public void setSearchValue(String search) {
        this.value1 = search;
    }

//    public void insertBST(String s1){
//        String[] t1 = s1.split(",");
//
//        for (int i=0; i<t1.length; i++){
//            insert(t1[i]);
//            System.out.println(t1[i]);
//        }
//    }

    public void insert(String s1) {
    	String[] t1 = s1.split(",");
    	for(int i=0; i<t1.length; i++) {
        if (root == null) {
            root = new TreeNodeString(t1[i]);
        }
        else {
            root.insert(t1[i]);
        }
    }
    	}


    public String get() {
    	start_time_String = System.nanoTime();
        if (root != null) {
            return String.valueOf(root.get(this.value1));
        }
        end_time_String = System.nanoTime();

        return null;
    }



}
