package demo.domain;

import java.util.UUID;

public class Task 
{


	private String username;
	private String description; 
	private String status;
	private String id = UUID.randomUUID().toString();;
	
	public Task() 
	{
		
	}
	
	public Task(String username, String description, String status) {
		this.username = username;
		this.description = description;
		this.status = status;
	}	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
