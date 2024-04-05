package br.com.microservices.orchestrated.orchestratorservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ETopics {
	START_SAGE("start-saga-v1"),
	BASE_ORCHESTRATOR("orchestrator-v1"),
	FINISH_SUCCESS("finish-success-v1"),
	FINISH_FAIL("finish-fail-v1"),
	PRODUCT_VALIDATION_SUCCESS("product-success-v1"),
	PRODUCT_VALIDATION_FAIL("product-fail-v1"),
	INVENTORY_VALIDATION_SUCCESS("inventory-success-v1"),
	INVENTORY_VALIDATION_FAIL("inventory-fail-v1"),
	PAYMENT_VALIDATION_SUCCESS("payment-success-v1"),
	PAYMENT_VALIDATION_FAIL("payment-fail-v1"),
	NOTIFY_ENDING("notify-ending-v1");

	private final String topic;
}
