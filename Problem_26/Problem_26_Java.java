package Problem_26;

public class Problem_26_Java {
    private static final int LIMIT = 1000;  
      public static void main(String[] args) {  
           int result = 0;  
           int longest = 0;  
           for (int i=2; i<LIMIT; i++){  
                int recurringNum = recurringNum(i);   
                if (recurringNum > longest){  
                     longest = recurringNum;  
                     result = i;  
                }  
           }  
           System.out.println(result);  
      }  
      public static int recurringNum(int num) {  
           int[] arr = new int[num+1];  
           int index = 1;  
           int mod = 1;  
           while(mod != 0 && arr[mod] == 0){  
                arr[mod]=index++;  
                mod = mod * 10 % num;  
           }  
           if (mod == 0){  
                return 0;  
           }  
           return index-arr[mod];  
   }  	

}