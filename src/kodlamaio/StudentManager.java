package kodlamaio;

public class StudentManager extends BasePersonManager{
	@Override
	public void message(BasePerson person) {
		System.out.println("ho�geldiniz ��renci " + person.getFirstName() +" " +person.getLastName());
	}
}
