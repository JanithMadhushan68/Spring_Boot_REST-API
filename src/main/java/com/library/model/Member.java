package com.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int memberID;
	    
	    private String memberName;
	    private String phoneNo;
	    private String address;
	    private String membershipType;
		public int getMemberID() {
			return memberID;
		}
		public void setMemberID(int memberID) {
			this.memberID = memberID;
		}
		public String getMemberName() {
			return memberName;
		}
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getMembershipType() {
			return membershipType;
		}
		public void setMembershipType(String membershipType) {
			this.membershipType = membershipType;
		}

}
