package in.gov.udiseplus.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;

import in.gov.udiseplus.bean.Signature;
import in.gov.udiseplus.constants.Messages;

//import com.me.util.ApiPaths;

import in.gov.udiseplus.dto.RequestDTO;
import in.gov.udiseplus.dto.ResponseDTO;
import in.gov.udiseplus.master.MasterData;
import in.gov.udiseplus.model.StudentDetails;
import in.gov.udiseplus.service.TcApplicationRequestService;
import in.gov.udiseplus.serviceImpl.TcApplicationRequestServiceImpl;

//@RestController("/tcForm")

@RestController
@RequestMapping("/tcForm")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TcApplicationController {

	@Autowired
	TcApplicationRequestService tcApplicationRequestService;
	
	@Value("${tcPath}")
	private String tcPath;
	
	@RequestMapping(value="/getStudentDetails", method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStudentDetails(@RequestBody RequestDTO sObj) {	
			return tcApplicationRequestService.getStudentDetails(sObj.getStudentDetails().getApplicantUserid());
		}
	
	@RequestMapping(value = "/saveStudentDetails", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveStudentDetails(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.saveStudentDetails(sObj);
	}
		
	@RequestMapping(value = "/saveStudentAcademicDetails", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveStudentAcademicDetails(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.saveStudentAcademicDetails(sObj);
	}
	
	@RequestMapping(value = "/getStudentAcademicDetails", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStudentAcademicDetails(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.getStudentAcademicDetails(sObj.getStudentAcademicDetails().getStudentId());
	}
	
	@RequestMapping(value = "/saveParentDetails", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveParentDetails(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.saveParentDetails(sObj);
	}
	
	@RequestMapping(value = "/getParentDetails", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getParentDetails(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.getParentDetails(sObj.getStudentParentDetails().getStudentId());
	}
	
	@RequestMapping(value = "/getNoDues", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getNoDues(@RequestBody Integer managementId) {
		// System.out.println("managementId---->"+managementId);
		return tcApplicationRequestService.getNoDues(managementId);
	}
	
	@RequestMapping(value = "/saveDuesCertificate", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveDuesCertificate(@RequestBody  RequestDTO sObj) {
//		// System.out.println("managementId---->"+managementId);
		return tcApplicationRequestService.saveDuesCertificate(sObj);
	}
	
	@RequestMapping(value = "/getDuesCertificate", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getDuesCertificate(@RequestBody  RequestDTO sObj) {
//		// System.out.println("managementId---->"+managementId);
		return tcApplicationRequestService.getDuesCertificate(sObj.getNoDuesCertificate().get(0).getStudentId());
	}
	
	@RequestMapping(value = "/saveFormStatus", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveFormStatus(@RequestBody  RequestDTO sObj) {
		// System.out.println("sObj--->"+sObj.getFormStatus());
		return tcApplicationRequestService.saveFormStatus(sObj);
	}
	
	@RequestMapping(value = "/getFormStatus", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getFormStatus(@RequestBody  RequestDTO sObj) {
		// System.out.println("sObj.getFormStatus().get(0).getStudentId()---->"+sObj.getFormStatus().get(0).getStudentId());
		return tcApplicationRequestService.getFormStatus(sObj.getFormStatus().get(0).getStudentId());
	}
	
	@RequestMapping(value = "/saveTcApproval", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveTcApproval(@RequestBody  RequestDTO sObj) {
		// System.out.println("sObj--->"+sObj.getTcApproval());
		return tcApplicationRequestService.saveTcApproval(sObj);
	}
	
	@RequestMapping(value = "/getTcApproval", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getTcApproval(@RequestBody  RequestDTO sObj) {
		// System.out.println("sObj--->"+sObj.getTcApproval());
		return tcApplicationRequestService.getTcApproval(sObj.getTcApproval().getTcId());
	}
	
	@RequestMapping(value = "/saveUserProfile", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveUserProfile(@RequestBody  RequestDTO sObj) {
		// System.out.println("sObj--->"+sObj.getUserProfile());
		return tcApplicationRequestService.saveUserProfile(sObj);
	}
	
	@RequestMapping(value = "/getUserProfile", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUserProfile(@RequestBody  RequestDTO sObj) {
		return tcApplicationRequestService.getUserProfile(sObj.getUserProfile().getApplicantUserid());
	}
	
	@RequestMapping(value = "/getSubjectByClass", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getSubjectByClass(@RequestBody  RequestDTO sObj) {
		return tcApplicationRequestService.getSubjectByClass(sObj.getClassSubject().getClassName());
	}
	
	@RequestMapping(value = "/saveStudentProfile", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveStudentProfile(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.saveStudentProfile(sObj);
	}
	
	@RequestMapping(value = "/getStudentProfile", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStudentProfile(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.getStudentProfile(sObj);
	}
	
	@RequestMapping(value = "/getStudentByUdiseSchCode", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStudentByUdiseSchCode(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.getStudentByUdiseSchCode(sObj);
	}
	
	@RequestMapping(value = "/getTCStatus", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getTCStatus(@RequestBody RequestDTO sObj) {
		return tcApplicationRequestService.getTCStatus(sObj);
	}
	
	@RequestMapping(value = "/getAppliedTc", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAppliedTc(@RequestBody RequestDTO sObj) {
		// System.out.println("sObj---->"+sObj);
		return tcApplicationRequestService.getAppliedTc(sObj);
	}
	
	@RequestMapping(value = "/getStudentAllData", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStudentAllData(@RequestBody RequestDTO sObj) {
		// System.out.println("sObj---->"+sObj);
		return tcApplicationRequestService.getStudentAllData(sObj);
	}
	
	@RequestMapping(value = "/getAllMaster", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllMaster() {
		return tcApplicationRequestService.getAllMaster();
	}
	
	@RequestMapping(value = "/getPostOffice", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getPostOffice(@RequestBody Integer pincode) {
		return tcApplicationRequestService.getPostOffice(pincode);
	}
	
	
	  @PostMapping("/upload") // //new annotation since 4.3
	    public ResponseEntity<?> singleFileUpload(@RequestParam("file") MultipartFile file ,@RequestParam("udise") String udise,
	                                   RedirectAttributes redirectAttributes) {
		  Map<String,Object> mObj=new HashMap<String,Object>();
//		  // System.out.println("file--->"+file);
//		  String UPLOADED_FOLDER = "E://uploadDoc//";
		  // System.out.println("tcPath--->"+tcPath);
	        if (file.isEmpty()) {
	            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	            mObj.put("status", 0);
	            return  ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,mObj));
	        }
	        
	        try {
	        	File udiseFoler=new File(tcPath+File.separator+udise);
//	        	File tcFoler=new File(tcPath+File.separator+udise+File.separator+tcId);
	        	if(!udiseFoler.exists()) {
	        		udiseFoler.mkdir();
	        	}
//	        	if(!tcFoler.exists()) {
//	        		tcFoler.mkdir();
//	        	}
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        }

	        try {

	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(tcPath+File.separator+udise , udise+"_Signature."+Arrays.asList(file.getOriginalFilename().split("\\.")).get(1));
//	            Path path = Paths.get(tcPath+File.separator+udise+File.separator+tcId , tcId+"_TC.pdf");
	            Files.write(path, bytes);
	            
	            

	            redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

	        } catch (IOException e) {
	        	  e.printStackTrace();
	        	  
	        	return  ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,mObj));
	          
	        }

	        mObj.put("status", 1);
	        mObj.put("docName", udise+"_Signature."+Arrays.asList(file.getOriginalFilename().split("\\.")).get(1));
	        return  ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,mObj));
	    }
	  
	  
	  @RequestMapping(path = "/download", method = RequestMethod.GET)
	  public void download(HttpServletRequest request, HttpServletResponse response,  @RequestParam("udise") String udise, @RequestParam("fileName") String fileName) throws IOException {
	// System.out.println("In download file");
		   File file = new File("E:\\uploadDoc"+File.separator+udise+File.separator+fileName);
//		   04011000403
//		   KVB000939
//
//	        HttpHeaders header = new HttpHeaders();
//	        header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=KVB000939_TC.pdf");
//	        header.add("Cache-Control", "no-cache, no-store, must-revalidate");
//	        header.add("Pragma", "no-cache");
//	        header.add("Expires", "0");
//
////	        Path path = Paths.get(file.getAbsolutePath());
//	        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
//
//	        return ResponseEntity.ok()
//	                .headers(header)
//	                .contentLength(file.length())
//	                .contentType(MediaType.APPLICATION_PDF)
//	                .body(resource);
		   // System.out.println(file.getAbsolutePath());
		   // System.out.println(file.exists());
		  
//			File file = new File(EXTERNAL_FILE_PATH + fileName);
			if (file.exists()) {

				//get the mimetype
				String mimeType = URLConnection.guessContentTypeFromName(file.getName());
				// System.out.println("mine type--->"+mimeType);
//				Files.probeContentType(path)
				if (mimeType == null) {
					//unknown mimetype so set the mimetype to application/octet-stream
//					mimeType = "application/octet-stream";
				}
// System.out.println("mime type--->"+mimeType);
				response.setContentType(mimeType);

				/**
				 * In a regular HTTP response, the Content-Disposition response header is a
				 * header indicating if the content is expected to be displayed inline in the
				 * browser, that is, as a Web page or as part of a Web page, or as an
				 * attachment, that is downloaded and saved locally.
				 * 
				 */

				/**
				 * Here we have mentioned it to show inline
				 */
				response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));

				 //Here we have mentioned it to show as attachment
//				 response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));

				response.setContentLength((int) file.length());

				InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

				FileCopyUtils.copy(inputStream, response.getOutputStream());
			}
		  
	  }

	  
	  @RequestMapping(value = "/deleteSignature", method = RequestMethod.POST)
		public ResponseEntity<?> deleteSignature(@RequestBody Signature signData) {
		  
		  HashMap<String,String> mp=new HashMap<String,String>();
		  
		  File file = new File("E:\\uploadDoc"+File.separator+signData.getUdiseCode()+File.separator+signData.getFileName());
		  
		 if(file.exists()) {
			 file.delete();
			 mp.put("status","1");
		 }else {
			 mp.put("status","0");
		 }		  
		  return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,mp));
		} 
	  
	  @RequestMapping(value = "/getData", method = RequestMethod.GET)
		public ResponseEntity<?> getData() {
		  return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,"Data"));
		}
	  
	  
	
	
	
	
}
