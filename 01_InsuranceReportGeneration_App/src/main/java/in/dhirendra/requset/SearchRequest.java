package in.dhirendra.requset;

import java.time.LocalDate;

import lombok.Data;
@SuppressWarnings("unused")
@Data
public class SearchRequest
{
	private String planName;
	private String planStatus;
	private String gender;
	
	private String startDate; 
	
	private String endDate;
	
	
	
}
