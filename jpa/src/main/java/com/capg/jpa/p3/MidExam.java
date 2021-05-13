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
public class MidExam extends Examination{
    
	private String invigilatorName;
	private int invigilatorId;
	
	
	
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


	public MidExam(int exam_Id, String examType, String invigilatorName, int invigilatorId) {
		super(exam_Id, examType);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "MidExam [invigilatorName=" + invigilatorName + ", invigilatorId=" + invigilatorId + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		MidExam other = (MidExam) obj;
		if (invigilatorId != other.invigilatorId)
			return false;
		if (invigilatorName == null) {
			if (other.invigilatorName != null)
				return false;
		} else if (!invigilatorName.equals(other.invigilatorName))
			return false;
		return true;
	}
	
	

}
