package id.ac.ugm.smartparking.smartparkingapp.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GetAllSlotsResponse {

	@SerializedName("data")
	public List<CheckSlot> data;

	public void setData(List<CheckSlot> data){
		this.data = data;
	}

	public List<CheckSlot> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"GetAllSlotsResponse{" +
			"data = '" + data + '\'' + 
			"}";
		}
}