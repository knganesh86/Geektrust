package com.example.geektrust.gman;

import java.text.MessageFormat;
import java.util.Objects;

/**
 * GMan is the class which holds the location and direction of the Man.
 * 
 * @author Ganesh.
 *
 */
public class GMan {
	private GridLocation location;
	private GridDirectionInfo direction;
	private int power;

	public GMan() {
		super();
		this.power = GManConstants.INITIAL_POWER;
	}

	public GMan(GridLocation location, GridDirectionInfo direction) {
		super();
		this.location = location;
		this.direction = direction;
		// set with initial power.
		this.power = GManConstants.INITIAL_POWER;
	}

	public GMan(GridLocation location, GridDirectionInfo direction, int power) {
		super();
		this.location = location;
		this.direction = direction;
		this.power = power;
	}

	public GridLocation getLocation() {
		return location;
	}

	public void setLocation(GridLocation location) {
		this.location = location;
	}

	public GridDirectionInfo getDirection() {
		return direction;
	}

	public void setDirection(GridDirectionInfo direction) {
		this.direction = direction;
	}

	public int getPower() {
		return this.power;
	}

	public void setPowerToTurn(int powerToTurn) {
		this.power = powerToTurn;
	}

	/**
	 * Will calculate the power required to move the location.
	 * 
	 * @param targetLocation -targetLocation.
	 * @return power needed to move.
	 */
	public int calculatePowerToMove(GridLocation targetLocation) {
		int noOfMoves = this.location.getDistance(targetLocation);
		int noOfTurns = this.direction.calcTurns(location.calcDistanceX(targetLocation),
				this.location.calcDistanceY(targetLocation));
		return (noOfMoves * GManConstants.POWER_TO_MOVE) + (noOfTurns * GManConstants.POWER_TO_TURN);

	}

	/**
	 * Move to location.
	 * 
	 * @param targetLocation - targetLocation.
	 * @throws Exception - incase of any issue.
	 */
	public void moveToLocation(GridLocation targetLocation) throws Exception {
		int powerNeeded = calculatePowerToMove(targetLocation);
		// verify that user can move to the target location with power having.
		if (powerNeeded <= this.power) {
			this.power -= powerNeeded;
			setLocation(targetLocation);
			// Will be enhanced later to set the direction.
		} else {
			throw new Exception(MessageFormat.format(GManConstants.LOW_POWER_MSG, powerNeeded, this.power));
		}

	}

}
