package java_game1;

import java.util.ArrayList;

public class castle_list {
	public ArrayList<castle> Castle = new ArrayList<castle>();
	
	public castle_list() {
		Castle.add(new castle(100000, 1000, 300000, 5000, 90, 700, 1)); // 임시 서울
		Castle.add(new castle(80000, 800, 200000, 7000, 60, 900, 2)); // 임시 부산
	}
	
	public castle get(int i) { //해당 인덱스에 맞는 성 객체 리턴
		return Castle.get(i);
	}
}
