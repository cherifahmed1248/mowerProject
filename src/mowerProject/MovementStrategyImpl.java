package mowerProject;

public class MovementStrategyImpl implements IMovementStrategy{

	public Mower moveMower(int GridX, int GridY, String position, String actions) {
		Mower mower = generateMower(GridX, GridY, position);
		for (String instruction : actions.split("")) {
			switch (instruction) {
			case "G":
				moveLeft(mower);
				break;
			case "D":
				moveRight(mower);
				break;
			case "A":
				forward(mower);
				break;
			}
		}
		return mower;
	}

	public Mower generateMower(int GridX, int GridY, String position) {
		int mowerX = Integer.parseInt(position.split(" ")[0].strip());
		int mowerY = Integer.parseInt(position.split(" ")[1].strip());
		String mowerDirection = position.split(" ")[2].strip();
		Mower mower = new Mower(mowerX, mowerY, mowerDirection, GridX, GridY);
		return mower;
	}

	public void moveRight(Mower mower) {
		switch (mower.getDirection()) {
		case "N":
			mower.setDirection("E");
			break;
		case "E":
			mower.setDirection("S");
			break;
		case "S":
			mower.setDirection("W");
			break;
		case "W":
			mower.setDirection("N");
			break;
		}
	}

	public void moveLeft(Mower mower) {
		switch (mower.getDirection()) {
		case "E":
			mower.setDirection("N");
			break;
		case "S":
			mower.setDirection("E");
			break;
		case "W":
			mower.setDirection("S");
			break;
		case "N":
			mower.setDirection("W");
			break;
		}
	}

	public void forward(Mower mower) {
		switch (mower.getDirection()) {
		case "N":
			if (mower.getY() + 1 <= mower.getGridY()) {
				mower.setY(mower.getY() + 1);
			}
			break;
		case "E":
			if (mower.getX() + 1 <= mower.getGridX()) {
				mower.setX(mower.getX() + 1);
			}
			break;
		case "S":
			if (mower.getY() - 1 >= 0) {
				mower.setY(mower.getY() - 1);
			}
			break;
		case "W":
			if (mower.getX() - 1 >= 0) {
				mower.setX(mower.getX() - 1);
			}
			break;
		}
	}


}
