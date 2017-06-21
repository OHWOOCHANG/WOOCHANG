package oop.exam3;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("오우창");
		h.setGender(1);
		h.setYear(1990);
		h.setJob("Data Analyst");
		h.setMarried(true);
		h.setWeight(67);
		h.setHeight(173);
		h.setHobby("음악");
		
		System.out.println(h);
		
		AnimalLover al = new AnimalLover();
		
		al.setName("JB");
		al.setGender(1);
		al.setYear(1991);
		al.setJob("개발자");
		al.setMarried(true);
		al.setWeight(70);
		al.setHeight(180);
		al.setHobby("테니스");
		al.setAnimalType("강아지");
		al.setAyear(4);
		
		System.out.println(al);
		
	}

}
