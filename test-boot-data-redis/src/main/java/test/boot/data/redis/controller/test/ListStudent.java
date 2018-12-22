package test.boot.data.redis.controller.test;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {

    public static List<Student> list1 = new ArrayList<>();
    public static List<Student> list2 = new ArrayList<>();
    public static List<Student> list3 = new ArrayList<>();
    public static List<Student> list4 = new ArrayList<>();
    public static List<Student> list5 = new ArrayList<>();

    static {
        for(int i = 0;i<1000000;i++){
            list2.add(new Student("工号" + (i +1),"同学名字"+ i,null,null,null));
            list3.add(new Student("工号" + (i +1),null,true,null,null));
            list4.add(new Student("工号" + (i +1),null,null,18+i,null));
            list5.add(new Student("工号" + (i +1),null,null,null,99+i));
        }
    }



}
