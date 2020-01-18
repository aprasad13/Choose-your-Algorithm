

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    static int sumInteger;
    private int count = 0;
    
 

	public TreeNode(int data) {
        this.data = data;
    }

   

	public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value) {
    	
        if (value == data) {  
        	count++;
        	sumInteger = sumInteger +count;
            System.out.println(sumInteger);
            return this;
        }

        else if (value < data) {
            if (leftChild != null) {
            	count ++;
            	sumInteger = sumInteger +count;
                return leftChild.get(value);
            }
        }
        else if (rightChild != null) {
            	count ++;
            	sumInteger = sumInteger +count;
                return rightChild.get(value);
            }
        
//        sumInteger = sumInteger + count;
        System.out.println(sumInteger);

        return null;
    }
    
    public int totalCountInteger() {
    	System.out.println(sumInteger);
		return sumInteger;
	}

    public int min() {
        if (leftChild == null) {
            return data;
        }
        else {
            return leftChild.min();
        }
    }

    public int max() {
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

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public String toString() {
        return "Entered input found";
    }
}
