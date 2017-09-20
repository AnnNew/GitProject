package com.det.first;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class TocallOnly {
    public static void main(String[] args) {
    List<CollectGenericPractice> studs = new ArrayList<>();
        studs.add(new CollectGenericPractice(1, 92));
        studs.add(new CollectGenericPractice(2, 90));
        studs.add(new CollectGenericPractice(3, 80));
        studs.add(new CollectGenericPractice(4, 85));
        studs.add(new CollectGenericPractice(5, 78));

        Collections.sort(studs);

//            Collections.sort(studs,(s1, s2) ->{
//                return s1.marks > s2.marks?-1:s1.marks<s2.marks?1:0;
//            } );
        for(CollectGenericPractice c : studs){
            System.out.println(c);
        }

}
}

//public class TocallOnly implements Comparator<Integer>{
//    public int compare( Integer o1, Integer o2){
//        if(o1%100 < o2%100){
//            return 1;
//        }
//        return -1;
//    }
//}
