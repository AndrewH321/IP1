
import java.util.Scanner;

/**
 *
 * @author Polina
 */
public class Tutor {
    private final int tutorID;
    private int lessonID;
    private String status;
    private Lesson lesson;
    private User user;
    private Customer cStatus;
    
    /**
     * Constructor for objects of class Tutor
     * @param tutorID
     */
    public Tutor(int tutorID)
    {
        this.tutorID = tutorID;
        //user.logIn(); alternative way to get in Tutor class
    }
   
    public void ChangeCustomerStatus()
    {
        Scanner stat = new Scanner(System.in);
        System.out.println("Please enter new status");
        String newStatus = stat.nextLine();
        status = newStatus;
    }
    
    public void AttendLesson()
    {
        //lesson.startLesson(int customerID, int tutorID)
        //lesson.displayDetails()
    }
    
    public void LogIn()
    {
        /**
        Scanner scan = new Scanner(File/database);
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your email");
        String inpEmail = reader.nextLine();
        System.out.println("Please enter your password");
        String inpPass = reader.nextLine();
        
        String email = scan.nextLine();
        String pass = scan.nextLine();
        
        if (inpEmail.equals(email) && inpPass.equals(pass)) {
            System.out.print("You are logged in");
        } else {
            System.out.print("Invalid email or password");
        }
        */
    }
    
    public Customer getCustomerStatus (){
       return cStatus;
    }
}
