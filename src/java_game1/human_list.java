package java_game1;

import java.util.ArrayList;

public class human_list {
	public ArrayList<human> Human = new ArrayList<human>();
	public human_list() {
		Human.add(new human("±¤°³Åä´ë¿Õ", 21, 100, 60, 85, 1));
		Human.add(new human("±ÙÃÊ°í¿Õ", 21, 85, 90, 90, 2));
		Human.add(new human("ÁøÈï¿Õ", 20, 70, 90, 100, 4));
		Human.add(new human("±èÀ¯½Å", 19, 85, 90, 90, 4));
		Human.add(new human("¿¬°³¼Ò¹®", 26, 90, 85, 85, 1));
	}
}
