package ru.oop.task3;

/**
 * Вид транспорта
 */
public interface Transport extends Positioned {

    /**
     * Проехать на транспорте до указанного места из текущего местоположения.
     * Или до точки, куда можно проехать.
     *
     * @param destination место, до которого нужно доехать
     * @return место, до которого удалось доехать
     */
    Position go(Position destination);
}
