package ThinkTest01;

public class ThinkTest016 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s = {'s','t','r','i','n','g'};
		Solution ss = new Solution();
		ss.reverseString(s);
	}


}	
class Solution{
    public void reverseString(char[] s){
	    int start = 0;
	    int end = s.length - 1;
	    while(start < end){
		    char temp = s[start];
		    s[start] = s[end];
		    s[end] = temp;
		    start++;
		    end--;
	    }
	    
	    for(int i =0;i<s.length;i++){
	    	System.out.print(s[i]);
	    }
    }
}