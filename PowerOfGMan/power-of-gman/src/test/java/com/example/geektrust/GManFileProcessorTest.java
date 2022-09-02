package com.example.geektrust;

import java.io.File;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.geektrust.File.GManFileProcessor;
import com.example.geektrust.gman.GManConstants;

public class GManFileProcessorTest {

	@Test
	public void testSourcePostive() {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		Assertions.assertDoesNotThrow( () -> {gp.processCommand("SOURCE 4 1 N");});
		}
	@Test
	public void testSourceNegativeMissingArg() {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		Exception exception = Assertions.assertThrows(Exception.class, () -> {gp.processCommand("SOURCE 4 1");});
		Assertions.assertEquals(GManConstants.INVALID_SOURCE_INPUT, exception.getMessage())	;
	}
	@Test
	public void testSourceNegativeAddingMoreArg() {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		Exception exception = Assertions.assertThrows(Exception.class, () -> {gp.processCommand("SOURCE 4 1 N E");});
		Assertions.assertEquals(GManConstants.INVALID_SOURCE_INPUT, exception.getMessage())	;

	}
	@Test
	public void testDestinationPostive() {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		Assertions.assertDoesNotThrow( () -> {gp.processCommand("DESTINATION 4 1");});
		}
	@Test
	public void testDestinationNegativeMissingArg() {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		Exception exception = Assertions.assertThrows(Exception.class, () -> {gp.processCommand("DESTINATION 4");});
		Assertions.assertEquals(GManConstants.INVALID_DESTINATION_INPUT, exception.getMessage())	;
	}
	@Test
	public void testDestinationNegativeAddingMoreArg() {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		Exception exception = Assertions.assertThrows(Exception.class, () -> {gp.processCommand("DESTINATION 4 1 N");});
		Assertions.assertEquals(GManConstants.INVALID_DESTINATION_INPUT, exception.getMessage())	;

	}
	@Test
	public void testPrintPositive() throws Exception {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		gp.processCommand("SOURCE 1 4 N");
		gp.processCommand("DESTINATION 4 6");

		Assertions.assertDoesNotThrow( () -> {gp.processCommand("PRINT_POWER");});
		}
	@Test
	public void testPrintNegativeMissingSource() throws Exception {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		gp.processCommand("DESTINATION 4 6");

		Exception exception = Assertions.assertThrows(Exception.class, () -> {gp.processCommand("PRINT_POWER");});
		Assertions.assertEquals(GManConstants.INVALID_COMMAND_PRINT, exception.getMessage())	;
	}
	@Test
	public void testPrintNegativeMissingDestination() throws Exception {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		gp.processCommand("SOURCE 1 4 N");
		Exception exception = Assertions.assertThrows(Exception.class, () -> {gp.processCommand("PRINT_POWER");});
		Assertions.assertEquals(GManConstants.INVALID_COMMAND_PRINT, exception.getMessage())	;

	}
	
	@Test
	public void testInvalidCommand() {
		GManFileProcessor gp = new GManFileProcessor(new File("sample_input/input1.txt"));
		Exception exception = Assertions.assertThrows(Exception.class, () -> {gp.processCommand("TEST");});
		Assertions.assertEquals(GManConstants.INVALID_INPUT+"TEST", exception.getMessage())	;
	}
	
	
}
