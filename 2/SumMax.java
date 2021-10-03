class SumMax {
    public int maxSubArray(int[] nums) {
        int Max=nums[0];
        int pre=0;  
        int cur=0;   
        for(int num:nums){
            cur=num;
            if(pre>0){  
                cur+=pre;
            }
            if(cur>Max){
                Max=cur;
            }
            pre=cur;   
        }
        return Max;
    }
	public static void main(String[] args) {
		int[] arr={-20,68,-34,22,-34};
		SumMax sum = new SumMax();
		System.out.println(sum.maxSubArray(arr));
	}
}