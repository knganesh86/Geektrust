package com.example.geektrust;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.geektrust.gman.Direction;
import com.example.geektrust.gman.GridDirectionInfo;
import com.example.geektrust.gman.GMan;
import com.example.geektrust.gman.GridLocation;

public class GManTest {
	@Test
	public void GManTest1() throws Exception {
		GridLocation current = new GridLocation(2,1);
		GridDirectionInfo direction = new GridDirectionInfo(Direction.EAST);
		GMan gman = new GMan(current, direction);
		int power = gman.calculatePowerToMove(new GridLocation(4, 1));
		Assertions.assertEquals(20, power);
	}
	
	@Test
	public void GManTest2() throws Exception {
		GridLocation current = new GridLocation(2,1);
		GridDirectionInfo direction = new GridDirectionInfo(Direction.SOUTH);
		GMan gman = new GMan(current, direction);
		int power = gman.calculatePowerToMove(new GridLocation(4, 5));
		Assertions.assertEquals(70, power);
	}
	@Test
	public void GManTest3() throws Exception {
		GridLocation current = new GridLocation(4,5);
		GridDirectionInfo direction = new GridDirectionInfo(Direction.NORTH);
		GMan gman = new GMan(current, direction);
		int power = gman.calculatePowerToMove(new GridLocation(2,1));
		Assertions.assertEquals(70, power);
	}
	
	@Test
	public void GManTest4() throws Exception {
		GridLocation current = new GridLocation(1,4);
		GridDirectionInfo direction = new GridDirectionInfo(Direction.NORTH);
		GMan gman = new GMan(current, direction);
		int power = gman.calculatePowerToMove(new GridLocation(4,6));
		Assertions.assertEquals(55, power);
	}
	@Test
	public void GManTestException() throws Exception {
		GridLocation current = new GridLocation(0,0);
		GridDirectionInfo direction = new GridDirectionInfo(Direction.NORTH);
		GMan gman = new GMan(current, direction);
		Assertions.assertDoesNotThrow( () -> {gman.moveToLocation(new GridLocation(6,6));});
		Exception exception = Assertions.assertThrows(Exception.class, () -> {
		gman.moveToLocation(new GridLocation(0,0));});
		Assertions.assertTrue(exception.getMessage().startsWith("Power required"));
		
		
		//Assertions.assertEquals(55, power);
	}



}
