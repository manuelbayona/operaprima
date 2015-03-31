package com.operaprima.commons.utils.dozer;

import java.util.List;

/**
 * @author Adesis
 *
 */
public interface IDozerUtils {

	List<?> parseList(List<?> list, Class<?> typeToConvert);
}
