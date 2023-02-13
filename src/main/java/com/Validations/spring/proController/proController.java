package com.Validations.spring.proController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Validations.spring.product.product;
import com.Validations.spring.productRepo.productRepo;

 
@RestController
public class proController {
	@Autowired
	private productRepo prepo;
	
	@PostMapping("saveproduct")
	public ResponseEntity<product> saveProduct(@RequestBody product product)
	{
		prepo.save(product);
		ResponseEntity<product> pr=new ResponseEntity<>(product,HttpStatus.OK);
		return pr;

		
	}
	@PostMapping("savefile")
	public void savefile(MultipartFile multipartfiel)  throws Exception{
		
		System.out.println(multipartfiel.getOriginalFilename());
		System.out.println(multipartfiel.getSize());
		System.out.println(multipartfiel.getContentType());
		
		File file=new File("C:\\Users\\vanga\\Pictures\\Govt ID\\springdata\\"+multipartfiel.getOriginalFilename());
				multipartfiel.transferTo(file);
		
	}
	
	
	

}
