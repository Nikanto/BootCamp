package userimport;

/**
 *
 * @author Nikos Katsantonis
 */
import administration.Trainer;
import java.util.ArrayList;
import java.util.Scanner;

public class TrainerImport {

    public Trainer trainerInput(Scanner sc) {
        sc.nextLine();
        Trainer trainer = new Trainer();
        System.out.println("Please write trainer's First Name:");
        trainer.setFirstName(sc.nextLine());
        System.out.println("Please write trainer's Last Name:");
        trainer.setLastName(sc.nextLine());
        System.out.println("Please write trainer's Subject:");
        trainer.setSubject(sc.nextLine());

        return (trainer);

    }

    public ArrayList<Trainer> multiTrainerInput(Scanner sc, ArrayList<Trainer> multiTrainers) {
        Trainer trainer = new Trainer();
        //       ArrayList<Trainer> multiTrainers = new ArrayList<Trainer>();

        boolean checkUserInput;
        do {
            trainer = trainerInput(sc);
            multiTrainers.add(trainer);
            System.out.println(trainer);
            System.out.println("Press 1 to import another Trainer:");
            System.out.println("Press 2 to enter the Print Menu");
            checkUserInput = sc.next().equals("2");
        } while (!checkUserInput);

        return (multiTrainers);
    }

}
