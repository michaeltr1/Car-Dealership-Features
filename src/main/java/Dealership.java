import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicles> inventory = new ArrayList<>();

public void addVehicle(Vehicles vehicle) {
    inventory.add(vehicle);
}
public ArrayList<Vehicles> getallVehicles() {
    return inventory;

public Dealership(String name,String address,String phone)
    this.name = name;
    this.address = address;
    this.phone = phone;


    //adding vehicles to inventory
public void addVehicle(Vehicles vehicles){
    return inventory;
    }
    Dealership dealership = new Dealership("Mike's Motors", "San Jose", "555-1234");

    dealership.addVehicle(new Vehicles(/* vehicle information */));




