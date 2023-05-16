package Middleware;

public class Student {


	    private String dateOfBirth,courseName,studentName,dateOfEnrollement;
	    private int enrollmentID,courseDuration,tutionFee;
	  
	     public Student(String dateOfBirth,String studentName, int courseDuration, int tutionFee)
	     {
	     
	       this.dateOfBirth=dateOfBirth;
	       this.studentName=studentName;
	       this.courseDuration=courseDuration;
	       this.tutionFee=tutionFee;
	       this.courseName="";
	       this.dateOfEnrollement="";
	       this.enrollmentID=0;
	    
	     } 
	     
	     //using accessor/get method.
	     public String getSDateOfBirth()
	     {
	         return dateOfBirth;
	     }
	     
	     public String getCourseName()
	     {
	         return courseName;
	     }
	     
	     public String getStudentName()
	     {
	         return studentName;
	     }
	        
	     public String getDateOfEnrollement()
	     {
	         return dateOfEnrollement;
	     }
	     public int setEnrollmentID ()
	     {
	         return enrollmentID;
	     }
	     public int courseDuration ()
	     {
	         return courseDuration ;
	     }
	     public int tutionFee ()
	     {
	         return tutionFee ;
	     }
	     //use of the mutator/set method.
	     public void setCourseName(String courseName)
	     {
	         this.courseName=courseName;
	     }
	      public void setEnrollmentID (int enrollmentID)
	     {
	         this.enrollmentID=enrollmentID;
	     }
	      public void setDateOfEnrollement(String dateOfEnrollement)
	     {
	         this.dateOfEnrollement=dateOfEnrollement;
	     }
	     
	     public void display()
	     {
	         if(this.dateOfBirth.equals("")||this.studentName.equals("")||
	         this.dateOfEnrollement.equals("")||this.courseDuration==0||this.tutionFee==0||
	         courseName.equals("")||enrollmentID==0)
	         {
	         System.out.println("ALL THE VALUES ARE NOT ENTERED.");
	        }
	        else
	        {

	         System.out.println("dateofbirth=" +dateOfBirth);
	         System.out.println("studentName=" +studentName);
	         System.out.println("dateOfenrollement=" +dateOfEnrollement);
	         System.out.println("courseDuration=" +courseDuration);
	         System.out.println("tutionFee=" +tutionFee);
	         System.out.println("courseName=" +courseName);
	         System.out.println("enrollmentID=" +enrollmentID);
	     } 
	      }
	     
	    }


