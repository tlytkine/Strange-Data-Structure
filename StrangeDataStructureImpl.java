
import java.util.*;

public class StrangeDataStructureImpl implements StrangeDataStructure {

    // INSERT YOUR CODE HERE
    // Stores elements of strange data structure in ArrayList 
    private ArrayList<Integer> strange;
    // Constructor 
    StrangeDataStructureImpl() {
    	strange = new ArrayList<Integer>(1);
    }
    // Method that adds elements to strange data structure
    public void addElement(int x){
    	strange.add(x);
    }
    // Returns the sum of the elements stored
    public int getSumOfElements() {
    	int strangeSum = 0; 
    	int size = strange.size();
    	int i;
    	for(i=0; i<size; i++){
    		strangeSum += strange.get(i);
    	}
    	return strangeSum;
    }
    // Enumerates through strange data structure to return odd integers stored
    public Enumeration oddElements() {
    	ArrayList<Integer> odd = new ArrayList<Integer>(1);
    	Enumeration<Integer> e;
    	int i;
    	int size = strange.size();
    	for(i=1; i<size; i=i+2){
    		odd.add(strange.get(i));
    	}
    	e = Collections.enumeration(odd);

    	return e;
    }
    // Enumerates through strange data structure to return even integers stored 
    public Enumeration evenElements() {
    	ArrayList<Integer> even = new ArrayList<Integer>(1);
    	Enumeration<Integer> e;
    	int i;
    	int size = strange.size();
    	for(i=0; i<size; i=i+2){
    		even.add(strange.get(i));
    	}
    	e = Collections.enumeration(even);

    	return e;
    }
}
