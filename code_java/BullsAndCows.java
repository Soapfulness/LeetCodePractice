package com.hss.leetcode.main;

public class BullsAndCows {

	public static void main(String[] args) {
		BullsAndCows bac = new BullsAndCows();
		String secret = "1011", guess = "1100";
		System.out.println(bac.getHint(secret, guess));
	}
	
    public String getHint(String secret, String guess) {
    	String hint = "";
    	int count = 0;
        for(int i = 0; i < secret.length(); i++) {
        	if(secret.charAt(i) == guess.charAt(i)) {
        		count++;
        		secret = secret.substring(0, i) + secret.substring(i + 1, secret.length());
        		guess = guess.substring(0, i) + guess.substring(i + 1, guess.length());
        		i--;
        	}
        }
        hint += count + "A";
        count = 0;
        for(int i = 0; i < secret.length(); i++) {
        	int temp = 0;
        	if((temp = secret.indexOf(guess.charAt(i))) != -1) {
        		count++;
        		secret = secret.substring(0, temp) + secret.substring(temp + 1, secret.length());
        		guess = guess.substring(0, i) + guess.substring(i + 1, guess.length());
        		i--;
        	}
        }
        hint += count + "B";
        return hint;
    }

}
