public class Customer 
{
	String lessonStatus;
	String firstName;
	String lastName;
	int customerID;
	int lessonID;
    int numLesson;
	String selectedLesson;
    boolean registered; //Variable supposed to be called from register() class
        
	public String BookLesson()
	{
            if(registered == true)
            {
                if (lessonID == 1)
                {
                    selectedLesson = "Word";
                    lessonStatus = "Beginner";
                    numLesson = 3;
                }
                if (lessonID == 2)
                {
                    selectedLesson = "Excel";
                    lessonStatus = "Beginner";
                    numLesson = 5;
                } 
                if (lessonID == 3)
                {
                    selectedLesson = "Web Design";
                    lessonStatus = "Beginner";
                    numLesson = 10;
                }
                if (lessonID == 4)
                {
                    selectedLesson = "Java";
                    lessonStatus = "Beginner";
                    numLesson = 10;
                }
                if (lessonID == 5)
                {
                    selectedLesson = "Python";
                    lessonStatus = "Beginner";
                    numLesson = 10;
                }
                if (lessonID == 6)
                {
                    selectedLesson = "C++";
                    lessonStatus = "Beginner";
                    numLesson = 10;
                }
                else
                {
                    System.out.println("You must register before booking!");
                }
            }
            return selectedLesson;
        }
	
	public String AttendLesson()
	{
		
	}
	
}