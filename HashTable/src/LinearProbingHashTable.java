import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class LinearProbingHashTable implements GradableMap{
	private HashTableEntry[] entries;
	private double max;
	private int size;
	
	/**
	 * hashtable constructor with inputs for max load and size 
	 * @param max
	 * @param size
	 */
	public LinearProbingHashTable(double max, int size) {
		this.max = max;
		this.size = size;
	}
	
	/**
	 * hashtable constructor with input for size 
	 * max load is auto set to 0.75
	 * @param size
	 */
	public LinearProbingHashTable(int size) {
		this.max = 0.75;
		this.size = size;
	}
	
	/**
	 * hashtable constructor where size is autoset to 11 and max load is set 0.75
	 */
	public LinearProbingHashTable() {
		this.max = 0.75;
		this.size = 11;
	}
	
	/**
	 * sets size to 0 and initializes entries as a new array 
	 */
	@Override
	public void clear() {
		this.size = 0;
		this.entries = new HashTableEntry[11];
	}
	
	/**
	 * sets the size of the hashtable 
	 */
	@Override
	public int size() {
		return size;
	}
	
	/**
	 * returns true or false based on if the hashtable is empty or not 
	 */
	@Override
	public boolean isEmpty() {	
		if(size > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public boolean containsKey(Object key) {
		//find out if entries contains a key value pair with this key
		List<HashTableEntry> hashList = new ArrayList<>(Arrays.asList(entries));
		return hashList.contains(key);
	}
	
	@Override
	public Set entrySet() {
		Set<HashTableEntry> hashSet = new HashSet<HashTableEntry>();
		hashSet.addAll(Arrays.asList(entries));
		return hashSet;
	}
	

	@Override
	public boolean containsValue(Object value) {
		List<HashTableEntry> hashList = new ArrayList<>(Arrays.asList(entries));
		return hashList.contains(value);
	}
	

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		
	}

	@Override
	public Object remove(Object key) {
		//find the hashtable entry with the associated key 
		//set the available value to true 
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public HashTableEntry[] getArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setArray(HashTableEntry[] array) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}*/
	
	public static void main(String[] args) {
		
	}

}
