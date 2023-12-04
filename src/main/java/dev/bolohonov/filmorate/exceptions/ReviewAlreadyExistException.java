package dev.bolohonov.filmorate.exceptions;

public class ReviewAlreadyExistException extends RuntimeException {
    public ReviewAlreadyExistException(String message) {
        super(message);
    }
}
