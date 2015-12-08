package com.avenuecode.app.rws;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.avenuecode.app.entities.Order;
import com.avenuecode.app.entities.Product;
import com.google.gson.Gson;

/**
 * Class responsible for handling orders.
 * 
 * @author lucasfrossard@gmail.com
 *
 */
@Path("order")
public class OrderService {

	/**
	 * Place an order
	 * 
	 * @return json indicating success or failure of the operation
	 */
	@POST
	@Path("/place")
	@Produces(MediaType.APPLICATION_JSON)
	public String placeOrder() {
		// Product must exist
		Gson gson = new Gson();
		String json = gson.toJson(Boolean.TRUE);
		return json;
	}

	/**
	 * Modify placed orders, receives the id and a list of products and update
	 * that order
	 * 
	 * @return json indicating success or failure of the operation
	 */
	@POST
	@Path("/change")
	@Produces(MediaType.APPLICATION_JSON)
	public String change() {
		Gson gson = new Gson();
		String json = gson.toJson(Boolean.TRUE);
		return json;
	}

	/**
	 * List orders
	 * 
	 * @return json containing all orders placed
	 */
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public String list() {
		Collection<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Botas"));
		products.add(new Product(1, "Cadarço"));
		Order anOrder = new Order(1, products);
		Collection<Order> orders = new ArrayList<Order>();
		orders.add(anOrder);
		Gson gson = new Gson();
		String json = gson.toJson(orders);
		return json;
	}

	/**
	 * Details of a given order
	 * 
	 * @param id
	 * @return details of a given order
	 */
	@GET
	@Path("/details/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String details(@PathParam("id") int id) {
		// Id must be valid
		return null;

	}

}
