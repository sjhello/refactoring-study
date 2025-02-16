package io.sjhello.refactoring.chapter4;

public class Producer {

	private Province province;

	private String name;

	private Integer cost;

	private Integer productions;

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getProductions() {
		return productions;
	}

	public void setProductions(Integer productions) {
		this.productions = productions;
	}
}
