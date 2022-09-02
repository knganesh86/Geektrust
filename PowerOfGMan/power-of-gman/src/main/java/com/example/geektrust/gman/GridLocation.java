package com.example.geektrust.gman;

/**
 * GridLocation is the class which holds the location of grid.
 * 
 * @author Ganesh
 *
 */
public class GridLocation {
	private int x;
	private int y;

	public GridLocation(int x, int y) throws Exception {
		setX(x);
		setY(y);
	}

	public GridLocation() throws Exception {
		this(0, 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) throws Exception {
		// checks the location before set.
		if (x < GManConstants.ZERO || x > GManConstants.GRID_SIZE_X) {
			throw new Exception(GManConstants.X_LOCATION_IS_OUT_OF_GRID);
		}
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws Exception {
		// checks the location before set.
		if (y < GManConstants.ZERO || y > GManConstants.GRID_SIZE_Y) {
			throw new Exception(GManConstants.Y_LOCATION_IS_OUT_OF_GRID);
		}
		this.y = y;
	}


	/**
	 * Calculate X axis distance.
	 * @param anotherGrid - GridLocation object.
	 * @return distance.
	 */
	public int calcDistanceX(GridLocation anotherGrid) {
		return anotherGrid.getX() - this.getX();
	}

	/**
	 * Calculate Y axis distance.
	 * @param anotherGrid - GridLocation object.
	 * @return distance.
	 */
	public int calcDistanceY(GridLocation anotherGrid) {
		return anotherGrid.getY() - this.getY();
	}

	/**
	 * get Distance between given location and this object. It is nothing but no of
	 * moves.
	 * 
	 * @param anotherGrid - GridLocation object.
	 * @return no of moves.
	 */
	public int getDistance(GridLocation anotherGrid) {
		int distanceX = calcDistanceX(anotherGrid);
		int distanceY = calcDistanceY(anotherGrid);
		return Math.abs(distanceX) + Math.abs(distanceY);
	}
}
