import java.io.*;
import java.text.*;
import java.util.*;


/*
 * 
 * @author Siddharth Sharma(2014104) + Deepak Thukral(2014036)
 * 
 * 
 * 
 * 
 * 
 * Use : Please see comments in the following lines : 27, 223, 480; 
 *
 *Please Note : The First input File(with commas in address fields) has been used for the BONUS.
 *
 *
 */
public class Lab_Seven {

	
	public static void main(String[] args) throws IOException
	{
		
		
		
		
		    
		
		
		
		
		String csvFile = "./src/Data_to_Import.csv";				//Data_to_Import.csv should be in src
		BufferedReader br = null;
		String line = "";
		
		

			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			while ((line = br.readLine()) != null) 
			{
				
				String[] coun = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);


			

		
				String s1;
				s1 = "";
				
				s1 = s1.concat(coun[0]);		//email
				
				s1 = s1.concat("#");			
		
				s1 = s1.concat(coun[1]);		//name
				s1 = s1.concat("#");
				
				s1 = s1.concat(coun[59]);		//enroll
				s1 = s1.concat("#");
				
		
				s1 = s1.concat(coun[9]);    //category
				
				s1 = s1.concat("#");
				
				
				s1 = s1.concat(coun[8]);		// gender
				
				s1 = s1.concat("#");
				
				
				
				
				s1 = s1.concat(coun[10]);    //Disabled?
				
				s1 = s1.concat("#");
				
				
				 SimpleDateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy");
				   SimpleDateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
				   Date date=null;
				   try {
				     date = originalFormat.parse(coun[11]);
				   
				    } catch (ParseException ex) {
		
				    }
				
				s1 = s1.concat(targetFormat.format(date));    //DOB
				
				s1 = s1.concat("#");
				
				s1 = s1.concat(coun[4]);    //PhD Stream
				
				s1 = s1.concat("#");
				
				if(coun[23].equals(""))
				{
					s1 = s1.concat("null");
				}
				else
					s1 = s1.concat(coun[23]);    //Graduation Degree
				
				s1 = s1.concat("#");
				
				if(coun[37].equals(""))
				{
					s1 = s1.concat("null");
				}
				else
					s1 = s1.concat(coun[37]);    //Post Graduation Degree
				
				s1 = s1.concat("#");
				
				
				s1 = s1.concat(coun[17]);    //10th Board
				
				s1 = s1.concat("#");
		
				s1 = s1.concat(coun[20]);    //12th Board
				
				s1 = s1.concat("#");
				
				s1 = s1.concat(coun[24]);    //Graduation Dept.
				
				s1 = s1.concat("#");
				
				
				if(coun[38].equals(""))
				{
					s1 = s1.concat("null");
				}
				else
					s1 = s1.concat(coun[38]);	    //Post Graduation Dept.
				s1 = s1.concat("#");
				
				
				s1 = s1.concat(coun[26]);    //Graduation Univ.
				
				s1 = s1.concat("#");
				
				
				if(coun[39].equals(""))
				{
					s1 = s1.concat("null");
				}
				else
					s1 = s1.concat(coun[39]);	    //Post Graduation Coll.
				s1 = s1.concat("#");
				
				
				
				s1 = s1.concat(coun[28]);    //Graduation State
				
				s1 = s1.concat("#");
				
				
				if(coun[42].equals(""))
				{
					s1 = s1.concat("null");
				}
				else
					s1 = s1.concat(coun[42]);	    //Post Graduation State
				s1 = s1.concat("#");
				
				
				s1 = s1.concat(coun[18]);    //10th Board Marks
				
				s1 = s1.concat("#");
		
				s1 = s1.concat(coun[21]);    //12th Board Marks
				
				s1 = s1.concat("#");
		
				String[] co = coun[30].split(":");
				if(co[0].equals("Marks"))
					s1 = s1.concat(co[1]);    //Graduation MARKS //or CGPA
				else if(co[0].equals("CGPA"))
				{
					float fa = Float.parseFloat(co[1]);
					fa*=10;
					String sdda1 = String.valueOf(fa);
					s1 = s1.concat(sdda1);
				}
				s1 = s1.concat("#");
				
				
				
				String[] co1 = coun[30].split(":");
				if(co1[0].equals("Marks"))
					s1 = s1.concat(co1[1]);    //Post Graduation MARKS //or CGPA
				else if(co1[0].equals("CGPA"))
				{
					float f = Float.parseFloat(co1[1]);
					f*=10;
					String sdd11 = String.valueOf(f);
					s1 = s1.concat(sdd11);
				}
				s1 = s1.concat("#");
				
				
				if(coun[54].equals(""))
				{
					s1 = s1.concat("null");
				}
				else
					s1 = s1.concat(coun[54]);    //Gate Marks (%)
				
				s1 = s1.concat("#");
		
				
				
				
				 		
				
				try { 
						Calendar cal = Calendar.getInstance(); 
						cal.setTime(new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss").parse(coun[58])); 
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd#hh:mm:ss");
						s1 = s1.concat(sdf.format(cal.getTime())); 
						//System.out.println(sdf.format(cal.getTime()));
						
		
				} catch (ParseException e) 
				{ e.printStackTrace(); }
				
				//System.out.println(s1);
			        
				File myFoo = new File("C:/Users/Siddharth Sharma/workspace/proj/src/feedback.txt");		//Change to Your feedback location
			
				FileWriter fooWriter = new FileWriter(myFoo, true); // true to append
			                                                     // false to overwrite.
				//System.out.println(s1);
				s1 = s1.concat("\n");
				
				fooWriter.write(s1);
				
				fooWriter.close();
				
				
				
				String s2 = "";
				//System.out.println(personalEmail.getText());
				s2 = s2.concat("\nEmail : "+coun[0]);
				
				//System.out.println(s2);
				s2 = s2.concat("\nName : "+coun[1]);
				s2 = s2.concat("\nEnrollment Number : "+coun[59]);
				s2 = s2.concat("\nPersonal Address : "+coun[2].substring(1, coun[2].length()-1));
				
				
				
					s2 = s2.concat("\nCategory : "+coun[9]);
				
				
					s2 = s2.concat("\nGender : "+coun[8]);
				
				
					s2 = s2.concat("\nDisabled : "+coun[10]);
				
				
				 SimpleDateFormat originalFormat1 = new SimpleDateFormat("dd-MM-yyyy");
				   SimpleDateFormat targetFormat1 = new SimpleDateFormat("yyyy-MM-dd");
				   Date date1=null;
				   try {
				     date1 = originalFormat1.parse(coun[11]);
				   
				    } catch (ParseException ex) {
		
				    }
				
		
				
				s2 = s2.concat("\nDate of Birth : "+targetFormat1.format(date1));
				 		
				s2 = s2.concat("\nPhD Stream : "+coun[4]);
				
				
				
				s2 = s2.concat("\nPhD Area Preference 1 : "+coun[5]);
		
				if(coun[6].equals(""))
				{
					s2 = s2.concat("\nPhD Area Preference 2 : null");
				}
				else
					s2 = s2.concat("\nPhD Area Preference 2 : "+coun[6]);
			
				if(coun[7].equals(""))
				{
					s2 = s2.concat("\nPhD Area Preference 3 : null");
				}
				else
					s2 = s2.concat("\nPhD Area Preference 3 : "+coun[7]);
			
				
				s2 = s2.concat("\nFather's Name : "+coun[13]);
				s2 = s2.concat("\nNationality : "+coun[14]);
				s2 = s2.concat("\nPermanent Address : "+coun[15].substring(1, coun[15].length()-1));
				System.out.println(s2);
				
				s2 = s2.concat("\nClass X Board : "+coun[17]);
				s2 = s2.concat("\nClass X Marks : "+coun[18]);
				
				
				
				s2 = s2.concat("\nClass XII Board : "+coun[20]);
				s2 = s2.concat("\nClass XII Marks : "+coun[21]);
				//System.out.println(coun[20]+"   "+coun[21]);
				
				
				
				s2 = s2.concat("\nGraduation College : "+coun[25]);
				
				s2 = s2.concat("\nGraduation University : "+coun[26]);
				
				s2 = s2.concat("\nGraduation Department : "+coun[24]);
				
				
				s2 = s2.concat("\nGraduation Degree : "+coun[23]);
				s2 = s2.concat("\nGraduation City : "+coun[27]);
				s2 = s2.concat("\nGraduation State : "+coun[28]);
				
				
				String[] co111 = coun[30].split(":");
				if(co111[0].equals("Marks"))
					s2 = s2.concat("\nGraduation Marks : "+co111[1]);    //Graduation MARKS //or CGPA
				else if(co111[0].equals("CGPA"))
				{
					s2 = s2.concat("\nGraduation CGPA : "+co111[1]);
				}
				
				
				
				if(coun[37].equals(""))
				{
					s2 = s2.concat("\nPost Graduation Degree : null");
				}
				else
					s2 = s2.concat("\nPostGraduation Degree : "+coun[37]);
				
				if(coun[38].equals(""))
				{
					s2 = s2.concat("\nPost Graduation Department : null");
				}
				else
					s2 = s2.concat("\nPost Graduation Department : "+coun[38]);
				
				
				
				
				
				if(coun[39].equals(""))
				{
					s2 = s2.concat("\nPost Graduation College : null");
				}
				else
					s2 = s2.concat("\nPost Graduation College : "+coun[39]);
				
				if(coun[40].equals(""))
				{
					s2 = s2.concat("\nPost Graduation Thesis : null");
				}
				else
					s2 = s2.concat("\nPost Graduation Thesis : "+coun[40]);
					
					
				if(coun[41].equals(""))
				{
					s2 = s2.concat("\nPost Graduation City : null");
				}
				else
					s2 = s2.concat("\nPost Graduation City : "+coun[41]);
				
				if(coun[42].equals(""))
				{
					s2 = s2.concat("\nPost Graduation State : null");
				}
				else
					s2 = s2.concat("\nPost Graduation State : "+coun[42]);
				
				if(coun[43].equals(""))
				{
					s2 = s2.concat("\nPost Graduation Year : null");
				}
				else
					s2 = s2.concat("\nPost Graduation Year : "+coun[43]);
		
				
				
				
				String[] coo1 = coun[30].split(":");
				if(coo1[0].equals("Marks"))
					s2 = s2.concat("\nPost Graduation Marks : "+coo1[1]);    //Post Graduation MARKS //or CGPA
				else if(coo1[0].equals("CGPA"))
				{
					s2 = s2.concat("\nPost Graduation CGPA : "+coo1[1]);  
				}
				
				
				if(coun[45].equals(""))
				{
					//s2 = s2.concat("\nPost Graduation Year : null");
				}
				else
					s2 = s2.concat("\nOther Academic Degrees : "+coun[45]);
				
				if(coun[46].equals(""))
				{
					//s2 = s2.concat("\nPost Graduation Year : null");
				}
				else
					s2 = s2.concat("\nExam Name : "+coun[46]);
				
				if(coun[47].equals(""))
				{
					//s2 = s2.concat("\nPost Graduation Year : null");
				}
				else
					s2 = s2.concat("\nSubject : "+coun[47]);
				if(coun[48].equals(""))
				{
					//s2 = s2.concat("\nPost Graduation Year : null");
				}
				else
					s2 = s2.concat("\nYear : "+coun[48]);
				if(coun[49].equals(""))
				{
					//s2 = s2.concat("\nPost Graduation Year : null");
				}
				else
					s2 = s2.concat("\nScore : "+coun[49]);
			
				if(coun[50].equals(""))
				{
					//s2 = s2.concat("\nPost Graduation Year : null");
				}
				else
					s2 = s2.concat("\nRank : "+coun[50]);
				//System.out.println(coun[50]);
				//System.out.println("51   "+coun[51]);
				
				
				s2 = s2.concat("\nTaken Gate ? : "+coun[51]);
		
				if(coun[51].equals("No"))
				{
					s2 = s2.concat("\nGate Area : N/A");
					s2 = s2.concat("\nYear of Graduation : N/A");
					s2 = s2.concat("\nMarks(%) : N/A");
					s2 = s2.concat("\nScore : N/A");
					s2 = s2.concat("\nRank : N/A");
					
				}
				else if(coun[51].equals("Yes"))
				{
					s2 = s2.concat("\nGate Area : "+coun[52]);
					s2 = s2.concat("\nYear of Graduation : "+coun[53]);
					s2 = s2.concat("\nMarks(%) : "+coun[54]);
					s2 = s2.concat("\nScore : "+coun[55]);
					s2 = s2.concat("\nRank : "+coun[56]);	
				}
			
				if(coun[57].equals(""))
					s2 = s2.concat("\nAchievements : None");
				else 
					s2 = s2.concat("\nAchievements : "+coun[57]);
		
				try { 
					Calendar cal11 = Calendar.getInstance(); 
					cal11.setTime(new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss").parse(coun[58])); 
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					s2 = s2.concat("\nTimestamp : "+sdf1.format(cal11.getTime())); 
					
				} catch (ParseException e) 
				{ e.printStackTrace(); }
			
		
		
		/*
				s2 = s2.concat("\nCV Link : "+cv);
				s2 = s2.concat("\nStatement of Purpose Link : "+state+"\n");		//NOT Provided in .csv file
							
				
				*/
				File my = new File("C:/Users/Siddharth Sharma/workspace/proj/src/data/"+coun[59]+".txt");  //Directory to save individual files
		    	
				FileWriter fooWrit = new FileWriter(my, false);
				
				fooWrit.write("\n"+s2+"\n");
						
				fooWrit.close();
			}
			
			br.close();
		}
	
}