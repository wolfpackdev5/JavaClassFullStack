
public class MissionOne {
	//sorting soldiers
	
	public Soldier[] soldiers;
	
	public MissionOne() { }
	
		int x = 0;
		int y = 0;
		int z = 0;
	public Soldier[] frontOfTheLineSoldier() {
		
		//System.out.println(x + " " + y);
		Soldier guy = new Soldier();

		while(x < soldiers.length) {
			if(soldiers[x].getStarRating() > guy.getStarRating()) {
				guy.setStarRating(soldiers[x].getStarRating());
				z = x;
			}
			x++;
		}
		swapIndex(z, y);
		if(y < soldiers.length - 1) {
		y += 1;
		
		x = y;
		frontOfTheLineSoldier();
		}
		
		
			
		
		return this.soldiers;
	}
	
	public void swapIndex(int index1, int index2) {
		Soldier thisGuy = soldiers[index1];
		soldiers[index1] = soldiers[index2];
		soldiers[index2] = thisGuy;
		
	}
}
