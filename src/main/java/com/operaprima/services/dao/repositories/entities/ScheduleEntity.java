package com.operaprima.services.dao.repositories.entities;

import java.math.BigDecimal;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.LocalTime;
import org.springframework.data.mongodb.core.mapping.Document;

import com.operaprima.commons.business.dtos.enums.DayOfWeekIntEnum;

/**
 * @author Adesis
 *
 */
@Document
public class ScheduleEntity {
	private DayOfWeekIntEnum day;
	private LocalTime hour;
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
	public LocalTime getHour() {
		return hour;
	}

	/**
	 * @param hour
	 *            the hour to set
	 */
	public void setHour(final LocalTime hour) {
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("day", day).append("hour", hour).append("duration", duration).toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof ScheduleEntity)) {
			return false;
		}
		final ScheduleEntity castOther = (ScheduleEntity) other;
		return new EqualsBuilder().append(day, castOther.day).append(hour, castOther.hour).append(duration, castOther.duration).isEquals();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(day).append(hour).append(duration).toHashCode();
	}

}
