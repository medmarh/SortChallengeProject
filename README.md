# NEEDED TOOLS
  - JDK
  - IDE like Eclipse, NetBeans ...

# Class to run 
 - App.Application.java : run this as java application.
 
 # Key information
  - Change arrays data as you want by going to class App.Application.java.<br/>
  LINES :<br/>
    11, 31 or 35<br/>
    
  - I used three different lists. One list for each method.<br/>
   * ascending and descending sorting :<br/>
     {0,0,2,0,5,9,3,55,2,12,0,11,1,2,5,6}<br/>
   * printSortedFrequency <br/>
     {1,2,5,3,0,0,0,2,5,11,12,55,66,32,12,1}<br/>
   * numberOfUniqueValues<br/>
     {1,1,22,2,0,0,0,5,0,3,22,55,1,2,5,7,8,9,6,3}<br/>    
  
# Result of running the app :
  ******************* simpleSort ***************** <br/>
****************************** simpleSort: ascending sorting *****************<br/>
0   0   0   0   1   2   2   2   3   5   5   6   9   11   12   55    <br/>
****************************** simpleSort: descending sorting *****************<br/>
55   12   11   9   6   5   5   3   2   2   2   1   0   0   0   0    <br/>
************ printSortedFrequency *****************<br/>
0 appears 3times<br/>
1 appears 2times<br/>
2 appears 2times<br/>
3 appears 1time<br/>
5 appears 2times<br/>
11 appears 1time<br/>
12 appears 2times<br/>
32 appears 1time<br/>
55 appears 1time<br/>
66 appears 1time<br/>
************************** numberOfUniqueValues ***************<br/>
11<br/>


# Quiz

Application specifications
Create an application that uses a class that implements the provided interface. There are three
functions that need to be implemented in the interface. The purpose of this interface is to supply
different list sorting functionality. You may not import java.util.Arrays in your submission. All
logic must be written by you using basic data types and structures only.
❏ You must receive the list you are operating on from the user in some way.
❏ simpleSort takes a list of numbers and sorts them into ascending order. If specified, the
list can also be sorted descending.
- For example, if the list [ 24, 12, 8, 12, 19 ] is supplied, when sorting ascending, [
8, 12, 12, 19, 24 ] will be returned. [24, 19, 12, 12, 8 ] would be produced when
sorting descending.

❏ printSortedFrequency takes a list of numbers and prints them in ascending order to
standard out along with the number of times that integer appears in the list.
- For example, if the list [ 24, 12, 8, 12, 19 ] is supplied, the following will be printed
to the terminal:
- 8 appears 1 time
- 12 appears 2 times
- 19 appears 1 time
- 24 appears 1 time

❏ numberOfUniqueValues takes a list of numbers and returns the number of times a
unique value appears.
- For example, if the list [ 24, 12, 8, 12, 19 ] is supplied, the number 4 is returned.
- For example, if the list [ 24, 12, 8, 12, 19, 24 ] is supplied, the number 4 is
returned.

public interface SortChallenge {<br/>
    public int[] simpleSort(int[] list, boolean ascending);<br/>
    public void printSortedFrequency(int[] list);<br/>
    public int numberOfUniqueValues(int[] list);<br/>
}<br/>
