package m3;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: MyApplication */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24784a;

    public f1(int i7) {
        this.f24784a = i7;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(h0 h0Var);

    public abstract void d(u uVar, boolean z7);
}
