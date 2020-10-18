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
	
	private String[] wholeAddress; // Not intended for data store

	protected IpAddress() {}	
	
	public IpAddress(Long block, Long part1, Long part2, Long part3, Long part4) {
		this.block = block;		
		this.part1 = part1;
		this.part2 = part2;
		this.part3 = part3;
		this.part4 = part4;
		this.status = "Available";
	}
	
	//IpAddress(String address)
	//{
		//CreateIpAddress(address);		
	//}
	
	/*
	protected void CreateIpAddress(String addressBlock) {
		
		wholeAddress = addressBlock.split("/",2);
		String[] address = wholeAddress[0].split("\\.",4);
		
		String blockString = wholeAddress[1];
		block = Long.parseLong(blockString);
		
		// Just doing class C / 24 block for now
		for(int i=0; i < block; i++)
		{
			;
		}		
	}*/	
	
	/*
	protected void CreateIpAddress(String[] address )	{
		
		part1 = Long.parseLong(address[0]);
		part2 = Long.parseLong(address[1]);
		part3 = Long.parseLong(address[2]);
		part4 = Long.parseLong(address[3]);
		
		status = "Available";
	}*/

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%d, firstName='%s', lastName='%s']",
				id, block, status);
	}

	public Long getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}
}
