package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: MyApplication */
public final class gb0 extends jb0 {
    @Override // com.google.android.gms.internal.ads.kb0
    public final boolean W(String str) {
        try {
            return z2.a.class.isAssignableFrom(Class.forName(str, false, gb0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            w2.p.f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final boolean l0(String str) {
        try {
            return y2.a.class.isAssignableFrom(Class.forName(str, false, gb0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            w2.p.f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final nb0 v(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, gb0.class.getClassLoader());
                if (y2.f.class.isAssignableFrom(cls)) {
                    return new lc0((y2.f) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (y2.a.class.isAssignableFrom(cls)) {
                    return new lc0((y2.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                w2.p.f(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                w2.p.a("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new lc0(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new lc0(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            w2.p.g(sb2.toString(), th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final id0 y(String str) {
        return new vd0((RtbAdapter) Class.forName(str, false, md0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
