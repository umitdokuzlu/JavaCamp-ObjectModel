package kodlamaio;

public class UserManager extends BasePersonManager{
	@Override
	public void message(BasePerson person) {
		System.out.println("ho�geldiniz Kullan�c� " + person.getFirstName() +" "+ person.getLastName());
	}
}
