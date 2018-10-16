package com.qa.BlackjackExample;

public class Blackjack {
	public static void main(String[] args) {
		
	}

	public int play(int player, int dealer) {
		// Create functional code
		if (player < 1 || player > 31) {
			return 0;
		} else if (dealer < 1 || dealer > 31) {
			return 0;
		} else if (player <= 21 && dealer > 21) {
			return player;
		} else if (player > 21 && dealer <= 21) {
			return dealer;
		} else if (player <= 21 && dealer <= 21 && player <= dealer) {
			return dealer;
		} else if (player <= 21 && dealer <= 21 && player >= dealer) {
			return player;
		} else {
			return 0;
		}
	}

	public int play2(int player, int dealer) {
		if ((player <= 31 && player >= 1) && (dealer <= 31 && dealer >= 1)) {
			return Math.max(dealer > 21 ? 0 : dealer, player > 21 ? 0 : player);// if dealer is greater than 21 return 0
																				// else return dealer
		}
		return 0;
	}
}
