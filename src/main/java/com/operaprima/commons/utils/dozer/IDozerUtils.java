package com.operaprima.commons.utils.dozer;

import java.util.List;

/**
 * @author Adesis
 *
 */
public interface IDozerUtils {

	List<?> listMapper(List<?> list, Class<?> typeToConvert);

	Object classMapper(Object classToConvert, Class<?> typeToConvert);
}
