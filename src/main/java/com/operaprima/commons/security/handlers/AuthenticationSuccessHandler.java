package com.operaprima.commons.security.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.util.StringUtils;

/**
 * @author Stormtrooper
 *
 */
public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private RequestCache requestCache = new HttpSessionRequestCache();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
			final Authentication authentication) throws ServletException, IOException {
		final SavedRequest savedRequest = requestCache.getRequest(request, response);

		if (savedRequest == null) {
			clearAuthenticationAttributes(request);
			return;
		}
		final String targetUrlParam = getTargetUrlParameter();
		if (isAlwaysUseDefaultTargetUrl() || targetUrlParam != null && StringUtils.hasText(request.getParameter(targetUrlParam))) {
			requestCache.removeRequest(request, response);
			clearAuthenticationAttributes(request);
			return;
		}

		clearAuthenticationAttributes(request);
	}

	/**
	 * @param requestCache
	 */
	public void setRequestCache(final RequestCache requestCache) {
		this.requestCache = requestCache;
	}
}