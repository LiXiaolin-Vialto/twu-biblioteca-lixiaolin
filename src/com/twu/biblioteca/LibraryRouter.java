package com.twu.biblioteca;

public class LibraryRouter {

    private LibraryService service;
    private RouteState state;

    LibraryRouter(LibraryService service, RouteState state) {
        this.service = service;
        this.state = state;
    }

    public void Message(){
        switch (state) {
            case Initialize: service.WelcomMessage(); break;
            case MainMenu: service.BookList();break;
            default:service.WelcomMessage();
        }
    }
}
