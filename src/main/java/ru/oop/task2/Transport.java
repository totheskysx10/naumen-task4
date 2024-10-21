package ru.oop.task2;

/**
 * Вид транспорта
 */
public interface Transport extends Positioned {

    /**
     * Проехать на транспорте до указанного места из текущего местоположения.
     * Или до точки, куда можно проехать.
     *
     * @param destination место, до которого нужно доехать
     * @param person человек, который едет
     * @return место, до которого удалось доехать
     */
    Position go(Person person, Position destination);
}
