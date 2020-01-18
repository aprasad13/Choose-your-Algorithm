public class TreeNodeDouble {

    private double data;
    private TreeNodeDouble leftChild;
    private TreeNodeDouble rightChild;
    private int count = 0;
    static int sumDouble;
    
   

    public TreeNodeDouble(double data) {
        this.data = data;
    }

    public void insert(double value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNodeDouble(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new TreeNodeDouble(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNodeDouble get(double value) {
    	
        if (value == data) {
        	count++;
        	sumDouble = sumDouble +count ;
            return this;
        }

        if (value < data) {
            if (leftChild != null) {
            	count++;
            	sumDouble = sumDouble +count ;
                return leftChild.get(value);
            }
        }
        else {
            if (rightChild != null) {
            	count++;
            	sumDouble = sumDouble +count ;
                return rightChild.get(value);
            }
        }
        
        return null;
    }
    
    public int totalCountDouble() {
    	System.out.println(sumDouble);
		return sumDouble;
	}

    public double min() {
        if (leftChild == null) {
            return data;
        }
        else {
            return leftChild.min();
        }
    }

    public double max() {
        if (rightChild == null) {
            return data;
        }
        else {
            return rightChild.max();
        }
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

    public double getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNodeDouble getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNodeDouble leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNodeDouble getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNodeDouble rightChild) {
        this.rightChild = rightChild;
    }

    public String toString() {
        return "Entered input found";
    }
}
