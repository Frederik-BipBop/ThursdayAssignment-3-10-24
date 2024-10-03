public class Team
{
	private String teamName;
	private int teamRank;
	private static int numOfTeams = 0;

	public Team(String teamName){
		numOfTeams++;

		this.teamName = teamName;

	}
	public void setRank(int teamRank){
		if(teamRank> 0 && teamRank < numOfTeams ){
			this.teamRank = teamRank;
	}

	}
	public int setRank(){
		return this.teamRank;
	}

	public void addPlayer(String teamName){
		String[] teamNames = {"fc.brainrot", "Fc.Abbas", "Fc.Cph", "Fc.Clear", "Fc.Notgood", " Fc. WetheBest"};
		
	}
	public String addPlayer(){
			return this.teamName;
		}


	public String toString(){
			return "Hold: " + teamName + " Rank: " + teamRank;
		}
}




