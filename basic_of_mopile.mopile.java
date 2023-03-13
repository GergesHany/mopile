package hello;

public class basic_of_mopile {

    protected int id;
    protected String brand, model, processor, storage,
    ram, Rcamera, Fcamera,
    screen, battery, price, OS;
    
    public basic_of_mopile() {}
    
	void set_data() {
		System.out.println("\t\t____________________________________________________");
		System.out.println("\t\t| ID:                   | " + id);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| model:                | " + model);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| brand:                | " + brand);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| processor             | " + processor);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| storage:              | " + storage);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| battery:              |" + battery);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| Rcamera:              | " + Rcamera);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| Fcamera:              | " + Fcamera);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| screen:               | " + screen);
		System.out.println("\t\t|_______________________|___________________________");
		System.out.println("\t\t| price:                | " + price);
		System.out.println("\t\t|_______________________|____________________________");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRcamera() {
		return Rcamera;
	}

	public void setRcamera(String rcamera) {
		Rcamera = rcamera;
	}

	public String getFcamera() {
		return Fcamera;
	}

	public void setFcamera(String fcamera) {
		Fcamera = fcamera;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public basic_of_mopile(int id, String brand, String model, String processor, String storage, String ram, String rcamera, String fcamera, String screen, String battery, String price, String OS) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.storage = storage;
		this.ram = ram;
		this.Rcamera = rcamera;
		this.Fcamera = fcamera;
		this.screen = screen;
		this.battery = battery;
		this.price = price;
		this.OS = OS;
	}
	
 
}
