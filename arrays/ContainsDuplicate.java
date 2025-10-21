package arrays;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] intArray) {
        for(int i=0; i<intArray.length; i++){
            for(int j=i+1; j<intArray.length; j++){
                if(intArray[i]==intArray[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        ContainsDuplicate mn = new ContainsDuplicate();
        int[] intArray={1,2,3,1};
        boolean result=mn.containsDuplicate(intArray);
        System.out.println(result);
    }
}