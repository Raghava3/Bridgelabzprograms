package com.Bridgelabz;
import java.util.Scanner;

public class BalancedParanthesis {
	

		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in); 
			System.out.println("enter the paranthesis");
			String s=scn.nextLine();
			scn.close();
			s=s.replace(" ", "");
			char[] cArr=s.toCharArray();
			System.out.println(check(cArr));
			
			}
		// this is gautham logic . my logic is not working properley
		static boolean check(char[] cArr){
			MyStack st=new MyStack(cArr.length);
			for(int i=0;i<cArr.length;i++){
				switch(cArr[i]){
					case '[':
					case '{':
					case '(':
						st.push(cArr[i]);
						break;
					case '}':
					case ']':
					case ')':
						//System.out.println(st.isEmpty());
						if(!st.isEmpty())
						{
							char c=st.pop();
							if(c=='('&&cArr[i]==')'||c=='{'&&cArr[i]=='}'||c=='['&&cArr[i]==']')
							{
								
							}
							else
								return false;
						}
						else
							return false;
						break;
					}	
				}
				return true;
			}
			
		}
	
	
	
	
	


