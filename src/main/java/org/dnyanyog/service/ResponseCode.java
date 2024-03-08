package org.dnyanyog.service;

public class ResponseCode {
	/*INVALID_INPUT("001","Invalid input provided"),
	DATABASE_ERROR("002","error accessing database"),
	Authentication_Failed("003","Authentication failed"),
	Unauthorized_Access("005","Unauthorized access");*/
public final static  String  ADD_CUSTOMER_SUCCESS_STATUS = "Success";
public final static  String  ADD_CUSTOMER_SUCCESS_Message = "Customer added Successfully";

public final static  String  UPDATE_CUSTOMER_SUCCESS_STATUS = "Success";
public final static  String  UPDATE_CUSTOMER_SUCCESS_MESSAGE = "Customer details updated successfully";

public final static String  ADD_CUSTOMER_DUPLICATE_EMAIL_STATUS="Fail";
public final static String  ADD_CUSTOMER_DUPLICATE_EMAIL_MESSAGE="Email Already exists";

public final static String  CUSTOMER_Not_Found_STATUS="Fail";
public final static String  CUSTOMER_Not_Found_MESSAGE="Customer not found";
}
