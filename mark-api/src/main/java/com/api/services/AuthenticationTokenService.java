package com.api.services;

import java.util.Map;

import com.common.models.AuthenticationToken;
import com.common.models.User;

public interface AuthenticationTokenService  extends MarkService<AuthenticationToken> {

	AuthenticationToken getAuthTokenByUserId(String userId);

	Map<String, Object> generateAuthToken(User user);

	void deleteAuthenticationToken(String userId);

	void updateLastAccessedTime(AuthenticationToken existingAuthenticationToken);

}
