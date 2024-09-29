package springmvcsearch.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


@Controller
public class FileUploadController {
	
	@RequestMapping("/FileUpload")
	public String showFileUploadForm() {
		System.out.println("in showFileUploadForm");
		return "fileUploadForm";
	}

	@RequestMapping(value="/uploadFile", method=RequestMethod.POST)
	public String processUploadedFile(@RequestParam("file1") CommonsMultipartFile file1, HttpSession s, Model model) throws IOException {
		
		System.out.println("in processUploadedFile");
		System.out.println("file size "+file1.getSize() );
		System.out.println("file content type "+file1.getContentType());
		System.out.println("file name "+file1.getOriginalFilename());
	    byte[] data = file1.getBytes();
		String path = s.getServletContext().getRealPath("/")+file1.getOriginalFilename();
		FileOutputStream fos= new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("File uploaded");
		model.addAttribute("file", file1.getOriginalFilename());
		return "fileuploadsuccess";
	}
}
