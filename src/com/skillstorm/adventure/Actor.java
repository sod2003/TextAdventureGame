package com.skillstorm.adventure;

public class Actor {	
	private int muscle;
	private int mysticality;
	private int moxie;
	
	protected Actor(int muscle, int mysticality, int moxie) {
		this.muscle = muscle;
		this.mysticality = mysticality;
		this.moxie = moxie;
	}

	public int getMuscle() {
		return muscle;
	}

	public void setMuscle(int muscle) {
		this.muscle = muscle;
	}

	public int getMysticality() {
		return mysticality;
	}

	public void setMysticality(int mysticality) {
		this.mysticality = mysticality;
	}

	public int getMoxie() {
		return moxie;
	}

	public void setMoxie(int moxie) {
		this.moxie = moxie;
	}
	
	
}
