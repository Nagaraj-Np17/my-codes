package Exericsm;

public class Program1 {

	public static void main(String[] args) {
		
		
		System.out.println(AnnalynsInfiltration_canFastAttack(false));
		
		System.out.println(AnnalynsInfiltration_canSignalPrisoner(false,true));
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = false;
		System.out.println(AnnalynsInfiltration_canFreePrisoner(knightIsAwake, archerIsAwake,
				prisonerIsAwake, petDogIsPresent));
		
	}
	
	public static boolean AnnalynsInfiltration_canFastAttack(boolean knightIsAwake){
		return !knightIsAwake;
	}
	public boolean AnnalynsInfiltration_canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
		return  (knightIsAwake || archerIsAwake || prisonerIsAwake);
	}
	public static boolean AnnalynsInfiltration_canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
		return (!archerIsAwake && prisonerIsAwake);
	}
	public static boolean AnnalynsInfiltration_canFreePrisoner(boolean knightIsAwake,
		boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
		return  petDogIsPresent?(!archerIsAwake):
			(!knightIsAwake && ! archerIsAwake && prisonerIsAwake);
				
	}
	
	
	
}
