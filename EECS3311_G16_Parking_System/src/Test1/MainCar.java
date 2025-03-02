package Test1;

import java.time.LocalDateTime;

class Car {
	private String licensePlate;
	private String brand;
	private String model;
	private String colour;
	private String ownerName;

	private int parkingSpotNumber;
	private boolean isElectric;
	private String vehicleType;
	private LocalDateTime entryTime;
	private LocalDateTime exitTime;
	private boolean hasMonthlyPass;
	
	private Car (carBuilder builder) {
		licensePlate = builder.licensePlate;
		brand = builder.brand;
		model = builder.model;
		colour = builder.colour;
		ownerName = builder.ownerName;
		
		parkingSpotNumber = builder.parkingSpotNumber;
		isElectric = builder.isElectric;
		vehicleType = builder.vehicleType;
		entryTime = builder.entryTime;
		exitTime = builder.exitTime;
		hasMonthlyPass = builder.hasMonthlyPass;
	}
	
	public static class carBuilder {
		private String licensePlate;
		private String brand;
		private String model;
		private String colour;
		private String ownerName;

		private int parkingSpotNumber;
		private boolean isElectric;
		private String vehicleType;
		private LocalDateTime entryTime;
		private LocalDateTime exitTime;
		private boolean hasMonthlyPass;
		
		private carBuilder (String licensePlate, String brand, String model, String colour, String ownerName) {
			this.licensePlate = licensePlate;
			this.brand = brand;
			this.model = model;
			this.colour = colour;
			this.ownerName = ownerName;
		}
		
		public carBuilder setParkingSpotNumber(int parkingSpotNumber) {
			this.parkingSpotNumber = parkingSpotNumber;
			return this;
		}
		
		public carBuilder SetIsElectric(boolean isElectric) {
			this.isElectric = isElectric;
			return this;
		}
		
		public carBuilder SetVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
			return this;
		}
		
		public carBuilder SetEntryTime(LocalDateTime entryTime) {
			this.entryTime = entryTime;
			return this;
		}
		
		public carBuilder SetExitTime(LocalDateTime exitTime) {
			this.exitTime = exitTime;
			return this;
		}
		
		public carBuilder SetHasMonthlyPass(boolean hasMonthlyPass) {
			this.hasMonthlyPass= hasMonthlyPass;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
}




public class MainCar {
	public static void main(String[] args) {
		
		
	}

}
