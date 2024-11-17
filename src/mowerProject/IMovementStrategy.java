package mowerProject;

public interface IMovementStrategy {
	public Mower moveMower(int GridX, int GridY, String position, String actions);

	public Mower generateMower(int GridX, int GridY, String position);

	public void moveRight(Mower mower);

	public void moveLeft(Mower mower);

	public void forward(Mower mower);

}
