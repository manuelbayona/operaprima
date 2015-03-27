package com.operaprima.commons.service.business.dtos;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import com.operaprima.commons.business.dtos.enums.DayOfWeekIntEnum;

/**
 * @author Adesis
 *
 */
public class ScheduleIntDto {

	private DayOfWeekIntEnum day;
	private DateTime hour;
	private BigDecimal duration;

	/**
	 * @return the day
	 */
	public DayOfWeekIntEnum getDay() {
		return day;
	}

	/**
	 * @param day
	 *            the day to set
	 */
	public void setDay(final DayOfWeekIntEnum day) {
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
