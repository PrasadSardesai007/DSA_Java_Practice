package questions;

public class Question1 {

	/**
	 * 
	 * 1. What is Request Specification ??
	 * 
	 * ----> Request Specification in Rest Assured is an interface.
	 * It is a way to set up all the details for making the API call.
	 * It allows you to define things like:
	 * Base URL: Where the API is located.
	 * Path Parameters: Specific parts of the URL for identifying resources.
	 * Query Parameters: Extra info added to the URL to filter results.
	 * Headers: Additional information, like authentication tokens.
	 * Body: Information sent with requests like POST or PUT.
	 * Authentication: How to verify user identity.
	 * 
	 * You can create a request specification by setting up all the details
	 * and group them together, so you don't have to repeat them every time you
	 * make the request
	 * 
	 * Once you have a request specification, you can easily reuse it in 
	 * different tests.
	 */
	
	/**
	 * TAO Digital (What is difference between Path parameters and
	 * QUery Parameters ?)
	 * 
	 * 2. What is path parameter?
	 * 
	 * ---> Path parameters is variable which is always embedded into baseUri which can be used
	 * to identify a specific resource or resources.
	 * 
	 * e.g.
	 * https://api.example.com/orderId/{5434321}
	 * 
	 * https://api.streaming.com/accountId/{A54654524}
	 * 
	 * 
	 * 3. What is query parameters?
	 * 
	 * --> Query parameters are used to filter , sort or customize the API responses. These are key & value pairs
	 * always embedded into baseuri after a ?.
	 * Query Parameters are optional. They are used to sort, filter or customize the request data
	 * based on criteria. 
	 * 
	 * 
	 */
	
}



