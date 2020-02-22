package standard.teste2.q6;

public class Donkey implements Movable {

	int location = 200;
	public void move(int by) {
		location = location+by;
		
	}

	
	public void moveBack(int by) {
		location = location-by;
		
	}

}
