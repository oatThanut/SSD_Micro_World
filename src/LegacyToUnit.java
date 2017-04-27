/**
 * Created by Thanut Sajjakulnukti 5810545416 on 4/27/2017 AD.
 */
public class LegacyToUnit implements IUnit {
    private LegacyUnit l;

    public LegacyToUnit(LegacyUnit legacyToUnit) {
        this.l = legacyToUnit;
    }

    @Override
    public void move() {
        l.move();
    }

    @Override
    public void bounce() {
        l.bounce();
    }

    @Override
    public int getX() {
        return l.getX();
    }

    @Override
    public int getY() {
        return l.getY();
    }

    @Override
    public String getName() {
        return "legacy";
    }

    @Override
    public int getHealth() {
        return 999;
    }

    @Override
    public boolean dead() {
        return false;
    }
}
