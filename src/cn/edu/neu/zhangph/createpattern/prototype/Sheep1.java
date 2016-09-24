package cn.edu.neu.zhangph.createpattern.prototype;

import java.util.Date;

public class Sheep1 implements Cloneable {
	private String sname;
	private Date birthday;

	public Sheep1(String sname, Date birthday) {
		this.sname = sname;
		this.birthday = birthday;
	}

	public Sheep1() {
	}

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
		// 深克隆
		Object obj = super.clone();
		Sheep1 s = (Sheep1) obj;
		s.birthday = (Date) this.birthday.clone();
		return obj; // 直接克隆Object的clone方法
	}
}
