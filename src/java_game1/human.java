package java_game1;

public class human {
	String name = "아무개"; //이름
	int age = 0; //나이
	int location = 1; //위치코드
	int STR = 0; //무력
	int INT = 0; //지력
	int ATT = 0; //매력
	
	
	public human(String name, int age, int STR, int INT, int ATT, int location) {
		this.name = name;
		this.age = age;
		this.STR = STR;
		this.INT = INT;
		this.ATT = ATT;
		this.location = location;
	}
}
