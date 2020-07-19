package com.forum.units;

import java.util.Date;

import com.forum.util.Utility;

public abstract class AbstractEntity {

	private Date created;
	private long id;

	public abstract void autoGenerateId();

	public Date getCreated() {
		return created;
	}

	public void setCreated() {
		this.created = Utility.getCurrentDate();
	}

	public long getId(){
		return  this.id;
	};

	protected void setId(Long lastEntry){
		this.id = lastEntry;
	};
}
