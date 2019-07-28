package com.feliphecosta.sistemarpgmongodb.util;

import java.io.Serializable;

public class Level implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer level;
	private Integer xpCurrent;
	private Integer xpToNextLevel;
	
	public Level() {}

	public Level(Integer level, Integer xpCurrent, Integer xpToNextLevel) {
		this.level = level;
		this.xpCurrent = xpCurrent;
		this.xpToNextLevel = xpToNextLevel;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getXpCurrent() {
		return xpCurrent;
	}

	public void setXpCurrent(Integer xpCurrent) {
		this.xpCurrent = xpCurrent;
	}

	public Integer getXpToNextLevel() {
		return xpToNextLevel;
	}

	public void setXpToNextLevel(Integer xpToNextLevel) {
		this.xpToNextLevel = xpToNextLevel;
	}
	
}
