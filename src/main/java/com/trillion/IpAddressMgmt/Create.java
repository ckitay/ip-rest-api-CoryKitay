package com.trillion.IpAddressMgmt;

public class Create {

	private final long id;
	private final IpAddress ipAddress;

	public Create(long id, IpAddress ipAddress) {
		this.id = id;
		this.ipAddress = ipAddress;
	}

	public long getId() {
		return id;
	}

	public IpAddress getContent() {
		return ipAddress;
	}
}
