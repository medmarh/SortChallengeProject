package App;

import codeChallenge.SortChallenge;
import codeChallenge.SortChallengeImpl;


public class Application {

	public static void main(String[] args) {
		SortChallenge sort = new SortChallengeImpl();
		int[] list1 = {0,0,2,0,5,9,3,55,2,12,0,11,1,2,5,6};
		
		System.out.println("******************* simpleSort *****************");
		System.out.println("****************************** simpleSort: ascending sorting *****************");
		int[] sortedList1 = sort.simpleSort(list1, true);
		for (int i = 0 ; i<sortedList1.length ; i++)
		{
			System.out.print(sortedList1[i] + "   ");
		}
		System.out.println(" ");
		System.out.println("****************************** simpleSort: descending sorting *****************");
		int[] sortedList2 = sort.simpleSort(list1, false);
		for (int i = 0 ; i<sortedList2.length ; i++)
		{
			System.out.print(sortedList2[i] + "   ");
		}
		
		System.out.println(" ");
		
		System.out.println("************ printSortedFrequency *****************");
		int[] list2 = {1,2,5,3,0,0,0,2,5,11,12,55,66,32,12,1};
		sort.printSortedFrequency(list2);
		
		System.out.println("************************** numberOfUniqueValues ***************");
		int[] list3 = {1,1,22,2,0,0,0,5,0,3,22,55,1,2,5,7,8,9,6,3};
		System.out.println(sort.numberOfUniqueValues(list3));
		
	}

}
