package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private String city;
	private String region;
	private String email;
	private String phone;
	private String description;
	//I will need a relation for something like this later:
//	private Map<String, Integer> numberOfRoomsPerType;
	private int numberOfRooms;
	private double rating;
	private double price;
	private short stars;
	private boolean pool;
	private boolean spa;
	private boolean wifi;
	private boolean parking;
	private boolean airportShuttle;
	private boolean pets;
	private boolean electricStation;
	private boolean recommended;
	private int discount;

	public Hotel() {
	}

	public Hotel(int id, String name, String address, String city, String region, String email, String phone,
			String description, int numberOfRoomsPerType, double rating, double price, short stars,
			boolean pool, boolean spa, boolean wifi, boolean parking, boolean airportShuttle, boolean pets,
			boolean electricStation, boolean recommended, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.region = region;
		this.email = email;
		this.phone = phone;
		this.description = description;
		this.numberOfRooms = numberOfRoomsPerType;
		this.rating = rating;
		this.price = price;
		this.stars = stars;
		this.pool = pool;
		this.spa = spa;
		this.wifi = wifi;
		this.parking = parking;
		this.airportShuttle = airportShuttle;
		this.pets = pets;
		this.electricStation = electricStation;
		this.recommended = recommended;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfRoomsPerType() {
		return numberOfRooms;
	}

	public void setNumberOfRoomsPerType(int numberOfRoomsPerType) {
		this.numberOfRooms = numberOfRoomsPerType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public short getStars() {
		return stars;
	}

	public void setStars(short stars) {
		this.stars = stars;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean isSpa() {
		return spa;
	}

	public void setSpa(boolean spa) {
		this.spa = spa;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isAirportShuttle() {
		return airportShuttle;
	}

	public void setAirportShuttle(boolean airportShuttle) {
		this.airportShuttle = airportShuttle;
	}

	public boolean isPets() {
		return pets;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public boolean isElectricStation() {
		return electricStation;
	}

	public void setElectricStation(boolean electricStation) {
		this.electricStation = electricStation;
	}

	public boolean isRecommended() {
		return recommended;
	}

	public void setRecommended(boolean recommended) {
		this.recommended = recommended;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}


}
