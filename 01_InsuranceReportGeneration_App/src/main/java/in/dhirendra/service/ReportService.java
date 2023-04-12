package in.dhirendra.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import in.dhirendra.entity.CitizenPlan;
import in.dhirendra.requset.SearchRequest;

@Service
public interface ReportService 
{
	public List<String> getPlanName();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel(HttpServletResponse response) throws Exception;
	
	public boolean exportPdf(HttpServletResponse response) throws Exception;

	}
