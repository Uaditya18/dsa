package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class SortCharacterByFreq {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0;i<str.length();i++){
            if(hashMap.containsKey(str.charAt(i)));
            {
                hashMap.put(str.charAt(i),hashMap.get(i)+1);
            }
        }
        System.out.println(hashMap.toString());
    }
}
