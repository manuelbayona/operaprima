package com.operaprima.commons.utils.adapter;

import java.text.SimpleDateFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.DateTime;

/**
 * @author Adesis
 *
 */
public class DateTimeAdapter extends XmlAdapter<String, DateTime> {

	private static final String DATETIME_FORMAT = "dd/MM/yyyy HH:mm:ss";
	private final SimpleDateFormat dateFormat = new SimpleDateFormat(DATETIME_FORMAT);

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(final DateTime v) throws Exception {
		return dateFormat.format(v);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public DateTime unmarshal(final String v) throws Exception {
		return new DateTime(dateFormat.parse(v));
	}

}
