package org.idsoy.test.esper;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

class AppleListener implements UpdateListener {

	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		if (newEvents != null) {
			Double avg = (Double) newEvents[0].get("avg(price)");
			System.out.println("Apple's average price is " + avg);
		}
	}

}