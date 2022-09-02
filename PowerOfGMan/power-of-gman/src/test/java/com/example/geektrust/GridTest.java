package com.example.geektrust;

import java.io.File;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.geektrust.File.GManFileProcessor;
import com.example.geektrust.gman.GManConstants;
import com.example.geektrust.gman.GridLocation;

class GridTest {
	@Test
	public void testDestinationInvalidX1() {
		Exception exception = Assertions.assertThrows(Exception.class, () -> {	GridLocation a = new GridLocation(8,2);});
		Assertions.assertEquals(GManConstants.X_LOCATION_IS_OUT_OF_GRID, exception.getMessage())	;

	}
	
	@Test
	public void testDestinationInvalidX2() {
		Exception exception = Assertions.assertThrows(Exception.class, () -> {	GridLocation a = new GridLocation(-1,2);});
		Assertions.assertEquals(GManConstants.X_LOCATION_IS_OUT_OF_GRID, exception.getMessage())	;

	}


	@Test
	public void testDestinationInvalidY1() {
		Exception exception = Assertions.assertThrows(Exception.class, () -> {	GridLocation a = new GridLocation(1,8);});
		Assertions.assertEquals(GManConstants.Y_LOCATION_IS_OUT_OF_GRID, exception.getMessage())	;

	}
	@Test
	public void testDestinationInvalidY2() {
		Exception exception = Assertions.assertThrows(Exception.class, () -> {	GridLocation a = new GridLocation(1,-1);});
		Assertions.assertEquals(GManConstants.Y_LOCATION_IS_OUT_OF_GRID, exception.getMessage())	;

	}

	
	@Test
	public void testDestancePostiveXPositiveY() throws Exception
	{
		GridLocation a = new GridLocation(2,2);
		GridLocation b = new GridLocation(4,6);
		int distance = a.getDistance(b);
		Assertions.assertEquals(6, distance);		
		
	}
	@Test
	public void testDestancePostiveXNegativeY() throws Exception
	{
		GridLocation a = new GridLocation(2,6);
		GridLocation b = new GridLocation(4,2);
		int distance = a.getDistance(b);
		Assertions.assertEquals(6, distance);		
		
	}
	@Test
	public void testDistanceNegativeXPositiveY() throws Exception
	{
		GridLocation a = new GridLocation(4,2);
		GridLocation b = new GridLocation(2,6);
		int distance = a.getDistance(b);
		Assertions.assertEquals(6, distance);		
		
	}
	@Test
	public void testDistanceNegativeXNegativeY() throws Exception
	{
		GridLocation a = new GridLocation(4,6);
		GridLocation b = new GridLocation(2,2);
		int distance = a.getDistance(b);
		Assertions.assertEquals(6, distance);		
		
	}
	@Test
	public void testDestanceSameGrid() throws Exception
	{
		GridLocation a = new GridLocation(4,6);
		GridLocation b = new GridLocation(4,6);
		int distance = a.getDistance(b);
		Assertions.assertEquals(0, distance);		
		
	}
}
