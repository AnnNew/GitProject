package com.det.first;

public class FindDupString {
        public void findDupCharInString(String s){
            s = "";
            if(s.isEmpty()){
            }
            for(int i=0;i<=s.length();i++){
                 s.charAt(i);
            }
}

    public static void main(String[] args) {
        FindDupString fd = new FindDupString();
        fd.findDupCharInString("trickortreat");
    }
}