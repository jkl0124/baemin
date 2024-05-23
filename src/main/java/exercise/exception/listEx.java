package exercise.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class listEx {

    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[0] = "adsfs";
        strings[1] = "asdfag";
        for(int i=0;i<2;i++){
            System.out.println(strings[i]);
        }

        List<Object> arrayList= new ArrayList<>();
        arrayList.add("asdf");
        arrayList.add(123);

    }
}
