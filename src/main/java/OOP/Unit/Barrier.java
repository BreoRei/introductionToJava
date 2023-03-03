package OOP.Unit;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Barrier {
    protected Vector2D coords;
    protected String barrieraEmodji;

    public String getBarrieraEmodji() {
        return barrieraEmodji;
    }

    public Barrier(Vector2D coords) {

        this.coords = coords;
        this.barrieraEmodji = getEmodjiBarrier();
    }
    protected String getEmodjiBarrier() {
        List<String> strBarrier = Arrays.asList("🗿", "🪵", "🪨");
        return strBarrier.get(new Random().nextInt(0, 3));
    }
    public int[] getCoords() { return new int[]{coords.posX, coords.posY};}

}
