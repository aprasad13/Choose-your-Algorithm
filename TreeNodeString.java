

public class TreeNodeString {

    private String data;
    private TreeNodeString leftChild;
    private TreeNodeString rightChild;
    private int count =0;
    static int sumString;

    public TreeNodeString(String data) {
        this.data = data;
    }

    public void insert(String value) {
        if (value.equals(data)) {
            return;
        }

        if (value.compareTo(data)<0) {
            if (leftChild == null) {
                leftChild = new TreeNodeString(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new TreeNodeString(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNodeString get(String value) {
        if (value == data) {
        	count++;
        	sumString = sumString +count ;
            return this;
        }

        if (value.compareTo(data)<0) {
            if (leftChild != null) {
            	count++;
            	sumString = sumString +count ;
                return leftChild.get(value);
            }
        }
        else {
            if (rightChild != null) {
            	count++;
            	sumString = sumString +count ;
                return rightChild.get(value);
            }
        }

        return null;
    }

    public int totalCountString() {
    	System.out.println(sumString);
		return sumString;
	}



    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ",");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNodeString getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNodeString leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNodeString getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNodeString rightChild) {
        this.rightChild = rightChild;
    }

    public String toString() {
        return "Entered input found";
    }
}
