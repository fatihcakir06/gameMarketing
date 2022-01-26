package dataAccess.abstracts;

import entities.concretes.Game;
import entities.concretes.Sale;

public interface SaleDao {
	  public void add(Sale sale);
	  public void update(Sale sale);
	  public void delete(Sale sale);
}
