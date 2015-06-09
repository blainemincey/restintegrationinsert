/**
 * 
 */
package com.mycompany.restintegrationinsert;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author bmincey
 *
 */
public class MessageProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("=== MessageProcessor.process===");
		
		exchange.getIn().setHeader(Exchange.HTTP_METHOD, "POST");
		exchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
	
	}
	
}
