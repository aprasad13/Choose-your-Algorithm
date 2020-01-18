import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

/*
<applet code="home" width=200 height=200>
</applet>
*/

public class home extends Applet implements ActionListener, ItemListener{
	TextField textfield,label,textFieldToEnterArrayForSearch,textFieldToSearchValue,resultTextBubble,resultTextQuick,resultSortedSearch;
	Choice choice,choice1,choice2,choice3;
	Button sort,search;
	String x = "";
	int array_type;
	
	Checkbox Integer_Array, Float_Array, String_Array;
	CheckboxGroup cbg;
	Label lab,resultTimeBubble,resultTimeQuick,resultSearchLinear,resultSearchBinary,resultTimeLinear,resultTimeBinary,countBubble,countQuick,countLinear,countBinary;
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("Application to Sort and Search : ",10,20);
		g.drawString("Enter your inputs : ",10,130);
		g.drawString("Choose the type of Array you want to Sort/Search : ",10,50);
		g.drawString("Sorting : ",10,100);
		g.drawString("Sorting based on: ", 10, 170);
		g.drawString("Complexity (in nanosecond): ", 10, 210);
		g.drawString("Total Count of Operation: ", 10, 250);
		g.drawString("Sorted result: ", 10, 300);
		g.drawString("-----------------------------------------------------------------------------------------------------------------------------------------"
				+ "---------------------------------------------------------------------------------------------------------------------------------------------"
				+ "---------------------------------------------", 10, 340);
		g.drawString("-----------------------------------------------------------------------------------------------------------------------------------------"
				+ "---------------------------------------------------------------------------------------------------------------------------------------------"
				+ "---------------------------------------------", 10, 80);
		
