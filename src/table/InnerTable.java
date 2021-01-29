package tr.edu.deu.ceng.coffie.entity.table;

import tr.edu.deu.ceng.coffie.entity.Order;
import tr.edu.deu.ceng.coffie.entity.exceptions.OrderNotValidException;

public class InnerTable extends Table {
	public InnerTable(int id, int sitCount) {
		super(id, sitCount);
	}

	@Override
	public void addOrder(Order order) throws OrderNotValidException {
		if (order.getMenuItem().isOuter())
			throw new OrderNotValidException(order, this);
		this.orders.add(order);

	}
}