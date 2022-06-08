import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


@SuppressWarnings("rawtypes")
public class LinearProbingHashTable<K, V> implements GradableMap{
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
		List<HashTableEntry> hashList = new ArrayList<>(Arrays.asList(entries));
		return hashList.contains(key);
	}
	
	@Override
	public Set entrySet() {
		Set<HashTableEntry> hashSet = new HashSet<HashTableEntry>();
		hashSet.addAll(Arrays
				.asList(entries));
		return hashSet;
	}
	

	@Override
	public boolean containsValue(Object value) {
		List<HashTableEntry> hashList = new ArrayList<>(Arrays.asList(entries));
		return hashList.contains(value);
	}
	

	@Override
	public Object get(Object key) {
		
		Object value = null;
		
		List<HashTableEntry> hashList = new ArrayList<>(Arrays.asList(entries));
		if(!hashList.contains(key)) {
			throw new NullPointerException();
		} else {


		for(int x = 0; x < entries.length; x++) {
			
			if(entries[x].getKey() == key) {
				value = entries[x].getValue();
			} 
		}
		}
		return value;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public Object put(Object key, Object value) {
		int hash = Math.abs(key.hashCode() % 11);
		HashTableEntry putHash = new HashTableEntry(key, value);
		Object ifNeeded = null;
		if(entries[hash].getKey() == null && hash < max * size) {
			entries[hash] = putHash;
		} if(entries[hash].getKey() != null && hash < max * size) {
			ifNeeded = entries[hash].getValue();
			entries[hash] = putHash;
		} else {
			//add in hashtable resizing
			throw new NullPointerException();
		}
		return ifNeeded;
	}

	

	@Override
	public Object remove(Object key) {
		Object toRemove = null;
		//find object at hashed index
		int hash = Math.abs(key.hashCode() % 11);
		if(entries[hash] == null) {
			throw new NullPointerException();
		} if(entries[hash] != null && entries[hash].getKey() != null) {
			toRemove = entries[hash].getValue();
		}
		
		return toRemove;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void putAll(Map map) {
		Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<K, V> entry = iterator.next();
			//HashTableEntry<K, V> iHash = new HashTableEntry<>(entry.getKey(), entry.getValue());
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public Set keySet() {
		Set<Object> hashSet = new HashSet<Object>();
		for(HashTableEntry entry : entries) {
			hashSet.add(entry.getKey());
		}
		return hashSet;
	}

	@Override
	public Collection values() {
		Collection<HashTableEntry> collection = new ArrayList<HashTableEntry>(Arrays.asList(entries));
		return collection;
	}

	@Override
	public HashTableEntry[] getArray() {
		// TODO Auto-generated method stub
		return this.entries;
	}

	@Override
	public void setArray(HashTableEntry[] array) {
		this.entries = array;
	}
	
	

}
