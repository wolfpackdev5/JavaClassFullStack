import java.util.Map;

public class HashTableEntry<K, V> implements Map.Entry<K, V> {
	private K key;
	private V value;
	private boolean available;
	
	public HashTableEntry(K key, V value) {
		this.key = key;
		this.value = value;
		this.available = false;
	}
	
	public boolean isAvailable() {
		return this.available;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public V setValue(V value) {
		// TODO Auto-generated method stub
		V oldValue = getValue();
		this.value = value;
		System.out.println("the value being removed is: ");
		return oldValue;
	}
	
	@SuppressWarnings("rawtypes")
	public boolean equals(HashTableEntry object) {
		if(this.key == object.key && this.value == object.value) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public int hashCode() {
		String value = this.value.toString();
		int hash = 0;
		for(int x = 0; x < value.length(); x++) {
			hash += x * 31^(value.length() - 1);
		}
		return hash;
		
	}
	
	

}
