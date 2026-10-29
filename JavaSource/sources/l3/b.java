package l3;

import com.google.android.gms.common.api.Status;

/* compiled from: MyApplication */
public class b extends Exception {

    /* renamed from: q, reason: collision with root package name */
    protected final Status f24593q;

    public b(Status status) {
        super(status.N0() + ": " + (status.O0() != null ? status.O0() : ""));
        this.f24593q = status;
    }

    public Status a() {
        return this.f24593q;
    }

    public int b() {
        return this.f24593q.N0();
    }
}
