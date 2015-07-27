public class Person{
  private String firstName;
  private String lastName;
  private String title;
  private String address;

   private List<Animal> animals = new ArrayList<Animal>();

public String getFullName(){
   return firstName + " " + lastName;	


}
public void introducePets(){
	for(Animal pet: animals){
	System.out.println(pet.getName());	
}
}


}
