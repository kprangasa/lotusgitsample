public class Person{
  private String firstName;
  private String lastName;
  private String title;

  private String address;

   private List<Animal> animals = new ArrayList<Animal>();


   private String nickName;

public String getFullName(){
   return firstName + " " + lastName;	


}


public void feedPets(){
	for(Animal animal: animals){
	animal.eat();
	System.out.println("Feeding " + animal.getName());
	}
}

public void introducePets(){
	for(Animal pet: animals){
	System.out.println(pet.getName());	
}
}



}
