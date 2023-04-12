package in.dhirendra.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.dhirendra.entity.CitizenPlan;
import in.dhirendra.requset.SearchRequest;
import in.dhirendra.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	private ReportService service;

	@GetMapping("/pdf")
	public void pdfExport(HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");

		response.addHeader("Content-Disposition", "attachment;fileName=plans.pdf");

		service.exportPdf(response);
	}

	@GetMapping("/excel")
	public void excelExport(HttpServletResponse response) throws Exception {
		response.setContentType("application/octel-stream");

		response.addHeader("Content-Disposition", "attachment;fileName=plans.xls");

		service.exportExcel(response);
	}

	@PostMapping("/search")
	public String handleSearch(@ModelAttribute("search") SearchRequest search, Model model) {
		// System.out.println(search);

		List<CitizenPlan> plans = service.search(search);// get the data from service

		model.addAttribute("plans", plans);

		// model.addAttribute("search", search);
		init(model);

		return "index";

	}

	@GetMapping("/")
	public String indexpage(Model model) {
		SearchRequest searchObj = new SearchRequest();
		model.addAttribute("search", searchObj);
		model.addAttribute("request", new SearchRequest());
		init(model);
		return "index";
	}

	private void init(Model model) {
		// model.addAttribute("search", new SearchRequest());
		model.addAttribute("names", service.getPlanName());
		model.addAttribute("status", service.getPlanStatus());
	}
}
