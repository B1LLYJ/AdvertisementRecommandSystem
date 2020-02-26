package com.xitu.ad.service;

import com.xitu.ad.exception.AdException;
import com.xitu.ad.vo.CreateUserRequest;
import com.xitu.ad.vo.CreateUserResponse;

/**
 * Created by billy
 */
public interface IUserService {

    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
