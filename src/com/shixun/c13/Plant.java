package com.shixun.c13;//
//
//  植物对象
//
//  @ Project : c13
//  @ File Name : Plant.java
//  @ Date : 2015/12/29
//  @ Author : zn
//
//


public class Plant {
	//血量
	private int hp;
	//攻击力
	private int ap;
	//防御力
	private int def;
	//太阳点
	private int sunNumber;
	//植物类型
	private String type;



	/**
	 * 攻击
	 */
	public void attack(Zombies zombies) {
		int off = ap - zombies.getDef();
		if(off > 0){
			zombies.setHp(zombies.getHp() - off);
		}
	}

	/**
	 * 防御
	 */
	public void defense() {
	
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSunNumber() {
		return sunNumber;
	}

	public void setSunNumber(int sunNumber) {
		this.sunNumber = sunNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
