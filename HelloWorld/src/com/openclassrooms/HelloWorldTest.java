package com.openclassrooms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {
	@Test
	public void testAjouter() {
	    HelloWorld testHelloWorld = new HelloWorld();
	    int somme = testHelloWorld.sommesNombres(2, 3);
	    assertEquals(5, somme);
	}

}
