package arrays;

public class FindingNumber{
    public static void main(String[] args){
        FindingNumber fn = new FindingNumber();
        int[] intArray={1,2,3,4,5,6};
        fn.linearSearch(intArray, 6);
    }

    //search method 
    public void linearSearch(int[] intArray, int value){
        for(int i=0; i<intArray.length; i++){
            if(intArray[i]==value){
                System.out.println("Value found at index of "+i);
                return;
            }
        }
                System.out.println(value+" is not found");
        
    }
}