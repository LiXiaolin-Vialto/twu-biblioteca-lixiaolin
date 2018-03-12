package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LibraryServiceTest {

    private PrintStream console = null;
    private ByteArrayOutputStream outputStream = null;

    @Before
    public void SetUp() throws Exception{
        outputStream = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(outputStream));

    }

    @After
    public void tearDown() {
        System.setOut(console);
    }

    @Test
    public void should_print_welcome_message() {
        LibraryService service = new LibraryService();
        service.WelcomMessage();
        String welcomeMessage = "Welcome To Biblioteca Library";
        Assert.assertEquals(welcomeMessage, outputStream.toString());
    }

    @Test
    public void should_get_bookList() {
        LibraryService service = new LibraryService();
        service.BookList();
        String bookListStr = "Harry Potter JKR HS\nDouble City Charles HS\nThinking in Java Bruce JD\n";
        Assert.assertEquals(bookListStr, outputStream.toString());

    }
}
