package learning.animals;

import learning.animals.Animal;

public class DomesticAnimal extends Animal {
  public String owner;

  @Override
  public String sound() {
    return "danger";
  }
}
