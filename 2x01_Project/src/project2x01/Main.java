package project2x01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello");
		
		String[] arr = new String[1];
	    arr[0] = "rohit";
	    List<String> newList = Arrays.asList(arr);

	    // Will throw `UnsupportedOperationException
	    // newList.add("jain"); // Can't do this.

	    ArrayList<String> updatableList = new ArrayList<String>();

	    updatableList.addAll(newList); 

	    updatableList.add("jain"); // OK this is fine. 

	    System.out.println(newList);       // Prints [rohit]
	    System.out.println(updatableList); //Prints [rohit, jain]
	}

}
