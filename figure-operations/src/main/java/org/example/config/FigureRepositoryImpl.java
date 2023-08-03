package org.example.config;

import java.util.ArrayList;
import java.util.List;

public class FigureRepositoryImpl<T extends Figure> implements FigureRepository<T> {
    private List<T> figureList = new ArrayList<>();


    @Override
    public List<T> findAll() {
        return new ArrayList<>(figureList.stream().toList());
    }

    @Override
    public void save(T figure) {
        figureList.add(figure);
    }
}
