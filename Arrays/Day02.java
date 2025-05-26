// DAY -2 Move All Zeroes to End in an Array 
class Solution {
    void pushZerosToEnd(int[] arr) {
        int i=0;
        int j=i;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        j++;
        }
    }
}
