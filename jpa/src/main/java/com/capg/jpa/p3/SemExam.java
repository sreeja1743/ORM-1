package com.capg.jpa.p3;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class SemExam extends Examination {
    
	private String centerName;
	private int centerId;
	private String invigilatorName;
	private int invigilatorId;
    
	

	public String getCenterName() {
		return centerName;
	}



	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}



	public int getCenterId() {
		return centerId;
	}



	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}



	public String getInvigilatorName() {
		return invigilatorName;
	}



	public void setInvigilatorName(String invigilatorName) {
		this.invigilatorName = invigilatorName;
	}



	public int getInvigilatorId() {
		return invigilatorId;
	}



	public void setInvigilatorId(int invigilatorId) {
		this.invigilatorId = invigilatorId;
	}



	public SemExam(int exam_Id, String examType, String centerName, int centerId, String invigilatorName,
			int invigilatorId) {
		super(exam_Id, examType);
		this.centerName = centerName;
		this.centerId = centerId;
		this.invigilatorName = invigilatorName;
		this.invigilatorId = invigilatorId;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + centerId;
		result = prime * result + ((centerName == null) ? 0 : centerName.hashCode());
		result = prime * result + invigilatorId;
		result = prime * result + ((invigilatorName == null) ? 0 : invigilatorName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SemExam other = (SemExam) obj;
		if (centerId != other.centerId)
			return false;
		if (centerName == null) {
			if (other.centerName != null)
				return false;
		} else if (!centerName.equals(other.centerName))
			return false;
		if (invigilatorId != other.invigilatorId)
			return false;
		if (invigilatorName == null) {
			if (other.invigilatorName != null)
				return false;
		} else if (!invigilatorName.equals(other.invigilatorName))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "SemExam [centerName=" + centerName + ", centerId=" + centerId + ", invigilatorName=" + invigilatorName
				+ ", invigilatorId=" + invigilatorId + "]";
	}

	

}
