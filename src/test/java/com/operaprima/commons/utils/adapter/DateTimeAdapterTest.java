package com.operaprima.commons.utils.adapter;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Stormtrooper
 *
 */
public class DateTimeAdapterTest {

	private final DateTimeAdapter adapter = new DateTimeAdapter();

	@Test
	public void test() throws Exception {

		final String marshal = adapter.marshal(new DateTime());

		Assert.assertNotNull(marshal);
	}

}
