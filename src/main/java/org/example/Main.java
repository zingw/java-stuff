package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        getClassInfo(Teacher.class);

        System.out.println("===");
        getFieldInfo(t);

    }

    public static <T> void getClassInfo( Class<T> t){
        Method[] methods = t.getDeclaredMethods();
        for(Method method : methods){
            System.out.println();
            System.out.println("Method: " + method.getName());
            System.out.println("Parameters: " + Arrays.toString(method.getParameters()));
        }
    }

    public static <T> void getFieldInfo( T t){
        for(Field field : t.getClass().getDeclaredFields()){
            System.out.println();
            System.out.println("Field: " +field.getName());
            System.out.println("Type: " +field.getType());
        }
    }
}