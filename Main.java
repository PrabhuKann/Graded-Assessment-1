
public class Main {

public static void main(String[] args) {
		//Objects created to pickup the AdminDepartment related output
System.out.println("Welcome to Admin Department");

AdminDepartment adADGT = new AdminDepartment();
adADGT.getTodaysWork();

AdminDepartment adGWDL = new AdminDepartment();
adGWDL.getWorkDeadline();

AdminDepartment adTHDAY = new AdminDepartment();
//isTodayHoliday is not available in Admin department. But Admin department is extended class of Super Department. 
adTHDAY.isTodayAHoliday();

//inserted a space between lines
System.out.println("\n");

 System.out.println("Welcome to HR Department");

 HrDepartment hrDA = new HrDepartment();
 hrDA.doActivitye();
 
 HrDepartment hrGTW = new HrDepartment();
 hrGTW.getTodaysWork(); 
 HrDepartment hrGWD = new HrDepartment();
 hrGWD.getWorkDeadline();
  //isTodayHoliday is not available in HR department. But HR department is extended class of Super Department.
 HrDepartment hrTAH = new HrDepartment();
 hrTAH.isTodayAHoliday();

 //inserted a space between lines
 System.out.println("\n");

 //Objects created to pickup the Tech Department related output
 System.out.println("Welcome to Tech Department");
 
 TechDepartment techGTW = new TechDepartment();
 techGTW.getTodaysWork();
 
 TechDepartment techGWDL = new TechDepartment();
 techGWDL.getWorkDeadline();
 
 TechDepartment techGTSI = new TechDepartment();
 techGTSI.getTechStackInformation();

 //isTodayHoliday is not available in TECH department. But HR department is extended class of Super Department.
 TechDepartment tecTAH = new TechDepartment();
 tecTAH.isTodayAHoliday();
 
	}

}
