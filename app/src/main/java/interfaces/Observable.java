package interfaces;

import java.util.Observer;

public interface Observable {

    //регистрирует наблюдателя
    void registerObserver(Observer observer);
    //удаляет наблюдателя
    void removeObserver(Observer observer);
    //При изменении данных вызывается метод notifyObservers, который в свою очередь вызывает метод update
    //у всех слушателей, передавая им обновлённые данные
    void notifyObservers();
    //метод изменения данных
    void changeData(String newEnteredText);

}
