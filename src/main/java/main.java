import model.Gym;
import model.Lesson;
import model.Member;

public class main {
    public static void main(String[] args) {
        Gym GrowthFlix = new Gym();
        Member a1 = new Member("Roberto");

        Lesson crossfit = new Lesson("Crossfit", "Erick", 10);

        GrowthFlix.addMember(a1);
        GrowthFlix.addLesson(crossfit);
        GrowthFlix.registerMemberInLesson(a1,crossfit);

        System.out.println("Vagas livres" + crossfit.checkVacancies());
        System.out.println(crossfit.getInstructorName());

    }
}
