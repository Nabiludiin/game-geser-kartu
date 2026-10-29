package c4;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class j extends q4.h implements k {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    @Override // c4.k
    public final void B4(g gVar, String str, long j7, String str2) {
        Parcel a8 = a();
        q4.t.b(a8, gVar);
        a8.writeString(str);
        a8.writeLong(j7);
        a8.writeString(str2);
        r0(7002, a8);
    }

    @Override // c4.k
    public final void C4() {
        r0(5006, a());
    }

    @Override // c4.k
    public final void K(long j7) {
        Parcel a8 = a();
        a8.writeLong(j7);
        r0(5001, a8);
    }

    @Override // c4.k
    public final void N7(i iVar, long j7) {
        Parcel a8 = a();
        q4.t.b(a8, iVar);
        a8.writeLong(j7);
        r0(15501, a8);
    }

    @Override // c4.k
    public final Bundle P7() {
        Parcel O = O(5004, a());
        Bundle bundle = (Bundle) q4.t.a(O, Bundle.CREATOR);
        O.recycle();
        return bundle;
    }

    @Override // c4.k
    public final void X1(g gVar) {
        Parcel a8 = a();
        q4.t.b(a8, gVar);
        r0(5002, a8);
    }

    @Override // c4.k
    public final Intent d1() {
        Parcel O = O(9005, a());
        Intent intent = (Intent) q4.t.a(O, Intent.CREATOR);
        O.recycle();
        return intent;
    }

    @Override // c4.k
    public final void l2(g gVar, String str, IBinder iBinder, Bundle bundle) {
        Parcel a8 = a();
        q4.t.b(a8, gVar);
        a8.writeString(str);
        a8.writeStrongBinder(iBinder);
        q4.t.c(a8, bundle);
        r0(5024, a8);
    }

    @Override // c4.k
    public final void o6(IBinder iBinder, Bundle bundle) {
        Parcel a8 = a();
        a8.writeStrongBinder(iBinder);
        q4.t.c(a8, bundle);
        r0(5005, a8);
    }

    @Override // c4.k
    public final Intent u3(String str, int i7, int i8) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeInt(i7);
        a8.writeInt(i8);
        Parcel O = O(18001, a8);
        Intent intent = (Intent) q4.t.a(O, Intent.CREATOR);
        O.recycle();
        return intent;
    }
}
