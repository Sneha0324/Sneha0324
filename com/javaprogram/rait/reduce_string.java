package com.javaprogram.rait;

public class reduce_string {

	public static void main(String[] args) {
		String ch = "aabbbbeeeeffggg";
		int[] count = new int[ch.length()];
		int i,j;
		
		char string[] = ch.toCharArray();
		
		for(i=0; i<ch.length(); i++) {
			
			count[i]=1;
			
			for(j=i+1; j<ch.length(); j++)
			if(string[i]==string[j]) {
				count[i] ++;
				
				string[j]='0';
			}
		}
		
		for(i=0; i<count.length; i++) {
			if(string[i]!=' ' && string[i]!='0') {
				System.out.println(string[i]+" "+count[i]);
			}
		}
		
	}
}
