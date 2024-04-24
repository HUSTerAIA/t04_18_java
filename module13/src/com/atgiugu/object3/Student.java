package com.atgiugu.object3;

public class Student implements Comparable {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /*
    this:代表students[i];
    o:代表students[i+1];
     */
    //重写compareTo
    @Override
    public int compareTo(Object o) {
        //多态->向下转型
        Student s = (Student) o;
        return this.getScore() - s.getScore();
    }
}
