package RENDUS.Java;

public class Socket {

    private enum State {
        INITIAL,
        ECOUTE,
        CONNECTEE,
        FERMEE
    }

    private State state;

    public Socket() {
        this.state = State.INITIAL;
    }

    public State initial() {
        if (this.state == State.FERMEE) {
            return this.state = State.INITIAL;
        } else {
            return this.state;
        }
    }

    public State ecoute() {
        if (this.state == State.INITIAL) {
            return this.state = State.ECOUTE;
        } else {
            return this.state;
        }
    }

    public State connectee() {
        if (this.state == State.ECOUTE) {
            return this.state = State.CONNECTEE;
        } else {
            return this.state;
        }
    }

    public State fermee() {
        if (this.state == State.CONNECTEE || this.state == State.ECOUTE) {
            System.out.println("Socket read");
            return this.state = State.FERMEE;
        } else {
            return this.state;
        }
    }

    public State getEtat() {
        return this.state;
    }
}
