/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Noor Safia
 */

interface GameLevel extends Cloneable {
    GameLevel clone();
    void configure();
}

class TerrainLevel implements GameLevel {
    @Override
    public GameLevel clone() {
        return new TerrainLevel();
    }

    @Override
    public void configure() {
        System.out.println("Configuring Terrain with mountains and rivers.");
    }
}

class ObstacleLevel implements GameLevel {
    @Override
    public GameLevel clone() {
        return new ObstacleLevel();
    }

    @Override
    public void configure() {
        System.out.println("Configuring Obstacles with walls and traps.");
    }
}

class EnemyLevel implements GameLevel {
    @Override
    public GameLevel clone() {
        return new EnemyLevel();
    }

    @Override
    public void configure() {
        System.out.println("Configuring Enemy positions and spawns...");
    }
}

public class LevelDesignTool {
    public static void main(String[] args) {
        GameLevel terrain = new TerrainLevel();
        GameLevel obstacle = new ObstacleLevel();
        GameLevel enemy = new EnemyLevel();

        GameLevel level1 = terrain.clone();
        level1.configure();

        GameLevel level2 = obstacle.clone();
        level2.configure();

        GameLevel level3 = enemy.clone();
        level3.configure();
    }
}
