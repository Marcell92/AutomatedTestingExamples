package Logic;

public class Runner {

	public static void main(String[] args) {

BlackJack blackjack = new BlackJack();

System.out.println(blackjack.play(10, 22));

System.out.println(blackjack.play(22, 9));

System.out.println(blackjack.play(22, 22));

System.out.println(blackjack.play(10, 7));

System.out.println(blackjack.play(1, 19));
	}

}
