package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.ki0;
import com.google.android.gms.internal.ads.o20;
import com.google.android.gms.internal.ads.p20;
import com.google.android.gms.internal.ads.ue0;
import com.google.android.gms.internal.ads.ve0;
import com.google.android.gms.internal.ads.vk0;
import com.google.android.gms.internal.ads.wk0;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class m1 extends xq implements o1 {
    m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // s2.o1
    public final v0 B7(w3.a aVar, g5 g5Var, String str, kb0 kb0Var, int i7) {
        v0 t0Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, g5Var);
        a8.writeString(str);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(13, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            t0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t0Var = queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new t0(readStrongBinder);
        }
        O.recycle();
        return t0Var;
    }

    @Override // s2.o1
    public final v0 K7(w3.a aVar, g5 g5Var, String str, int i7) {
        v0 t0Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, g5Var);
        a8.writeString(str);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(10, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            t0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t0Var = queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new t0(readStrongBinder);
        }
        O.recycle();
        return t0Var;
    }

    @Override // s2.o1
    public final p20 W4(w3.a aVar, w3.a aVar2) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, aVar2);
        Parcel O = O(5, a8);
        p20 j8 = o20.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // s2.o1
    public final v0 X6(w3.a aVar, g5 g5Var, String str, kb0 kb0Var, int i7) {
        v0 t0Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, g5Var);
        a8.writeString(str);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(2, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            t0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t0Var = queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new t0(readStrongBinder);
        }
        O.recycle();
        return t0Var;
    }

    @Override // s2.o1
    public final t2 c3(w3.a aVar, kb0 kb0Var, int i7) {
        t2 r2Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(17, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            r2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            r2Var = queryLocalInterface instanceof t2 ? (t2) queryLocalInterface : new r2(readStrongBinder);
        }
        O.recycle();
        return r2Var;
    }

    @Override // s2.o1
    public final ki0 e2(w3.a aVar, String str, kb0 kb0Var, int i7) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeString(str);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(12, a8);
        ki0 j8 = ji0.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // s2.o1
    public final v0 j6(w3.a aVar, g5 g5Var, String str, kb0 kb0Var, int i7) {
        v0 t0Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, g5Var);
        a8.writeString(str);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(1, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            t0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t0Var = queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new t0(readStrongBinder);
        }
        O.recycle();
        return t0Var;
    }

    @Override // s2.o1
    public final h1 n3(w3.a aVar, kb0 kb0Var, int i7) {
        h1 f1Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(18, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            f1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            f1Var = queryLocalInterface instanceof h1 ? (h1) queryLocalInterface : new f1(readStrongBinder);
        }
        O.recycle();
        return f1Var;
    }

    @Override // s2.o1
    public final ve0 o5(w3.a aVar, kb0 kb0Var, int i7) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(15, a8);
        ve0 j8 = ue0.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // s2.o1
    public final z1 p2(w3.a aVar, int i7) {
        z1 w1Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(9, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            w1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            w1Var = queryLocalInterface instanceof z1 ? (z1) queryLocalInterface : new w1(readStrongBinder);
        }
        O.recycle();
        return w1Var;
    }

    @Override // s2.o1
    public final cf0 q0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        Parcel O = O(8, a8);
        cf0 j8 = bf0.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // s2.o1
    public final r0 x1(w3.a aVar, String str, kb0 kb0Var, int i7) {
        r0 p0Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeString(str);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(3, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            p0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            p0Var = queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new p0(readStrongBinder);
        }
        O.recycle();
        return p0Var;
    }

    @Override // s2.o1
    public final wk0 y6(w3.a aVar, kb0 kb0Var, int i7) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(14, a8);
        wk0 j8 = vk0.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }
}
