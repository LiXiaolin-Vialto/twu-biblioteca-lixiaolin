package com.twu.biblioteca;

public class BookDetailHandler {
    public void handle(int i) {
        if (i == 0){
            return;
        }
        else if (i == 1) {
            CurrentState.setCurrentState(RouteState.BookList);
        }else if (i == 2) {
            CurrentState.setCurrentState(RouteState.CheckedInfo);
        }
    }
}
