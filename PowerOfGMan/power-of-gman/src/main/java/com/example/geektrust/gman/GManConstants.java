package com.example.geektrust.gman;

/**
 * This Class it to maintain the constants.
 * 
 * @author Ganesh.
 *
 */
public class GManConstants {
	/**
	 * DEFAULT VALUES.
	 */
	public static final int POWER_TO_MOVE = 10;
	public static final int POWER_TO_TURN = 5;
	public static final int INITIAL_POWER = 200;
	public static final int GRID_SIZE_X = 6;
	public static final int GRID_SIZE_Y = 6;
	public static final int ZERO = 0;
	public static final int TURN_2_180_DEGREE = 2;
	public static final int TURN_1_90_DEGREE = 1;
	public static final int NO_TURN = ZERO;


	/**
	 * ERROR MESSAGES
	 */
	public static final String INVALID_COMMAND_PRINT = "Invalid Command, Source and Destination is not available to process.";
	public static final String INVALID_DESTINATION_INPUT = "Invalid Distination Input";
	public static final String INVALID_SOURCE_INPUT = "Invalid Source Input";
	public static final String FILE_NOT_EXIST = "File not exist: ";
	public static final String INVALID_INPUT = "Invalid Input.";
	public static final String INVALID_DIRECTION_CODE = "Invalid Direction Code";
	public static final String LOW_POWER_MSG = "Power required to move {0} is more than power have {1}";
	public static final String Y_LOCATION_IS_OUT_OF_GRID = "Y location is out of grid";
	public static final String X_LOCATION_IS_OUT_OF_GRID = "X location is out of grid";

	/**
	 * STRING COMMANDS
	 */
	public static final String PRINT_POWER = "PRINT_POWER";
	public static final String DESTINATION = "DESTINATION";
	public static final String SOURCE = "SOURCE";
	public static final String POWER = "POWER ";

}
