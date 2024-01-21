package main;

public class Entity {

	private int hp;
	private int atk, matk, def, mdef, dex;
	private String name;



	public Entity(int hp, String name) {
		this.name = name;
		this.hp = hp;
		this.atk = 0;
		this.matk = 0;
		this.def = 0;
		this.mdef = 0;
		this.dex = 0;
	}

	public Entity(int hp, String name, int atk, int matk, int def, int mdef, int dex) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.matk = matk;
		this.def = def;
		this.mdef = mdef;
		this.dex = dex;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getMatk() {
		return matk;
	}

	public void setMatk(int matk) {
		this.matk = matk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getMdef() {
		return mdef;
	}

	public void setMdef(int mdef) {
		this.mdef = mdef;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
