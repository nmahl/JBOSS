package org.woodmen.demo.domain;

import java.io.Serializable;

public class CertificateInfo implements Serializable {

	private static final long serialVersionUID = -5365012205745670448L;

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CertificateInfo [status=" + status + ", getStatus()="
				+ getStatus() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
