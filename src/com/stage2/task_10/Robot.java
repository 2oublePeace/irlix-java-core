package com.stage2.task_10;

import java.awt.*;

public class Robot {
    // состояние робота (х, у, Direction)
    private Point point;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        point = new Point(x, y);
        this.direction = direction;
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return direction;
    }

    public int getX() {
        // текущая координата X
        return point.x;
    }

    public int getY() {
        // текущая координата Y
        return point.y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (direction) {
            case LEFT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.UP;
            case UP -> direction = Direction.LEFT;
        }
        System.out.println("Робот повернул налево");
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (direction) {
            case LEFT -> direction = Direction.UP;
            case DOWN -> direction = Direction.LEFT;
            case RIGHT -> direction = Direction.DOWN;
            case UP -> direction = Direction.RIGHT;
        }
        System.out.println("Робот повернул направо");
    }

    public void stepForward() {
        switch (direction) {
            case UP -> point.y++;
            case DOWN -> point.y--;
            case LEFT -> point.x--;
            case RIGHT -> point.x++;
        }
        System.out.println("Робот шагнул прямо");
    }
}
