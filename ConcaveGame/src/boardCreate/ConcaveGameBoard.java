package boardCreate;

public class ConcaveGameBoard {
	String concaveGameBoardCorner1 = "┌";
	String concaveGameBoardCorner2 = "┐";
	String concaveGameBoardCorner3 = "└";
	String concaveGameBoardCorner4 = "┘";
	String concaveGameBoardCenter = "┼";
	String concaveGameBoardJoint1 = "┬";
	String concaveGameBoardJoint2 = "├";
	String concaveGameBoardJoint3 = "┤";
	String concaveGameBoardJoint4 = "┴";
//	String ConcaveGameBoardJoint3 = "─";
			

	
	String[][] concaveGameBoardArr;

	public ConcaveGameBoard() {
		super();
		concaveGameBoardArr = new String[10][20];
		
		for (int i = 0; i < concaveGameBoardArr.length; i++) {
			for (int j = 0; j < concaveGameBoardArr[i].length; j++) {
				if (i == 0 && j == 0) {
					concaveGameBoardArr[i][j] = concaveGameBoardCorner1;
				} // 모서리 1 "┌"
				else if(i == 0 && j == concaveGameBoardArr[i].length - 1) {
					concaveGameBoardArr[i][j] = concaveGameBoardCorner2;
				}// 모서리 2 "┐"
				else if(i == concaveGameBoardArr.length - 1 && j == 0) {
					concaveGameBoardArr[i][j] = concaveGameBoardCorner3;
				}// 모서리 3 "└"
				else if (i == concaveGameBoardArr.length - 1 
						&& j == concaveGameBoardArr[i].length - 1) {
					concaveGameBoardArr[i][j] = concaveGameBoardCorner4;
				}// 모서리 4 "┘"
				else if(i == 0 
						&& 0 < j && j < concaveGameBoardArr[i].length) {
					concaveGameBoardArr[i][j] = concaveGameBoardJoint1;
				}// 사이드 1 "┬"
				else if(j == 0 
						&& 0 < i && i < concaveGameBoardArr.length) {
					concaveGameBoardArr[i][j] = concaveGameBoardJoint2;
				}// 사이드 2 "├"
				else if(j == concaveGameBoardArr[i].length - 1 
						&& 0 < i && i < concaveGameBoardArr.length) {
					concaveGameBoardArr[i][j] = concaveGameBoardJoint3;
				}// 사이드 3 "┤"
				else if(i == concaveGameBoardArr.length - 1
						&& 0 < j && j < concaveGameBoardArr[i].length) {
					concaveGameBoardArr[i][j] = concaveGameBoardJoint4;
				}// 사이드 4 "┴"
				else {
					concaveGameBoardArr[i][j] = concaveGameBoardCenter;
				}// 가운데 "┼"
	
			}
		}
	}
	
	public void createConcaveGameBoard () { // 게임판 출력
		
		System.out.println("------------------------");
		
		System.out.println();
		for (int i = 0; i < concaveGameBoardArr.length; i++) {
			for (int j = 0; j < concaveGameBoardArr[i].length; j++) {
				System.out.print(concaveGameBoardArr[i][j]);
			}
			
			System.out.println("");
			
		}
		System.out.println("------------------------");
	}
	
	
}
