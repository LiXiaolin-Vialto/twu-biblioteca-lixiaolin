package com.twu.biblioteca;

public class LibraryRouter {

    private LibraryService service;
    private RouteState state;

    LibraryRouter(LibraryService service, RouteState state) {
        this.service = service;
        this.state = state;
    }

    public void Message(){
        if (state == RouteState.Initialize) {
            service.WelcomMessage();
        }
    }
}
