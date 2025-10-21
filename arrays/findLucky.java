package arrays;
//find the lucky integer
class findLucky {
    public int Lucky(int[] arr){
        int[] numbers=new int[501];

        for(int j:arr){
            numbers[j]++;
        }
        for(int i=500; i>0; i--){
            if(i==numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        findLucky obj =new findLucky();
        int[] arr={2,2,2,3};
        obj.Lucky(arr);
        System.out.println(obj.Lucky(arr));
    }
}
