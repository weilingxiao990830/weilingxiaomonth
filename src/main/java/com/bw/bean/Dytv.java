package com.bw.bean;

public class Dytv {

	private Integer did;
	private String dname;
	private String person;
	private Integer price;
	private String startdate;
	private Integer ctime;
	private Integer tid;
	private Integer dyear;
	private String des;
	private Integer dcode;
	
	private String tname;
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public Integer getCtime() {
		return ctime;
	}
	public void setCtime(Integer ctime) {
		this.ctime = ctime;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getDyear() {
		return dyear;
	}
	public void setDyear(Integer dyear) {
		this.dyear = dyear;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Integer getDcode() {
		return dcode;
	}
	public void setDcode(Integer dcode) {
		this.dcode = dcode;
	}
	public Dytv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dytv(Integer did, String dname, String person, Integer price, String startdate, Integer ctime, Integer tid,
			Integer dyear, String des, Integer dcode) {
		super();
		this.did = did;
		this.dname = dname;
		this.person = person;
		this.price = price;
		this.startdate = startdate;
		this.ctime = ctime;
		this.tid = tid;
		this.dyear = dyear;
		this.des = des;
		this.dcode = dcode;
	}
	@Override
	public String toString() {
		return "Dytv [did=" + did + ", dname=" + dname + ", person=" + person + ", price=" + price + ", startdate="
				+ startdate + ", ctime=" + ctime + ", tid=" + tid + ", dyear=" + dyear + ", des=" + des + ", dcode="
				+ dcode + "]";
	}
	
	
	
	
	
	
}
