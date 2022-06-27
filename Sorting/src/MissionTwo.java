import java.util.Arrays;

public class MissionTwo<T extends Comparable<? super T>> {
private T[] data;
int x = 0;
int y = 0;
int z = 0;
	
	/**
	 * Default Constructor
	 */
	@SuppressWarnings("unchecked")
	public MissionTwo(int maxCapacity) {
		this.data =  (T[])new Comparable[maxCapacity];
	}
	
	/**
	 * method to separate swapping logic from sort method
	 */
	public void swapIndex(int index1, int index2) {
		T object = data[index1];
		data[index1] = data[index2];
		data[index2] = object;
		
	}
	
	/**
	 * sorting method 
	 * higher priority comes first 
	 */
	public T[] sort() {
		T object = data[x];

		while(x < data.length) {
			if(data[x].compareTo(object) == -1) {
				object = data[x];
				z = x;
			}
			x++;
		}
		swapIndex(z, y);
		if(y < data.length - 1) {
			y += 1;
			
			x = y;
			sort();
		}
		return this.data;
	}
	
	
	/**
	 * Adds the item to the structure, must be
	 * 
	 * in-place
	 * stable
	 * O(n)
	 * 
	 * @param item
	 */
	@SuppressWarnings("unchecked")
	public void add(T item) {
		
		
		T[] myData = this.data;
		
		data = (T[]) new Comparable[myData.length + 1];
		for(int i = 0; i < myData.length; i++) {
			data[i] = myData[i];
		}
		
		data[myData.length] = item;
		
		sort();
	}
	
	/**
	 * This must return the smallest element in this structure, must be
	 * 
	 * in-place
	 * stable
	 * O(1)
	 * 
	 * @return the smallest element currently in this structure
	 */
	@SuppressWarnings("unchecked")
	public T remove() {
		sort();
		
		T object = data[data.length - 1];
		
		// figure out how to shrink the array
		T[] myData = this.data;
		
		data = (T[]) new Comparable[myData.length - 1];
		for(int i = 0; i < myData.length; i++) {
			data[i] = myData[i];
		}
		
		return object;
	}
}
