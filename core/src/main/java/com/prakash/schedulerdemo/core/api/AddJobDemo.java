package com.prakash.schedulerdemo.core.api;

import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component(immediate=true)
public class AddJobDemo {
	private static final Logger LOG = LoggerFactory.getLogger(AddJobDemo.class);
	
	@Reference
	private Scheduler scheduelr;
	
	@Activate
	public void init(){
		Runnable job = new Runnable() {
			
			@Override
			public void run() {
				LOG.info("Job scheduled using expression");
			}
		};
		
		try {
			scheduelr.addJob("test-job1", job, null, "1 * * * * ?", true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
