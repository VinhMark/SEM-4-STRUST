package controller;

import java.util.*;
import javax.faces.bean.*;
import entities.*;
import model.*;

@ManagedBean(name = "holidayManagedBean")
@SessionScoped
public class HolidayManagedBean {

	private Date from;
	private Date to;
	private List<Holiday> holidays;
	
	public HolidayManagedBean() {
		this.holidays = new ArrayList<Holiday>();
	}

	public List<Holiday> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	public void search() {
		HolidayModel holidayModel = new HolidayModel();
		this.holidays = holidayModel.search(from, to);
	}

}
