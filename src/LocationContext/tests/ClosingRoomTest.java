package LocationContext.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class ClosingRoomTest {

    @BeforeEach
    void setUp(){
        System.out.println("Setting up system...");
    }

    @Test
    void roomClosed(){
        System.out.println("Close room");
    }

    @Test
    void desksClosed(){
        System.out.println("Close desks.");
    }

    @Test
    void usersNotified(){
        System.out.println("Notified users.");
    }


}