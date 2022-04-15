package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order status: " + getStatus() + "\n");
		sb.append("Client: " + getClient().getName());
		sb.append("Order items:\n");
		sb.append("ORDER SUMARY:\nOrder moment: " +
				getItems().toString());
		return sb.toString();
	}
}
