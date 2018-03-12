package com.twu.biblioteca;

public class LibraryShell {
    public void excute() {
        LibraryRouter router = new LibraryRouter(new LibraryService(), RouteState.Initialize);
        router.Message();
    }
}
