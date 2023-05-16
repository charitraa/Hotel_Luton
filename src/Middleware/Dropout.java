package Middleware;


	public class Dropout extends Student
	{
	   private int numOfRemainingModules;
	   private int numOfMonthsAttended;
	   private String dateOfDropout;
	   private int remainingAmount;
	   private boolean hasPaid;
	   
	   public Dropout(int enrollmentID,String 
	dateOfBirth, String courseName, String studentName, String dateOfEnrollement, int tutionFee,int courseDuration, int numOfRemainingModules, String dateOfDropout,
	int numOfMonthsAttended)
	   {
	      super(dateOfBirth,studentName,courseDuration,tutionFee);
	      super.setEnrollmentID(enrollmentID);
	      super.setCourseName(courseName);
	      super.setDateOfEnrollement(dateOfEnrollement);
	      this.numOfRemainingModules=numOfRemainingModules;
	      this.numOfMonthsAttended=numOfMonthsAttended;
	      this.dateOfDropout=dateOfDropout;
	      this.hasPaid=false;
	      this.remainingAmount=0;
	   }
	   
	public String getDateOfDropout()
	{
	    return dateOfDropout;
	}
	public int getNumOfRemainingModules()
	{
	    return numOfRemainingModules;
	}
	public int getNumOfMonthsAttended()
	{
	    return numOfMonthsAttended;
	}
	public int getRemainingAmount()
	{
	    return remainingAmount;
	}
	public boolean getHasPaid()
	{
	    return hasPaid;
	}

	public void billsPayable()
	{
	    double remainingAmount=(super.courseDuration()-numOfMonthsAttended)*super.tutionFee();
	    hasPaid=true;
	}
	public void removeStudent()
	{
	   if(hasPaid=true) 
	   {
	      getDateOfEnrollement();
	      setCourseName("");
	      getStudentName();
	      
	      super.setDateOfEnrollement("");
	      super.courseDuration();
	      super.tutionFee();
	      dateOfDropout="";
	      super.setEnrollmentID(0);
	      numOfRemainingModules=0;
	      numOfRemainingModules=0;
	      remainingAmount=0;
	    }
	    else
	      {
	        System.out.println("All bills not cleared");  
	      }
	   }
	
	
	}

	


