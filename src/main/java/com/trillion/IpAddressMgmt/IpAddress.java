package com.trillion.IpAddressMgmt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IpAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long block;
	private String status;
	private Long part1;
	private Long part2;
	private Long part3;
	private Long part4;
	
	protected IpAddress() {}	
	
	public IpAddress(Long block, Long part1, Long part2, Long part3, Long part4) {
		this.block = block;		
		this.part1 = part1;
		this.part2 = part2;
		this.part3 = part3;
		this.part4 = part4;
		this.status = "Available";
		this.id = part4;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%d, firstName='%s', lastName='%s']",
				id, block, status);
	}

	public Long getId() {
		return id;
	}
	
	public String getAddress() {
		return part1.toString() + "." + 
				part2.toString() + "." +
				part3.toString() + "." +
				part4.toString() + "/" +
				block.toString();
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
}
