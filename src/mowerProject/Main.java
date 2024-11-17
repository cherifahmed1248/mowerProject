package mowerProject;

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws IOException {
		MovementContext movementContext = new MovementContext(new MovementStrategyImpl());
		MovementContext englishMovementContext = new MovementContext(new EnglishMovementStrategyImpl());
		readFile("./mower.txt", movementContext);
		readFile("./englishInstructionMower.txt", englishMovementContext);
	}

	private static void readFile(String fileName, MovementContext movementContext) throws IOException {
		try (InputStream inputStream = Main.class.getResourceAsStream(fileName);
				InputStreamReader reader = new InputStreamReader(inputStream);
				BufferedReader bufferedReader = new BufferedReader(reader)) {

			if (inputStream == null) {
				throw new FileNotFoundException("File not found.");
			}

			String line = bufferedReader.readLine();
			int GridX = Integer.parseInt(line.split(" ")[0].strip());
			int GridY = Integer.parseInt(line.split(" ")[1].strip());

			if (GridX < 0 || GridY < 0 || (GridX == 0 && GridY == 0)) {
				throw new IOException("Invalid grid size");
			}
			while ((line = bufferedReader.readLine()) != null) {
				String position = line;
				String actions = bufferedReader.readLine();
				movementContext.executeMovement(GridX, GridY, position, actions);
			}
		}
	}

}
