package com.twu.biblioteca;

public class LibraryShell {
    private RouteState state;

    LibraryShell() {
        state = RouteState.Initialize;
    }

    LibraryShell(RouteState state) {
        this.state = state;
    }
    public void excute() {
        LibraryRouter router = new LibraryRouter(new LibraryService(), state);
        router.Message();
    }
}
