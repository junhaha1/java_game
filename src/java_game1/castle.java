package java_game1;

public class castle {
	
	int pop = 0; //인구
	int gold = 0; //금
	int rice = 0; //쌀
	int spec = 0; //특산물
	
	int land = 0; //토지
	int com = 0; //상업
	
	int code = 999; // 성 코드
	
	public castle(int POP, int GOLD, int RICE, int SPEC, int LAND, int COM, int CODE) {
		pop = POP;
		gold = GOLD;
		rice = RICE;
		spec = SPEC;
		land = LAND;
		com = COM;
		code = CODE;
	}
}
