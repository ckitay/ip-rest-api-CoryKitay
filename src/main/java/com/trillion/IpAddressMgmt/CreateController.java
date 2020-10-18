package com.trillion.IpAddressMgmt;

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
//import org.hibernate.mapping.List;
import java.util.List;

@RestController
public class CreateController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/create")
	public String create(@RequestParam(value = "addressBlock") String addressBlock) {		
		
		CreateIpAddressBlock(addressBlock);
		
		return "";// ipAddress.toString();
		
		//return new IpAddress(counter.incrementAndGet(), // ToDo Verify PK stuff works? 
				//String.format(template, block));
	}
	
	protected void CreateIpAddressBlock(String addressBlock) {
		
		String[] wholeAddress = addressBlock.split("/",2);
		String[] address = wholeAddress[0].split("\\.",4);
		
		String blockString = wholeAddress[1];
		long block = Long.parseLong(blockString);
		
		List<IpAddress> ipAddresses = new ArrayList<IpAddress>();
		
		// Just doing class C / 24 block for now
		for(long i=1; i < 256L; i++)
		{
			//IpAddress ipAddress; // ipAddresses.get(i);
			
			// ToDo, Just doing class C block 24 for now.
			IpAddress ipAddress = new IpAddress(
					block, 
					Long.parseLong(address[0]),
					Long.parseLong(address[1]),
					Long.parseLong(address[2]),
					i
					);
			
			ipAddresses.add(ipAddress);
			
			//part1 = Long.parseLong(address[0]);
			//part2 = Long.parseLong(address[1]);
			//part3 = Long.parseLong(address[2]);
			//part4 = Long.parseLong(address[3]);
		}		
		
		String DebugBreakpoint = "";
	}
}
