public class Owner{
	private String name;
    private String contactNumber;
	
    public void setName(String name) {
        this.name = name;
		}

    public String getName() {
        return this.name; 
		}
		
	public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
		}

    public String getContactNumber() {
        return this.contactNumber;
		}
	
	public void displayinformation(){
	 System.out.println("Owner Name: " + this.name);
        System.out.println("Contact Number: " + this.contactNumber);
    }
}
	
	
	
	
	