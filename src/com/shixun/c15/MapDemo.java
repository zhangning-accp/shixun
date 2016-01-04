package com.shixun.c15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zn on 2016/1/4.
 */
public class MapDemo {
    public static void main(String [] args) {
        Map<String,String> map = new HashMap();
        System.out.println(map);
        map.put("a","a");
        //System.out.println(map);
        map.put("a","b");
        //System.out.println(map);
        String s = map.getOrDefault("b", "b");
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            String value =map.get(key);
        }
        System.out.println(s);
    }
}
