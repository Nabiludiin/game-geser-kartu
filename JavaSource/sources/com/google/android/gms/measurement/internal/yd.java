package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: MyApplication */
public final class yd extends a8 {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f22905i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f22906j = {"_err"};

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f22907k = 0;

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f22908c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f22909d;

    /* renamed from: e, reason: collision with root package name */
    private int f22910e;

    /* renamed from: f, reason: collision with root package name */
    private q0.a f22911f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f22912g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f22913h;

    yd(w6 w6Var) {
        super(w6Var);
        this.f22913h = null;
        this.f22909d = new AtomicLong(0L);
    }

    static MessageDigest C() {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    static long D(byte[] bArr) {
        p3.o.m(bArr);
        int length = bArr.length;
        int i7 = 0;
        p3.o.p(length > 0);
        long j7 = 0;
        for (int i8 = length - 1; i8 >= 0 && i8 >= bArr.length - 8; i8--) {
            j7 += (bArr[i8] & 255) << i7;
            i7 += 8;
        }
        return j7;
    }

    static boolean E(Context context, boolean z7) {
        p3.o.m(context);
        return Build.VERSION.SDK_INT >= 24 ? F(context, "com.google.android.gms.measurement.AppMeasurementJobService") : F(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean F(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean N(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static boolean O(String str, String[] strArr) {
        p3.o.m(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(String str) {
        return !f22906j[0].equals(str);
    }

    public static ArrayList h0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", iVar.f22220q);
            bundle.putString("origin", iVar.f22221r);
            bundle.putLong("creation_timestamp", iVar.f22223t);
            bundle.putString("name", iVar.f22222s.f22701r);
            t4.t.a(bundle, p3.o.m(iVar.f22222s.M0()));
            bundle.putBoolean("active", iVar.f22224u);
            String str = iVar.f22225v;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            g0 g0Var = iVar.f22226w;
            if (g0Var != null) {
                bundle.putString("timed_out_event_name", g0Var.f22160q);
                e0 e0Var = g0Var.f22161r;
                if (e0Var != null) {
                    bundle.putBundle("timed_out_event_params", e0Var.R0());
                }
            }
            bundle.putLong("trigger_timeout", iVar.f22227x);
            g0 g0Var2 = iVar.f22228y;
            if (g0Var2 != null) {
                bundle.putString("triggered_event_name", g0Var2.f22160q);
                e0 e0Var2 = g0Var2.f22161r;
                if (e0Var2 != null) {
                    bundle.putBundle("triggered_event_params", e0Var2.R0());
                }
            }
            bundle.putLong("triggered_timestamp", iVar.f22222s.f22702s);
            bundle.putLong("time_to_live", iVar.f22229z);
            g0 g0Var3 = iVar.A;
            if (g0Var3 != null) {
                bundle.putString("expired_event_name", g0Var3.f22160q);
                e0 e0Var3 = g0Var3.f22161r;
                if (e0Var3 != null) {
                    bundle.putBundle("expired_event_params", e0Var3.R0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static boolean j0(Context context) {
        ActivityInfo receiverInfo;
        p3.o.m(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void k0(da daVar, Bundle bundle, boolean z7) {
        if (bundle != null && daVar != null) {
            if (!bundle.containsKey("_sc") || z7) {
                String str = daVar.f22056a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = daVar.f22057b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", daVar.f22058c);
                return;
            }
            z7 = false;
        }
        if (bundle != null && daVar == null && z7) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    static final boolean m0(Bundle bundle, int i7) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i7);
        return true;
    }

    private final Object n0(int i7, Object obj, boolean z7, boolean z8, String str) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return obj;
        }
        if (obj instanceof Double) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return q(obj.toString(), i7, z7);
        }
        if (!z8 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle Q = Q((Bundle) parcelable, null);
                if (!Q.isEmpty()) {
                    arrayList.add(Q);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final int o0(String str) {
        if ("_ldl".equals(str)) {
            this.f22928a.w();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f22928a.w();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f22928a.w();
            return 100;
        }
        this.f22928a.w();
        return 36;
    }

    static boolean r0(String str) {
        p3.o.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    final void A(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            w6 w6Var = this.f22928a;
            w6Var.a().t().c("Not putting event parameter. Invalid value type. name, type", w6Var.D().b(str), simpleName);
        }
    }

    final int A0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f22928a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }

    final void B(xd xdVar, String str, int i7, String str2, String str3, int i8) {
        Bundle bundle = new Bundle();
        m0(bundle, i7);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i7 == 6 || i7 == 7 || i7 == 2) {
            bundle.putLong("_el", i8);
        }
        xdVar.a(str, "_err", bundle);
    }

    final boolean B0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    final boolean C0(String str, String str2, int i7, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i7) {
                this.f22928a.a().t().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    final void D0(String str, String str2, String str3, Bundle bundle, List list, boolean z7) {
        int z02;
        String str4;
        int r7;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        w6 w6Var = this.f22928a;
        int i7 = true != w6Var.w().f22928a.C().V(231100000, true) ? 0 : 35;
        int i8 = 0;
        boolean z8 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                z02 = !z7 ? z0(str5) : 0;
                if (z02 == 0) {
                    z02 = A0(str5);
                }
            } else {
                z02 = 0;
            }
            if (z02 != 0) {
                x(bundle, z02, str5, z02 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (B0(bundle.get(str5))) {
                    w6Var.a().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    r7 = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    r7 = r(str, str2, str5, bundle.get(str5), bundle, list2, z7, false);
                }
                if (r7 != 0 && !"_ev".equals(str5)) {
                    x(bundle, r7, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (r0(str5) && !O(str5, t4.x.f26436d)) {
                    i8++;
                    if (!V(231100000, true)) {
                        w6Var.a().q().c("Item array not supported on client's version of Google Play Services (Android Only)", w6Var.D().a(str2), w6Var.D().e(bundle));
                        m0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i8 > i7) {
                        if (!w6Var.w().H(str4, c5.f21950f1) || !z8) {
                            n5 q7 = w6Var.a().q();
                            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i7);
                            sb.append(" item-scoped custom params");
                            q7.c(sb.toString(), w6Var.D().a(str2), w6Var.D().e(bundle));
                        }
                        m0(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        z8 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    final boolean G() {
        h();
        return J() == 1;
    }

    final q0.a H() {
        if (this.f22911f == null) {
            this.f22911f = q0.a.a(this.f22928a.e());
        }
        return this.f22911f;
    }

    final int I() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        if (extensionVersion <= 3) {
            return 0;
        }
        extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
        return extensionVersion2;
    }

    final long J() {
        int extensionVersion;
        long j7;
        h();
        if (!L(this.f22928a.L().q())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j7 = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j7 = 8;
            } else {
                w6 w6Var = this.f22928a;
                int I = I();
                w6Var.w();
                j7 = I < ((Integer) c5.f21970m0.b(null)).intValue() ? 16L : 0L;
            }
        }
        if (!M("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j7 |= 2;
        }
        if (j7 == 0 && !K()) {
            j7 = 64;
        }
        if (j7 == 0) {
            return 1L;
        }
        return j7;
    }

    final boolean K() {
        Object e8;
        Integer num;
        if (this.f22912g == null) {
            q0.a H = H();
            boolean z7 = false;
            if (H == null) {
                return false;
            }
            try {
                num = (Integer) H.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z7 = true;
                        }
                    } catch (InterruptedException e9) {
                        e8 = e9;
                        this.f22928a.a().r().b("Measurement manager api exception", e8);
                        this.f22912g = Boolean.FALSE;
                        this.f22928a.a().w().b("Measurement manager api status result", num);
                        return this.f22912g.booleanValue();
                    } catch (CancellationException e10) {
                        e8 = e10;
                        this.f22928a.a().r().b("Measurement manager api exception", e8);
                        this.f22912g = Boolean.FALSE;
                        this.f22928a.a().w().b("Measurement manager api status result", num);
                        return this.f22912g.booleanValue();
                    } catch (ExecutionException e11) {
                        e8 = e11;
                        this.f22928a.a().r().b("Measurement manager api exception", e8);
                        this.f22912g = Boolean.FALSE;
                        this.f22928a.a().w().b("Measurement manager api status result", num);
                        return this.f22912g.booleanValue();
                    } catch (TimeoutException e12) {
                        e8 = e12;
                        this.f22928a.a().r().b("Measurement manager api exception", e8);
                        this.f22912g = Boolean.FALSE;
                        this.f22928a.a().w().b("Measurement manager api status result", num);
                        return this.f22912g.booleanValue();
                    }
                }
                this.f22912g = Boolean.valueOf(z7);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e13) {
                e8 = e13;
                num = null;
            }
            this.f22928a.a().w().b("Measurement manager api status result", num);
        }
        return this.f22912g.booleanValue();
    }

    final boolean L(String str) {
        String str2 = (String) c5.f21982s0.b(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    final boolean M(String str) {
        h();
        w6 w6Var = this.f22928a;
        if (u3.e.a(w6Var.e()).a(str) == 0) {
            return true;
        }
        w6Var.a().v().b("Permission not granted", str);
        return false;
    }

    final boolean P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        w6 w6Var = this.f22928a;
        String i7 = w6Var.w().i();
        w6Var.c();
        return i7.equals(str);
    }

    final Bundle Q(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object s7 = s(str2, bundle.get(str2));
                if (s7 == null) {
                    w6 w6Var = this.f22928a;
                    w6Var.a().t().b("Param value can't be null", w6Var.D().b(str2));
                } else {
                    A(bundle2, str2, s7);
                }
            }
        }
        return bundle2;
    }

    final g0 R(String str, String str2, Bundle bundle, String str3, long j7, boolean z7, boolean z8) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (x0(str2) != 0) {
            w6 w6Var = this.f22928a;
            w6Var.a().o().b("Invalid conditional property event name", w6Var.D().c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle t7 = t(str, str2, bundle2, com.google.android.gms.common.util.f.a("_o"), true);
        if (z7) {
            t7 = Q(t7, str);
        }
        p3.o.m(t7);
        return new g0(str2, new e0(t7), str3, j7);
    }

    final boolean S(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f8 = u3.e.a(context).f(str, 64);
            if (f8 == null || (signatureArr = f8.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e8) {
            this.f22928a.a().o().b("Package name not found", e8);
            return true;
        } catch (CertificateException e9) {
            this.f22928a.a().o().b("Error obtaining certificate", e9);
            return true;
        }
    }

    final byte[] T(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final boolean V(int i7, boolean z7) {
        Boolean x7 = this.f22928a.J().x();
        if (W() < i7 / 1000) {
            return (x7 == null || x7.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int W() {
        if (this.f22913h == null) {
            this.f22913h = Integer.valueOf(k3.h.h().b(this.f22928a.e()) / 1000);
        }
        return this.f22913h.intValue();
    }

    public final int X(int i7) {
        return k3.h.h().j(this.f22928a.e(), k3.k.f24503a);
    }

    public final long Y(long j7, long j8) {
        return (j7 + (j8 * 60000)) / 86400000;
    }

    final void Z(Bundle bundle, long j7) {
        long j8 = bundle.getLong("_et");
        if (j8 != 0) {
            this.f22928a.a().r().b("Params already contained engagement", Long.valueOf(j8));
        } else {
            j8 = 0;
        }
        bundle.putLong("_et", j7 + j8);
    }

    public final void a0(com.google.android.gms.internal.measurement.y1 y1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            this.f22928a.a().r().b("Error returning string value to wrapper", e8);
        }
    }

    public final void b0(com.google.android.gms.internal.measurement.y1 y1Var, long j7) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j7);
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            this.f22928a.a().r().b("Error returning long value to wrapper", e8);
        }
    }

    public final void c0(com.google.android.gms.internal.measurement.y1 y1Var, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i7);
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            this.f22928a.a().r().b("Error returning int value to wrapper", e8);
        }
    }

    public final void d0(com.google.android.gms.internal.measurement.y1 y1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            this.f22928a.a().r().b("Error returning byte array to wrapper", e8);
        }
    }

    public final void e0(com.google.android.gms.internal.measurement.y1 y1Var, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            this.f22928a.a().r().b("Error returning boolean value to wrapper", e8);
        }
    }

    public final void f0(com.google.android.gms.internal.measurement.y1 y1Var, Bundle bundle) {
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            this.f22928a.a().r().b("Error returning bundle value to wrapper", e8);
        }
    }

    public final void g0(com.google.android.gms.internal.measurement.y1 y1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            y1Var.P0(bundle);
        } catch (RemoteException e8) {
            this.f22928a.a().r().b("Error returning bundle list to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.a8
    protected final boolean i() {
        return true;
    }

    public final URL i0(long j7, String str, String str2, long j8, String str3) {
        try {
            p3.o.g(str2);
            p3.o.g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(W())), str2, str, Long.valueOf(j8));
            if (str.equals(this.f22928a.w().j())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e8) {
            e = e8;
            this.f22928a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e9) {
            e = e9;
            this.f22928a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.a8
    protected final void j() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f22928a.a().r().a("Utils falling back to Random for random id");
            }
        }
        this.f22909d.set(nextLong);
    }

    final String l0() {
        byte[] bArr = new byte[16];
        q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f22928a.a().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        p3.o.m(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.f22928a.a().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", p5.x(str));
        return false;
    }

    final boolean p(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            p3.o.m(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final long p0() {
        long andIncrement;
        long j7;
        AtomicLong atomicLong = this.f22909d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f22909d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nextLong = new Random(System.nanoTime() ^ this.f22928a.f().a()).nextLong();
            int i7 = this.f22910e + 1;
            this.f22910e = i7;
            j7 = nextLong + i7;
        }
        return j7;
    }

    public final String q(String str, int i7, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i7) {
            return str;
        }
        if (z7) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i7))).concat("...");
        }
        return null;
    }

    final SecureRandom q0() {
        h();
        if (this.f22908c == null) {
            this.f22908c = new SecureRandom();
        }
        return this.f22908c;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int r(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.yd.r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    final Object s(String str, Object obj) {
        if ("_ev".equals(str)) {
            return n0(this.f22928a.w().y(null, false), obj, true, true, null);
        }
        return n0(N(str) ? this.f22928a.w().y(null, false) : this.f22928a.w().x(null, false), obj, false, true, null);
    }

    final Bundle s0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith("gad_")) {
                    String queryParameter10 = uri.getQueryParameter(str11);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e8) {
            this.f22928a.a().r().b("Install referrer url isn't a hierarchical URI", e8);
            return null;
        }
    }

    final Bundle t(String str, String str2, Bundle bundle, List list, boolean z7) {
        int z02;
        List list2 = list;
        boolean O = O(str2, t4.w.f26432d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        w6 w6Var = this.f22928a;
        int v7 = w6Var.w().v();
        int i7 = 0;
        boolean z8 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                z02 = !z7 ? z0(str3) : 0;
                if (z02 == 0) {
                    z02 = A0(str3);
                }
            } else {
                z02 = 0;
            }
            if (z02 != 0) {
                x(bundle2, z02, str3, z02 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int r7 = r(str, str2, str3, bundle.get(str3), bundle2, list2, z7, O);
                if (r7 == 17) {
                    x(bundle2, 17, str3, Boolean.FALSE);
                } else if (r7 != 0 && !"_ev".equals(str3)) {
                    x(bundle2, r7, r7 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (r0(str3) && (i7 = i7 + 1) > v7) {
                    if (!w6Var.w().H(null, c5.f21950f1) || !z8) {
                        StringBuilder sb = new StringBuilder(String.valueOf(v7).length() + 37);
                        sb.append("Event can't contain more than ");
                        sb.append(v7);
                        sb.append(" params");
                        w6Var.a().q().c(sb.toString(), w6Var.D().a(str2), w6Var.D().e(bundle));
                    }
                    m0(bundle2, 5);
                    bundle2.remove(str3);
                    z8 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    final boolean t0(String str, String str2) {
        if (str2 == null) {
            this.f22928a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f22928a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f22928a.a().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f22928a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final void u(q5 q5Var, int i7) {
        Bundle bundle = q5Var.f22528d;
        int i8 = 0;
        boolean z7 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (r0(str) && (i8 = i8 + 1) > i7) {
                w6 w6Var = this.f22928a;
                if (!w6Var.w().H(null, c5.f21950f1) || !z7) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i7);
                    sb.append(" params");
                    w6Var.a().q().c(sb.toString(), w6Var.D().a(q5Var.f22525a), w6Var.D().e(bundle));
                    m0(bundle, 5);
                }
                bundle.remove(str);
                z7 = true;
            }
        }
    }

    final boolean u0(String str, String str2) {
        if (str2 == null) {
            this.f22928a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f22928a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.f22928a.a().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f22928a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final void v(Parcelable[] parcelableArr, int i7) {
        p3.o.m(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i8 = 0;
            boolean z7 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (r0(str) && !O(str, t4.x.f26436d) && (i8 = i8 + 1) > i7) {
                    w6 w6Var = this.f22928a;
                    if (!w6Var.w().H(null, c5.f21950f1) || !z7) {
                        n5 q7 = w6Var.a().q();
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i7);
                        sb.append(" item-scoped custom parameters");
                        q7.c(sb.toString(), w6Var.D().b(str), w6Var.D().e(bundle));
                    }
                    m0(bundle, 28);
                    bundle.remove(str);
                    z7 = true;
                }
            }
        }
    }

    final boolean v0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f22928a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        p3.o.m(str2);
        String[] strArr3 = f22905i;
        for (int i7 = 0; i7 < 3; i7++) {
            if (str2.startsWith(strArr3[i7])) {
                this.f22928a.a().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !O(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && O(str2, strArr2)) {
            return true;
        }
        this.f22928a.a().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f22928a.C().A(bundle, str, bundle2.get(str));
            }
        }
    }

    final boolean w0(String str, int i7, String str2) {
        if (str2 == null) {
            this.f22928a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i7) {
            return true;
        }
        this.f22928a.a().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i7), str2);
        return false;
    }

    final void x(Bundle bundle, int i7, String str, Object obj) {
        if (m0(bundle, i7)) {
            this.f22928a.w();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                p3.o.m(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final int x0(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (!v0("event", t4.w.f26429a, t4.w.f26430b, str)) {
            return 13;
        }
        this.f22928a.w();
        return !w0("event", 40, str) ? 2 : 0;
    }

    final int y(String str, Object obj) {
        return "_ldl".equals(str) ? C0("user property referrer", str, o0(str), obj) : C0("user property", str, o0(str), obj) ? 0 : 7;
    }

    final int y0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!v0("user property", t4.y.f26437a, null, str)) {
            return 15;
        }
        this.f22928a.w();
        return !w0("user property", 24, str) ? 6 : 0;
    }

    final Object z(String str, Object obj) {
        return "_ldl".equals(str) ? n0(o0(str), obj, true, false, null) : n0(o0(str), obj, false, false, null);
    }

    final int z0(String str) {
        if (!t0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f22928a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }
}
