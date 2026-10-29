package q4;

import com.google.android.gms.common.api.Status;
import y3.b;

/* compiled from: MyApplication */
abstract class c extends b.c {

    /* renamed from: q, reason: collision with root package name */
    private final String f25651q;

    public c(String str, l3.f fVar) {
        super(fVar);
        this.f25651q = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ l3.j f(Status status) {
        return new b(this, status);
    }
}
