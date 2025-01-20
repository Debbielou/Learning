package springAssignmentXml;


public class UserRepositoryImplementor implements UserRepository{


	@Override
	public void addData() {
	System.out.println("Data added!");
		
	}

	@Override
	public void retrieveData() {
		System.out.println("Data has been retrieved.");
		
	}
	
		

}
