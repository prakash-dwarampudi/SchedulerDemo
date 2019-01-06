package com.prakash.schedulerdemo.core.whiteboard;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component(service= Runnable.class, immediate=true, property={"scheduler.period=10"})
public class SchedulerPeriodDemo implements Runnable{
	
	private static final Logger LOG = LoggerFactory.getLogger(SchedulerPeriodDemo.class);

	@Override
	public void run() {
		LOG.info("Printing from Scheduler Period Whiteboard");
	}

}
