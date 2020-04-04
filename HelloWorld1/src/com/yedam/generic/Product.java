package com.yedam.generic;

public class Product<T, M>{//파라미터 2개이상 가능
	private T kind;
	private M model;
	
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}
	
}
