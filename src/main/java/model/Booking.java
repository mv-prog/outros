package model;
import java.sql.Date;

public class Booking {
		private String email;
		private int hotelId;
		// we will need a relation roomType to numberOfRooms later
//		private Map<String, Integer>[] roomsBooked;
		private int roomsBooked;
		private int adults;
		private int children;
		private Date checkinDate;
		private Date checkoutDate;
		private boolean cancelled;
		private boolean completed;
		private boolean breakfastIncluded;
		private double totalPrice;
		private String review;
		private int rating;

		public Booking() {
		}
		/**Constructor para crear reserva  nueva, sin cancelar, completar, review o rating*/
		public Booking(String email, int hotelId, int roomsBooked, int adults, int children,
				Date checkinDate, Date checkoutDate, boolean breakfastIncluded, double totalPrice) {
			this.email = email;
			this.hotelId = hotelId;
			this.roomsBooked = roomsBooked;
			this.adults = adults;
			this.children = children;
			this.checkinDate = checkinDate;
			this.checkoutDate = checkoutDate;
			this.totalPrice = totalPrice;
			this.breakfastIncluded = breakfastIncluded;
		}
		public Booking(String email, int hotelId,int roomsBooked, int adults, int children,
				Date checkinDate, Date checkoutDate, boolean cancelled, boolean completed, 
				boolean breakfastIncluded, double totalPrice, String review, int rating) {
			super();
			this.email = email;
			this.hotelId = hotelId;
			this.roomsBooked = roomsBooked;
			this.adults = adults;
			this.children = children;
			this.checkinDate = checkinDate;
			this.checkoutDate = checkoutDate;
			this.cancelled = cancelled;
			this.completed = completed;
			this.totalPrice = totalPrice;
			this.breakfastIncluded = breakfastIncluded;
			this.review = review;
			this.rating = rating;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getHotelId() {
			return hotelId;
		}
		public void setHotelId(int hotelId) {
			this.hotelId = hotelId;
		}
		public int getRoomsBooked() {
			return roomsBooked;
		}
		public void setRoomsBooked(int roomsBooked) {
			this.roomsBooked = roomsBooked;
		}
		public int getAdults() {
			return adults;
		}
		public void setAdults(int adults) {
			this.adults = adults;
		}
		public int getChildren() {
			return children;
		}
		public void setChildren(int children) {
			this.children = children;
		}
		public Date getCheckinDate() {
			return checkinDate;
		}
		public void setCheckinDate(Date checkinDate) {
			this.checkinDate = checkinDate;
		}
		public Date getCheckoutDate() {
			return checkoutDate;
		}
		public void setCheckoutDate(Date checkoutDate) {
			this.checkoutDate = checkoutDate;
		}
		public boolean isCancelled() {
			return cancelled;
		}
		public void setCancelled(boolean cancelled) {
			this.cancelled = cancelled;
		}
		public boolean isCompleted() {
			return completed;
		}
		public void setCompleted(boolean completed) {
			this.completed = completed;
		}
		public double getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
		public boolean isBreakfastIncluded() {
			return breakfastIncluded;
		}
		public void setBreakfastIncluded(boolean breakfastIncluded) {
			this.breakfastIncluded = breakfastIncluded;
		}
		public String getReview() {
			return review;
		}
		public void setReview(String review) {
			this.review = review;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
}
