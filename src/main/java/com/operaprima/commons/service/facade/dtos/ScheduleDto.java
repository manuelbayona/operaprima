package com.operaprima.commons.service.facade.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;

import com.operaprima.commons.service.facade.dtos.enums.DayOfWeekEnum;
import com.operaprima.commons.utils.adapter.DateTimeAdapter;

/**
 * @author Adesis
 *
 */
@XmlRootElement(name = "schedule")
public class ScheduleDto implements Serializable {

	private static final long serialVersionUID = -1132226108704735465L;

	@XmlElement(name = "day")
	private DayOfWeekEnum day;

	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "hour")
	private DateTime hour;

	@XmlElement(name = "duration")
	private BigDecimal duration;

	/**
	 * @return the day
	 */
	public DayOfWeekEnum getDay() {
		return day;
	}

	/**
	 * @param day
	 *            the day to set
	 */
	public void setDay(final DayOfWeekEnum day) {
		this.day = day;
	}

	/**
	 * @return the hour
	 */
	public DateTime getHour() {
		return hour;
	}

	/**
	 * @param hour
	 *            the hour to set
	 */
	public void setHour(final DateTime hour) {
		this.hour = hour;
	}

	/**
	 * @return the duration
	 */
	public BigDecimal getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(final BigDecimal duration) {
		this.duration = duration;
	}

}
