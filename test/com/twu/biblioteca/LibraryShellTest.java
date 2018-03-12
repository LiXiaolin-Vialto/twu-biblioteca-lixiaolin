package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class LibraryShellTest {
    private PrintStream console = null;
    private OutputStream outputStream = null;
    @Before
    public void SetUp() {
        outputStream = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void Dispose() {
        System.setOut(console);
    }

    @Test
    public void should_get_welcomeMessage() {
        LibraryShell shell = new LibraryShell();
        shell.excute();
        String welcomeMessage = "Welcome To Biblioteca Library";
        Assert.assertEquals(welcomeMessage, outputStream.toString());
    }
}
