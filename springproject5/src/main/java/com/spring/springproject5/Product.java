package com.spring.springproject5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_spring_info")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int  productid;
	@Column
	private String productname;
	@Column
	private long productprice;
	//private Vendor vendor;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public long getProductprice() {
		return productprice;
	}
	public void setProductprice(long productprice) {
		this.productprice = productprice;
	}
	/*public Vendor getVendor() {
		return vendor;
	}
	*/
	
	
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ "]";
	}
	public Product(int productid, String productname, long productprice, Vendor vendor) {
		
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		//this.vendor = vendor;
		System.out.println("inside parameterised constructor");
	}

	public Product() {
		
	
		super();
		// TODO Auto-generated constructor stub
		System.out.println("inside default constructor");
	}
	public Product(Vendor vendor) {
		super();
		//this.vendor = vendor;
	}
	
	
	
	
	
}
	
	
	class Vendor{
		private int venid;
		private String vendtype;
		public int getVenid() {
			return venid;
		}
		public void setVenid(int venid) {
			this.venid = venid;
		}
		public String getVendtype() {
			return vendtype;
		}
		public void setVendtype(String vendtype) {
			this.vendtype = vendtype;
		}
		/*@Override
		public String toString() {
			return "Vendor [venid=" + venid + ", vendtype=" + vendtype + "]";
		}*/
		public Vendor(int venid, String vendtype) {
			super();
			this.venid = venid;
			this.vendtype = vendtype;
			System.out.println("inside vendor parameterised constructor");
		}
		public Vendor() {
			super();
			System.out.println("inside vendor default constructor");
			// TODO Auto-generated constructor stub
		}
		
		
		
	}
	
	
	


