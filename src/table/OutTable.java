package tr.edu.deu.ceng.coffie.entity.table;

import tr.edu.deu.ceng.coffie.entity.Order;

public class OutTable extends Table{

	public OutTable(int id, int sitCount) {
		super(id, sitCount);
	}

	@Override
	public void addOrder(Order order) {
		this.orders.add(order);
	}

}
