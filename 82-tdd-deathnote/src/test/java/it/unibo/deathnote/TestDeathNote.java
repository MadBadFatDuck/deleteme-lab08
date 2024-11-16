package it.unibo.deathnote;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import it.unibo.deathnote.api.DeathNote;
import it.unibo.deathnote.impl.Person;
import it.unibo.deathnote.impl.DeathNoteImplementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestDeathNote {

    DeathNote deathnote = new DeathNoteImplementation();


    @Test
    void testgetrules(){
       try {
         deathnote.getRule(0);
         Assertions.fail( "Indices cannot be negative or equal to 0");
        } catch (IllegalArgumentException e){
            assertFalse(e.getMessage().isBlank());
            assertNotNull(e.getMessage());
            
        }
    }

    @Test
    void testrules(){
        
        for (String s : DeathNote.RULES) {
            assertFalse(s.isBlank());
            assertNotNull(s);
        }

     }

     @Test
     void testnames(){

        final String name = "Marco";
        assertFalse(deathnote.isNameWritten(name));
        deathnote.writeName(name);
        assertFalse(deathnote.isNameWritten("Paolo"));
        assertFalse(deathnote.isNameWritten(""));
     }

     @Test
     void 
 

}