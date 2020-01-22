package Assignment3;

public class Elections {
	private int electionId;
	private String electionName;
	private String electiondate;
	private String district;
	private String constituency;
	private String countingDate;
	
	
	public Elections(int electionId, String electionName, String electiondate, String district, String constituency,
			String countingDate) {
		super();
		this.electionId = electionId;
		this.electionName = electionName;
		this.electiondate = electiondate;
		this.district = district;
		this.constituency = constituency;
		this.countingDate = countingDate;
	}
	public int getElectionId() {
		return electionId;
	}
	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}
	public String getElectionName() {
		return electionName;
	}
	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}
	public String getElectiondate() {
		return electiondate;
	}
	public void setElectiondate(String electiondate) {
		this.electiondate = electiondate;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getCountingDate() {
		return countingDate;
	}
	public void setCountingDate(String countingDate) {
		this.countingDate = countingDate;
	}
	@Override
	public String toString() {
		return "\nElections [electionId=" + electionId + ", electionName=" + electionName + ", electiondate="
				+ electiondate + ", district=" + district + ", constituency=" + constituency + ", countingDate="
				+ countingDate + "]";
	}
	
	public int hashCode() {
		int code= electionName.hashCode();
		//System.out.println("In HashCode ....."+code);
		return electionName.hashCode();
	}
	
	public boolean equals(Object o) {
		//System.out.println("In equals()...");
		boolean flag=false;
		if(o instanceof Elections)
		{
			Elections e=(Elections)o;
			if(e.electionName == this.electionName)
				flag=true;
		}
		return flag;
	}
	
}
