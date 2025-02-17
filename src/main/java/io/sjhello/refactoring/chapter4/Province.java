package io.sjhello.refactoring.chapter4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Province {

	private String name;

	private List<Producer> producers;

	private Integer totalProduction;

	private Integer demand;

	private Integer price;

	public Province(String name, List<Producer> producers, Integer totalProduction, Integer demand, Integer price) {
		this.name = name;
		this.producers = producers;
		this.totalProduction = totalProduction;
		this.demand = demand;
		this.price = price;
	}

	public Province(String name, List<Producer> producers, Integer demand, Integer price) {
		this.name = name;
		this.producers = new ArrayList<>();
		this.totalProduction = 0;
		this.demand = demand;
		this.price = price;
		producers.forEach(
			producer -> this.addProducer(new Producer(this, producer))
		);
	}

	private void addProducer(Producer producer) {
		this.producers.add(producer);
		this.totalProduction += producer.getProduction();
	}

	public Integer getShortFall() {
		return this.demand - this.totalProduction;
	}

	public Integer getProfit() {
		return this.getDemandValue() - this.getDemandCost();
	}

	public Integer getDemandValue() {
		return 0;
	}

	public Integer getSatisfiedDemand() {
		return Math.min(this.demand, this.totalProduction);
	}

	public Integer getDemandCost() {
		int remainingDemand = this.demand;
		int result = 0;

		this.producers.sort(Comparator.comparingInt(Producer::getCost));
		for (Producer producer : this.producers) {
			int contribution = Math.min(remainingDemand, producer.getProduction());
			remainingDemand -= contribution;
			result += contribution * producer.getCost();
		}
		return result;
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
