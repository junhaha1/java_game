package java_game1;

import java.util.ArrayList;

public class human_list {
	public ArrayList<human> Human = new ArrayList<human>();
	public human_list() {
		Human.add(new human("��������", 21, 100, 60, 85, 1));
		Human.add(new human("���ʰ��", 21, 85, 90, 90, 2));
		Human.add(new human("�����", 20, 70, 90, 100, 4));
		Human.add(new human("������", 19, 85, 90, 90, 4));
		Human.add(new human("�����ҹ�", 26, 90, 85, 85, 1));
	}
}
