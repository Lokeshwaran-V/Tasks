package lokesh;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class schms {
	
	static Scanner scn = new Scanner(System.in);
	static String username;
    static String password;
    static String choose1;
    static String choose2;
    static String choose3;
    static String choose4;
    static String choose5;
    static int choose6;
    static int choose7;
    static String choose8;
    static int choose9;
    static String choose10;
    static int choose11;
    static int choose12;
    
    static ArrayList<String> sturesult = new ArrayList<String>();
    
    
    //Maths Subject
    static ArrayList<String> mathsquestion = new ArrayList<String>();
    static ArrayList<String> mathsanswer = new ArrayList<String>();
    static ArrayList<String> stumathsans = new ArrayList<String>();
    
    public void Mathsmethod() {
    	mathsquestion.add("question1");
		mathsquestion.add("question2");
		mathsquestion.add("question3");
		mathsquestion.add("question4");
		mathsquestion.add("question5");
		
		mathsanswer.add("answer1");
		mathsanswer.add("answer2");
		mathsanswer.add("answer3");
		mathsanswer.add("answer4");
		mathsanswer.add("answer5");
		
		stumathsans.add("answer1");
		stumathsans.add("answer2");
		stumathsans.add("answer3");
		stumathsans.add("answer4");
		stumathsans.add("answer5");
    }

    //Science Subject
    static ArrayList<String> sciencequestion = new ArrayList<String>();
    static ArrayList<String> scienceanswer = new ArrayList<String>();
    static ArrayList<String> stuscienceans = new ArrayList<String>();
	    
    public void Sciencemethod() {
    	sciencequestion.add("question1");
		sciencequestion.add("question2");
		sciencequestion.add("question3");
		sciencequestion.add("question4");
		sciencequestion.add("question5");
		
		scienceanswer.add("answer1");
		scienceanswer.add("answer2");
		scienceanswer.add("answer3");
		scienceanswer.add("answer4");
		scienceanswer.add("answer5");
		
		stuscienceans.add("answer1");
		stuscienceans.add("answer2");
		stuscienceans.add("answer3");
		stuscienceans.add("answer4");
		stuscienceans.add("answer5");
    }
    
    //English Subject
    static ArrayList<String> englishquestion = new ArrayList<String>();
    static ArrayList<String> englishanswer = new ArrayList<String>();
    static ArrayList<String> stuenglishans = new ArrayList<String>();
    
    public void Englishmethod() {
    	englishquestion.add("question1");
		englishquestion.add("question2");
		englishquestion.add("question3");
		englishquestion.add("question4");
		englishquestion.add("question5");
		
		englishanswer.add("answer1");
		englishanswer.add("answer2");
		englishanswer.add("answer3");
		englishanswer.add("answer4");
		englishanswer.add("answer5");
		
		stuenglishans.add("answer1");
		stuenglishans.add("answer2");
		stuenglishans.add("answer3");
		stuenglishans.add("answer4");
		stuenglishans.add("answer5");
    }
    
    static ArrayList<String> stafflist = new ArrayList<String>();
    public void StafflistMethod() {
    	stafflist.add("Staff1");
		stafflist.add("staff2");
		stafflist.add("staff3");
    }
    
    static ArrayList<String> studentlist = new ArrayList<String>();
    public void StudentlistMethod() {
    	studentlist.add("student1");
		studentlist.add("student2");
		studentlist.add("student3");
		studentlist.add("student4");
		studentlist.add("student5");
    }
    
    static ArrayList<String> mark = new ArrayList<String>();
    public void marklistMethod() {
    	mark.add("student1");
    	mark.add("student2");
		mark.add("student3");
		mark.add("student4");
		mark.add("student5");
    }
    
	public void hodMethod(){
        
        username = "admin";
        password = "admin";
        System.out.println("You choice is Head of the Department.");
        System.out.println("\nEnter Username");
        choose1 = scn.next();
        
        if (choose1.equals(username)){
        	System.out.println("\nEnter Password");
            choose2 = scn.next();
            if (choose2.equals(password)){
                System.out.println("\nYou logged in as Head of the Department.");
            }
            else {
                System.out.println("Password is incorrect");
            }
        }
        else {
            System.out.println("Username is incorrect");
        }
	}
	
	public void hod1Method() {
		
		while (true) {
			System.out.println("\n1.View Staffs list.\n"
					+ "2.View Students list.\n"
					+ "3.View Students result.\n");
			choose11 = scn.nextInt();
		
			if (choose11 == 1) {
				System.out.println("Staffs List\n");
				Iterator<String> it = stafflist.iterator();
				while(it.hasNext()) {
					  System.out.println(it.next());
					}
			}
			else if (choose11 == 2) {
				System.out.println("Students List\n");
				Iterator<String> it1 = studentlist.iterator();
				while(it1.hasNext()) {
					  System.out.println(it1.next());
					}
			}
			else if (choose11 == 3) {
				Iterator<String> it4 = sturesult.iterator();
				while(it4.hasNext()) {
					  System.out.println(it4.next());
					}
			}
			else {
				System.out.println("Choose correct option\n");
				break;
			}
		}		
	}
	
	public void staffMethod(){
        
        username = "staff";
        password = "staff";
        System.out.println("You choice is Staff.");
        System.out.println("\nEnter Username");
        choose1 = scn.next();
        
        if (choose1.equals(username)){
        	System.out.println("\nEnter Password");
            choose2 = scn.next();
            if (choose2.equals(password)){
                System.out.println("\nYou logged in as Staff.");
            }
            else {
                System.out.println("Password is incorrect");
            }
        }
        else {
            System.out.println("Username is incorrect");
        }
	}
	
	public void staff1Method() {
		
			if (choose6 == 1) {
				System.out.println("Staffs List\n");
				Iterator<String> it = stafflist.iterator();
				while(it.hasNext()) {
					  System.out.println(it.next());
					}
			}
			else if (choose6 == 2) {
				System.out.println("Add Staff/s\n");
				System.out.println("How many Staffs do you want to add\n");
				
				choose7 = scn.nextInt();
				for(int i=1;i <= choose7;i++) {
					System.out.println("Enter staff name\n");
					choose8 = scn.next();
					stafflist.add(choose8);
				}
			}
			else if (choose6 == 3) {
				System.out.println("Students List\n");
				Iterator<String> it1 = studentlist.iterator();
				while(it1.hasNext()) {
					  System.out.println(it1.next());
					}
			}
			else if (choose6 == 4) {
				System.out.println("Add Student/s\n");
				System.out.println("How many students do you want to add\n");
				
				choose9 = scn.nextInt();
				for(int i=1;i <= choose9;i++) {
					System.out.println("Enter student name\n");
					choose10 = scn.next();
					studentlist.add(choose10);
				}
			}
			else {
				System.out.println("Choose correct option\n");
			}
		}
	
	public void studentMethod(){
        
        username = "student";
        password = "student";
        System.out.println("You choice is Student.");
        System.out.println("\nEnter Username");
        choose1 = scn.next();
        
        if (choose1.equals(username)){
        	System.out.println("\nEnter Password");
            choose2 = scn.next();
            if (choose2.equals(password)){
                System.out.println("\nYou logged in as Student.");
            }
            else {
                System.out.println("Password is incorrect");
            }
        }
        else {
            System.out.println("Username is incorrect");
        }
	}
	public void subjectMethod() {
		System.out.println("Select Subject\n"
				+ "1.Maths\n"
				+ "2.Science\n"
				+ "3.English\n");
		choose12 = scn.nextInt();
	}
	
	/*---------------Questions---------------*/ 
	
	public void mathsquestionMethod() {
		
		for (int i=0;i<5;i++) {
			System.out.println("Enter your question " + (i+1));
			choose3 = scn.next();
			mathsquestion.set(i, choose3);
	
			System.out.println("Enter the answer " + (i+1));
			choose4 = scn.next();
			mathsanswer.set(i, choose4);
		}
	}
	
	public void sciencequestionMethod() {
			
			for (int i=0;i<5;i++) {
				System.out.println("Enter your question " + (i+1));
				choose3 = scn.next();
				sciencequestion.set(i, choose3);
		
				System.out.println("Enter the answer " + (i+1));
				choose4 = scn.next();
				scienceanswer.set(i, choose4);
			}
		}
	
	public void englishquestionMethod() {
		
		for (int i=0;i<5;i++) {
			System.out.println("Enter your question " + (i+1));
			choose3 = scn.next();
			englishquestion.set(i, choose3);
	
			System.out.println("Enter the answer " + (i+1));
			choose4 = scn.next();
			englishanswer.set(i, choose4);
		}
	}
	
	/*---------------Questions---------------*/
	
	/*---------------Result Validation---------------*/
	
	public void validatemathMethod() {
		for(int i=0;i<mathsanswer.size();i++) {
			if (mathsanswer.get(i).equals(stumathsans.get(i))) {
				System.out.println("Correct answer");
				sturesult.add("Correct answer");

			}
			else {
				System.out.println("Wrong answer");
				sturesult.add("Wrong answer");

			}
		}
	}
	
	public void validatesciMethod() {
		for(int i=0;i<scienceanswer.size();i++) {
			
			if (scienceanswer.get(i).equals(stuscienceans.get(i))) {
				System.out.println("Correct answer");
				sturesult.add("Correct answer");

			}
			else {
				System.out.println("Wrong answer");
				sturesult.add("Wrong answer");

			}
		}
	}
    
    public void validateengMethod() {
		for(int i=0;i<englishanswer.size();i++) {
			
			if (englishanswer.get(i).equals(stuenglishans.get(i))) {
				System.out.println("Correct answer");
				sturesult.add("Correct answer");
			}
			else {
				System.out.println("Wrong answer");
				sturesult.add("Wrong answer");

			}
		}
	}
	
    /*---------------Result Validation---------------*/
    
    
    
    /*---------------Students Answers---------------*/
    
	public void studentmathsansMethod() {
		for (int i=0;i<5;i++) {
			System.out.println("Q" + (i+1) + ":- " + mathsquestion.get(i));
			choose5 = scn.next();
			stumathsans.set(i, choose5);
		}
		
	}
	
	public void studentsciansMethod() {
		for (int i=0;i<5;i++) {
			System.out.println("Q" + (i+1) + ":- " + sciencequestion.get(i));
			choose5 = scn.next();
			stuscienceans.set(i, choose5);
		}
		
	}
	
	public void studentengansMethod() {
		for (int i=0;i<5;i++) {
			System.out.println("Q" + (i+1) + ":- " + englishquestion.get(i));
			choose5 = scn.next();
			stuenglishans.set(i, choose5);
		}
		
	}
	
	/*---------------Students Answers---------------*/
	
	public static void main(String args []) {
		schms myObj = new schms();
		
		myObj.Mathsmethod();
		myObj.Sciencemethod();
		myObj.Englishmethod();
		myObj.StafflistMethod();
		myObj.StudentlistMethod();
		
		while (true){
			System.out.println("\nWelcome to the School login portal.");
			System.out.println("1.Head of the department\n"
					+ 			"2.Department Staff\n"
					+			"3.student\n");
			
			int choose3 = scn.nextInt();
				if (choose3 == 1) {
					myObj.hodMethod();
					if (choose1.equals(username)&& choose2.equals(password)){
						myObj.hod1Method();
					}
				}
				else if (choose3 == 2) {
					myObj.staffMethod();
					if (choose1.equals(username)&& choose2.equals(password)){
						System.out.println("\n1.View Staffs list.\n"
								+ "2.Add new Staffs.\n"
								+ "3.View Students list.\n"
								+ "4.Add Students.\n"
								+ "5.Post Questions\n"
								+ "6.View Results\n");
						choose6 = scn.nextInt();
						
						if (choose6 == 1 || choose6 == 2 || choose6 == 3 || choose6 == 4) {
							myObj.staff1Method();
						}
						else if (choose6 == 5) {
							myObj.subjectMethod();
							if (choose12 == 1) {
								myObj.mathsquestionMethod();
		
							}
							else if (choose12 == 2) {
								myObj.sciencequestionMethod();
		
							}
							else if (choose12 == 3) {
								myObj.englishquestionMethod();
		
							}
							else {
								System.out.println("Make correct choice");
							}
						}
						else if (choose6 == 6) {
							Iterator<String> it3 = sturesult.iterator();
							while(it3.hasNext()) {
								  System.out.println(it3.next());
								}
						}
					}
				}
				else if (choose3 == 3) {
					myObj.studentMethod();
					if (choose1.equals(username)&& choose2.equals(password)){
						myObj.subjectMethod();
						if (choose12 == 1) {
							myObj.studentmathsansMethod();
							myObj.validatemathMethod();
	
						}
						else if (choose12 == 2) {
							myObj.studentsciansMethod();
							myObj.validatesciMethod();
	
						}
						else if (choose12 == 3) {
							myObj.studentengansMethod();
							myObj.validateengMethod();
	
						}
						else {
							System.out.println("Make correct choice");
						}
					}
					
				}
				else {
					System.out.println("Please choose a correct choice.");
					break;
				}
		}
	}
}
