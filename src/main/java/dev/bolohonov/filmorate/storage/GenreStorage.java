package dev.bolohonov.filmorate.storage;

import dev.bolohonov.filmorate.model.Genre;

import java.util.Collection;
import java.util.Optional;

public interface GenreStorage {
    Collection<Genre> getAllGenres();
    Optional<Genre> getGenreById(Integer genreId);
}
