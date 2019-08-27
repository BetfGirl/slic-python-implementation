package model;

public class Type2 {
	private int id;
	private Type t;
	private String name;
	
	public Type2(String name) {
		super();
		this.name = name;
	}

	public void init() {
		System.out.println("¥ÛµÒ√»√√");
	}
	
	public Type2(Type t) {
		super();
		this.t = t;
	}
	public Type getT() {
		return t;
	}
	public void setT(Type t) {
		this.t = t;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
