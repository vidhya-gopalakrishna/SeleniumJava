package OOPsTest;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professors pf = new Professors();
		pf.conductLectures();
		pf.reviewAssignments();
		pf.issueBadges();
		pf.lunchHours();
		
		Staff stf = new Staff();
		stf.admissionProcess();
		stf.lunchHours();
		stf.issueBadges();
		
		Students std = new Students();
		std.attendClasses();
		std.doAssignments();
		std.lunchHours();
		std.issueBadges();

	}

}
