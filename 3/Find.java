class Find{
	public static void main(String[] args) {
		 System.out.print(2+" ");
         boolean bool;
		 int sum=1;
         for (int i = 3; i < 20000; i+=2) {
             bool = true;
             for (int j = 3; j <= Math.sqrt(i); j++) {
                 if (i % j == 0) {
                     bool = false;
					 break;
                 }
             }
             if (bool){
				sum++;
				System.out.print(i + " ");
				if(sum%5==0)
				System.out.print("\n");
			 }
         }
     }
}