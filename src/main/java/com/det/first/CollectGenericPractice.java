package com.det.first;
class CollectGenericPractice implements Comparable<CollectGenericPractice> {
        int rollNo;
        int marks;
    public CollectGenericPractice(int rollNo, int marks){
            this.rollNo = rollNo;
            this.marks = marks;
        }
    @Override
    public String toString() {
        return "CollectGenericPractice{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
    @Override
    public int compareTo(CollectGenericPractice c)
    {
        return this.marks>c.marks?-1:this.marks<c.marks?1:0;
    }

}
//        List<Integer> values = new ArrayList<>();
//        values.add(398);
//        values.add(677);
//        values.add(992);
//        values.add(533);
//        values.add(205);
//        values.add(2);
//        values.add(21);
//
//        Comparator<Integer> comparator = new TocallOnly();
//        Collections.sort(values,comparator);
//        for(int i:values){
//           System.out.println(i);
//       }
//        Comparator<Integer> comparator =(o1, o2) -> {
//                if(o1%100 < o2%100){
//                return 1;
//            }
//            return -1;
//            return o1%10>o2%10?1:-1;
//        };

//        Collections.sort(values, (o1, o2) -> {
//            return o1%10>o2%10?1:-1;
//        });
//        for(int i:values){
//            System.out.println(i);
//        }
//        int values[]= new int[4];
//        Object values1[]= new Object[5];
//        values1[0] = "ji";
//        values[7] = 9;

//        Collection <Integer>values = new ArrayList<>();
//       List<Integer> values = new ArrayList<>();
//        values.add(3);
//        values.add(6);
//        values.add(99);
//        values.add(5);
//        Collections.sort(values);
////        values.add("monu");
////        values.add(7.9f);
//        Iterator i = values.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        Vector v = new Vector();
//        v.add(4);
//        v.add(8);
//        System.out.println(v.capacity());
//        for(Object i:v){
//            System.out.println(i);
//        }



