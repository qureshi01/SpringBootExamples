package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

	@Entity
public class mobile {
	
	@Id
	private int modelNo;
	private String modelName;
	private String company_Name;
	private int ram_size;
	private int rom_size;
	private String os_name;
	private String processor_name;
	private int price;
	private int imei_no;
	private int fcam_size;
	private int bcam_size;
	public mobile(int modelNo, String modelName, String company_Name, int ram_size, int rom_size, String os_name,
			String processor_name, int price, int imei_no, int fcam_size, int bcam_size) {
		super();
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.company_Name = company_Name;
		this.ram_size = ram_size;
		this.rom_size = rom_size;
		this.os_name = os_name;
		this.processor_name = processor_name;
		this.price = price;
		this.imei_no = imei_no;
		this.fcam_size = fcam_size;
		this.bcam_size = bcam_size;
	}
	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public int getRam_size() {
		return ram_size;
	}
	public void setRam_size(int ram_size) {
		this.ram_size = ram_size;
	}
	public int getRom_size() {
		return rom_size;
	}
	public void setRom_size(int rom_size) {
		this.rom_size = rom_size;
	}
	public String getOs_name() {
		return os_name;
	}
	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}
	public String getProcessor_name() {
		return processor_name;
	}
	public void setProcessor_name(String processor_name) {
		this.processor_name = processor_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getImei_no() {
		return imei_no;
	}
	public void setImei_no(int imei_no) {
		this.imei_no = imei_no;
	}
	public int getFcam_size() {
		return fcam_size;
	}
	public void setFcam_size(int fcam_size) {
		this.fcam_size = fcam_size;
	}
	public int getBcam_size() {
		return bcam_size;
	}
	public void setBcam_size(int bcam_size) {
		this.bcam_size = bcam_size;
	}
	
	
	

}
