package test.boot.data.redis;

import org.junit.Test;
import sun.tools.jar.Main;
import test.boot.data.redis.controller.test.ListStudent;
import test.boot.data.redis.controller.test.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    Long endMili;


    ListStudent listStudent = new ListStudent();


    public List<Student> test(List<Student> list2,List<Student> list3,List<Student> list4,List<Student> list5){
        List<Student> list = new ArrayList<>();
        long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
        System.out.println("开始 "+startMili);
        for(int i = 0;i<list2.size();i++){
            list.add(new Student(
                    list2.get(i).getWorkNum()
                    ,list2.get(i).getName()
                    ,list3.get(i).getSex()
                    ,list4.get(i).getAge()
                    ,list5.get(i).getScore()
            ));
        }
        endMili=System.currentTimeMillis();
        endMili=System.currentTimeMillis();
        endMili= endMili-startMili;
        return list;

    }

    public List<Student> test2(List<Student> list2,List<Student> list3,List<Student> list4,List<Student> list5){
        List<Student> list = new ArrayList<>();

        long startMili=System.currentTimeMillis();// 当前时间对应的毫秒数
        Map<String,Boolean> map3 = new HashMap<>();
        Map<String,Integer> map4 = new HashMap<>();
        Map<String,Integer> map5 = new HashMap<>();
        for (int i = 0;i<list2.size();i++){
            map3.put(list3.get(i).getWorkNum(), list3.get(i).getSex());
            map4.put(list4.get(i).getWorkNum(), list4.get(i).getAge());
            map5.put(list5.get(i).getWorkNum(), list5.get(i).getScore());
        }

        for(int i = 0;i<list2.size();i++){
            list.add(
                    new Student(list2.get(i).getWorkNum()
                            ,list2.get(i).getName()
                            ,map3.get(list2.get(i).getWorkNum())
                            ,map4.get(list2.get(i).getWorkNum())
                            ,map5.get(list2.get(i).getWorkNum()))
            );
        }
        endMili=System.currentTimeMillis();
        endMili= endMili-startMili;
        return list;
    }


    @Test
    public void di(){
        List<Student> test = test2(listStudent.list2, listStudent.list3, listStudent.list4, listStudent.list5);
        for(Student student : test){
            System.out.println(student);
        }
        System.out.println(endMili);
    }

}
