//Supawit itthisiriwet
//6209650370
package homework2;

public class PokemonTester {

	public static void main(String[] args) { 
		
		Pokemon poke1 = new Pokemon(); 
		Pokemon poke2 = new Pokemon();
		Pokemon poke3 = new Pokemon();
		Pokemon poke4 = new Pokemon();
		Pokemon poke5 = new Pokemon();
		
			poke1.setName("Nidoking");
			poke1.setCate("Drill");
			poke1.setWeight(136.7);
			poke1.setType("Poison/Ground");
			poke1.printInfo();
			
			poke2.setName("Dugtrio");
			poke2.setCate("Mole");
			poke2.setWeight(73.4);
			poke2.setType("Ground");
			poke2.printInfo();
			
			poke3.setName("Meowth");
			poke3.setCate("Scratch Cat");
			poke3.setWeight(9.3);
			poke3.setType("Normal"); 
			poke3.printInfo();
			
			poke4.setName("Electrode");
			poke4.setCate("Ball");
			poke4.setWeight(146.8);
			poke4.setType("Electric");
			poke4.printInfo();
			
			poke5.setName("Gengar");
			poke5.setCate("Shadow");
			poke5.setWeight(89.3 );
			poke5.setType("Ghost/Poison");
			poke5.printInfo();
		}
}
