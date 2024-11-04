package model;

import java.util.List;

public class Lesson {
    private final String lesson;
    private String instructorName;
    private final int capacity;
    private List<Member> members;

    public Lesson(String lesson, String instructorName, int capacity){
        this.lesson = lesson;
        this.instructorName = instructorName;
        this.capacity = capacity;
    }

    public void addMember(Member member){
        if (checkVacancies()){
            members.add(member);
            System.out.printf("%s foi cadastrado com sucesso na aula %s", member.getName(), this.lesson);
        }else{
            System.out.println("Não há mais vagas para esta aula.");
        }
    }

    public boolean checkVacancies(){
        return members.size() < capacity;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getLesson() {
        return lesson;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Member> getMembers() {
        return members;
    }
}
