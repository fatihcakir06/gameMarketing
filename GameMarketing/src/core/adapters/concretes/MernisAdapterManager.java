package core.adapters.concretes;

import core.adapters.abstracts.MernisAdapterService;
import core.external.MernisService;
import entities.concretes.Customer;

public class MernisAdapterManager implements MernisAdapterService{
	
	
	MernisService mernisService = new MernisService();

	@Override
	public boolean ifCheckRealPerson(Customer customer) {
		if (mernisService.isPersonMernisExists()) {
			System.out.println("Mernis kiþi doðrulamasý yapýldý.");
			return true;
		}
		return false;
	}
} 
