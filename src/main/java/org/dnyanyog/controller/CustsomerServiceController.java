package org.dnyanyog.controller;

import org.dnyanyog.dto.CustomerRequest;
import org.dnyanyog.dto.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class CustsomerServiceController {

	@Autowired
	org.dnyanyog.service.CustomerServiceImpl CustomerServiceImpl;

	@PostMapping(path = "/api/v1/customer/add", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public CustomerResponse addCustomerDetails(@Valid @RequestBody CustomerRequest request) {
		return CustomerServiceImpl.addCustomerDetails(request);
	}

	@PostMapping(path = "/api/v1/customer/update/{id}", consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public CustomerResponse update(@PathVariable long id, @Valid @RequestBody CustomerRequest request) {
		return CustomerServiceImpl.updateCustomerDetails(id, request);
	}


}
