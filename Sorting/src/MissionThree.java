
public class MissionThree {

	/**
	 * Merges two sorted arrays, and computer the difference in scores
	 * 
	 * @param person1 a sorted array of medals
	 * @param person2 a sorted array of medals
	 * @return the difference in score of person1 and person2
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<? super T>> int merge(T[] person1, T[] person2) {
		//int totalperson1
		int oneTotal = 0;
		//int totalperson2
		int twoTotal = 0;
		
		//create an array of size prson1 + prson2
		T[] medals = (T[]) new Comparable[person1.length + person2.length];
		//add all the elements from person1
		for(int x = 0; x < person1.length - 1; x++) {
			medals[x] = person1[x];
		}
		//then for each elememt in person2, loop through the new array and compare to to find the proper spot
		for( T object : person2) {
			for(int i = 0; i < medals.length - 1; i++) {
				if(medals[i].compareTo(object) == 1) {
					int a = medals.length;
					while(a > i) {
						medals[a] = medals[a - 1];
						a--;
					}
					medals[i] = object;
				}
			}
		}
		
		//loop through the final additions of the new array
		for(int r = 0; r < medals.length; r++) {
			for(int s = 0; s < person1.length; s++) {
				if(medals[r].equals(person1[s])) {
					oneTotal += r + 1;
				}
			}
			for(int q = 0; q < person2.length; q++) {
				if(medals[r].equals(person2[q])) {
					twoTotal += q + 1;
				}
			}
		}
		//if object exists in person1 add x(index number) + 1 to 
		//if object exists in person2 add x(index number) + 1
		
		
		return oneTotal - twoTotal;
	}
	
}