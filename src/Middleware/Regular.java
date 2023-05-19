package Middleware;

	public class Regular extends Student
	{
	  private int numOfModules;
	  private int numOfCreditHours;
	  private double daysPresent;
	  private boolean isGrantedScholarship;
	  
	  public Regular (String dateOfBirth,String studentName, int courseDuration, int tutionFee,String courseName,String dateOfEnrollement,int enrollmentID, int numOfModule,int numOfCreditHours,double daysPresent)
	  {
	      super(dateOfBirth,studentName, courseDuration,tutionFee);//calling instance variable from student class using super keywords.
	      super.setEnrollmentID(enrollmentID);
	      super.setCourseName(courseName);
	      super.setDateOfEnrollement(dateOfEnrollement);
	      this.numOfModules=numOfModules;
	      this.numOfCreditHours=numOfCreditHours;
	      this.daysPresent=daysPresent;
	      this.isGrantedScholarship=false;
	  }
	  
	    public int getNumOfModules()
	    {
	        return numOfModules;
	    }
	    
	    public int getNumOfCreditHours()
	    {
	        return numOfCreditHours;
	    }
	    
	    public double getDaysPresent()
	    {
	        return daysPresent;
	    }
	    
	    public boolean getIsGrantedScholarship()
	    {
	         return isGrantedScholarship;
	    }
	    
	    public double presentPercentage(double daysPresent)
	  {
	      double presentPer= (daysPresent/super.courseDuration())*100;
	      if(super.courseDuration()<daysPresent)
	      {
	          System.out.println("number of days present is less than course duration.");
	      }
	      else
	      {
	      if(presentPer>=80)
	      {
	          this.isGrantedScholarship=true;
	      }
	  }  
	  return presentPer;
	}

	public void grantCertificate(String courseName,int enrollmentID, String dateOfEnrollement)
	{
	    System.out.println("Congratulation! for your graduation,enrollmentID=" +enrollmentID +"from the course " + courseName + "which was enrolled on date " + dateOfEnrollement);
	    if(isGrantedScholarship=true)
	    {
	        System.out.println("The scholarship has been granted");
	    }
	}

	public void display()
	{
	    super.display();
	    System.out.println("numOfModules=+numOfModules");
	    System.out.println("numOfCreditHours=+numOfCreditHours");
	    System.out.println("daysPresent=+daysPresent");
	}
	}


