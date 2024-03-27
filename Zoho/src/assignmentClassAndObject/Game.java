package assignmentClassAndObject;



class Team{
	private String name;
	private String city;
	private String divition;
	private Player player;
	public Team(Team team) {
		this.player=new Player(this);
	}
	public void playGame() {
		System.out.println("Team Play");
	}
	public void hireCoach() {
		System.out.println("Hire Coach");
	}
	
}
class Player{
	private Team team;
	public Player(Team team) {
		this.team=team;
	}
	private String name;
	private String position;
	private int jerseyNumber;
	public void playGame() {
		System.out.println("Player Play");
	}
	public void train() {
		System.out.println("Player trained");
	}
}
public class Game {

	
}
