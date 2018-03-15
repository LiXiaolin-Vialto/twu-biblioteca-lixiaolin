package com.twu.biblioteca;

public class CurrentState {
    private static RouteState currentState = RouteState.Initialize;

    public static void setCurrentState(RouteState currentState) {
        CurrentState.currentState = currentState;
    }

    public static RouteState getCurrentState() {
        return currentState;
    }

}
