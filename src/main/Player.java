package main;

public class Player {

	private int id;
	private String name;
	private int lv, nowXp, totalXp;



	public void init() {
		this.id = 0;
		this.name = " ";
		this.lv = 0;
		this.nowXp = 0;
		this.totalXp = 0;
	}

	public void run() {

		totalXp = lv^2 + 30*lv;

		if(totalXp <= nowXp) {
			totalXp -= nowXp;
			lv++;

		}

	}
}
