package concaveGameBoardTest;

import java.util.Scanner;

import boardCreate.ConcaveGameBoard;
import boardCreate.ConcaveGamePlay;
import boardCreate.GameMessage;

public class ConcaveGameBoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameMessage.gameStart();
		
		ConcaveGameBoard gameBoard = new ConcaveGameBoard();
		
		ConcaveGamePlay play = new ConcaveGamePlay();
		
		String player1 = "";
		String player2 = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("선공 ○(흑돌)인 사람의 이름을 입력해주세요");
		System.out.print("○(흑돌) : ");
		player1 = scan.nextLine();
		
		System.out.println("후공 ●(백돌)인 사람의 이름을 입력해주세요");
		System.out.print("●(백돌) : ");
		player2 = scan.nextLine();
		
		System.out.println("———————————————————————————————");
		System.out.println("|선공 ○(흑돌) : " + player1 + "||후공 ●(백돌) : " +  player2 + "|");
		System.out.println("———————————————————————————————");
		System.out.println("\t게임을 시작합니다!");
		play.playConcaveGame(player1,player2);
	}

}
