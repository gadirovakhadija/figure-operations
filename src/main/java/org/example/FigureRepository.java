package org.example;

import java.util.List;

public interface FigureRepository<T extends Figure> {

    List<T> findAll();

    void save(T figure);
}
