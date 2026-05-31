class Solution {
    public void rotate(int[] arr, int k) {
        int size = arr.length;
        k = k % size;
        reverseArray(arr,0,size - k-1);
        reverseArray(arr,size-k,size-1);
        reverseArray(arr,0,size-1);
    }

    private void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}