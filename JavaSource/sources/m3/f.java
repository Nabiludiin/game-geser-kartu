package m3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: MyApplication */
public abstract class f implements l3.j, l3.h {

    /* renamed from: q, reason: collision with root package name */
    protected final Status f24781q;

    /* renamed from: r, reason: collision with root package name */
    protected final DataHolder f24782r;

    protected f(DataHolder dataHolder, Status status) {
        this.f24781q = status;
        this.f24782r = dataHolder;
    }

    @Override // l3.h
    public void a() {
        DataHolder dataHolder = this.f24782r;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // l3.j
    public Status x0() {
        return this.f24781q;
    }
}
