package dev.bolohonov.filmorate.storage;

import dev.bolohonov.filmorate.model.Mpa;

import java.util.Collection;
import java.util.Optional;

public interface MpaStorage {
    Collection<Mpa> getAllMpa();
    Optional<Mpa> getMpaById(Integer mpaId);
}
