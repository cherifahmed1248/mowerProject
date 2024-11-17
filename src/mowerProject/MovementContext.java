package mowerProject;

public class MovementContext {
    private IMovementStrategy movementStrategy;

    public MovementContext(IMovementStrategy strategy) {
        this.movementStrategy = strategy;
    }

    public void setPaymentStrategy(IMovementStrategy strategy) {
        this.movementStrategy = strategy;
    }

    public void executeMovement(int GridX, int GridY, String position, String actions) {
    	Mower mower = movementStrategy.moveMower(GridX, GridY, position, actions);
    	System.out.println(mower.printMowerPosition());
    }

}
