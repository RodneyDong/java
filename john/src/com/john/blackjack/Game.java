package com.john.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	public static Scanner input = new Scanner(System.in);
	private List<Player> playerList = new ArrayList<>();
	private Dealer dealer = new Dealer();

	public static String ask(String question) {
		System.out.print(question);
		String answer = input.nextLine();
		return answer;
	}

	public Game() {
		dealer.shuffle();
		addPlayers();
	}

	private void addPlayers() {
		String answer = "y";
		do {
			String name = ask("Enter player name: ");
			Player player = new Player(name);
			playerList.add(player);
			answer = ask("More player? (y/n) ");
		} while (answer.equals("y"));
	}


	public static void main(String[] args) {
		Game game = new Game();
		game.play();
	}

	private void play() {
	}

}
