package neetcode.courses.designpatterns.behaviourals.strategy.example.context;

import neetcode.courses.designpatterns.behaviourals.strategy.example.strategies.Lockeable;
import neetcode.courses.designpatterns.behaviourals.strategy.example.strategies.Openable;

public abstract class Door {

    private Lockeable lockBehaviour;

    private Openable openBehaviour;

    public void setLockBehaviour(Lockeable l) {
        this.lockBehaviour = l;
    }

    public void setOpenBehaviour(Openable o) {
        this.openBehaviour = o;
    }

    public void performLock() {
        lockBehaviour.lock();
    }

    public void performUnlock() {
        lockBehaviour.lock();
    }

    public void performOpen() {
        openBehaviour.open();
    }

    public void performClose() {
        openBehaviour.close();
    }

    public float getDimensions() {
        return 5;
    }
}
