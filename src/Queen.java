
public class Queen {
	private Position position;
	private int id = 0;
	
	public Queen(Position position, int id) {
		this.id = id;
		this.position = position;
	}
	
	public int getRow() {
		return this.position.getRow();
	}
	
	public int getColumn() {
		return this.position.getColumn();
	}
	
	public int getID() {
		return this.id;
	}
	
	public Position getPosition() {
		return this.position;
	}
}
