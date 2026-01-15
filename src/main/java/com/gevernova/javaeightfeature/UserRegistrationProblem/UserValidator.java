package com.gevernova.javaeightfeature.UserRegistrationProblem;

public interface UserValidator<T, R> {
    R validate(T input);
}
