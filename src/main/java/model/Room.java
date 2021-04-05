package model;

public class Room {
	private int hotelId;
	private int roomId;
	private String roomType;
	private int minHosts;
	private int maxHosts;
	private boolean privateBathroom;
	private boolean privateToilet;
	private boolean mountainView;
	private boolean seaView;
	private boolean balcony;
	private boolean ac;
	private boolean minibar;
	private boolean flatScreenTv;
	public Room() {
	}
	
	public Room(int hotelId, int roomId, String roomType, int minHosts, int maxHosts, boolean privateBathroom,
			boolean privateToilet, boolean mountainView, boolean seaView, boolean balcony, boolean ac, boolean minibar,
			boolean flatScreenTv) {
		super();
		this.hotelId = hotelId;
		this.roomId = roomId;
		this.roomType = roomType;
		this.minHosts = minHosts;
		this.maxHosts = maxHosts;
		this.privateBathroom = privateBathroom;
		this.privateToilet = privateToilet;
		this.mountainView = mountainView;
		this.seaView = seaView;
		this.balcony = balcony;
		this.ac = ac;
		this.minibar = minibar;
		this.flatScreenTv = flatScreenTv;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getMinHosts() {
		return minHosts;
	}
	public void setMinHosts(int minHosts) {
		this.minHosts = minHosts;
	}
	public int getMaxHosts() {
		return maxHosts;
	}
	public void setMaxHosts(int maxHosts) {
		this.maxHosts = maxHosts;
	}
	public boolean isPrivateBathroom() {
		return privateBathroom;
	}
	public void setPrivateBathroom(boolean privateBathroom) {
		this.privateBathroom = privateBathroom;
	}
	public boolean isPrivateToilet() {
		return privateToilet;
	}
	public void setPrivateToilet(boolean privateToilet) {
		this.privateToilet = privateToilet;
	}
	public boolean isMountainView() {
		return mountainView;
	}
	public void setMountainView(boolean mountainView) {
		this.mountainView = mountainView;
	}
	public boolean isSeaView() {
		return seaView;
	}
	public void setSeaView(boolean seaView) {
		this.seaView = seaView;
	}
	public boolean isBalcony() {
		return balcony;
	}
	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public boolean isMinibar() {
		return minibar;
	}
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}
	public boolean isFlatScreenTv() {
		return flatScreenTv;
	}
	public void setFlatScreenTv(boolean flatScreenTv) {
		this.flatScreenTv = flatScreenTv;
	}
	
	
}
