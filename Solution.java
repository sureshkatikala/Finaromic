package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
	
	

	public static int isValidSudoku(final List<String> a) {
        if(a == null)
            return 0;
      //  int n = a.size();
     //   if(n != 0 || a.get(0).length() != 9)
     //       return 0;
        HashSet<Character> set = new HashSet<Character>();
        
        for(int i =0; i < 9; i++){
            set.clear();
            for(int j = 0; j < 9; j++){
                char c = a.get(i).charAt(j);
                if(c == '.')
                    continue;
                if(set.contains(c))
                    return 0;
                set.add(c);
            }
        }
        
        for(int i = 0; i < 9; i++){
            set.clear();
            for(int j = 0; j < 9; j++){
                char c = a.get(j).charAt(i);
                if(c == '.')
                    continue;
                if(set.contains(c))
                    return 0;
                set.add(c);
            }
        }
        
        for(int k =0; k < 9; k++){
        	set.clear();
            int x = k / 3;
            int y = k % 3;
            
            for(int i = 3*x; i < 3*x + 3; i++){
                for(int j = 3*y; j < 3*y + 3; j++){
                    char c = a.get(i).charAt(j);
                    if(c == '.')
                        continue;
                    if(set.contains(c))
                        return 0;
                    set.add(c);
                }
            }
        }
        
        return 1;
    }
	
	
	//studnt pass best..cost thakva untade
    public static void main(String[] args){
        List<String> a = new ArrayList<String>();
        a.add("..5.....6");
        a.add("....14...");
        a.add(".........");
        a.add(".....92..");
        
        a.add("5....2...");
        a.add(".......3.");
        a.add("...54....");
        a.add("3.....42.");
        a.add("...27.6..");
     
        System.out.println(isValidSudoku(a));
    }
}