import java.util.ArrayList;

public class tourism extends  booking {
    ArrayList<packages> tourPackageList = new ArrayList<>();
    String city;
    int dateFrom;
    int dateTo;

    public void createPackages( int dateFrom,int dateTo, String city, double cost, String hotelName, String description){
        packages p1=new packages(dateFrom,dateTo,city,cost,hotelName,description);
        tourPackageList.add(p1);
    }
    @Override
    public String toString() {
        return "tourism{" +

                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", residence='" + residence + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
