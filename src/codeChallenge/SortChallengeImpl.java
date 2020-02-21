package codeChallenge;

public class SortChallengeImpl implements SortChallenge {

	public int[] simpleSort(int[] list, boolean ascending) {
		return ascending ? sortAscendingOrder(list) : sortDescendingOrder(list);
	}

	private int[] sortAscendingOrder(int[] list)
	{
		int count = 0;
		while(count <= list.length)
		{
		int val1 = list[0];
		int position = 0;
		  for (int j = 0; j<list.length-1; j++)
		{
			int val2 = list[j+1];
			if (val1 > val2)
			{
				list[position] = val2;
				list[j+1] = val1;
				position ++;
			} else if (val1 <= val2)
			{
				val1 = val2;
				position++;
			}
		}
		count ++;
		}
		return list;
	}

	private int[] sortDescendingOrder(int[] list)
	{
	int count = 0;
	while(count <= list.length)
	{
	int val1 = list[0];
	int position = 0;
	  for (int j = 0; j<list.length-1; j++)
	{
	int val2 = list[j+1];
	if (val1 < val2)
	{
	list[position] = val2;
	list[j+1] = val1;
	position ++;
	} else if (val1 >= val2)
	{
	val1 = val2;
	position++;
	}
	}
	count ++;
	}
	return list;
	}


	public void printSortedFrequency(int[] list) {
		int[][] repArray = getFinalArray(list);
		for(int i=0; i< repArray.length; i++)
		{
			String txt = "time";
			if(repArray[i][0] != 0 || repArray[i][1] != 0)
			{
				txt = repArray[i][1] != 1 ? "times" : "time";
				System.out.println(repArray[i][0] + " appears " + repArray[i][1] + txt);
					
			}
		}

	}
	
	private int[][] getFinalArray(int[] list)
	{
		list = sortAscendingOrder(list);
		int count = 0;
		int[][] array = new int[list.length][2];
		while(count < list.length)
		{
			int timesRepeated = 1;
			boolean counted = false;
			for(int j=count ; j>=0; j--)
			{
				if(list[count] == array[j][0] && array[j][1] != 0)
				{
					counted = true;
					break;
				}
			}
			
			if(!counted)
			{
				for (int i=count; i<list.length - 1 ; i++)
				{
					if(list[count] == list[i + 1 ]){
						timesRepeated ++;
						array[count][0] = list[count];
						array[count][1] = timesRepeated;
					}
				}
				
				if(timesRepeated == 1)
				{
					array[count][0] = list[count];
					array[count][1] = timesRepeated;
				}
			}
			
			count ++;
		}
		
		return array;
		
	}

	public int numberOfUniqueValues(int[] list) {
		int[][] array = getFinalArray(list);
		int numberOfUniqueValues = 0;
		
		for(int i=0; i<array.length; i++)
		{
			if (array[i][0] != 0 || array[i][1] != 0)
			{
				numberOfUniqueValues ++;
			}
		}
		return numberOfUniqueValues;
	}

}
