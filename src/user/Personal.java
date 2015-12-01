package user;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Personal
 */
@WebServlet("/Personal")
public class Personal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Personal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
		//HttpSession sess = request.getSession(true);
		
		int roll = 0;
    	File myF = new File("C:/Users/Siddharth/Documents/workspace2/AP_Project/src/Roll.txt");//SPECIFY FILE PATH
    	
    	FileInputStream fis = new FileInputStream(myF);
    	 
    	//Construct BufferedReader from InputStreamReader
    	BufferedReader br = new BufferedReader(new InputStreamReader(fis));
     
    	String line = null;
    	while ((line = br.readLine()) != null) {
    		roll = Integer.parseInt(line);
    	}
    	
    	br.close();
    	
    	
    	//System.out.println(roll);
    	
   		String s1,s2;
   		
   		s1 = ("PhD2015" + Integer.toString(roll));
    	
    	
   		roll+=1;
   		
   		s2 = Integer.toString(roll);
    	
   		//System.out.println(roll);
   		FileWriter fooW = new FileWriter(myF, false); 
   		fooW.write(s2);
    	
   		fooW.close();
    	
    	
   		//personalEnroll.setText(s1);
   	

		
   		
   		PrintWriter outid = response.getWriter();  
   		outid.println("<!DOCTYPE html>"
   				
   				+"<head>"
   				+"<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>"
   				
   				+"<title>Personal Details</title>"
   				
   			 

+"<script language='javascript'>"
	
+"function onChange(campus){"
+" var dropdown = document.getElementById('dropDown');"
+" var dropdown1 = document.getElementById('dropDown1');"

+"switch (campus.value){"
+" case 'Computer Science':{"
      +"  dropdown.options.length = 0;"
      // +" dropdown.options[dropdown.options.length] = new Option('Select','0');"
       
      
      
      +"dropdown.options[dropdown.options.length] = new Option('Computer Architecture and Systems Design - CSE','Computer Architecture and Systems Design - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Computer Graphics - CSE','Computer Graphics - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Computer Vision - CSE','Computer Vision - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Image Analysis and Biometrics - CSE','Image Analysis and Biometrics - CSE');"
       +"dropdown.options[dropdown.options.length] = new Option('Information Management and Data Engineering - CSE','Information Management and Data Engineering - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Machine Learning - CSE','Machine Learning - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Massively Parallel Systems - CSE','Massively Parallel Systems - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Mobile Computing and Networking Applications - CSE','Mobile Computing and Networking Applications - CSE');"
       +"dropdown.options[dropdown.options.length] = new Option('Program Analysis - CSE','Program Analysis - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Security and Privacy - CSE','Security and Privacy - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Signal and Image Processing - CSE','Signal and Image Processing - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Software Engineering - CSE','Software Engineering - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Wireless Networks - CSE','Wireless Networks - CSE');"
       +" dropdown.options[dropdown.options.length] = new Option('Theoretical Computer Science - CSE','Theoretical Computer Science - CSE');"
      
       
		+"  dropdown1.options.length = 0;"
		// +" dropdown.options[dropdown.options.length] = new Option('Select','0');"
		+"dropdown1.options[dropdown1.options.length] = new Option('Computer Architecture and Systems Design - CSE','Computer Architecture and Systems Design - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Computer Graphics - CSE','Computer Graphics - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Computer Vision - CSE','Computer Vision - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Image Analysis and Biometrics - CSE','Image Analysis and Biometrics - CSE');"
	       +"dropdown1.options[dropdown1.options.length] = new Option('Information Management and Data Engineering - CSE','Information Management and Data Engineering - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Machine Learning - CSE','Machine Learning - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Massively Parallel Systems - CSE','Massively Parallel Systems - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Mobile Computing and Networking Applications - CSE','Mobile Computing and Networking Applications - CSE');"
	       +"dropdown1.options[dropdown1.options.length] = new Option('Program Analysis - CSE','Program Analysis - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Security and Privacy - CSE','Security and Privacy - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Signal and Image Processing - CSE','Signal and Image Processing - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Software Engineering - CSE','Software Engineering - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Wireless Networks - CSE','Wireless Networks - CSE');"
	       +" dropdown1.options[dropdown1.options.length] = new Option('Theoretical Computer Science - CSE','Theoretical Computer Science - CSE');"
	      
       
       
       
       +" break;"
       +"}"
       +" case 'Electronics and Communication':{"
          +"  dropdown.options.length = 0;"
          
          
          
          
          
          
          // +" dropdown.options[dropdown.options.length] = new Option('Select','0');"
            +"dropdown.options[dropdown.options.length] = new Option('Computer Architecture and Systems Design - ECE','Computer Architecture and Systems Design - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Control and Robotics - ECE','Control and Robotics - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Digital and Analog VLSI Systems Design - ECE','Digital and Analog VLSI Systems Design - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Electromagnetics - ECE','Electromagnetics - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Embedded and VLSI Systems Design - ECE','Embedded and VLSI Systems Design - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Embedded Systems - ECE','Embedded Systems - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Fiber-Wireless Architectures - ECE','Fiber-Wireless Architectures - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Machine Learning - ECE','Machine Learning - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('OFDM based Optical Access Networks - ECE','OFDM based Optical Access Networks - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Optical Wireless Communication Systems - ECE','Optical Wireless Communication Systems - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('RF and Mixed Signal Electronics - ECE','RF and Mixed Signal Electronics - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Signal and Image Processing - ECE','Signal and Image Processing - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Wireless Communication - ECE','Wireless Communication - ECE');"
           +" dropdown.options[dropdown.options.length] = new Option('Wireless Networks - ECE','Wireless Networks - ECE');"
           
           
			           
			+"  dropdown1.options.length = 0;"
			// +" dropdown.options[dropdown.options.length] = new Option('Select','0');"
			 +"dropdown1.options[dropdown1.options.length] = new Option('Computer Architecture and Systems Design - ECE','Computer Architecture and Systems Design - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Control and Robotics - ECE','Control and Robotics - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Digital and Analog VLSI Systems Design - ECE','Digital and Analog VLSI Systems Design - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Electromagnetics - ECE','Electromagnetics - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Embedded and VLSI Systems Design - ECE','Embedded and VLSI Systems Design - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Embedded Systems - ECE','Embedded Systems - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Fiber-Wireless Architectures - ECE','Fiber-Wireless Architectures - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Machine Learning - ECE','Machine Learning - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('OFDM based Optical Access Networks - ECE','OFDM based Optical Access Networks - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Optical Wireless Communication Systems - ECE','Optical Wireless Communication Systems - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('RF and Mixed Signal Electronics - ECE','RF and Mixed Signal Electronics - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Signal and Image Processing - ECE','Signal and Image Processing - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Wireless Communication - ECE','Wireless Communication - ECE');"
	           +" dropdown1.options[dropdown1.options.length] = new Option('Wireless Networks - ECE','Wireless Networks - ECE');"
	                      
           
           
           
           
           
           
           
           
           
           
           
           +" break;"
           +"}"
           +" case 'Computational Biology':{"
           +"  dropdown.options.length = 0;"
            //+" dropdown.options[dropdown.options.length] = new Option('Select','0');"
            +"dropdown.options[dropdown.options.length] = new Option('Biophysics - CB','Biophysics - CB');"
			+" dropdown.options[dropdown.options.length] = new Option('Structural Biology - CB','Structural Biology - CB');"
			+" dropdown.options[dropdown.options.length] = new Option('Systems Biology - CB','Systems Biology - CB');"
			
            
            
            
			+"  dropdown1.options.length = 0;"
			//+" dropdown.options[dropdown.options.length] = new Option('Select','0');"
			 +"dropdown1.options[dropdown1.options.length] = new Option('Biophysics - CB','Biophysics - CB');"
			+" dropdown1.options[dropdown1.options.length] = new Option('Structural Biology - CB','Structural Biology - CB');"
			+" dropdown1.options[dropdown1.options.length] = new Option('Systems Biology - CB','Systems Biology - CB');"
			
			            
            
            
            
            
            
            +" break;"
            +"}"
       
      +"}"
      
      
     
     
     
     
     
     
     
     
     
     
     
     
     
     +" }"
+"</script>"
			

   				
   				
   				
   				+"</head>"
   				+"<body>"
   				+"<form action='Personal' method=\"post\">"
   				
   				+"<h2>Personal Info</h2>"
   				
   				
   				+"<hr>"
   				+"<br><br>Name* :<input type='text' name='Name'   required pattern='[a-zA-Z\\s]+'  required/><br><br>"  
   				
   				+"Mobile* :<input type='tel' pattern='[0-9]{10,10}' class='search' name='number'  autocomplete='off'  maxlength='10' required><br><br>"
   				
   				+"Address* :<input type='text' name='Add' required/><br><br>"
   				
   				+"Email* :<input type='email' name='Email' required/><br><br>"
   						
   				+"Enrollment No:<br><br><input type='text' name ='enroll' value="+s1+" class='field left' readonly><br><br>"
   				/*"PhD Stream *:<input type='radio' name='color' value='Computer Science' required='required' />Computer Science<br><br>"
   				+"<input type='radio' name='color' value='Electronics and Communication' required='required' />Electronics and Communication<br><br>"
   				+"<input type='radio' name='color' value='Computational Biology' required='required' />Computational Biology<br><br>"
   				 */
   		
				+"PhD Stream *:<br><input type='radio' value='Computer Science' name='campus' required value='1' onclick='onChange(this)'/>Computer Science<br>"
				//+"<label for='radIn'>Computer Science</label>"
				+"<br/>"
				
					+"<input type='radio' value='Electronics and Communication' name='campus' onclick='onChange(this)'/>Electronics and Communication<br><br>"
				  +"<input type='radio' value='Computational Biology' name='campus' onclick='onChange(this)'/>Computational Biology<br>"
				//+"id='radOut'/>"
				//+"<label for='radOut'>Out Campus</label>"
				+"<br>"
				+"PhD Area Preference 1* : <select id='dropDown' name='ppref1' required = '1'></select><br><br>"
   				+"PhD Area Preference 2* : <select id='dropDown1' name='ppref2' required = '1'></select><br><br>"
   		

      	   		
   				+"Gender *:<br><input type='radio' name='gender' value='Male' required='required' />Male<br>"
   				+"<input type='radio' name='gender' value='Female' required='required' />Female<br><br>"
			
			
				+"Category *:<br><input type='radio' name='category' value='General' required='required' />General<br>"
				+"<input type='radio' name='category' value='SC' required='required' />SC<br>"
				+"<input type='radio' name='category' value='ST' required='required' />ST<br>"
				+"<input type='radio' name='category' value='OBC' required='required' />OBC<br><br>"
		   		
   				
				+"Physically Disabled *:<br><input type='radio' name='p_disabled' value='Yes' required='required' />Yes<br>"
				+"<input type='radio' name='p_disabled' value='No' required='required' />No<br><br>"

   				+"Date of Birth  :<br><input type='date' name='dob' min='1950-12-01' max='2000-01-01' required><br>"
   		
   		
				+"<br>Father's Name *:  <input type='text' name='FName'   required pattern='[a-zA-Z\\s]+'  required/><br><br>"
		
				+"Children/War widow of Defence Personnel Killed/Disabled in Action *:<br><input type='radio' name='war' value='Yes' required='required' />Yes<br>"
				+"<input type='radio' name='war' value='No' required='required' />No<br><br>"

				
					
				+"Pincode :  <input type='number' name='pincode' min='000001' max='999999'><br><br>"
   		
   		
   				+"Nationality *:    <select name ='nationality' name='country' required='required'>"
   				+"<option value='Afghanistan'>Afghanistan</option>"
   				+"<option value='Albania'>Albania</option>"
   				    			+"<option value='Algeria'>Algeria</option>"
   				    			+"<option value='Andorra'>Andorra</option>"
   				    			+"<option value='Angola'>Angola</option>"
   				    			+"<option value='Antigua and Barbuda'>Antigua and Barbuda</option>"
   				    			+"<option value='Argentina'>Argentina</option>"
   				    			+"<option value='Armenia'>Armenia</option>"
   				    			+"<option value='Aruba'>Aruba</option>"
   				    			+"<option value='Australia'>Australia</option>"
   				    			+"<option value='Austria'>Austria</option>"
   				    			+"<option value='Azerbaijan'>Azerbaijan</option>"
   				    			+"<option value='Bahamas'>Bahamas</option>"
   				    			+"<option value='Bahrain'>Bahrain</option>"
   				    			+"<option value='Bangladesh'>Bangladesh</option>"
   				    			+"<option value='Barbados'>Barbados</option>"
   				    			+"<option value='Belarus'>Belarus</option>"
   				    			+"<option value='Belgium'>Belgium</option>"
   				    			+"<option value='Belize'>Belize</option>"
   				    			+"<option value='Benin'>Benin</option>"
   				    			+"<option value='Bhutan'>Bhutan</option>"
   				    			+"<option value='Bolivia'>Bolivia</option>"
   				    			+"<option value='Bosnia and Herzegovina'>Bosnia and Herzegovina</option>"
   				    			+"<option value='Botswana'>Botswana</option>"
   				    			+"<option value='Brazil'>Brazil</option>"
   				    			+"<option value='Brunei'>Brunei</option>"
   				    			+"<option value='Bulgaria'>Bulgaria</option>"
   				    			+"<option value='Burkina Faso'>Burkina Faso</option>"
   				    			+"<option value='Burma'>Burma</option>"
   				    			+"<option value='Burundi'>Burundi</option>"
   				    			+"<option value='Fiji'>Fiji</option>"
   				    			+"<option value='Finland'>Finland</option>"
   				    			+"<option value='France'>France</option>"   			
   				    			+"<option value='Germany'>Germany</option>"
   				    			+"<option value='Ghana'>Ghana</option>"
   				    			+"<option value='Greece'>Greece</option>"
   				    			+"<option value='Hong Kong'>Hong Kong</option>"
   				    			+"<option value='Hungary'>Hungary</option>"
   				    			+"<option value='Iceland'>Iceland</option>"
   				    			+"<option value='India'>India</option>"
   				    			+"<option value='Indonesia'>Indonesia</option>"
   				    			+"<option value='Iran'>Iran</option>"
   				    			+"<option value='Iraq'>Iraq</option>"
   				    			+"<option value='Italy'>Italy</option>"
   				    			+"<option value='Jamaica'>Jamaica</option>"
   				    			+"<option value='Japan'>Japan</option>"
   								+"<option value='Nepal'>Nepal</option>"
   				    			+"<option value='Netherlands'>Netherlands</option>"
   				    			+"<option value='Pakistan'>Pakistan</option>"
   				    			+"<option value='Poland'>Poland</option>"
   				    			+"<option value='Portugal'>Portugal</option>"
   				    			+"<option value='Qatar'>Qatar</option>"
   				    			+"<option value='Romania'>Romania</option>"
   				    			+"<option value='Russia'>Russia</option>"
   				    			+"<option value='Singapore'>Singapore</option>"
   				    			+"<option value='South Africa'>South Africa</option>"
   				    			+"<option value='Spain'>Spain</option>"
   				    			+"<option value='Sri Lanka'>Sri Lanka</option>"
   				    			+"<option value='Sweden'>Sweden</option>"
   				    			+"<option value='Switzerland'>Switzerland</option>"
   				    			+"<option value='Syria'>Syria</option>"
   				    			+"<option value='Taiwan'>Taiwan</option>"
   				    			+"<option value='Thailand'>Thailand</option>"
   				    			+"<option value='Turkey'>Turkey</option>"
   				    			+"<option value='Turkmenistan'>Turkmenistan</option>"
   				    			+"<option value='Tuvalu'>Tuvalu</option>"
   				    			+"<option value='Uganda'>Uganda</option>"
   				    			+"<option value='Ukraine'>Ukraine</option>"
   				    			+"<option value='United Arab Emirates'>United Arab Emirates</option>"
   				    			+"<option value='United Kingdom'>United Kingdom</option>"
   				    			+"<option value='Uruguay'>Uruguay</option>"
   				    			+"<option value='Uzbekistan'>Uzbekistan</option>"
   				    			+"<option value='Venezuela'>Venezuela</option>"
   				    			+"<option value='Vietnam'>Vietnam</option>"
   				    			+"<option value='Yemen'>Yemen</option>"
   				    			+"<option value='Zambia'>Zambia</option>"
   				    			+"<option value='Zimbabwe'>Zimbabwe</option>"
				  +"</select>"
				
				+"<h2>Educational Info</h2>"
   				
   				
   				+"<hr>"
   							
				  
   		+"<br><br>Xth Board *:<input type='text' name='10board'   required pattern='[a-zA-Z\\s]+'  required/><br><br>" 
   		+"Xth Marks(%) *:  <input type='number' name='10marks' min='0' max='100' required><br><br>"
   		
   		
   		
   		+"Year(of passing 10th) :    <select name ='10year' required='required'>"
   		+"<option value='2013'>2013</option>"
   		+"<option value='2012'>2012</option>"
   		+"<option value='2011'>2011</option>"
   		+"<option value='2010'>2010</option>"
   		+"<option value='2009'>2009</option>"
   		+"<option value='2008'>2008</option>"
   		+"<option value='2007'>2007</option>"
   		+"<option value='2006'>2006</option>"
   		+"<option value='2005'>2005</option>"
   		+"<option value='2004'>2004</option>"
   		+"<option value='2003'>2003</option>"
   		+"<option value='2002'>2002</option>"
   		+"<option value='2001'>2001</option>"
   		+"<option value='2000'>2000</option>"
   		+"<option value='1999'>1999</option>"
   		+"<option value='1998'>1998</option>"
   		+"<option value='1997'>1997</option>"
   		+"<option value='1996'>1996</option>"
   		+"<option value='1995'>1995</option>"
   		+"<option value='1994'>1994</option>"
   		+"<option value='1993'>1993</option>"
   		+"<option value='1992'>1992</option>"
   		+"<option value='1991'>1991</option>"
   		+"<option value='1990'>1990</option>"
   		+"<option value='1989'>1989</option>"
   		+"<option value='1988'>1988</option>"
   		+"<option value='1987'>1987</option>"
   		+"<option value='1986'>1986</option>"
   		+"<option value='1985'>1985</option>"
   		+"<option value='1984'>1984</option>"
   		+"<option value='1983'>1983</option>"
   		+"<option value='1982'>1982</option>"
   		+"<option value='1981'>1981</option>"
   		+"<option value='1980'>1980</option>"
   		+"<option value='1979'>1979</option>"
   		+"<option value='1978'>1978</option>"
   		+"<option value='1977'>1977</option>"
   		+"<option value='1976'>1976</option>"
   		+"<option value='1975'>1975</option>"
   		+"<option value='1974'>1974</option>"
   		+"<option value='1973'>1973</option>"
   		+"<option value='1972'>1972</option>"
   		+"<option value='1971'>1971</option>"
   		+"<option value='1970'>1970</option>"
   		+"<option value='1969'>1969</option>"
   		+"<option value='1968'>1968</option>"
   		+"<option value='1967'>1967</option>"
   		+"</select>"
   		
   		
   		
+"<br><br>XIIth Board *:<input type='text' name='12board'   required pattern='[a-zA-Z\\s]+'  required/><br><br>" 
	+"XIIth Marks(%) *:  <input type='number' name='12marks' min='0' max='100' required><br><br>"
	
	
	
	+"Year(of passing 12th) :    <select name ='12year' required='required'>"
	+"<option value='2013'>2013</option>"
	+"<option value='2012'>2012</option>"
	+"<option value='2011'>2011</option>"
	+"<option value='2010'>2010</option>"
	+"<option value='2009'>2010</option>"
	+"<option value='2008'>2010</option>"
	+"<option value='2007'>2007</option>"
	+"<option value='2006'>2006</option>"
	+"<option value='2005'>2005</option>"
	+"<option value='2004'>2004</option>"
	+"<option value='2003'>2003</option>"
	+"<option value='2002'>2002</option>"
	+"<option value='2001'>2001</option>"
	+"<option value='2000'>2000</option>"
	+"<option value='1999'>1999</option>"
	+"<option value='1998'>1998</option>"
	+"<option value='1997'>1997</option>"
	+"<option value='1996'>1996</option>"
	+"<option value='1995'>1995</option>"
	+"<option value='1994'>1994</option>"
	+"<option value='1993'>1993</option>"
	+"<option value='1992'>1992</option>"
	+"<option value='1991'>1991</option>"
	+"<option value='1990'>1990</option>"
	+"<option value='1989'>1989</option>"
	+"<option value='1988'>1988</option>"
	+"<option value='1987'>1987</option>"
	+"<option value='1986'>1986</option>"
	+"<option value='1985'>1985</option>"
	+"<option value='1984'>1984</option>"
	+"<option value='1983'>1983</option>"
	+"<option value='1982'>1982</option>"
	+"<option value='1981'>1981</option>"
	+"<option value='1980'>1980</option>"
	+"<option value='1979'>1979</option>"
	+"<option value='1978'>1978</option>"
	+"<option value='1977'>1977</option>"
	+"<option value='1976'>1976</option>"
	+"<option value='1975'>1975</option>"
	+"<option value='1974'>1974</option>"
	+"<option value='1973'>1973</option>"
	+"<option value='1972'>1972</option>"
	+"<option value='1971'>1971</option>"
	+"<option value='1970'>1970</option>"
	+"<option value='1969'>1969</option>"
	+"<option value='1968'>1968</option>"
	+"<option value='1967'>1967</option>"
	+"</select>"
   		
	+"<br><br>Graduation Degree *:<input type='text' name='graddegree' required/><br><br>" 
	+"<br><br>Graduation Dept *:<input type='text' name='graddept'   required/><br><br>" 
	+"<br><br>Graduation College *:<input type='text' name='gradcoll'  required/><br><br>" 
	+"<br><br>Graduation University *:<input type='text' name='graduniv'  required/><br><br>" 
	+"<br><br>Graduation City *:<input type='text' name='gradcity'  required/><br><br>" 
	+"<br><br>Graduation State *:<input type='text' name='gradstat'  required/><br><br>" 

		+"Graduation Year* :    <select name ='gradyear' required='required'>"
		+"<option value='2013'>2013</option>"
		+"<option value='2012'>2012</option>"
		+"<option value='2011'>2011</option>"
		+"<option value='2010'>2010</option>"
		+"<option value='2009'>2010</option>"
		+"<option value='2008'>2010</option>"
		+"<option value='2007'>2007</option>"
		+"<option value='2006'>2006</option>"
		+"<option value='2005'>2005</option>"
		+"<option value='2004'>2004</option>"
		+"<option value='2003'>2003</option>"
		+"<option value='2002'>2002</option>"
		+"<option value='2001'>2001</option>"
		+"<option value='2000'>2000</option>"
		+"<option value='1999'>1999</option>"
		+"<option value='1998'>1998</option>"
		+"<option value='1997'>1997</option>"
		+"<option value='1996'>1996</option>"
		+"<option value='1995'>1995</option>"
		+"<option value='1994'>1994</option>"
		+"<option value='1993'>1993</option>"
		+"<option value='1992'>1992</option>"
		+"<option value='1991'>1991</option>"
		+"<option value='1990'>1990</option>"
		+"<option value='1989'>1989</option>"
		+"<option value='1988'>1988</option>"
		+"<option value='1987'>1987</option>"
		+"<option value='1986'>1986</option>"
		+"<option value='1985'>1985</option>"
		+"<option value='1984'>1984</option>"
		+"<option value='1983'>1983</option>"
		+"<option value='1982'>1982</option>"
		+"<option value='1981'>1981</option>"
		+"<option value='1980'>1980</option>"
		+"<option value='1979'>1979</option>"
		+"<option value='1978'>1978</option>"
		+"<option value='1977'>1977</option>"
		+"<option value='1976'>1976</option>"
		+"<option value='1975'>1975</option>"
		+"<option value='1974'>1974</option>"
		+"<option value='1973'>1973</option>"
		+"<option value='1972'>1972</option>"
		+"<option value='1971'>1971</option>"
		+"<option value='1970'>1970</option>"
		+"<option value='1969'>1969</option>"
		+"<option value='1968'>1968</option>"
		+"<option value='1967'>1967</option>"
		+"</select>"
		   		
   		+"<br><br>CGPA/Marks *:<br><input type='radio' name='cgpamarks' value='CGPA' required />CGPA"+"     Enter CGPA(/10) :  <input type='number' name='CGPA1' min='0' max='10'><br>"
		+"<br><input type='radio' name='cgpamarks' value='Marks' />Marks     "+"Enter Marks(%) :  <input type='number' name='marks1' min='0' max='100'><br><br>"
		 +"<br>"
		 +"<br>Upload CV : <input type='file' name='cv' required><br>"
		 +"<br>Upload SOP : <input type='file' name='sop' required><br><br>"
		 
		 +"<input type='checkbox' name='post_grad_rad' value='post_grad'> Completed Post Graduation?<br>"
   		
		+"<br>College* :<input type='text' name='post_grad_coll'/><br><br>"
	
		+"State* :<input type='text' name='post_grad_state'/><br><br>"
	
		+"Degree* :<input type='text' name='post_grad_deg'/><br><br>"
	
		+"Department* :<input type='text' name='post_grad_dep'/><br><br>"
	
		+"Post Graduation Year* :    <select name ='postgradyear'>"
		+"<option value='2013'>2013</option>"
		+"<option value='2012'>2012</option>"
		+"<option value='2011'>2011</option>"
		+"<option value='2010'>2010</option>"
		+"<option value='2009'>2010</option>"
		+"<option value='2008'>2010</option>"
		+"<option value='2007'>2007</option>"
		+"<option value='2006'>2006</option>"
		+"<option value='2005'>2005</option>"
		+"<option value='2004'>2004</option>"
		+"<option value='2003'>2003</option>"
		+"<option value='2002'>2002</option>"
		+"<option value='2001'>2001</option>"
		+"<option value='2000'>2000</option>"
		+"<option value='1999'>1999</option>"
		+"<option value='1998'>1998</option>"
		+"<option value='1997'>1997</option>"
		+"<option value='1996'>1996</option>"
		+"<option value='1995'>1995</option>"
		+"<option value='1994'>1994</option>"
		+"<option value='1993'>1993</option>"
		+"<option value='1992'>1992</option>"
		+"<option value='1991'>1991</option>"
		+"<option value='1990'>1990</option>"
		+"<option value='1989'>1989</option>"
		+"<option value='1988'>1988</option>"
		+"<option value='1987'>1987</option>"
		+"<option value='1986'>1986</option>"
		+"<option value='1985'>1985</option>"
		+"<option value='1984'>1984</option>"
		+"<option value='1983'>1983</option>"
		+"<option value='1982'>1982</option>"
		+"<option value='1981'>1981</option>"
		+"<option value='1980'>1980</option>"
		+"<option value='1979'>1979</option>"
		+"<option value='1978'>1978</option>"
		+"<option value='1977'>1977</option>"
		+"<option value='1976'>1976</option>"
		+"<option value='1975'>1975</option>"
		+"<option value='1974'>1974</option>"
		+"<option value='1973'>1973</option>"
		+"<option value='1972'>1972</option>"
		+"<option value='1971'>1971</option>"
		+"<option value='1970'>1970</option>"
		+"<option value='1969'>1969</option>"
		+"<option value='1968'>1968</option>"
		+"<option value='1967'>1967</option>"
		+"</select>"
 
				
		+"<br><br>CGPA/Marks *:<br><input type='radio' name='post_grad_cgpamarks' value='CGPA'/>CGPA"+"     Enter CGPA(/10) :  <input type='number' name='CGPA2' min='0' max='10'><br>"
		+"<br><input type='radio' name='post_grad_cgpamarks' value='Marks' />Marks     "+"Enter Marks(%) :  <input type='number' name='marks2' min='0' max='100'><br><br>"
		 +"<br>"

		 
						 
		+"<br><input type='checkbox' name='gate_rad' value='taken_gate'>  Taken Gate?<br><br>"
					 
		+"Marks(%) :  <input type='number' name='gatemarks' min='0' max='100'><br><br>"
		+"Score :  <input type='number' name='gatescore' min='0' max='1000'><br><br>"
		+"Rank :  <input type='number' name='gaterank' min='0' max='100'><br><br>"
		
		
		+"Gate Year :    <select name ='gateyear' >"
		+"<option value='2013'>2013</option>"
		+"<option value='2012'>2012</option>"
		+"<option value='2011'>2011</option>"
		+"<option value='2010'>2010</option>"
		+"<option value='2009'>2010</option>"
		+"<option value='2008'>2010</option>"
		+"<option value='2007'>2007</option>"
		+"<option value='2006'>2006</option>"
		+"<option value='2005'>2005</option>"
		+"<option value='2004'>2004</option>"
		+"<option value='2003'>2003</option>"
		+"<option value='2002'>2002</option>"
		+"<option value='2001'>2001</option>"
		+"<option value='2000'>2000</option>"
		+"<option value='1999'>1999</option>"
		+"<option value='1998'>1998</option>"
		+"<option value='1997'>1997</option>"
		+"<option value='1996'>1996</option>"
		+"<option value='1995'>1995</option>"
		+"<option value='1994'>1994</option>"
		+"<option value='1993'>1993</option>"
		+"<option value='1992'>1992</option>"
		+"<option value='1991'>1991</option>"
		+"<option value='1990'>1990</option>"
		+"<option value='1989'>1989</option>"
		+"<option value='1988'>1988</option>"
		+"<option value='1987'>1987</option>"
		+"<option value='1986'>1986</option>"
		+"<option value='1985'>1985</option>"
		+"<option value='1984'>1984</option>"
		+"<option value='1983'>1983</option>"
		+"<option value='1982'>1982</option>"
		+"<option value='1981'>1981</option>"
		+"<option value='1980'>1980</option>"
		+"<option value='1979'>1979</option>"
		+"<option value='1978'>1978</option>"
		+"<option value='1977'>1977</option>"
		+"<option value='1976'>1976</option>"
		+"<option value='1975'>1975</option>"
		+"<option value='1974'>1974</option>"
		+"<option value='1973'>1973</option>"
		+"<option value='1972'>1972</option>"
		+"<option value='1971'>1971</option>"
		+"<option value='1970'>1970</option>"
		+"<option value='1969'>1969</option>"
		+"<option value='1968'>1968</option>"
		+"<option value='1967'>1967</option>"
		+"</select><br><br>"
		+"<input type='checkbox' name='ecephd' value='ece_phd'> Applying for ECE PhD?<br><br>"
		
		+"PhD Area Preference 1* <select name='ecephd1'>"
		
		
		+"<option value='Advanced Signal Processing'>Advanced Signal Processing</option>"
		+"<option value='Statistical Signal Processing'>Statistical Signal Processing</option>"
		+"<option value='Digital VLSI Design'>Digital VLSI Design</option>"
		+"<option value='Analog CMOS Design'>Analog CMOS Design</option>"
		+"<option value='Digital Communications'>Digital Communications</option>"
		+"<option value='Communication Networks'>Communication Networks</option>"
		+"<option value='Linear Systems'>Linear Systems</option>"
		+"<option value='Introduction to Robotics'>Introduction to Robotics</option>"
		+"<option value='RF Circuit Design'>RF Circuit Design</option>"
		+"<option value='Antennas and Propagation'>Antennas and Propagation</option>"
		+"<option value='Embedded Systems'>Embedded Systems</option>"
   			+"</select><br><br>"

		+"PhD Area Preference 2* <select name='ecephd2'>"
		
		
		+"<option value='Advanced Signal Processing'>Advanced Signal Processing</option>"
		+"<option value='Statistical Signal Processing'>Statistical Signal Processing</option>"
		+"<option value='Digital VLSI Design'>Digital VLSI Design</option>"
		+"<option value='Analog CMOS Design'>Analog CMOS Design</option>"
		+"<option value='Digital Communications'>Digital Communications</option>"
		+"<option value='Communication Networks'>Communication Networks</option>"
		+"<option value='Linear Systems'>Linear Systems</option>"
		+"<option value='Introduction to Robotics'>Introduction to Robotics</option>"
		+"<option value='RF Circuit Design'>RF Circuit Design</option>"
		+"<option value='Antennas and Propagation'>Antennas and Propagation</option>"
		+"<option value='Embedded Systems'>Embedded Systems</option>"
   			+"</select><br><br>"
		
		+"PhD Area Preference 3* <select name='ecephd3'>"
		
		
		+"<option value='Advanced Signal Processing'>Advanced Signal Processing</option>"
		+"<option value='Statistical Signal Processing'>Statistical Signal Processing</option>"
		+"<option value='Digital VLSI Design'>Digital VLSI Design</option>"
		+"<option value='Analog CMOS Design'>Analog CMOS Design</option>"
		+"<option value='Digital Communications'>Digital Communications</option>"
		+"<option value='Communication Networks'>Communication Networks</option>"
		+"<option value='Linear Systems'>Linear Systems</option>"
		+"<option value='Introduction to Robotics'>Introduction to Robotics</option>"
		+"<option value='RF Circuit Design'>RF Circuit Design</option>"
		+"<option value='Antennas and Propagation'>Antennas and Propagation</option>"
		+"<option value='Embedded Systems'>Embedded Systems</option>"
   			+"</select><br><br>");

   		
		
		 //+"<br>Upload SOP : <input type='file' name='sop'><br>"
		 
		 
   		outid.println("<br><br><input type='submit' value='Submit'/>"
   				 
   				  
   				
   				+"</form>"  				
   				
   				+"</body>"
   				+"</html>");
   		
   		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = null;
		HttpSession sess = request.getSession(true);
		sess.setAttribute("dob", request.getParameter("dob"));
   		System.out.println(request.getParameter("dob"));
   		//System.out.println("     "+request.getAttribute("dob"));
   		//System.out.println("     "+request.getAttribute("Name"));
   		//System.out.println("     "+request.getAttribute("number"));
   		System.out.println("CV : "+request.getParameter("cv"));
   		System.out.println(request.getParameter("number"));
   		
   		
   		String s1;
   		int ct11=0;
   		System.out.println("\n post_grad_rad : "+request.getParameter("post_grad_rad"));
   		if(request.getParameter("post_grad_rad") != null)
   		{
   			if((request.getParameter("post_grad_coll").equals(""))
   			||(request.getParameter("post_grad_state").equals(""))
   			||(request.getParameter("post_grad_deg").equals(""))
   			||(request.getParameter("post_grad_dep").equals(""))
   			||(request.getParameter("postgradyear")==null)
   			||(request.getParameter("post_grad_cgpamarks")==null)
   			||((request.getParameter("CGPA2").equals(""))&&(request.getParameter("marks2").equals(""))))
   			{
   				path = "User3";
   		   		ct11=1;
   				//response.sendRedirect(response.encodeRedirectURL(path));
   			}
   				
   			
   		}
   		if(request.getParameter("gate_rad") != null)
   		{
   			if((request.getParameter("gatemarks").equals(""))
   			||(request.getParameter("gatescore").equals(""))
   			||(request.getParameter("gatescorerank").equals(""))
   			||(request.getParameter("gateyear")==null))
   			{
   				path = "User3";
   				ct11=2;
   		   		//response.sendRedirect(response.encodeRedirectURL(path));
   			}
   		}	
   		if(ct11==0)
   			path = "Thankyou";
   		response.sendRedirect(response.encodeRedirectURL(path));
   		if(ct11!=0)
   			return;
   			s1 = "";
   			
   			s1 = s1.concat(request.getParameter("Email"));
    		
    		s1 = s1.concat("#");
    		//System.out.println(s1);
    		s1 = s1.concat(request.getParameter("Name"));
    		s1 = s1.concat("#");
    		
    		s1 = s1.concat(request.getParameter("enroll"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("category"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("gender"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("p_disabled"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("dob"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("campus"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("graddegree"));
    		s1 = s1.concat("#");
    		
    		
    		//System.out.println("\nP G DEG = "+request.getParameter("post_grad_deg"));
//    		if(request.getParameter("post_grad_deg").equals(""))
//    		{
//    		//System.out.println("HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAAHHAHAHAHAHAHAHAHAHAHAHAHHAHAHHAHAH");
//    			s1 = s1.concat("null");
//    		}
//    		else 
    		s1 = s1.concat(request.getParameter("post_grad_deg"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("10board"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("12board"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("graddept"));
    		s1 = s1.concat("#");
//    		if(request.getParameter("post_grad_dep").equals(""))
//        			s1 = s1.concat("null");
//        	else 
        			s1 = s1.concat(request.getParameter("post_grad_dep"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("graduniv"));
    		s1 = s1.concat("#");
//    		if(request.getParameter("post_grad_coll").equals(""))
//        			s1 = s1.concat("null");
//        	else 
    		s1 = s1.concat(request.getParameter("post_grad_coll"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("gradstat"));
    		s1 = s1.concat("#");
//    		if(request.getParameter("post_grad_state").equals(""))
//        			s1 = s1.concat("null");
//        	else 
        			s1 = s1.concat(request.getParameter("post_grad_state"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("10marks"));
    		s1 = s1.concat("#");
    		s1 = s1.concat(request.getParameter("12marks"));
    		s1 = s1.concat("#");
    	//error
    		if(request.getParameter("cgpamarks").equals("CGPA"))
    			s1 = s1.concat(String.valueOf(Integer.parseInt(request.getParameter("CGPA1"))*10) );
    		else
    			s1 = s1.concat(request.getParameter("marks1"));
    	
    		s1 = s1.concat("#");
    		
    		
     		if(request.getParameter("post_grad_cgpamarks")==null)
    			s1 = s1.concat("");
    		else
    		{
    			if(request.getParameter("post_grad_cgpamarks").equals("CGPA"))
    				s1 = s1.concat(String.valueOf(Integer.parseInt(request.getParameter("CGPA2"))*10) );
    			else
    				s1 = s1.concat(request.getParameter("marks2"));
 			}
    		s1 = s1.concat("#");
    		
//    		if(request.getParameter("gatescore").equals(""))
//        			s1 = s1.concat("null");
//        		else 
        			s1 = s1.concat(request.getParameter("gatemarks"));
    		s1 = s1.concat("#");
    		
    		
    		String sdd;
	        Format formatter;
	        Date date = new Date();
	        formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	        sdd = formatter.format(date);
	        //System.out.println(sdd);
	        s1 = s1.concat(sdd);
	        s1 = s1.concat("\n");
	        //System.out.println("\ns1 : "+s1);
	     
	        //Date d = Date.now();
			File myFoo = new File("C:/Users/Siddharth/Documents/workspace2/AP_Project/src/feedback.txt");
		
			FileWriter fooWriter = new FileWriter(myFoo, true); // true to append
		                                                     // false to overwrite.
			//System.out.println(s1);
			fooWriter.write(s1);
			
			fooWriter.close();
			
			
			
			String s2 = "";
	   			
   			
			s2 = s2.concat("Email : "+request.getParameter("Email"));
    		
    		//System.out.println(s2);
    		s2 = s2.concat("\nName : "+request.getParameter("Name"));
    		s2 = s2.concat("\nEnrollment Number : "+request.getParameter("enroll"));
    		s2 = s2.concat("\nPersonal Address : "+request.getParameter("Add"));
    		s2 = s2.concat("\nCategory : "+request.getParameter("category"));
   			
    		s2 = s2.concat("\nGender : Male");
    		s2 = s2.concat("\nDisabled : Yes");
    		s2 = s2.concat("\nDate of Birth : "+request.getParameter("dob"));
    		s2 = s2.concat("\nPhD Stream : "+request.getParameter("campus"));
    		
    		s2 = s2.concat("\nPhD Area Preference 1 : "+request.getParameter("ppref1"));
    		s2 = s2.concat("\nPhD Area Preference 2 : "+request.getParameter("ppref2"));
    		
    		s2 = s2.concat("\nFather's Name : "+request.getParameter("FName"));
    		s2 = s2.concat("\nNationality : "+request.getParameter("country"));
    		
    		
    		s2 = s2.concat("\nClass X Board : "+request.getParameter("10board"));
    		s2 = s2.concat("\nClass X Marks : "+request.getParameter("10marks"));
    		
    		
    		
    		
    		s2 = s2.concat("\nClass XII Board : "+request.getParameter("12board"));
    		s2 = s2.concat("\nClass XII Marks : "+request.getParameter("12marks"));
    		
    		
    		
    		s2 = s2.concat("\nGraduation College : "+request.getParameter("gradcoll"));
    		
    		s2 = s2.concat("\nGraduation University : "+request.getParameter("graduniv"));
    		
    		s2 = s2.concat("\nGraduation Department : "+request.getParameter("graddept"));
    		
    		
    		s2 = s2.concat("\nGraduation Degree : "+request.getParameter("graddegree"));
    		s2 = s2.concat("\nGraduation State : "+request.getParameter("gradstat"));
    		
    		
    		if(request.getParameter("cgpamarks").equals("CGPA"))
    			s2 = s2.concat("\nGraduation Marks : "+String.valueOf(Integer.parseInt(request.getParameter("CGPA1"))*10) );
    		else
    			s2 = s2.concat("\nGraduation Marks : "+request.getParameter("marks1"));
    	
    		
    		
    		if(request.getParameter("post_grad_deg").equals(""))
    		{
    		//System.out.println("HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAAHHAHAHAHAHAHAHAHAHAHAHAHHAHAHHAHAH");
    			s2 = s2.concat("\nPost Graduation Degree : null");
    		}
    		else 
    			s2 = s2.concat("\nPostGraduation Degree : "+request.getParameter("post_grad_deg"));
    		
    		
    		if(request.getParameter("post_grad_dep").equals(""))
    			s2 = s2.concat("\nPost Graduation Department : null");
    	else 
    		s2 = s2.concat("\nPost Graduation Department : "+request.getParameter("post_grad_dep"));
    		   		
    		
    		if(request.getParameter("post_grad_coll").equals(""))
    			s2 = s2.concat("\nPost Graduation College : null");
    		else 
    			s2 = s2.concat("\nPost Graduation College : "+request.getParameter("post_grad_coll"));
    		
    		if(request.getParameter("post_grad_state").equals(""))
    			s2 = s2.concat("\nPost Graduation State : null");
    	else 
    		s2 = s2.concat("\nPost Graduation State : "+request.getParameter("post_grad_state"));
    				
    		
    		if(request.getParameter("post_grad_cgpamarks")==null)
    			s2 = s2.concat("\nPost Graduation Marks : null");
    		else
    		{
    			if(request.getParameter("post_grad_cgpamarks").equals("CGPA"))
    				s2 = s2.concat("\nPost Graduation Marks : "+String.valueOf(Integer.parseInt(request.getParameter("CGPA2"))*10) );
    			else
    				s2 = s2.concat("\nPost Graduation Marks : "+request.getParameter("marks2"));
    		}
    				
    		
    		if(request.getParameter("gatescore").equals(""))
    			s2 = s2.concat("\nGate Score : null");
    		else 
    			s2 = s2.concat("\nGate Score : "+request.getParameter("gatescore"));
    		
    		
    		s2 = s2.concat("\nCV Link : "+request.getParameter("cv"));
    		s2 = s2.concat("\nStatement of Purpose Link : "+request.getParameter("sop")+"\n");
    		
    		
    		
    		String sdd1;
	        Format formatter1;
	        Date date1 = new Date();
	        formatter1 = new SimpleDateFormat("yyyy-MM-dd");
	        sdd1 = formatter1.format(date1);
	        //System.out.println(sdd1);
    		s2 = s2.concat("Date of Form :"+sdd1+"\n");
    		File my = new File("C:/Users/Siddharth/Documents/workspace2/AP_Project/src/Data/"+request.getParameter("enroll")+".txt");
        	
    		FileWriter fooWrit = new FileWriter(my, false);
    		
    		fooWrit.write("\n"+s2+"\n");
    		
    		
    		fooWrit.close();
    		
    		String fpath = request.getParameter("sop");
    		InputStream inStream = null;
        	OutputStream outStream = null;
        	try{
        		
        	    File file1 =new File(fpath);
        	    File file2 =new File("C:/Users/Siddharth/Documents/workspace2/AP_Project/src/Statement/"+request.getParameter("enroll")+".txt");
        	    //state = "./src/Statement/"+personalEnroll.getText()+".txt";
        	    inStream = new FileInputStream(file1);
        	    outStream = new FileOutputStream(file2); 
        	    
        	    byte[] buffer = new byte[1024];
     
        	    int length;
        	    while ((length = inStream.read(buffer)) > 0){
        	    	outStream.write(buffer, 0, length);
        	    }
     
        	    if (inStream != null)inStream.close();
        	    if (outStream != null)outStream.close();

        	}catch(IOException e){
        		e.printStackTrace();
        	}
	
    		
        	
        	
        	
        	
        	fpath = request.getParameter("cv");
        	InputStream inS = null;
        	OutputStream outS = null;
        	try{
        		
        	    File f1 =new File(fpath);
        	    File f2 =new File("C:/Users/Siddharth/Documents/workspace2/AP_Project/src/CV/"+request.getParameter("enroll")+".txt");
        	    //cv = "./src/CV/"+request.getParameter("enroll")+".txt";
        	    inS = new FileInputStream(f1);
        	    outS = new FileOutputStream(f2); 
     
        	    byte[] buffer = new byte[1024];
     
        	    int length;
        	    while ((length = inS.read(buffer)) > 0){
        	    	outS.write(buffer, 0, length);
        	    }
     
        	    if (inS != null)inS.close();
        	    if (outS != null)outS.close();
     
        	    //cvUploadLabel.setText("Uploaded");
        	}catch(IOException e){
        		e.printStackTrace();
        	}
        	
        	
        	
        	
        	
    		
    		
   		
   		//doGet(request, response);
	}

}
