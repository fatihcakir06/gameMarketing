package dataAccess.abstracts;

import entities.concretes.Game;

public interface GameDao {
  public void add(Game game);
  public void update(Game game);
  public void delete(Game game);
}
