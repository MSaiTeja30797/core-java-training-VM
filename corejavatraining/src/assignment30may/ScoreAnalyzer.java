package assignment30may;

import java.util.*;
public class ScoreAnalyzer {

	LinkedList<Integer>runsSecured;

	public ScoreAnalyzer(LinkedList<Integer>runsSecured) {
		super();
		this.runsSecured = runsSecured;
	}
	
	public void addRunsToList(int runs)
	{
		runsSecured.add(runs);
	}
	
	public int lowestRunsScored(int runs)
	{
		Collections.sort(runsSecured);
		return runsSecured.get(0);
	}
	public LinkedList<Integer>displayRuns()
	{
		return runsSecured;
	}
	
	public double CalcRunRate(int truns)
	{
		double runrate=0;
	         truns=0;
		
		for(Integer i:runsSecured)
		{
			truns=truns+i;
		}
		
		return runrate;
	}
	
}

