package java_game1;

public class castle {
	String name = "";
	
	int pop = 0; //인구
	int gold = 0; //금
	int rice = 0; //쌀
	int spec = 0; //특산물
	
	int land = 0; //토지
	int com = 0; //상업
	
	int x_coo = 0; //성 x좌표
	int y_coo = 0; // 성 y좌표
	
	int code = 999; // 성 코드
	
	public castle(String NAME, int POP, int GOLD, int RICE, int SPEC, int LAND, int COM, int X_COO, int Y_COO, int CODE) {
		name = NAME;
		pop = POP;
		gold = GOLD;
		rice = RICE;
		spec = SPEC;
		land = LAND;
		com = COM;
		
		x_coo = X_COO;
		y_coo = Y_COO;
		
		code = CODE;
	}
}
