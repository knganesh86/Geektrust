/**
 * 
 */
package com.example.geektrust.gman;

/**
 * Direction enum to denote four directions.
 * 
 * @author Ganesh.
 *
 */
public enum Direction {
	NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");

	private final String shortCode;

	Direction(String code) {
		this.shortCode = code;
	}

	public String getDirectionCode() {
		return this.shortCode;
	}

	/**
	 * This method used to identify the Direction from shortCode.
	 * 
	 * @param shortCode - shortCode of Direction.
	 * @return Direction Enum.
	 * @throws Exception incase of invalid ShortCode.
	 */
	public static Direction fromShortCode(String shortCode) throws Exception {
		for (Direction aDir : Direction.values()) {
			if (aDir.getDirectionCode().equals(shortCode)) {
				return aDir;
			}
		}
		throw new Exception(GManConstants.INVALID_DIRECTION_CODE);
	}

}
