public class arrayornot{
    public static void main(String[] args){
        int[] arr={1,4,34,56,7};
        int searchElement=56;
        int resultIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchElement){
                resultIndex=i;
                break;
            }
        }
        System.out.println(resultIndex);
    }
}