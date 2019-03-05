package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	@Test
	public void DoesElementExist_Test1() {

		int[] array1 = { 1, 2, 3, 5 };
		int iValue = 2;
		boolean bExpectedCondition = true;
		boolean bActualCondition;

		bActualCondition = LatinSquare.doesElementExist(array1, iValue);

		assertEquals(bExpectedCondition, bActualCondition);

	}

	@Test
	public void DoesElementExist_Test2() {

		int[] array1 = { 1, 2, 3, 5 };
		int iValue = 7;
		boolean bExpectedCondition = false;
		boolean bActualCondition;

		bActualCondition = LatinSquare.doesElementExist(array1, iValue);

		assertEquals(bExpectedCondition, bActualCondition);

	}

	@Test
	public void hasAllValues_Test1() {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2 };
		boolean bExpectedCondition = true;

		boolean bActualValue = LatinSquare.hasAllValues(arr1, arr2);

		assertEquals(bExpectedCondition, bActualValue);

	}

	@Test
	public void hasAllValues_Test2() {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 7, 6, 5 };
		boolean bExpectedValue = false;

		boolean bActualValue = LatinSquare.hasAllValues(arr1, arr2);

		assertEquals(bExpectedValue, bActualValue);
	}

	@Test
	public void ContainsZer0_Test1() {

		int[][] puzzle = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = false;
		boolean bActual = ls.ContainsZero();

		assertEquals(bExpected, bActual);

	}

	@Test
	public void ContainsZer0_Test2() {

		int[][] puzzle = { { 1, 2, 3 }, { 2, 0, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = true;
		boolean bActual = ls.ContainsZero();

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_Test1() {
		int[] arr = { 1, 2, 3, 4 };
		boolean bExpected = false;
		assertEquals(bExpected, LatinSquare.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicated_Test2() {
		int[] arr = { 1, 1, 2, 3 };
		boolean bExpected = true;
		assertEquals(bExpected, LatinSquare.hasDuplicates(arr));
	}
	
	@Test
	public void getRow_Test1() {
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare ls = new LatinSquare(puzzle);
		
		int[] bExpected = {1,2,3};
		assertTrue(Arrays.equals(bExpected, ls.getRow(0)));
		
	}
	
	@Test
	public void getRow_Test2(){
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare ls = new LatinSquare(puzzle);
		
		int[] bExpected = {4,5,6};
		assertTrue(Arrays.equals(bExpected, ls.getRow(1)));
		
	}
	
	@Test
	public void getRow_Test3() {
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare ls = new LatinSquare(puzzle);
		
		int[] bExpected = {7,8,9};
		assertTrue(Arrays.equals(bExpected, ls.getRow(2)));
		
	}
	
	@Test
	public void isLatinSquare_Test1() {
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare ls = new LatinSquare(puzzle);
		assertFalse(ls.isLatinSquare());
	} 
	@Test
	public void getColumn_Test1() {
	
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare ls = new LatinSquare(puzzle);
		
		int[] bExpected = {1,4,7};
		assertTrue(Arrays.equals(bExpected, ls.getColumn(0)));
	}
	
	@Test
	public void getColumn_Test2() {
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare ls = new LatinSquare(puzzle);
		
		int[] bExpected = {2,5,8};
		assertTrue(Arrays.equals(bExpected, ls.getColumn(1)));
		
	}
	
	@Test
	public void getColumn_Test3() {
	int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
	LatinSquare ls = new LatinSquare(puzzle);
	
	int[] bExpected = {3,6,9};
	assertTrue(Arrays.equals(bExpected, ls.getColumn(2)));
	}
	
	@Test
	public void getColumn_Test4() {
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare ls = new LatinSquare(puzzle);
		
		int[] bExpected = {1,2,6};
		assertTrue(!Arrays.equals(bExpected, ls.getRow(2)));
		}
	
}