		textfield.setBounds(180,110,500,30);
		textFieldToEnterArrayForSearch.setBounds(180,370,500,30);
		textFieldToSearchValue.setBounds(180,420,200,30);
		resultSortedSearch.setBounds(800,420,200,30);
		resultTextBubble.setBounds(180, 280, 200, 30);
		resultTextQuick.setBounds(800, 280, 200, 30);
		resultTimeBubble.setBounds(180, 193, 200, 30);
		resultTimeQuick.setBounds(800, 193, 200, 30);
		resultTimeLinear.setBounds(250, 575, 200, 50);
		resultTimeBinary.setBounds(800, 575, 200, 50);
		resultSearchLinear.setBounds(180, 625, 400, 30);
		countBubble.setBounds(180, 230, 200, 30);
		countQuick.setBounds(800, 230, 200, 30);
		countLinear.setBounds(180, 550, 200, 30);
		countBinary.setBounds(800, 550, 200, 30);
		resultSearchBinary.setBounds(800, 625, 400, 30);
		choice.setBounds(180,150,200,30);
		sort.setBounds(1200,150,100,30);
		g.drawString("Enter your inputs (Textbox 1): ",10,390);
		g.drawString("Enter item to be searched: ",10,440);
		g.drawString("Searching: ", 10, 355);
		g.drawString("Sorted Array (Textbox 2): ",650,440);
		search.setBounds(1200,470,100,30);
		choice1.setBounds(180,470,200,30);
		choice3.setBounds(800,470,200,30);
		g.drawString("Searching: ", 10, 490);
//		g.drawString("Linear Search", 120, 500);
//		g.drawString("Binary Search", 500, 500);
		g.drawString("Total Count of Operation: ", 10, 550);
		g.drawString("Complexity (in nanosecond): ", 10, 600);
		g.drawString("Searched result:", 10, 650);
		choice2.setBounds(800,150,200,30);
		Integer_Array.setBounds(300, 20, 120, 50);
		Float_Array.setBounds(450, 20, 120, 50);
		String_Array.setBounds(600, 20, 120, 50);
		lab.setBounds(800, 20, 500, 50);
		
		
	}

	@Override
	public void init() {
		
		textfield = new TextField();
		textfield.setEnabled(false);
		textFieldToEnterArrayForSearch = new TextField();
		textFieldToEnterArrayForSearch.setEnabled(false);
		textFieldToSearchValue = new TextField();
		textFieldToSearchValue.setEnabled(false);
		resultSortedSearch = new TextField();
		resultSortedSearch.setEditable(false);
		resultTextBubble = new TextField();
		resultTextQuick = new TextField();
		resultSearchLinear = new Label();
		resultSearchBinary = new Label();
		resultTimeBubble = new Label();
		resultTimeQuick = new Label();
		resultTimeLinear = new Label();
		resultTimeBinary = new Label();
		countBubble = new Label();
		countQuick = new Label();
		countLinear = new Label();
		countBinary = new Label();
		label = new TextField();
		choice = new Choice();
		choice1 = new Choice();
		choice3 = new Choice();
		choice2 = new Choice();
		sort = new Button("Sort");
		search = new Button("Search");
		

		resultTextBubble.setEditable(false);
		resultTextQuick.setEditable(false);
		
		add(textfield);
		add(textFieldToEnterArrayForSearch);
		add(textFieldToSearchValue);
		add(resultSortedSearch);
		add(resultSearchLinear);
		add(resultSearchBinary);
		add(resultTextBubble);
		add(resultTextQuick);
		add(resultTimeBubble);
		add(resultTimeQuick);
		add(resultTimeLinear);
		add(resultTimeBinary);
		add(countBubble);
		add(countQuick);
		add(countLinear);
		add(countBinary);
//		System.out.println(result+"******");
//		resultTextBubble.setText(result);
		choice.add("Bubble Sort");
//		choice.add("Selection Sort");
		choice1.add("Linear Search");
		choice3.add("Binary Search");
		choice2.add("Quick Sort");
//		choice2.add("Merge Sort");
		
		
		add(choice);		
		add(choice1);
		add(choice2);
		add(choice3);
		add(sort);
		add(search);
		
		
		
		sort.addActionListener(this);
		search.addActionListener(this);
		
		  cbg = new CheckboxGroup();
		  Integer_Array = new Checkbox("Integer Array", cbg, false);
		  Float_Array = new Checkbox("Double Array", cbg, false);
		  String_Array = new Checkbox("String Array", cbg, false);
		  lab = new Label("I Display Your Selection");
		            
		  Integer_Array.addItemListener(this);
		  Float_Array.addItemListener(this);
		  String_Array.addItemListener(this);
		 
		  add(Integer_Array);
		  add(Float_Array);
		  add(String_Array);
		  add(lab);
		
}
	public int intarray1;
	public void itemStateChanged(ItemEvent e)
	  {
		String str = "";
	    if(Integer_Array.getState() == true) {
	      str = "Enter your input in the form of Integer Array";
	      intarray1 = 1;
	      
	    }
	    else if(Float_Array.getState() == true) {
	      str = "Enter your input in the form of Double/Float Array";
	      intarray1 = 3;
	    }
	    else if(String_Array.getState() == true) {
	      str = "Enter your input in the form of String Array";
	      intarray1 = 2;
	    }
	    lab.setText(str);
	    if(Integer_Array.getState() == true || Float_Array.getState() == true || String_Array.getState() == true ) {
	    	textfield.setEnabled(true);
	    	textFieldToEnterArrayForSearch.setEnabled(true);	
	    	textFieldToSearchValue.setEnabled(true);

	    }
	  }
	 
	
	Bubble bsort = new Bubble();
	QuickSort qsort = new QuickSort();
	LinearSearch lsearch = new LinearSearch();
	Tree tree = new Tree();
