package androidx.work;

import android.content.Context;
import androidx.work.a;
import e1.j;
import e1.t;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class WorkManagerInitializer implements z0.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2951a = j.f("WrkMgrInitializer");

    @Override // z0.a
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // z0.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t b(Context context) {
        j.c().a(f2951a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        t.e(context, new a.b().a());
        return t.d(context);
    }
}
