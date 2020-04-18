package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        List<Integer> list=new ArrayList<>();
        List<ResultList> results =new ArrayList<>();
        ResultList buff;
        list.add(4);
        list.add(10);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(2);
        MaxSearchAlgorithms obj = new MaxSearchAlgorithms();
        Class cls = obj.getClass();
        Method[] methods=cls.getDeclaredMethods();
        Method call;
        for (Method method:methods)
        {
            System.out.println(method.getName());
            if(method.getName().matches("(.*)scan(.*)"))
            {
                call=cls.getDeclaredMethod(method.getName(),List.class);
                buff = new ResultList(method.getName(), (List<Integer>) call.invoke(obj,list));
                results.add(buff);
            }
        }

        Iterator<ResultList> iterator = results.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
