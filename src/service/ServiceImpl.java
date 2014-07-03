package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.GsonBuilder;

@Path("/myservice/")
public class ServiceImpl {

	@GET
	@Path("/test")
	@Produces("application/json")
	public Response getTest() {
		Response.ResponseBuilder b = Response.status(Status.OK);
		GsonBuilder gb = new GsonBuilder();
		b.entity(gb.create().toJson("test"));
		return b.build();
	}
	
	@GET
	@Path("/test2")
	@Produces("application/json")
	public Response getTest2() {
		Response.ResponseBuilder b = Response.status(Status.OK);
		GsonBuilder gb = new GsonBuilder();
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		b.entity(gb.create().toJson(list));
		return b.build();
	}

}