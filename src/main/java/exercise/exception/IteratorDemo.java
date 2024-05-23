package exercise.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> sportStars = new ArrayList<>();
        sportStars.add("asd");
        sportStars.add("asdf");
        sportStars.add("asde");
        sportStars.add("asdw");
        sportStars.add("asdq");
        for(int i=0;i<sportStars.size();i++){
            System.out.println(sportStars.get(i));
        }
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"asd");
        map.put(2,"asdf");
        map.put(3,"zxcv");
        map.put(4,"qewop");
        map.put(5,"asud");
        for(int i=1;i<=map.size();i++){
            System.out.println(map.get(i));
        }

        Iterator<String> sportStarIterator = sportStars.iterator();
        while(sportStarIterator.hasNext()){
            System.out.println(sportStarIterator.next());
        }
        Iterator<String> mapIterator = map.values().iterator();
        while(mapIterator.hasNext()){
            System.out.println(mapIterator.next());
        }

        for(String ss : map.values()){
            System.out.println(ss);
        }
    }
}
