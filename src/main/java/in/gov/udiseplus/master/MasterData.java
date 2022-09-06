package in.gov.udiseplus.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasterData {

	private  final Map<Integer,String> bldMaster=new HashMap<Integer,String>();
	private  final Map<Integer,String> soclMaster=new HashMap<Integer,String>();

	
	public  Map<Integer, String> getBldmaster() {
		List bldMasterArray=new ArrayList<Map<Integer, String>>();
		bldMaster.put(1,"A+");
		bldMaster.put(2,"A−");
		bldMaster.put(3,"B+");
		bldMaster.put(4,"B−");
		bldMaster.put(5,"AB+");
		bldMaster.put(6,"AB−");
		bldMaster.put(7,"O+");
		bldMaster.put(8,"O−");
		return bldMaster;
	}
	public  Map<Integer, String> getSoclmaster() {
		soclMaster.put(1, "General");
		soclMaster.put(2, "SC");
		soclMaster.put(3, "ST");
		soclMaster.put(4, "OBC");
		soclMaster.put(5, "ORC");
		soclMaster.put(6, "Others");
		return soclMaster;
	}
			
}
