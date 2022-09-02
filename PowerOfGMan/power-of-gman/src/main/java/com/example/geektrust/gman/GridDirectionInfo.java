package com.example.geektrust.gman;

import java.util.Objects;

/**
 * GridDirectionInfo class to hold the direction. It also finds the no of turns
 * when move.
 * 
 * @author Ganesh.
 *
 */
public class GridDirectionInfo {

	
	private Direction direction;

	public GridDirectionInfo(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/**
	 * Find the no of turn when move x distance.
	 * 
	 * @param xDistance - x axis move distance.
	 * @return no of turn.
	 */
	private int calcTurnX(int xDistance) {
		if (xDistance != GManConstants.ZERO) {
			if (direction == Direction.NORTH || direction == Direction.SOUTH) {
				// need to turn 90 degree.
				return GManConstants.TURN_1_90_DEGREE;
			} else if (direction == Direction.EAST && xDistance < 0) {
				// need to turn 180 degree.
				return GManConstants.TURN_2_180_DEGREE;
			} else if (direction == Direction.WEST && xDistance > 0) {
				// need to turn 180 degree.
				return GManConstants.TURN_2_180_DEGREE;
			}
		}
		return GManConstants.NO_TURN;

	}

	/**
	 * Find the no of turn when move y distance.
	 * 
	 * @param yDistance - y axis move distance.
	 * @return no of turn.
	 */
	private int calcTurnY(int yDistance) {
		if (yDistance != GManConstants.ZERO) {
			if (direction == Direction.EAST || direction == Direction.WEST) {
				// need to turn 90 degree.
				return GManConstants.TURN_1_90_DEGREE;
			} else if (direction == Direction.NORTH && yDistance < 0) {
				// need to turn 180 degree.
				return GManConstants.TURN_2_180_DEGREE;
			} else if (direction == Direction.SOUTH && yDistance > 0) {
				// need to turn 180 degree.
				return GManConstants.TURN_2_180_DEGREE;
			}
		}
		return GManConstants.NO_TURN;

	}

	/**
	 * Calculate the total no of turn when move x,y.
	 * 
	 * @param xDistance - x axis move distance.
	 * @param yDistance - y axis move distance.
	 * @return
	 */
	public int calcTurns(int xDistance, int yDistance) {
		// Max distance is 2 always. Since it is allow to turn left and right.
		return Math.max(calcTurnX(xDistance), calcTurnY(yDistance));
	}

}