//	TreeNode treeNode = new TreeNode(data)
	TreeString treeString = new TreeString(); 
	TreeDouble treeDouble = new TreeDouble();
	
	String resultBubble,resultQuick,resultTime,resultTimeQSort,resultLinear,resultBinary,resultSortSearch,resultTimeLinearSearch,resultTimeBinarySearch,
	resultCountBubble,resultCountQuick,resultCountLinear,resultCountBinary;
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String action = arg0.getActionCommand();
		if(action.equals("Sort")) {
			
			if(choice.getSelectedItem()== "Bubble Sort") {
				
				if (intarray1 == 2) {
					resultBubble = bsort.BubbleString(textfield.getText());
					resultQuick = qsort.printQSortString(textfield.getText());
					resultTime = bsort.timeComplexityString();
					resultCountBubble = bsort.totalCountString();
					resultTimeQSort = qsort.timeComplexityString();
					resultCountQuick = qsort.totalCountString();
					System.out.println("Printing String");
					
				}
				
				else if (intarray1 == 1) {
					resultBubble = bsort.BubbleInteger(textfield.getText());
					resultQuick = qsort.printQSortInteger(textfield.getText());
					resultTime = bsort.timeComplexityInteger();
					resultCountBubble = bsort.totalCountInteger();
					resultTimeQSort = qsort.timeComplexityInteger();
					resultCountQuick = qsort.totalCountInteger();
					System.out.println("Printing Integer");
					}
				else if (intarray1 == 3) {
					resultBubble = bsort.BubbleDouble(textfield.getText());
					resultQuick = qsort.printQSortDouble(textfield.getText());
					resultTime = bsort.timeComplexityDouble();
					resultCountBubble = bsort.totalCountDouble();
					resultTimeQSort = qsort.timeComplexityDouble();
					resultCountQuick = qsort.totalCountDouble();
					System.out.println("Printing Double");
					}
				resultTextBubble.setText(resultBubble);
				resultTextQuick.setText(resultQuick);
				resultTimeBubble.setText(resultTime);
				resultTimeQuick.setText(resultTimeQSort);
				countBubble.setText(resultCountBubble);
				countQuick.setText(resultCountQuick);
					
			}
			
			
		}
		if(action.equals("Search")) {
			if (intarray1 == 2) {
				lsearch.setStringValue(textFieldToSearchValue.getText().toLowerCase());
				resultLinear = lsearch.linearSearchString(textFieldToEnterArrayForSearch.getText().toLowerCase());
				resultTimeLinearSearch = lsearch.timeComplexityString();
				resultCountLinear = lsearch.totalCountString();
				
				
				
				resultSortSearch = bsort.BubbleString(textFieldToEnterArrayForSearch.getText());
				treeString.insert(resultSortSearch.toLowerCase());
				treeString.setSearchValue(textFieldToSearchValue.getText().toLowerCase());
				System.out.println(textFieldToSearchValue.getText());
				resultBinary= treeString.get();
				System.out.println(resultBinary);
				resultTimeBinarySearch = treeString.timeComplexityString();
				resultCountBinary = treeString.getCounter();

				
				
				
			}
			
			else if (intarray1 == 1) {
				lsearch.setIntValue(textFieldToSearchValue.getText());
				resultLinear = lsearch.linearSearchInteger(textFieldToEnterArrayForSearch.getText());
				resultTimeLinearSearch = lsearch.timeComplexityInteger();
				resultCountLinear = lsearch.totalCountInteger();
				System.out.println(resultTimeLinearSearch);
				

				resultSortSearch = bsort.BubbleInteger(textFieldToEnterArrayForSearch.getText());
				tree.insertBST(resultSortSearch);
				tree.setSearchValue(textFieldToSearchValue.getText());
				resultBinary= tree.get();
				resultTimeBinarySearch = tree.timeComplexityInteger();
				resultCountBinary = tree.getCounter();
				}
			
			
			else if (intarray1 == 3) {
				lsearch.setDoubleValue(textFieldToSearchValue.getText());
				resultLinear = lsearch.linearSearchDouble(textFieldToEnterArrayForSearch.getText());
				resultTimeLinearSearch = lsearch.timeComplexityDouble();
				resultCountLinear = lsearch.totalCountDouble();
				
				
				resultSortSearch = bsort.BubbleDouble(textFieldToEnterArrayForSearch.getText());
				treeDouble.insertBST(resultSortSearch); 
				treeDouble.setSearchValue(textFieldToSearchValue.getText());
				resultBinary= treeDouble.get();
				resultTimeBinarySearch = treeDouble.timeComplexityDouble();
				resultCountBinary = treeDouble.getCounter();

				}
			resultSearchLinear.setText(resultLinear);
			resultSortedSearch.setText(resultSortSearch);
			resultSearchBinary.setText(resultBinary);
			resultTimeLinear.setText(resultTimeLinearSearch);
			resultTimeBinary.setText(resultTimeBinarySearch);
			countLinear.setText(resultCountLinear);
			countBinary.setText(resultCountBinary);

	}

}}





   	