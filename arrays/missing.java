package arrays;

public class missing {
    public static int findMissingNumberInArray(int[] array) {
          int n = array.length + 1;
          int expectedSum = (n * (n + 1)) / 2;
          int actualSum = 0;
   
          for (int number : array) {
              actualSum += number;
          }
   
          return expectedSum - actualSum;
      }
  
    public static void main(String[] args) {
        int[] myArray={1,2,3,4,6};
        int missingNumber=findMissingNumberInArray(myArray);
        System.out.println(missingNumber); 
    }
}
