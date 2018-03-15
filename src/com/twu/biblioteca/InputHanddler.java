package com.twu.biblioteca;

public class InputHanddler {

    public void handle(int i) {
        switch (CurrentState.getCurrentState()) {
            case Initialize: {
                if (i == 0) return;
                if (i == 1) {
                    CurrentState.setCurrentState(RouteState.MainMenu);
                }
                else {
                    ErrorInputMessage();
                }
                break;
            }
            case MainMenu: {
                if (i == 1) {
                    CurrentState.setCurrentState(RouteState.Initialize);
                }
                else if (i == 2) {
                    CurrentState.setCurrentState(RouteState.BookList);
                }
                else {
                    ErrorInputMessage();
                }
                break;
            }

            case BookList: new BooklistHandler().handle(i);break;
            case BookDetail: new BookDetailHandler().handle(i);break;
            case CheckedInfo: {
                if (i == 0) {
                    return;
                }
                else if (i == 1){
                    CurrentState.setCurrentState( RouteState.BookList);
                }
                else {
                    ErrorInputMessage();
                }
            }

        }
    }

    private void ErrorInputMessage() {
        System.out.println("your input is wrong, please input again");
    }
}
