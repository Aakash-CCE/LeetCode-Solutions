class Solution {
    public int calPoints(String[] operations) {
        int arr[]=new int[operations.length];
        int n=0;
        for(String op:operations){
            if(op.equals("C")){
                n--;
            }
            else if(op.equals("D")){
                arr[n]=2*arr[n-1];
                n++;

            }
            else if(op.equals("+")){
                arr[n]=arr[n-1]+arr[n-2];
                n++;
            }
            else{
                arr[n]=Integer.parseInt(op);
                n++;
            }

        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

        }
        return sum;
    }
}