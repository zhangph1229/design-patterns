package cn.edu.neu.zhangph.createpattern.prototype;

import java.io.Serializable;
import java.util.Date;


@SuppressWarnings("serial")
public class Sheep implements Cloneable,Serializable{
	private String sname;
	private Date birthday;
	
	public Sheep(String sname, Date birthday){
		this.sname = sname;
		this.birthday = birthday;
	}
	
	public Sheep() {}
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//Ç³¿ËÂ¡
		return super.clone();
	}
}
