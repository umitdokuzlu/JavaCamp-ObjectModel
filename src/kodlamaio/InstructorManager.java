package kodlamaio;

public class InstructorManager extends BasePersonManager{
	@Override
	public void message(BasePerson person) {
		System.out.println("ho�geldiniz e�itmen " + person.getFirstName() +" "+ person.getLastName());
	}
}
