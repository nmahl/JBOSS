package org.woodmen.demo.domain;

import java.io.Serializable;

public class CertificateInfo implements Serializable {

	private static final long serialVersionUID = -5365012205745670448L;

	private String status;
	private String certificateNumber;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	@Override
	public String toString() {
		return "CertificateInfo [status=" + status + ", certificateNumber="
				+ certificateNumber + "]";
	}

}
