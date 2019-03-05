package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] LatinSquare;

	public LatinSquare() {
		super();
	}

	public LatinSquare(int[][] puzzle) {
		super();
		this.LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	} 
	
	public static boolean doesElementExist(int[] arr, int ivalue) {
		
		for(int i: arr)
		{
			if (i == ivalue)
			{
				return true;
			}
		}
		return false;
	}
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		
		boolean hasAllValues = true;
		for (int j = 0;j< arr2.length; j++) {
			
			boolean bFound = false;
			
			for (int i = 0; i <arr1.length;i++) {
				if (arr1[i] == arr2[j]) {
					bFound = true;
					break;
				}
			}
		
			if (bFound == false) {
				hasAllValues = false;
				break;
			}
		}
		return hasAllValues;
	}
	
	public boolean ContainsZero()
	{
		for(int iRow = 0; iRow < this.LatinSquare.length; iRow++) {
			for (int iCol = 0; iCol < this.LatinSquare.length; iCol++) {
				if(this.LatinSquare[iRow][iCol] == 0) {
					
					return true;
				}
			}
		}
		return false;
	}
	public static boolean hasDuplicates(int[] arr) {
		
		int[] newArray = Arrays.copyOf(arr,arr.length);
		
		Arrays.sort(newArray);
		
		for(int i = 0; i < arr.length-1; i++) {
			if(newArray[i] == newArray[i+1]) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public int[] getColumn (int iCol) {
		
		int [] arr = new int [this.LatinSquare.length];
		
		for(int n = 0; n < this.LatinSquare.length; n++) {
			arr[n] = this.LatinSquare[n][iCol];
		}
		
		return arr;
	}
	
	  public boolean isLatinSquare() {
		  
		  int [] row = getRow(0);
		  int [] column = getColumn(0);
		  
		  for (int i=0; i<this.LatinSquare.length; i++) {
			  int [] iColumn = getColumn(i);
			  int [] iRow = getRow(i);
			  if (hasDuplicates(iColumn)==true) {
				  return false;
			  }
			  if (hasDuplicates(iRow)==true) {
				  return false;
			  }
			  else {
				  for (int k = 0; k<this.LatinSquare.length; k++) {
					  if (hasAllValues(getRow(k), row)==false) {
					  return false;
					  }
					  if (hasAllValues(getColumn(k), column)==false) { 
						  return false;
					  }
				  }
			  }
		  }
		  return true;
	  }
	
	public int[] getRow (int iRow){
		return this.LatinSquare[iRow];

	}
		
		
	}
	
