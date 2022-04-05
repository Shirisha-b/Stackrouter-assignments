

import java.util.list;

public class Traveller {

    private int id;
    private String travelType;
    private double price;
    private List<String> locations;

    public Traveller(int id, String travellerType, double price, String locations) 
{
        this.id = id;
        this.travelType = travelType;
        this.price = price;
        this.locations = locations;
    }


   
    public int getId() {
        return id;
    }

    public void setId(int id) {
       this.id=id;

    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(List travelType) {
        this.travelType = travelType;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
     this.price = price;

    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
      this.locations = locations;

    } 

}
