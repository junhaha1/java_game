package java_game1;

public class castle {
	String name = "";
	
	int pop = 0; //�α�
	int gold = 0; //��
	int rice = 0; //��
	int spec = 0; //Ư�깰
	
	int land = 0; //����
	int com = 0; //���
	
	int x_coo = 0; //�� x��ǥ
	int y_coo = 0; // �� y��ǥ
	
	int code = 999; // �� �ڵ�
	
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
