package com.test.third;
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cloningtut cl = new Cloningtut();
        cl.i = 5;
        cl.j = 10;
        Cloningtut c2 = (Cloningtut) cl.clone();
        cl.i = 8;
        System.out.println(cl);
    }
}
// Deep, Shallow
class Cloningtut implements Cloneable
{
    int i;
    int j;
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Cloningtut{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
