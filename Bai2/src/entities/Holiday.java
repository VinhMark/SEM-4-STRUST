package entities;
// Generated Aug 15, 2017 11:01:03 AM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Holiday generated by hbm2java
 */
@Entity
@Table(name = "Holiday", catalog = "AAA")
public class Holiday implements java.io.Serializable {

	private int id;
	private String firstName;
	private String lastName;
	private Date fromDate;
	private Date toDate;
	private String reason;

	public Holiday() {
	}

	public Holiday(int id) {
		this.id = id;
	}

	public Holiday(int id, String firstName, String lastName, Date fromDate, Date toDate, String reason) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.reason = reason;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "FirstName", length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FromDate", length = 23)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ToDate", length = 23)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Column(name = "Reason")
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
