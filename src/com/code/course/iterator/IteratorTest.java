package com.code.course.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author tcy
 */
public class IteratorTest {

    /**
     * 迭代器模式
     * 不使用迭代器模式也可以实现指定的功能，比如遍历一个自定义的数据结构
     * 当自定义的结构改变时，那使用该结构的地方也需要对应的调整，增加代码的耦合度
     *
     * 使用迭代器模式之后，对外提供指定的方法来进行数据迭代，当自定义的数据结构改变时
     * 只需要将对应对外提供的方法一起调整修改，所有使用该结构的地方迭代不需要做任何改动，实现了解偶
     *
     */

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        for (int i=0; i < 5; i++) {
            Student student = new Student("stu" + i);
            classroom.addStudent(student);
        }

        while (classroom.hasNext()) {
            System.out.println(classroom.getNext());
        }
    }

    public static class Student {

        public Student(String name) {
            this.name = name;
        }

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public interface Iterator<T> {
        boolean hasNext();
        T getNext();
    }

    public static class Classroom implements Iterator<Student> {

//        private List<Student> studentList = new ArrayList<>(10);
        private Set<Student> studentList = new HashSet<>(10);

        public void addStudent(Student student) {
            studentList.add(student);
        }

        @Override
        public boolean hasNext() {
            return studentList.size() > 0;
        }

        @Override
        public Student getNext() {
//            return studentList.remove(0);
            Student s = studentList.iterator().next();
            studentList.remove(s);
            return s;
        }
    }
}
