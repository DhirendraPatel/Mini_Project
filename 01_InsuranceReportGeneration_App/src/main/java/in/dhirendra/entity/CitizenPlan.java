package in.dhirendra.entity;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lowagie.text.pdf.PdfPCell;

import lombok.Data;

@SuppressWarnings("unused")
@Data
@Entity
public class CitizenPlan 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName; 
	private String gender;
	private String  planName;
	private String  planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benifitAmount;
	private String denialReason;
	private LocalDate terminateddate;
	private String terminatedReason;
}
