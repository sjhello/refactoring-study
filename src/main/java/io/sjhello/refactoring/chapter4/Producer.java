package io.sjhello.refactoring.chapter4;

public class Producer {

	private Province province;

	private String name;

	private Integer cost;

	private Integer production;

	public Producer(Province province, Producer producer) {
		this.province = province;
		this.name = producer.getName();
		this.cost = producer.getCost();
		this.production = producer.getProduction();
	}

	public Producer(String name, Integer cost, Integer production) {
		this.name = name;
		this.cost = cost;
		this.production = production;
	}

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

	public Integer getProduction() {
		return production;
	}

	public void setProduction(String amountStr) {
		Integer amount = Integer.parseInt(amountStr);
		Integer newProduction = amount.equals(0) ? 0 : amount;
		this.province.setTotalProduction(newProduction - this.production);
		this.production = newProduction;
	}
}
