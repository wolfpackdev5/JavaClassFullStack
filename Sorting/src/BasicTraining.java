/**
 * 
 * @author devinlewis
 * BasicTraining is a class that quick sorts arrays
 */

//the method logic works right now for swapping values in the array but changes dont actually leave the function 
public class BasicTraining {
		private int pivot;
		private int[] quick;
		
		public BasicTraining(int[] quick) {
			this.quick = quick;
			this.pivot = Math.round(quick.length / 2);
		}
		
		
		public int getPivot() {
			return this.pivot;
		}
		
		/**
		 * will be used in the sorting methods to simplify the code
		 * will swap the values of two indexes in the array
		 * @param index1
		 * @param index2
		 */
		public void swapIndex(int index1, int index2) {
			int x = this.quick[index1];
			this.quick[index1] = this.quick[index2];
			this.quick[index2] = x;
			
		}
		/**
		 * sorts the first half of the array
		 * @param quick
		 */
		public void sortFirstHalf() {
			for(int x = 0; x < pivot; x++) {
				if(this.quick[x] > this.quick[x + 1]) {
					swapIndex(x, x + 1);
				}
			}
		}
		/**
		 * sorts the second half of the array
		 * @param quick
		 */
		public void sortSecondHalf() {
			for(int x = pivot; x < this.quick.length - 1; x++) {
				if(this.quick[x] > this.quick[x + 1]) {
					swapIndex(x, x + 1);
					sortSecondHalf();
					
				}
			}
		}
		
		/**
		 * does a final run through sort of the entire array
		 * @param quick
		 */
		public void finalSort() {
			for(int x = 0; x < this.quick.length - 1; x++) {
				if(this.quick[x] > this.quick[x + 1]) {
					swapIndex(x, x + 1);
					finalSort();
				}
			}
		}
		
		
		public static void main(String[] main) {
			int[] quick = {5, 10, 22, 14, 0, 4, 3};
			BasicTraining qs = new BasicTraining(quick);
			
			System.out.println(qs.getPivot());
			
			/*for(int x = 0; x < qs.quick.length; x++) {
				System.out.println(qs.quick[x]);
			}*/
			
			qs.sortFirstHalf();
			qs.sortSecondHalf();
			qs.finalSort();
			
			for(int x = 0; x < qs.quick.length; x++) {
				System.out.print(qs.quick[x] + " ");
			}
			
			
		}
	
}
