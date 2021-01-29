package tr.edu.deu.ceng.coffie.entity.table;

import java.util.List;

import tr.edu.deu.ceng.coffie.entity.Order;
import tr.edu.deu.ceng.coffie.entity.exceptions.OrderNotValidException;

public abstract class Table {
	private int id;
	private int sitCount;

	protected List<Order> orders;

	public Table(int id, int sitCount) {
		super();
		this.id = id;
		this.sitCount = sitCount;
	}

	public abstract void addOrder(Order order) throws OrderNotValidException;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSitCount() {
		return sitCount;
	}

	public void setSitCount(int sitCount) {
		this.sitCount = sitCount;
	}
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
