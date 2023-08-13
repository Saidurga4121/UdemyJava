package CodeWars;

public class WordScores {

	public static void main(String[] args) {
		String s="what time are we climbing up to the volcano";
		// char[] arr=s.toCharArray();
		//
		int sum=0;
		int largest=0;
		int index=0;
		String[] arr=s.split(" ");
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    //
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length();j++)
			{
				for (char ch : alphabet) 
				{
					 int position= ch - 'a' + 1; 
					 if(ch==arr[i].charAt(j))
					 {
					    	 sum=sum+position;
					    	 break;
					 }
				 }
			}
			// System.out.println(sum + " - "+ arr[i]);
			if(largest<sum)
			{
				largest=sum;
				index=i;
			}	
			sum=0;
		}
		System.out.println(arr[index]);
		// System.out.println(largest);


		
		
//		String s="what time are we climbing up to the volcano";
//		String winner="";
//		int highestScore=0;
//		//
//		for(String word:s.split(" "))
//		{
//			int score=0;
//			for(char ch:word.toCharArray())
//			{
//				score=score+(ch-'a'+1);
//			}
//			if(highestScore<score)
//			{
//				highestScore=score;
//				winner=word;
//			}	
//		}
//		System.out.println(winner);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
