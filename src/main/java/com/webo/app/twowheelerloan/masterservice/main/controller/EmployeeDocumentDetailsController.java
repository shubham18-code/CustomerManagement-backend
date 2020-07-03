package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.webo.app.twowheelerloan.masterservice.main.model.EmployeeDocumentDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.EmployeeDocumentDetailsRepository;


@RestController
public class EmployeeDocumentDetailsController {
	
	@Autowired
	private EmployeeDocumentDetailsRepository eddr;

//	@RequestMapping(value = "/upload",method = RequestMethod.POST)
//	public ResponseEntity<Void> upload(@RequestParam  MultipartFile[] files){
//		try {
//			
//			System.out.println("file list");
//			System.out.println(files.length);
//			System.out.println(files[1].getOriginalFilename());
//			for(MultipartFile f:files) {
//				System.out.println(f.getOriginalFilename());
//			}
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}
//		catch (Exception e) {
//			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
//			}
//	}

	
	
	@RequestMapping(value = "/saveEmployeeDocumentDetails",method = RequestMethod.POST)
	public String saveEmployeeDocumentDetails(@RequestParam MultipartFile[] files) throws IOException 
	{
		byte[] x;  
		final EmployeeDocumentDetails documentDetails=new EmployeeDocumentDetails(); 
		for(int i=0;i<files.length;i++) {
			MultipartFile file= files[i];
			if(i==0) {
		    documentDetails.setEmployeeAdharcard(file.getBytes());}
			if(i==1) {
			documentDetails.setEmployeePanCard(file.getBytes());}
			if(i==2) {
			documentDetails.setEmployeePhoto(file.getBytes());}
		}

		       
        eddr.save(documentDetails);
        
		return "welcome to the Project";

	}


	
}
