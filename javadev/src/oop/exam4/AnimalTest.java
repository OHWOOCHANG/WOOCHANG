package oop.exam4;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal);
		
		Animal animal2 = new Eagle();
		System.out.println(animal2);
		
		Animal condor = new Condor();
		Condor condor2 = (Condor) condor;
		System.out.println(condor2);
		
		Animal eagle = new Eagle();
		Tiger tiger = (Tiger) eagle;
		System.out.println(tiger);
	}

}
