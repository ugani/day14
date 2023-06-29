package generic;

import java.util.ArrayList;

class Test03< T >{
	public void sumFunc(T n1, T n2) {
		System.out.println(n1+", "+n2);
	}

}

public class MainClass03 {
	public static void main(String[] args) {
		Test03<Integer> t = new Test03();
		t.sumFunc(200, 100);
		
//		Test03<String> t02 = new Test03();
//		t.sumFunc("ad", "asds");
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(100);
		int n = arr.get(0);
		
	}
}

