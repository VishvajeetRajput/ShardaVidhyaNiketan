package com.sharda.request;

public class ResponseMessage {

	// Response Code
	public final static String SUCCESS = "200";
	public final static String UNAUTHORISED = "201";
	public final static String FAILED = "201";
	public final static String MISSING_PARAMETER = "201";
	public final static String CONNECTION_TIMEOUT = "203";
	public final static String SOMETHING_WENT_WRONG = "203";

	// Response Key
	public final static String CODE = "code";
	public final static String DESCRIPTION = "description";
	public final static String FIELD = "field";
	public final static String STATUS = "status";

	public final static String baseUrl= "http://localhost:8007/v2/";
	public final static String baseUrlWithoutV2= "http://localhost:8007/";


//	public final static String baseUrl= "https://spring-mvc-production.up.railway.app/v2/";
//	public final static String baseUrlWithoutProd= "https://spring-mvc-production.up.railway.app/";

	
//	public final static String DESCRIPTION = "description";
	


}