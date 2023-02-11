package ru.yandex.practicum.exception;

public class IncorrectCountException extends RuntimeException {

    public IncorrectCountException() {
    }

    public IncorrectCountException(String message) {
        super(message);
    }

    public IncorrectCountException(String message, Throwable cause) {
        super(message, cause);
    }
}