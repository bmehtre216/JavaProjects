 class Animal{
    void eat() { 
    	System.out.println("Animal eats");
    }
}

public class Program extends Animal {
    
	void bark() {
		System.out.println("Dog barks"); 
	}


	public static void main(String[] args) {
		// primitive to primitive
		int num = 64;
		char ch = (char) num;
		
		System.out.println(ch);
		
		//reference to reference
		String s1 = "Bhim";
		
		

		        Program myDog = new Program();
		        Animal myAnimal = myDog;   // Upcasting: Dog reference assigned to Animal reference
		        myAnimal.eat();     // Can call methods defined in Animal
		        // myAnimal.bark(); // Cannot call Dog-specific methods without downcasting
		        
		        
		        //Downcasting - Explicit-typecasting
		       Program myDog1 = (Program) myAnimal; 
		       myDog1.bark();
		        
	}
}
