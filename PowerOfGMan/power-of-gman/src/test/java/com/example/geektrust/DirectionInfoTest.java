package com.example.geektrust;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.geektrust.gman.Direction;
import com.example.geektrust.gman.GridDirectionInfo;

public class DirectionInfoTest {
	@Test
	public void test_South_ForwardX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(4, 4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_North_ForwardX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(4, 4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_West_ForwardX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(4, 4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_East_ForwardX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(4, 4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_South_BackwardX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(-4, 4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_North_BackwardX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(-4, 4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_West_BackwardX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(-4, 4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_East_BackwardX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(-4, 4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_South_ForwardX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(4, -4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_North_ForwardX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(4, -4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_West_ForwardX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(4, -4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_East_ForwardX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(4, -4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_South_BackwardX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(-4, -4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_North_BackwardX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(-4, -4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_West_BackwardX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(-4, -4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_East_BackwardX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(-4, -4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_South_ZeroX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(4, 4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_North_ZeroX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(0, 4);
		Assertions.assertEquals(0, turn);
	}
	@Test
	public void test_West_ZeroX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(0, 4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_East_ZeroX_ForwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(0, 4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_South_ZeroX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(0, -4);
		Assertions.assertEquals(0, turn);
	}
	@Test
	public void test_North_ZeroX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(0, -4);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_West_ZeroX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(0, -4);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_East_ZeroX_BackwardY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(0, -4);
		Assertions.assertEquals(1, turn);
	}
	
	@Test
	public void test_South_ForwardX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(2, 0);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_North_ForwardX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(2, 0);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_West_ForwardX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(2, 0);
		Assertions.assertEquals(2, turn);
	}
	@Test
	public void test_East_ForwardX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(2,0);
		Assertions.assertEquals(0, turn);
	}
	@Test
	public void test_South_BackwardX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(-4,0);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_North_BackwardX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(-4,0);
		Assertions.assertEquals(1, turn);
	}
	@Test
	public void test_West_BackwardX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(-4,0);
		Assertions.assertEquals(0, turn);
	}
	@Test
	public void test_East_BackwardX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(-4,0);
		Assertions.assertEquals(2, turn);
	}

	@Test
	public void test_South_ZeroX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.SOUTH);
		int turn = d.calcTurns(0,0);
		Assertions.assertEquals(0, turn);
	}
	@Test
	public void test_North_ZeroX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.NORTH);
		int turn = d.calcTurns(0,0);
		Assertions.assertEquals(0, turn);
	}
	@Test
	public void test_West_ZeroX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.WEST);
		int turn = d.calcTurns(0,0);
		Assertions.assertEquals(0, turn);
	}
	@Test
	public void test_East_ZeroX_ZeroY() throws Exception {
		GridDirectionInfo d = new GridDirectionInfo(Direction.EAST);
		int turn = d.calcTurns(0,0);
		Assertions.assertEquals(0, turn);
	}
}
