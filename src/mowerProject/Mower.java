package mowerProject;

public class Mower {
	private int x;
	private int y;
	private String direction;
	private int gridX;
	private int gridY;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getDirection() {
		return direction;
	}

	public int getGridX() {
		return gridX;
	}

	public int getGridY() {
		return gridY;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void setGridX(int gridX) {
		this.gridX = gridX;
	}

	public void setGridY(int gridY) {
		this.gridY = gridY;
	}

	public Mower(int x, int y, String direction, int gridX, int gridY) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.gridX = gridX;
		this.gridY = gridY;
	}

	public String printMowerPosition() {
		return " " + x + " " + y + " " + direction;
	}

}
