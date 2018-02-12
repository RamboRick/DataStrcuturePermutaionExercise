package permutationString;

import java.util.HashMap;
import java.util.Map;

public class PermutaionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static boolean permutationCheck(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		
		Map<Character, Integer> mapping = new HashMap<Character, Integer>();
		for (int i = 0; i != s1.length(); i++){
			char c = s1.charAt(i);
			if (mapping.containsKey(c)){
				mapping.put(c, mapping.get(c)+1);
			}else {
				mapping.put(c, 1);
			}
		}
		
		for (int i = 0; i !=s2.length(); i++){
			char c = s2.charAt(i);
			if (mapping.containsKey(c)){
				mapping.put(c, mapping.get(c) -1);
				if (mapping.get(c) == 0){
					mapping.remove(c);
				}
			}else {
				return false;
			}
					
		}
		return true; 
	}

}
