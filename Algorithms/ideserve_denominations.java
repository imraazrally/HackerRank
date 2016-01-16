	public static void main(String [] args){
		int [] notes=new int[]{20,10,5,1};
		Denomination d=new Denomination(notes);
		d.printNumberOfWays(20);
	}
}

class Denomination{
	int [] notes;
	int [] state;
	
	public Denomination(int [] notes){
		this.notes=notes;
		this.state=new int[notes.length];
	}

	public void printNumberOfWays(int amount){
		print(amount,0);
	}

	private void print(int amount,int pos){
		if(amount<0)return;

		if(amount==0){
			System.out.println(Arrays.toString(state));
			return;
		}

		for(int i=pos; i<notes.length; i++){
			state[i]++;
			print(amount-notes[i],i);
			state[i]--;
		}
	}
}
