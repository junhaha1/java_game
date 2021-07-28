 package java_game1;

import java.util.ArrayList;

public class castle_list {
	public ArrayList<castle> Castle = new ArrayList<castle>();
	
	public castle_list() {
		Castle.add(new castle("국내성", 80000, 800, 200000, 7000, 60, 900, 360, 90, 1)); // 국내성
		Castle.add(new castle("평양성",100000, 1000, 300000, 5000, 90, 700, 270, 290, 2)); // 평양성
		Castle.add(new castle("위례성",120000, 1200, 400000, 3000, 90, 900, 280, 340, 3)); // 위례성
		Castle.add(new castle("금성",70000, 900, 250000, 7000, 70, 800, 410, 450, 4)); // 금성
		Castle.add(new castle("사비성",50000, 600, 130000, 3000, 60, 600, 285, 500, 5)); // 사비성
		
	}
	
	public castle get(int i) { //해당 인덱스에 맞는 성 객체 리턴
		return Castle.get(i);
	}
}
