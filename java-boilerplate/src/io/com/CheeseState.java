package io.com;

public enum CheeseState {
    EAT, SLEEP, MAKE;

    public static CheeseState from(String state) throws Exception {
        switch(state) {
            case "EAT":
                return EAT;
            case "SLEEP":
                return SLEEP;
            case "MAKE":
                return MAKE;
            default:
                throw new RuntimeException("YO! ERROR::"+state);
        }
    }
}
