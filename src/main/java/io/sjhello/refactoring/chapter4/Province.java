package io.sjhello.refactoring.chapter4;

import java.util.List;

public class Province {

	private String name;

	private List<Producer> producers;

	private Integer totalProduction = 0;

	private Integer demand;

	private Integer price;

	public Province(String name, List<Producer> producers, Integer totalProduction, Integer demand, Integer price) {
		this.name = name;
		this.producers = producers;
		this.totalProduction = totalProduction;
		this.demand = demand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public List<Producer> getProducers() {
		return producers;
	}

	public Integer getTotalProduction() {
		return totalProduction;
	}

	public Integer getDemand() {
		return demand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProducers(List<Producer> producers) {
		this.producers = producers;
	}

	public void setTotalProduction(Integer totalProduction) {
		this.totalProduction = totalProduction;
	}

	public void setDemand(Integer demand) {
		this.demand = demand;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
