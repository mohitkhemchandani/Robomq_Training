package Assignment3;

import java.util.HashSet;
import java.util.Set;

public class ElectionHashSet {
		public static void main(String[] args)
		{
			HashSet<Elections>parties = new HashSet<Elections>();
			
			parties.add(new Elections(1, "Party1", "1-1-2019","District1","Contituency1","10-1-2019"));
			parties.add(new Elections(2, "Party2", "1-1-2019","District2","Contituency2","10-2-2019"));
			parties.add(new Elections(3, "Party3", "1-3-2019","District3","Contituency2","10-3-2019"));
			parties.add(new Elections(3, "Party3", "1-3-2019","District3","Contituency2","10-3-2019"));			
		
		//System.out.println(parties);
			//Set<String>set = new HashSet<String>();
			for (Elections s:parties) {
				if(s.getElectiondate().equals(s.getElectiondate()))
				System.out.println(s);
		}
}
}
