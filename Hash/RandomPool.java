package Hash;

import java.util.HashMap;

public class RandomPool {
	HashMap<String, Integer> map;
	HashMap<Integer, String> help;
	int index;
	public RandomPool(){
		index = 0;
		map = new HashMap<>();
		help = new HashMap<>();
	}
	public String getRandom() {
		if(index<=0)
			return null;
		int i = (int)Math.random()*index;
		return help.get(i);
	}
	public void Del(String s) {
		int value = map.get(s);
		String i = help.get(index);
		map.put(i, value);
		map.remove(i, index);
		help.put(value, i);
		help.remove(index);
	}
	public void put(String s) {
		map.put(s, ++index);
		help.put(index, s);
	}
}
