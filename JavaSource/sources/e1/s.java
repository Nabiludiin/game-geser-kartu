package e1;

/* compiled from: MyApplication */
public enum s {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean c() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
