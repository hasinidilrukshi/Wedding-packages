package service_package;

public class pakageModel {
	private int id;
	private String title;
	private String description;
	private String price;
	private String event_duration;
	private String max_guests;
	private String event_type;
	private String package_type;
	
	
	public pakageModel(int id, String title, String description, String price, String event_duration, String max_guests,
			String event_type, String package_type) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.event_duration = event_duration;
		this.max_guests = max_guests;
		this.event_type = event_type;
		this.package_type = package_type;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getEvent_duration() {
		return event_duration;
	}


	public void setEvent_duration(String event_duration) {
		this.event_duration = event_duration;
	}


	public String getMax_guests() {
		return max_guests;
	}


	public void setMax_guests(String max_guests) {
		this.max_guests = max_guests;
	}


	public String getEvent_type() {
		return event_type;
	}


	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}


	public String getPackage_type() {
		return package_type;
	}


	public void setPackage_type(String package_type) {
		this.package_type = package_type;
	}
	
	
}
