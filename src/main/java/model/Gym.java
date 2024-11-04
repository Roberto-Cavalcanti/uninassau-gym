package model;

import java.util.List;
import java.util.Set;

public class Gym {

    Set<Member> members;
    List<Lesson> lessons;
    List<AttendenceRecord> attendenceRecord;

    public void addMember(Member member){
        this.members.add(member);
    }
    public void addLesson(Lesson lesson){
        this.lessons.add(lesson);
    }
    public void registerMemberInLesson(Member member, Lesson lesson){
        if (lessons.contains(lesson)){
            if(member.getPaymentStatus()){
                lesson.addMember(member);
            }else{
                System.out.printf("%s, regularize o seu pagamento para inscrever-se em aulas.%n", member.getName());
            }
        }else{
            System.out.println("Essa aula não existe no sistema.");
        }
    }

}
