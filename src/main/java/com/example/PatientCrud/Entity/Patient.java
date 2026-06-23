package com.example.PatientCrud.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate dob;
	private String diagnose;
	private Integer billamount;
	private LocalDate admitDate;
	private LocalDate dischargeDate;

	@Enumerated(EnumType.STRING)
	private BillStatus billstatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public Integer getBillamount() {
		return billamount;
	}

	public void setBillamount(Integer billamount) {
		this.billamount = billamount;
	}

	public LocalDate getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(LocalDate admitDate) {
		this.admitDate = admitDate;
	}

	public LocalDate getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(LocalDate dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public BillStatus getBillstatus() {
		return billstatus;
	}

	public void setBillstatus(BillStatus billstatus) {
		this.billstatus = billstatus;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", dob=" + dob + ", diagnose=" + diagnose + ", billamount="
				+ billamount + ", admitDate=" + admitDate + ", dischargeDate=" + dischargeDate + ", billstatus="
				+ billstatus + "]";
	}

	public Patient(Long id, String name, LocalDate dob, String diagnose, Integer billamount, LocalDate admitDate,
			LocalDate dischargeDate, BillStatus billstatus) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.diagnose = diagnose;
		this.billamount = billamount;
		this.admitDate = admitDate;
		this.dischargeDate = dischargeDate;
		this.billstatus = billstatus;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

}
