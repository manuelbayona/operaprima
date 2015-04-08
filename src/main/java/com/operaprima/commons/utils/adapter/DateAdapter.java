package com.operaprima.commons.utils.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Stormtroopers
 *
 */
public class DateAdapter extends XmlAdapter<String, Date> {

	private static final String DATETIME_FORMAT = "dd/MM/yyyy HH:mm:ss";
	private final SimpleDateFormat dateFormat = new SimpleDateFormat(DATETIME_FORMAT);

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(final Date v) throws Exception {
		return dateFormat.format(v);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Date unmarshal(final String v) throws Exception {
		return dateFormat.parse(v);
	}

}
