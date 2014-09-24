package com.focusit.soap.service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.w3c.dom.Element;

/**
 * Created by Denis V. Kirpichenkov on 24.09.14.
 */
@Endpoint
public class SoapServiceEndpoint {

	private final static String NAMESPACE="http://naumen.ru/smp/soap";

	@PayloadRoot(localPart = "createRequest", namespace = NAMESPACE)
	public void handleCreateRequest(@RequestPayload Element holidayRequest) throws Exception {
		System.out.println("Got it create");
	}

	@PayloadRoot(localPart = "findRequest", namespace = NAMESPACE)
	public void handleFindRequest(@RequestPayload Element holidayRequest) throws Exception {
		System.out.println("Got it find");
	}

	@PayloadRoot(localPart = "updateRequest", namespace = NAMESPACE)
	public void handleUpdateRequest(@RequestPayload Element holidayRequest) throws Exception {
		System.out.println("Got it update");
	}

	@PayloadRoot(localPart = "deleteRequest", namespace = NAMESPACE)
	public void handleDeleteRequest(@RequestPayload Element holidayRequest) throws Exception {
		System.out.println("Got it delete!");
	}
}
