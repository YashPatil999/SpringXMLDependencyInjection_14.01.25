package com.entity;

import java.util.List;

public class Order {
	private int orderId;
	private String customerName;
	private String orderDate;
	private double totalAmount;

	private List<Product> products;

	public Order() {
	}

	public Order(int orderId, String customerName, String orderDate, List<Product> products, double totalAmount) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.products = products;
		this.totalAmount = totalAmount;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Order{" + "orderId=" + orderId + ", customerName='" + customerName + '\'' + ", orderDate='" + orderDate
				+ '\'' + ", products=" + products + ", totalAmount=" + totalAmount + '}';
	}
}
