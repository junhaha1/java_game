 package java_game1;

import java.util.ArrayList;

public class castle_list {
	public ArrayList<castle> Castle = new ArrayList<castle>();
	
	public castle_list() {
		Castle.add(new castle("������", 80000, 800, 200000, 7000, 60, 900, 360, 90, 1)); // ������
		Castle.add(new castle("��缺",100000, 1000, 300000, 5000, 90, 700, 270, 290, 2)); // ��缺
		Castle.add(new castle("���ʼ�",120000, 1200, 400000, 3000, 90, 900, 280, 340, 3)); // ���ʼ�
		Castle.add(new castle("�ݼ�",70000, 900, 250000, 7000, 70, 800, 410, 450, 4)); // �ݼ�
		Castle.add(new castle("���",50000, 600, 130000, 3000, 60, 600, 285, 500, 5)); // ���
		
	}
	
	public castle get(int i) { //�ش� �ε����� �´� �� ��ü ����
		return Castle.get(i);
	}
}
