package Partie2_1;

public class Socket {

    private SocketState state;

    public Socket() {
        this.state = new Initial();
    }

    public void listen() {
        this.state.handleListen(this);
    }

    public void accept() {
        this.state.handleAccept(this);
    }

    public void connect() {
        this.state.handleConnect(this);
    }

    public void read() {
        this.state.handleRead(this);
    }

    public void close() {
        this.state.handleClose(this);
    }

    public void reset() {
        this.state.handleReset(this);
    }

    public void configuration() {
        this.state.handleConfiguration(this);
    }



    public void setState(SocketState state) {
        this.state = state;
    }
}