package java_game1;

import java.util.ArrayList;

public class human_list {
	static ArrayList<human> Human = new ArrayList<human>();
	public human_list() {
		Human.add(new human("������", 21, 80, 75, 85));
		Human.add(new human("�̼���", 45, 90, 99, 99));
		Human.add(new human("����", 36, 89, 70, 70));
		Human.add(new human("�����", 27, 99, 60, 50));
		Human.add(new human("����", 50, 50, 45, 35));
	}
}
