package com.operaprima.commons.service.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import org.joda.time.DateTime;

import com.operaprima.commons.service.dtos.enums.DayOfWeekEnum;

/**
 * @author Adesis
 *
 */
public class ScheduleDto implements Serializable {

	private static final long serialVersionUID = -1132226108704735465L;

	private DayOfWeekEnum day;
	private DateTime hour;
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
