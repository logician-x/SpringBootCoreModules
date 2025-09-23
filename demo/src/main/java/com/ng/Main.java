package com.ng;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Map<Student,List<String>> map = new HashMap<>();
       System.out.println("enter the total students:");
       int total = Integer.parseInt(sc.next());
       for(int i=1;i<=total;i++){
        System.out.println("enter name:");
        String name = sc.next();
        System.out.println("enter id:");
        Integer id = Integer.parseInt(sc.next());
        Student s =new Student(name,id);
        List<String> list= getCourses();
        map.put(s, list);
       }
       for(Map.Entry<Student,List<String>> entry:map.entrySet()){
           boolean status = entry.getValue().stream().anyMatch(str->str.equals("data science"));
           if(status){
               System.out.println(entry.getKey());
           }
       }
       sc.close();
       System.out.println(map);       
    }
    public static List<String> getCourses(){
        
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("enter total courses to enrol:");
        int courses = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=courses;i++){
             System.out.println("enter course name:");
             String course = sc.nextLine();
             list.add(course);
        }        
        return list;
    }
}
record Student(String name,Integer id){
	
}

