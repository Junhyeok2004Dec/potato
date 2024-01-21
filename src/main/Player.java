package main;

import java.util.ArrayList;

public class Player extends Entity{

	private int id;
	private int lv, nowXp, totalXp;


	private ArrayList<Item> inventory;

	public Player(int hp, String name) {
		super(hp, name, 1, 1, 1, 1, 1);
	}

	public Player(String name) {
		super(100, name, 1, 1, 1, 1, 1);
	}

	public void setHp(int amount) {
		super.setHp(amount);
	}

	public int getHp() {
		return super.getHp();
	}


	// 플레이어 레벨링 시스템? 구현
}
