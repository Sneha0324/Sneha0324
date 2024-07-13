package com.javaprogram.rait;

public class primeno {
	public static void main(String[] args) {
		int from=1, till=50;
		
		while(from<till) {
			boolean flag=false;
			
			for(int i=2; i<=from/2; ++i) {
				
				if(from%i == 0) {
					flag=true;
					break;
				}
			}
			
			if(!flag && from!=0 && from!=1) {
				System.out.print(from + " ");
			}
			++from;
		}
	}
}
