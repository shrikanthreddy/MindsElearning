package com.sag.routes.model;

public class VehicleDetail 
{
	private int id;
	private int Vehicle_no;
	private int Vehicle_code;
	private String No_of_Seat;
	private String Maximum_capacity;
	private int insurance;
	private int tax_remitted;
	private String permit;
	private String status;
	private String Vehicle_type_id;
	private String campusId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVehicle_no() {
		return Vehicle_no;
	}
	public void setVehicle_no(int vehicle_no) {
		Vehicle_no = vehicle_no;
	}
	public int getVehicle_code() {
		return Vehicle_code;
	}
	public void setVehicle_code(int vehicle_code) {
		Vehicle_code = vehicle_code;
	}
	public String getNo_of_Seat() {
		return No_of_Seat;
	}
	public void setNo_of_Seat(String no_of_Seat) {
		No_of_Seat = no_of_Seat;
	}
	public String getMaximum_capacity() {
		return Maximum_capacity;
	}
	public void setMaximum_capacity(String maximum_capacity) {
		Maximum_capacity = maximum_capacity;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
	public int getTax_remitted() {
		return tax_remitted;
	}
	public void setTax_remitted(int tax_remitted) {
		this.tax_remitted = tax_remitted;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVehicle_type_id() {
		return Vehicle_type_id;
	}
	public void setVehicle_type_id(String vehicle_type_id) {
		Vehicle_type_id = vehicle_type_id;
	}
	public String getCampusId() {
		return campusId;
	}
	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}
	
}
