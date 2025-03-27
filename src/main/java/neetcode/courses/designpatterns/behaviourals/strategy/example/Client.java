package neetcode.courses.designpatterns.behaviourals.strategy.example;

import neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies.NonLocking;
import neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies.Password;
import neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies.Standard;
import neetcode.courses.designpatterns.behaviourals.strategy.example.concreteimplementations.ClosetDoor;
import neetcode.courses.designpatterns.behaviourals.strategy.example.context.Door;

public class Client {
    
    public static void main(String[] args) {
        Door c;

        c = new ClosetDoor();
        c.setOpenBehaviour(new Standard());
        c.setLockBehaviour(new NonLocking());

        c.performOpen();
        c.performClose();

        c.performLock();
        c.performUnlock();

        /// upgrade the door to a password protected door
        c.setLockBehaviour(new Password());
        c.performLock();
        c.performUnlock();
    }
}
