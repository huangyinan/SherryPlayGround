package pair1;

import java.awt.Color;

public class PairTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "Mary", "had", "a", "little", "lamb" };
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getSecond());
		System.out.println(Color.ORANGE);
		

	}

}


