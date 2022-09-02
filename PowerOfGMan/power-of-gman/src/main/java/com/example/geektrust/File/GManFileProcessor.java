/**
 * 
 */
package com.example.geektrust.File;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import com.example.geektrust.gman.Direction;
import com.example.geektrust.gman.GridDirectionInfo;
import com.example.geektrust.gman.GMan;
import com.example.geektrust.gman.GManConstants;
import com.example.geektrust.gman.GridLocation;

/**
 * GManFileProcessor is used to process the given file. It reads the files and
 * perform the operation mentioned in the file.
 * 
 * @author Ganesh.
 *
 */
public class GManFileProcessor {

	private File file;
	private GMan gMan;
	private GridLocation targetLocation;

	public GManFileProcessor(File file) {
		this.file = file;
	}

	// process the File.
	public void processFile() {

		try {
			FileInputStream fis = new FileInputStream(this.file);
			Scanner sc = new Scanner(fis);
			while (sc.hasNextLine()) {
				String input = sc.nextLine();
				processCommand(input);
			}
			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Process the each command.
	 * 
	 * @param input - Full command String.
	 * @throws Exception incase of any issue.
	 */
	public void processCommand(String input) throws Exception {
		String[] cmd = input.split(" ");

		if (cmd[0].equals(GManConstants.SOURCE)) {
			processSource(cmd);
		} else if (cmd[0].equals(GManConstants.DESTINATION)) {
			processDestination(cmd);
		} else if (cmd[0].equals(GManConstants.PRINT_POWER)) {
			processPrintPower();
		} else {
			throw new Exception(GManConstants.INVALID_INPUT + cmd[0]);
		}
	}

	/**
	 * Process print command.
	 * 
	 * @throws Exception incase of any issue.
	 */
	private void processPrintPower() throws Exception {
		// Expected source and destination commands are processed earlier.
		if (gMan != null && targetLocation != null) {
			gMan.moveToLocation(targetLocation);
			System.out.println(GManConstants.POWER + gMan.getPower());
		} else {
			throw new Exception(GManConstants.INVALID_COMMAND_PRINT);
		}

	}

	/**
	 * process Destination command.
	 * 
	 * @param cmd -Destination Command.
	 * @throws Exception - incase of any issue.
	 */
	private void processDestination(String[] cmd) throws Exception {
		// Expected length is 3.
		if (cmd.length != 3) {
			throw new Exception(GManConstants.INVALID_DESTINATION_INPUT);
		}
		int dX = Integer.parseInt(cmd[1]);
		int dY = Integer.parseInt(cmd[2]);
		targetLocation = new GridLocation(dX, dY);

	}

	/**
	 * Process Source command.
	 * 
	 * @param cmd - source command
	 * @throws Exception - incase of any issue.
	 */
	private void processSource(String[] cmd) throws Exception {
		// Expected length is 4.
		if (cmd.length != 4) {
			throw new Exception(GManConstants.INVALID_SOURCE_INPUT);
		}
		int sX = Integer.parseInt(cmd[1]);
		int sY = Integer.parseInt(cmd[2]);
		String dir = cmd[3];
		GridLocation sourceLocation = new GridLocation(sX, sY);
		GridDirectionInfo directionInfo = new GridDirectionInfo(Direction.fromShortCode(dir));
		gMan = new GMan(sourceLocation, directionInfo);

	}
}
