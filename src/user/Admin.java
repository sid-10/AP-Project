package user;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter outid = response.getWriter();  
   		outid.println("<!DOCTYPE html>"
   				
   				+"<head>"+"</head>"
			+"<body>"
			+"<form action='Admin' method=\"post\">"
			
			+"<h2>Personal Info</h2>"
			
			
			+"<hr>"
			+"<br><br>Name :  <input type='text' name='Name' /><br><br>"  
			
			+"Email :  <input type='email' name='Email'/><br><br>"
					
			+"Enrollment No : <input type='text' name ='enroll'><br><br>"
			
			+"Gender :  <br><input type='radio' name='gender' value='Male'/>Male<br>"
			+"<input type='radio' name='gender' value='Female'/>Female<br><br>"
			
			+"Category :  <br><input type='radio' name='cat' value='General'/>General<br>"
			+"<br><input type='radio' name='cat' value='SC'/>SC<br><br>"
			+"<input type='radio' name='cat' value='ST'/>ST<br><br>"
			+"<input type='radio' name='cat' value='OBC'/>OBC<br><br>"

			+"Physically Disabled :  <br><input type='radio' name='p_disabled' value='Yes'/>Yes<br>"
			+"<input type='radio' name='p_disabled' value='No'/>No<br><br>"
			
			+"Date of Birth	: <input type='radio' name='dobl' value='Before'/>Before  "
			+"<input type='radio' name='dobl' value='On'/>On  "
			+"<input type='radio' name='dobl' value='After'/>After<br><br>"
			+"<input type='date' name='dob' min='1950-12-01' max='2000-01-01'><br>"

			
   			+"<h2>Educational Info</h2>"
			
			
   			+"<hr>"
   			+"<br><br>PhD Stream :  <input type='text' name='phdstream'/><br><br>"  
   			+"<br><br>Graduation Degree :  <input type='text' name='Graduation_Degree'/><br><br>"  
   			+"<br><br>Post Graduation Degree :  <input type='text' name='Post_Graduation_Degree'/><br><br>"  
   			+"<br><br>Xth Board :  <input type='text' name='10board'/><br><br>"  
   			+"<br><br>XII Board :  <input type='text' name='12board'/><br><br>"
			+"<br><br>Graduation Department :  <input type='text' name='graddept'/><br><br>"
   			+"<br><br>Post Graduation Department :  <input type='text' name='postgraddept'/><br><br>"
   			+"<br><br>Graduation University :  <input type='text' name='gradUniv'/><br><br>"
   			+"<br><br>Post Graduation University :  <input type='text' name='postGradUniv'/><br><br>"
   			+"<br><br>Graduation State :  <input type='text' name='gradstat'/><br><br>"
   			+"<br><br>Post Graduation State :  <input type='text' name='postgradstat'/><br><br>"
   			
			   			
						
			
			+"X Board Percentage  : <input type='radio' name='xmarks1' value='Less'/>Less"
			+"<input type='radio' name='xmarks1' value='Equal'/>Equal"
			+"<input type='radio' name='xmarks1' value='Greater'/>Greater      <input type='number' name='10marks' min='0' max='100'><br><br><br>"
				
			+"XII Board Percentage  : <input type='radio' name='xiimarks1' value='Less'/>Less"
			+"<input type='radio' name='xiimarks1' value='Equal'/>Equal"
			+"<input type='radio' name='xiimarks1' value='Greater'/>Greater      <input type='number' name='12marks' min='0' max='100'><br><br><br>"

			+"Graduation Percentage  : <input type='radio' name='gradmarks1' value='Less'/>Less"
			+"<input type='radio' name='gradmarks1' value='Equal'/>Equal"
			+"<input type='radio' name='gradmarks1' value='Greater'/>Greater      <input type='number' name='gradmarks' min='0' max='100'><br><br><br>"

	
			+"Post Graduation Percentage  : <input type='radio' name='postgradmarks1' value='Less'/>Less"
			+"<input type='radio' name='postgradmarks1' value='Equal'/>Equal"
			+"<input type='radio' name='postgradmarks1' value='Greater'/>Greater      <input type='number' name='postgradmarks' min='0' max='100'><br><br><br>"

	
			+"Gate Percentage  : <input type='radio' name='gatemarks1' value='Less'/>Less"
			+"<input type='radio' name='gatemarks1' value='Equal'/>Equal"
			+"<input type='radio' name='gatemarks1' value='Greater'/>Greater  <input type='number' name='gatescore' min='0' max='1000'><br><br>"

			+"<br><br><h2>Submit</h2>"
   			
			+"<hr>"
   			
			+"Applications Dated From <input type='date' name='appdatefrom'><br><br>"
			+"Applications Dated Upto <input type='date' name='appdateupto'><br>"
   			
   		    +"<br><br><input type='submit' value='Submit'/>"
   		    +"<br><br></form>"  				
			
   			+"</body>"
   			+"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		
		File myFoo = new File("C:/Users/Siddharth/Documents/workspace2/AP_Project/src/feedback.txt");
		BufferedReader br = new BufferedReader(new FileReader(myFoo));
		    String line;
		    String delimiters = "#";

		    while ((line = br.readLine()) != null) 
		    {
		    	int catc = 1;
		       // process the line.
		    	String[] tokensVal = line.split(delimiters);
			/*	   System.out.println("\ntoken[0] : "+tokensVal[0]);
				   System.out.println("\ntoken[1] : "+tokensVal[1]);
				   System.out.println("\ntoken[2] : "+tokensVal[2]);
				   System.out.println("\ntoken[3] : "+tokensVal[3]);
				   System.out.println("\ntoken[4] : "+tokensVal[4]);
				   System.out.println("\ntoken[5] : "+tokensVal[5]);
				   System.out.println("\ntoken[6] : "+tokensVal[6]);
				   System.out.println("\ntoken[7] : "+tokensVal[7]);
				   System.out.println("\ntoken[8] : "+tokensVal[8]);
				   System.out.println("\ntoken[9] : "+tokensVal[9]);
				   System.out.println("\ntoken[10] : "+tokensVal[10]);
				   System.out.println("\ntoken[11] : "+tokensVal[11]);
				   System.out.println("\ntoken[12] : "+tokensVal[12]);
				   System.out.println("\ntoken[13] : "+tokensVal[13]);
				   System.out.println("\ntoken[14] : "+tokensVal[14]);
		    */
		    	//
		    	//System.out.println("Hi11");	 
		    	if(request.getParameter("Name")!="")
		    	{
		    		//System.out.println("Hi22");	    		
		    		if(!request.getParameter("Name").equals(tokensVal[1]))
		    		{
		    			catc=0;
		    			System.out.println("Name Not Match");
		    			//System.out.println("token[1] : "+tokensVal[1]+"    adminName :"+request.getParameter("Name"));
		    		}
		    	}
		    	
		    	if(request.getParameter("Email")!="")
		    	{
		    		if(!request.getParameter("Email").equals(tokensVal[0]))
		    		{
		    			catc=0;
		    			System.out.println("Email Not Match");
    				}
		    	}
		    	if(request.getParameter("enroll")!="")
		    	{
		    		if(!request.getParameter("enroll").equals(tokensVal[2]))
		    		{
		    			catc=0;
		    			System.out.println("Enroll Not Match");
    				}
		    	}
		    	if(request.getParameter("gender")!=null)
		    	{
		    		
		    		if(!request.getParameter("gender").equals(tokensVal[4]))
		    		{
		    			catc=0;
		    			System.out.println("Gender Not Match");
    				}
		    	}
		    	if(request.getParameter("cat")!=null)
		    	{
		    		if(!request.getParameter("cat").equals(tokensVal[3]))
		    		{
		    			catc=0;
		    			System.out.println("Category Not Match");
    				}
		    	}
		    	if(request.getParameter("p_disabled")!=null)
		    	{
		    		if(!request.getParameter("p_disabled").equals(tokensVal[5]))
		    		{
		    			catc=0;
		    			System.out.println("Disabled Not Match");
    				}
		    	}
		    	
		    	
		    	if(request.getParameter("dobl")!=null)
		    	{
		    		if(request.getParameter("dobl").equals("Before"))
		    		{
		    			System.out.println("Before");
		    			if(request.getParameter("dob")=="")
		    			{
		    				System.out.println("No DOB Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(dob) :"+request.getParameter("dob"));
		    				System.out.println("tokensVal[6]"+tokensVal[6]);
		    				System.out.println((request.getParameter("dob").compareTo(tokensVal[6])));
		    				
		    				if((request.getParameter("dob").compareTo(tokensVal[6]))<=0)
			    			{	
		    					catc=0;
			    				System.out.println("Dob Not Match(Before)");
			    			}
		    				else
		    					System.out.println("DOB Match");
		    			}
		    		}
		    		
		    		if(request.getParameter("dobl").equals("After"))
		    		{
		    			System.out.println("After");
		    			if(request.getParameter("dob")=="")
		    			{
		    				System.out.println("No DOB Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(dob) :"+request.getParameter("dob"));
		    				System.out.println("tokensVal[6]"+tokensVal[6]);
		    				System.out.println((request.getParameter("dob").compareTo(tokensVal[6])));
		    				
		    				if((request.getParameter("dob").compareTo(tokensVal[6]))>=0)
			    			{	
		    					catc=0;
			    				System.out.println("Dob Not Match(After)");
			    			}
		    				else
		    					System.out.println("DOB Match");
		    			}
		    		}
		    		if(request.getParameter("dobl").equals("On"))
		    		{
		    			System.out.println("On");
		    			if(request.getParameter("dob")=="")
		    			{
		    				System.out.println("No DOB Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(dob) :"+request.getParameter("dob"));
		    				System.out.println("tokensVal[6]"+tokensVal[6]);
		    				System.out.println((request.getParameter("dob").compareTo(tokensVal[6])));
		    				
		    				if((request.getParameter("dob").compareTo(tokensVal[6]))!=0)
			    			{	
		    					catc=0;
			    				System.out.println("Dob Not Match(After)");
			    			}
		    				else
		    					System.out.println("DOB Match");
		    			}
		    		}
		    	}
		    	
		    	if(request.getParameter("phdstream")!="")
		    	{
		    		if(!request.getParameter("phdstream").equals(tokensVal[7]))
		    		{
		    			catc=0;
		    			System.out.println("PhdStream Not Match");
    				}
		    	}
		    	
		    	if(request.getParameter("Graduation_Degree")!="")
		    	{
		    		if(!request.getParameter("Graduation_Degree").equals(tokensVal[8]))
		    		{
		    			catc=0;
		    			System.out.println("Grad Degree Not Match");
    				}
		    	}
		    	
		    	if(request.getParameter("Post_Graduation_Degree")!="")
		    	{
		    		if(!request.getParameter("Post_Graduation_Degree").equals(tokensVal[9]))
		    		{
		    			catc=0;
		    			System.out.println("post Grad Degree Not Match");
    				}
		    	}
		    	if(request.getParameter("10board")!="")
		    	{
		    		if(!request.getParameter("10board").equals(tokensVal[10]))
		    		{
		    			catc=0;
		    			System.out.println("10board Not Match");
    				}
		    	}
		    	if(request.getParameter("12board")!="")
		    	{
		    		if(!request.getParameter("12board").equals(tokensVal[11]))
		    		{
		    			catc=0;
		    			System.out.println("12board Not Match");
    				}
		    	}
		    	if(request.getParameter("graddept")!="")
		    	{
		    		if(!request.getParameter("graddept").equals(tokensVal[12]))
		    		{
		    			catc=0;
		    			System.out.println("graddept Not Match");
    				}
		    	}
		    	if(request.getParameter("postgraddept")!="")
		    	{
		    		if(!request.getParameter("postgraddept").equals(tokensVal[13]))
		    		{
		    			catc=0;
		    			System.out.println("postgraddept Not Match");
    				}
		    	}
		    	if(request.getParameter("gradUniv")!="")
		    	{
		    		if(!request.getParameter("gradUniv").equals(tokensVal[14]))
		    		{
		    			catc=0;
		    			System.out.println("gradUniv Not Match");
    				}
		    	}
		    	if(request.getParameter("postgradUniv")!=null)
		    	{
//		    		System.out.println("request.getParameter(postgradUniv) :"+request.getParameter("postgradUniv"));
//		    		System.out.println("tokensVal[15] :"+tokensVal[15]);
//		    		System.out.println("request.getParameter(postgradUniv).equals(tokensVal[15]) :"+request.getParameter("postgradUniv").equals(tokensVal[15]));
		    		if(!request.getParameter("postgradUniv").equals(tokensVal[15]))
		    		{
		    			catc=0;
		    			System.out.println("postgradUniv Not Match");
    				}
		    	}
		    	if(request.getParameter("gradstat")!="")
		    	{
		    		if(!request.getParameter("gradstat").equals(tokensVal[16]))
		    		{
		    			catc=0;
		    			System.out.println("gradstat Not Match");
    				}
		    	}
		    	if(request.getParameter("postgradstat")!="")
		    	{
		    		if(!request.getParameter("postgradstat").equals(tokensVal[17]))
		    		{
		    			catc=0;
		    			System.out.println("postgradstat Not Match");
    				}
		    	}   
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	if(request.getParameter("xmarks1")!=null)
		    	{
		    		if(request.getParameter("xmarks1").equals("Less"))
		    		{
		    			System.out.println("Less");
		    			if(request.getParameter("10marks")=="")
		    			{
		    				System.out.println("No 10marks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(10marks) :"+request.getParameter("10marks"));
		    				System.out.println("tokensVal[18]"+tokensVal[18]);
		    				System.out.println((request.getParameter("10marks").compareTo(tokensVal[18])));
		    				
		    				if((request.getParameter("10marks").compareTo(tokensVal[18]))<=0)
			    			{	
		    					catc=0;
			    				System.out.println("10marks Not Match");
			    			}
		    				else
		    					System.out.println("10marks Match");
		    			}
		    		}
		    		
		    		if(request.getParameter("xmarks1").equals("Greater"))
		    		{
		    			System.out.println("Greater");
		    			if(request.getParameter("10marks")=="")
		    			{
		    				System.out.println("No 10marks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(10marks) :"+request.getParameter("10marks"));
		    				System.out.println("tokensVal[18]"+tokensVal[18]);
		    				System.out.println((request.getParameter("10marks").compareTo(tokensVal[18])));
		    				
		    				if((request.getParameter("10marks").compareTo(tokensVal[18]))>=0)
			    			{	
		    					catc=0;
			    				System.out.println("10marks Not Match");
			    			}
		    				else
		    					System.out.println("10marks Match");
		    			}
		    		}
		    		if(request.getParameter("xmarks1").equals("Equal"))
		    		{
		    			System.out.println("Equal");
		    			if(request.getParameter("10marks")=="")
		    			{
		    				System.out.println("No 10marks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(10marks) :"+request.getParameter("10marks"));
		    				System.out.println("tokensVal[18]"+tokensVal[18]);
		    				System.out.println((request.getParameter("10marks").compareTo(tokensVal[18])));
		    				
		    				if((request.getParameter("10marks").compareTo(tokensVal[18]))!=0)
			    			{	
		    					catc=0;
			    				System.out.println("10marks Not Match");
			    			}
		    				else
		    					System.out.println("10marks Match");
		    			}
		    		}
		    	}
		    	
		    	
		    	
		    	
		    	
		    	
		    	if(request.getParameter("xiimarks1")!=null)
		    	{
		    		if(request.getParameter("xiimarks1").equals("Less"))
		    		{
		    			System.out.println("Less");
		    			if(request.getParameter("12marks")=="")
		    			{
		    				System.out.println("No 12marks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(12marks) :"+request.getParameter("12marks"));
		    				System.out.println("tokensVal[19]"+tokensVal[19]);
		    				System.out.println((request.getParameter("12marks").compareTo(tokensVal[19])));
		    				
		    				if((request.getParameter("12marks").compareTo(tokensVal[19]))<=0)
			    			{	
		    					catc=0;
			    				System.out.println("12marks Not Match");
			    			}
		    				else
		    					System.out.println("12marks Match");
		    			}
		    		}
		    		
		    		if(request.getParameter("xiimarks1").equals("Greater"))
		    		{
		    			System.out.println("Greater");
		    			if(request.getParameter("12marks")=="")
		    			{
		    				System.out.println("No 12marks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(12marks) :"+request.getParameter("12marks"));
		    				System.out.println("tokensVal[19]"+tokensVal[19]);
		    				System.out.println((request.getParameter("12marks").compareTo(tokensVal[19])));
		    				
		    				if((request.getParameter("12marks").compareTo(tokensVal[19]))>=0)
			    			{	
		    					catc=0;
			    				System.out.println("12marks Not Match");
			    			}
		    				else
		    					System.out.println("12marks Match");
		    			}
		    		}
		    		if(request.getParameter("xiimarks1").equals("Equal"))
		    		{
		    			System.out.println("Equal");
		    			if(request.getParameter("12marks")=="")
		    			{
		    				System.out.println("No 12marks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(12marks) :"+request.getParameter("12marks"));
		    				System.out.println("tokensVal[19]"+tokensVal[19]);
		    				System.out.println((request.getParameter("12marks").compareTo(tokensVal[19])));
		    				
		    				if((request.getParameter("12marks").compareTo(tokensVal[19]))!=0)
			    			{	
		    					catc=0;
			    				System.out.println("12marks Not Match");
			    			}
		    				else
		    					System.out.println("12marks Match");
		    			}
		    		}
		    	}
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	if(request.getParameter("gradmarks1")!=null)
		    	{
		    		if(request.getParameter("gradmarks1").equals("Less"))
		    		{
		    			System.out.println("Less");
		    			if(request.getParameter("gradmarks")=="")
		    			{
		    				System.out.println("No gradmarks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(gradmarks) :"+request.getParameter("gradmarks"));
		    				System.out.println("tokensVal[20]"+tokensVal[20]);
		    				System.out.println((request.getParameter("gradmarks").compareTo(tokensVal[20])));
		    				
		    				if((request.getParameter("gradmarks").compareTo(tokensVal[20]))<=0)
			    			{	
		    					catc=0;
			    				System.out.println("gradmarks Not Match");
			    			}
		    				else
		    					System.out.println("gradmarks Match");
		    			}
		    		}
		    		
		    		if(request.getParameter("gradmarks1").equals("Greater"))
		    		{
		    			System.out.println("Greater");
		    			if(request.getParameter("gradmarks")=="")
		    			{
		    				System.out.println("No gradmarks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(gradmarks) :"+request.getParameter("gradmarks"));
		    				System.out.println("tokensVal[20]"+tokensVal[20]);
		    				System.out.println((request.getParameter("gradmarks").compareTo(tokensVal[20])));
		    				
		    				if((request.getParameter("gradmarks").compareTo(tokensVal[20]))>=0)
			    			{	
		    					catc=0;
			    				System.out.println("gradmarks Not Match");
			    			}
		    				else
		    					System.out.println("gradmarks Match");
		    			}
		    		}
		    		if(request.getParameter("gradmarks1").equals("Equal"))
		    		{
		    			System.out.println("Equal");
		    			if(request.getParameter("gradmarks")=="")
		    			{
		    				System.out.println("No gradmarks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(gradmarks) :"+request.getParameter("gradmarks"));
		    				System.out.println("tokensVal[20]"+tokensVal[20]);
		    				System.out.println((request.getParameter("gradmarks").compareTo(tokensVal[20])));
		    				
		    				if((request.getParameter("gradmarks").compareTo(tokensVal[20]))!=0)
			    			{	
		    					catc=0;
			    				System.out.println("gradmarks Not Match");
			    			}
		    				else
		    					System.out.println("gradmarks Match");
		    			}
		    		}
		    	}
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	if(request.getParameter("postgradmarks1")!=null)
		    	{
		    		if(request.getParameter("postgradmarks1").equals("Less"))
		    		{
		    			System.out.println("Less");
		    			if(request.getParameter("postgradmarks")=="")
		    			{
		    				System.out.println("No postgradmarks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(postgradmarks) :"+request.getParameter("postgradmarks"));
		    				System.out.println("tokensVal[21]"+tokensVal[21]);
		    				System.out.println((request.getParameter("postgradmarks").compareTo(tokensVal[21])));
		    				
		    				if((request.getParameter("postgradmarks").compareTo(tokensVal[21]))<=0)
			    			{	
		    					catc=0;
			    				System.out.println("postgradmarks Not Match");
			    			}
		    				else
		    					System.out.println("postgradmarks Match");
		    			}
		    		}
		    		
		    		if(request.getParameter("postgradmarks1").equals("Greater"))
		    		{
		    			System.out.println("Greater");
		    			if(request.getParameter("postgradmarks")=="")
		    			{
		    				System.out.println("No postgradmarks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(postgradmarks) :"+request.getParameter("postgradmarks"));
		    				System.out.println("tokensVal[21]"+tokensVal[21]);
		    				System.out.println((request.getParameter("postgradmarks").compareTo(tokensVal[21])));
		    				
		    				if((request.getParameter("postgradmarks").compareTo(tokensVal[21]))>=0)
			    			{	
		    					catc=0;
			    				System.out.println("postgradmarks Not Match");
			    			}
		    				else
		    					System.out.println("postgradmarks Match");
		    			}
		    		}
		    		if(request.getParameter("postgradmarks1").equals("Equal"))
		    		{
		    			System.out.println("Equal");
		    			if(request.getParameter("postgradmarks")=="")
		    			{
		    				System.out.println("No postgradmarks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(postgradmarks) :"+request.getParameter("postgradmarks"));
		    				System.out.println("tokensVal[21]"+tokensVal[21]);
		    				System.out.println((request.getParameter("postgradmarks").compareTo(tokensVal[21])));
		    				
		    				if((request.getParameter("postgradmarks").compareTo(tokensVal[21]))!=0)
			    			{	
		    					catc=0;
			    				System.out.println("postgradmarks Not Match");
			    			}
		    				else
		    					System.out.println("postgradmarks Match");
		    			}
		    		}
		    	}
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	if(request.getParameter("gatemarks1")!=null)
		    	{
		    		if(request.getParameter("gatemarks1").equals("Less"))
		    		{
		    			System.out.println("Less");
		    			if(request.getParameter("gatescore")=="")
		    			{
		    				System.out.println("No gatemarks Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(gatescore) :"+request.getParameter("gatescore"));
		    				System.out.println("tokensVal[22]"+tokensVal[22]);
		    				System.out.println((request.getParameter("gatescore").compareTo(tokensVal[22])));
		    				
		    				if((request.getParameter("gatescore").compareTo(tokensVal[22]))<=0)
			    			{	
		    					catc=0;
			    				System.out.println("gatescore Not Match");
			    			}
		    				else
		    					System.out.println("gatescore Match");
		    			}
		    		}
		    		
		    		if(request.getParameter("gatemarks1").equals("Greater"))
		    		{
		    			System.out.println("Greater");
		    			if(request.getParameter("gatescore")=="")
		    			{
		    				System.out.println("No gatescore Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(gatescore) :"+request.getParameter("gatescore"));
		    				System.out.println("tokensVal[22]"+tokensVal[22]);
		    				System.out.println((request.getParameter("gatescore").compareTo(tokensVal[22])));
		    				
		    				if((request.getParameter("gatescore").compareTo(tokensVal[22]))>=0)
			    			{	
		    					catc=0;
			    				System.out.println("gatescore Not Match");
			    			}
		    				else
		    					System.out.println("gatescore Match");
		    			}
		    		}
		    		if(request.getParameter("gatemarks1").equals("Equal"))
		    		{
		    			System.out.println("Equal");
		    			if(request.getParameter("gatescore")=="")
		    			{
		    				System.out.println("No gatescore Entered");
		    			}
		    			else
		    			{
		    				System.out.println("request.getParameter(gatescore) :"+request.getParameter("gatescore"));
		    				System.out.println("tokensVal[22]"+tokensVal[22]);
		    				System.out.println((request.getParameter("gatescore").compareTo(tokensVal[22])));
		    				
		    				if((request.getParameter("gatescore").compareTo(tokensVal[22]))!=0)
			    			{	
		    					catc=0;
			    				System.out.println("gatescore Not Match");
			    			}
		    				else
		    					System.out.println("gatescore Match");
		    			}
		    		}
		    	}
		    	
		    	
		    	
		    	if(request.getParameter("appdatefrom")!="")
		    	{
		    		if((request.getParameter("appdatefrom").compareTo(tokensVal[23]))>0)
	    			{	
						catc=0;
	    				System.out.println("Date Not Match(After)");
	    			}
					else
						System.out.println("Date Match");
		    	}
		    	
		    	if(request.getParameter("appdateupto")!="")
		    	{
		    		if((request.getParameter("appdateupto").compareTo(tokensVal[23]))<0)
	    			{	
						catc=0;
	    				System.out.println("Date Not Match Before");
	    			}
					else
						System.out.println("Date Match");
		    	}
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	System.out.println("Finally catc = "+catc);
		    	
		    	if(catc==1)
		    	{	
		    		PrintWriter outid = response.getWriter();  
		       		outid.println("<!DOCTYPE html>"
		       				
		       				+"<head>"+"</head>"
		    			+"<body>"
		    			+"<table style='width:100%' border='1'>"
		    			  +"<tr>"
		       			    +"<td>"+tokensVal[1]+"</td>"
		       			    +"<td>"+tokensVal[2]+"</td>" 
		       			    +"<td><a href='C:/Users/Siddharth/Documents/workspace2/AP_Project/src/Data/"+tokensVal[2]+".txt' target='_blank'>Link to Data</a></td>"
		       			  +"</tr>"
		       			+"</table>");
		    			
		    		System.out.println(line);
		    	
		    	}
		    	
		    }
		    
		    br.close();
		
		
	}//EO doPost

}
