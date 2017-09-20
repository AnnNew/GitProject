package com.det.first;
public class Interview2 {

    public void reverseWordsInString(String input){

        String[] array = input.split(" ");

        for(int index = array.length-1;index>=0;index--){
            System.out.print(array[index] + " ");
        }
    }
    public static void main(String[] args) {
        Interview2 obj = new Interview2();
       obj.reverseWordsInString("My name is monu");

    }

}
