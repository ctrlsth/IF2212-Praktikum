/* 18221171 - Hans Stephano */
/* Topik: Generics */

import java.lang.System;
import java.util.ArrayList;
import java.util.List;


public class RobotPrinter {
    // Hint 1:
    // List adalah interface Java yang merupakan subinterface dari interface Collection
    // Deklarasi tipe generic `List` di Java yang sudah tersedia adalah:
    // `public interface List<E> extends Collection<E>`
    // 
    // Seperti dapat dilihat, List bisa menggunakan variabel tipe (T) generic saat digunakan. Contoh penggunaannya:
    // List<Integer> integerList = ...;   

    // Hint 2:
    // Iterasi melalui seluruh elemen list dapat digunakan dengan loop for-each, yang di Java bisa dilakukan dengan sintaks:
    // for (E element : elementList){
        //operasi pada element
    // }
    
    public void printListOfRobot(List<? extends Robot> RoboList) {
		for (Robot temp : RoboList) {
			System.out.println(temp.getName());
		}
	}
	
    public void printListOfTransformer(List<? extends Transformer> AutoBots) {
		for (Transformer temp : AutoBots) {
			System.out.println(temp.getWeapons());
		}
	}
    public void printClassNameOfList(List<? extends Object> WoRedacted) {
		for (Object temp : WoRedacted) {
			System.out.println(temp.getClass().getName());
		}
	}
    public <T> void printObjectClassName(T UFO) {
		System.out.println(UFO.getClass().getName());
	}

}

class Robot {
    private String name;
  
    public Robot(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Transformer extends Robot{
    private int weapons;
    public Transformer(String name, int weapons){
        super(name);
        this.weapons = weapons;
    }

    public int getWeapons(){
        return this.weapons;
    }
}

class Bumblebee extends Transformer{
    public Bumblebee(String name, int weapons){
        super(name,weapons);
    }
}

class Baymax extends Robot{
    public Baymax(String name){
        super(name);
    }
}
