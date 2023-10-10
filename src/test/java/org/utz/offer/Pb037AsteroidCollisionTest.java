package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb037AsteroidCollisionTest {

    @Test
    void asteroidCollision() {
        Pb037AsteroidCollision pb = new Pb037AsteroidCollision();
        int[] res = pb.asteroidCollision(new int[]{-2,-2,1,-2});
        for (int v : res) {
            System.out.println(v);
        }
    }
}