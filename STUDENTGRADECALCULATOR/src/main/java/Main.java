import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjectNum = input.nextInt();
        input.nextLine(); 

        String[] subjectNames = new String[subjectNum];
        int[] subjectMarks = new int[subjectNum];
        String[] subjectGrades = new String[subjectNum];
        int total = 0;
         

        for (int i = 0; i < subjectNum; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();

            System.out.print("Enter the mark for " + subjectNames[i] + ": ");
            subjectMarks[i] = input.nextInt();
            input.nextLine(); 
            
            total += subjectMarks[i];
            subjectGrades[i] = getGrade(subjectMarks[i]);
        }
        
        double average = (double) total / subjectNum;
        String averageGrade = getGrade((int) average);

        System.out.println("\n--- Subject Marks ---");
        for (int i = 0; i < subjectNum; i++) {
            System.out.println(subjectNames[i] +" - Mark: "+ subjectMarks[i] +" - Grade: " + subjectGrades[i]);
        }
        
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Overall Grade: " + averageGrade);

    }
    
    public static String getGrade(int mark) {
        if (mark >= 90 && mark <= 100) return "A+";
        else if (mark >= 80) return "A";
        else if (mark >= 70) return "B+";
        else if (mark >= 60) return "B";
        else if (mark >= 50) return "C";
        else if (mark >= 40) return "D";
        else return "F";
    }
}
