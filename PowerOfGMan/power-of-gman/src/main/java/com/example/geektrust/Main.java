package com.example.geektrust;

import java.io.File;

import com.example.geektrust.File.GManFileProcessor;
import com.example.geektrust.gman.GManConstants;
/**
 * Main class for the Power of GMan problem.
 * @author Ganesh.
 *
 */
public class Main {

	public static void main(String[] args) {
		File file = new File(args[0]);
		if (file.exists()) {
			GManFileProcessor gManFileProcessor = new GManFileProcessor(file);
			gManFileProcessor.processFile();
		} else {
			System.err.println(GManConstants.FILE_NOT_EXIST + args[0]);
		}
	}
}
