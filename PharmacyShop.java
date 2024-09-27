public class PharmacyShop {
    private Person owner;
    private Address address;
    private List<Medicine> medicines;
    private double totalRevenue;

    public PharmacyShop(Person owner, Address address) {
        this.owner = owner;
        this.address = address;
        this.medicines = new ArrayList<>();
        this.totalRevenue = 0.0;
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void updateMedicine(String medicineId, Medicine updatedMedicine) {
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getMedicineId