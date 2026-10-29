package q6;

import java.io.Serializable;

/* compiled from: MyApplication */
public abstract class j implements f, Serializable {

    /* renamed from: q, reason: collision with root package name */
    private final int f25705q;

    public j(int i7) {
        this.f25705q = i7;
    }

    @Override // q6.f
    public int b() {
        return this.f25705q;
    }

    public String toString() {
        String f8 = q.f(this);
        i.d(f8, "renderLambdaToString(...)");
        return f8;
    }
}
