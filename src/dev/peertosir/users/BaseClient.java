package dev.peertosir.users;

public abstract class BaseClient {
    protected int bankAgentId;
    public static int clientID;

    public BaseClient(int bankAgentId) {
        this.bankAgentId = bankAgentId;
        clientID++;
    }
}
