package com.pr.fourth;
import java.util.*;

public class PracticeCollections implements Comparator<Integer>{

    @Override
    public int compare (Integer one, Integer two){
        if(one>two)
        { return 1;}
        if(one<two)
        { return -1;}

        return 0;

    }
}
