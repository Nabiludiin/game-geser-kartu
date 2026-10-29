package t4;

/* compiled from: MyApplication */
public enum u {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: q, reason: collision with root package name */
    private final String f26422q;

    u(String str) {
        this.f26422q = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26422q;
    }
}
