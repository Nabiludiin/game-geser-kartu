package q4;

import com.google.android.gms.common.api.Status;
import y3.b;

/* compiled from: MyApplication */
public abstract class l extends b.c {
    protected l(l3.f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ l3.j f(Status status) {
        return new k(this, status);
    }
}
