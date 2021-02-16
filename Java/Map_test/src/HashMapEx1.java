import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map m = new HashMap();
		String str = "Hello my name is Lisa and I am cool";
		
		for (char x: str.toCharArray()) { // convert str to char array
			if (m.containsKey(x)) {
				int old = (int) m.get(x);
				m.put(x,  old+1);
				
			}
			else {
				m.put(x, 1);
			}
		}
		
		m.remove(' '); 			// remove all the spaces
		System.out.println(m);
	

	}

}
