package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.cf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class pd implements b8 {
    private static volatile pd K;
    private long A;
    private final Map B;
    private final Map C;
    private final Map D;
    private da F;
    private String G;
    private x H;
    private long I;

    /* renamed from: a, reason: collision with root package name */
    private final o6 f22487a;

    /* renamed from: b, reason: collision with root package name */
    private final u5 f22488b;

    /* renamed from: c, reason: collision with root package name */
    private u f22489c;

    /* renamed from: d, reason: collision with root package name */
    private x5 f22490d;

    /* renamed from: e, reason: collision with root package name */
    private uc f22491e;

    /* renamed from: f, reason: collision with root package name */
    private e f22492f;

    /* renamed from: g, reason: collision with root package name */
    private final td f22493g;

    /* renamed from: h, reason: collision with root package name */
    private ba f22494h;

    /* renamed from: i, reason: collision with root package name */
    private xb f22495i;

    /* renamed from: j, reason: collision with root package name */
    private final cd f22496j;

    /* renamed from: k, reason: collision with root package name */
    private g6 f22497k;

    /* renamed from: l, reason: collision with root package name */
    private final w6 f22498l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22500n;

    /* renamed from: o, reason: collision with root package name */
    long f22501o;

    /* renamed from: p, reason: collision with root package name */
    private List f22502p;

    /* renamed from: r, reason: collision with root package name */
    private int f22504r;

    /* renamed from: s, reason: collision with root package name */
    private int f22505s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22506t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f22507u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f22508v;

    /* renamed from: w, reason: collision with root package name */
    private FileLock f22509w;

    /* renamed from: x, reason: collision with root package name */
    private FileChannel f22510x;

    /* renamed from: y, reason: collision with root package name */
    private List f22511y;

    /* renamed from: z, reason: collision with root package name */
    private List f22512z;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f22499m = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    private final Deque f22503q = new LinkedList();
    private final Map E = new HashMap();
    private final xd J = new kd(this);

    pd(qd qdVar, w6 w6Var) {
        p3.o.m(qdVar);
        this.f22498l = w6.O(qdVar.f22551a, null, null);
        this.A = -1L;
        this.f22496j = new cd(this);
        td tdVar = new td(this);
        tdVar.k();
        this.f22493g = tdVar;
        u5 u5Var = new u5(this);
        u5Var.k();
        this.f22488b = u5Var;
        o6 o6Var = new o6(this);
        o6Var.k();
        this.f22487a = o6Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        b().t(new dd(this, qdVar));
    }

    public static pd F(Context context) {
        p3.o.m(context);
        p3.o.m(context.getApplicationContext());
        if (K == null) {
            synchronized (pd.class) {
                try {
                    if (K == null) {
                        K = new pd((qd) p3.o.m(new qd(context)), null);
                    }
                } finally {
                }
            }
        }
        return K;
    }

    static final void G(com.google.android.gms.internal.measurement.h6 h6Var, int i7, String str) {
        List x7 = h6Var.x();
        for (int i8 = 0; i8 < x7.size(); i8++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.m6) x7.get(i8)).G())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.l6 R = com.google.android.gms.internal.measurement.m6.R();
        R.y("_err");
        R.C(i7);
        com.google.android.gms.internal.measurement.m6 m6Var = (com.google.android.gms.internal.measurement.m6) R.s();
        com.google.android.gms.internal.measurement.l6 R2 = com.google.android.gms.internal.measurement.m6.R();
        R2.y("_ev");
        R2.A(str);
        com.google.android.gms.internal.measurement.m6 m6Var2 = (com.google.android.gms.internal.measurement.m6) R2.s();
        h6Var.C(m6Var);
        h6Var.C(m6Var2);
    }

    static final void H(com.google.android.gms.internal.measurement.h6 h6Var, String str) {
        List x7 = h6Var.x();
        for (int i7 = 0; i7 < x7.size(); i7++) {
            if (str.equals(((com.google.android.gms.internal.measurement.m6) x7.get(i7)).G())) {
                h6Var.G(i7);
                return;
            }
        }
    }

    private final int I(String str, o oVar) {
        t4.v vVar;
        t4.u m7;
        o6 o6Var = this.f22487a;
        if (o6Var.R(str) == null) {
            oVar.c(t4.v.AD_PERSONALIZATION, n.FAILSAFE);
            return 1;
        }
        v5 J0 = F0().J0(str);
        if (J0 != null && c3.c(J0.I()).a() == t4.u.POLICY && (m7 = o6Var.m(str, (vVar = t4.v.AD_PERSONALIZATION))) != t4.u.UNINITIALIZED) {
            oVar.c(vVar, n.REMOTE_ENFORCED_DEFAULT);
            return m7 == t4.u.GRANTED ? 0 : 1;
        }
        t4.v vVar2 = t4.v.AD_PERSONALIZATION;
        oVar.c(vVar2, n.REMOTE_DEFAULT);
        return o6Var.P(str, vVar2) ? 0 : 1;
    }

    private final Map J(com.google.android.gms.internal.measurement.i6 i6Var) {
        HashMap hashMap = new HashMap();
        K0();
        for (Map.Entry entry : td.t(i6Var, "gad_").entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    private final x K() {
        if (this.H == null) {
            this.H = new gd(this, this.f22498l);
        }
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void v0() {
        b().h();
        if (this.f22503q.isEmpty() || K().c()) {
            return;
        }
        long max = Math.max(0L, ((Integer) c5.C0.b(null)).intValue() - (f().b() - this.I));
        a().w().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
        K().b(max);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final boolean M(java.lang.String r44, long r45) {
        /*
            Method dump skipped, instructions count: 3598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.M(java.lang.String, long):boolean");
    }

    private final void N(com.google.android.gms.internal.measurement.t6 t6Var, long j7, boolean z7) {
        Object obj;
        String str = true != z7 ? "_lte" : "_se";
        wd B0 = F0().B0(t6Var.H(), str);
        wd wdVar = (B0 == null || (obj = B0.f22834e) == null) ? new wd(t6Var.H(), "auto", str, f().a(), Long.valueOf(j7)) : new wd(t6Var.H(), "auto", str, f().a(), Long.valueOf(((Long) obj).longValue() + j7));
        com.google.android.gms.internal.measurement.k7 Q = com.google.android.gms.internal.measurement.l7.Q();
        Q.y(str);
        Q.x(f().a());
        Object obj2 = wdVar.f22834e;
        Q.B(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.l7 l7Var = (com.google.android.gms.internal.measurement.l7) Q.s();
        int X = td.X(t6Var, str);
        if (X >= 0) {
            t6Var.b1(X, l7Var);
        } else {
            t6Var.c1(l7Var);
        }
        if (j7 > 0) {
            F0().A0(wdVar);
            a().w().c("Updated engagement user property. scope, value", true != z7 ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean O(com.google.android.gms.internal.measurement.h6 h6Var, com.google.android.gms.internal.measurement.h6 h6Var2) {
        p3.o.a("_e".equals(h6Var.H()));
        K0();
        com.google.android.gms.internal.measurement.m6 r7 = td.r((com.google.android.gms.internal.measurement.i6) h6Var.s(), "_sc");
        String I = r7 == null ? null : r7.I();
        K0();
        com.google.android.gms.internal.measurement.m6 r8 = td.r((com.google.android.gms.internal.measurement.i6) h6Var2.s(), "_pc");
        String I2 = r8 != null ? r8.I() : null;
        if (I2 == null || !I2.equals(I)) {
            return false;
        }
        p3.o.a("_e".equals(h6Var.H()));
        K0();
        com.google.android.gms.internal.measurement.m6 r9 = td.r((com.google.android.gms.internal.measurement.i6) h6Var.s(), "_et");
        if (r9 == null || !r9.J() || r9.K() <= 0) {
            return true;
        }
        long K2 = r9.K();
        K0();
        com.google.android.gms.internal.measurement.m6 r10 = td.r((com.google.android.gms.internal.measurement.i6) h6Var2.s(), "_et");
        if (r10 != null && r10.K() > 0) {
            K2 += r10.K();
        }
        K0();
        td.o(h6Var2, "_et", Long.valueOf(K2));
        K0();
        td.o(h6Var, "_fr", 1L);
        return true;
    }

    private final boolean P() {
        b().h();
        O0();
        return F0().B() || !TextUtils.isEmpty(F0().r());
    }

    private static String Q(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void R() {
        long max;
        long j7;
        b().h();
        O0();
        if (this.f22501o > 0) {
            long abs = 3600000 - Math.abs(f().b() - this.f22501o);
            if (abs > 0) {
                a().w().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                G0().b();
                H0().n();
                return;
            }
            this.f22501o = 0L;
        }
        if (!this.f22498l.m() || !P()) {
            a().w().a("Nothing to upload or uploading impossible");
            G0().b();
            H0().n();
            return;
        }
        long a8 = f().a();
        B0();
        long max2 = Math.max(0L, ((Long) c5.P.b(null)).longValue());
        boolean z7 = true;
        if (!F0().D() && !F0().s()) {
            z7 = false;
        }
        if (z7) {
            String i7 = B0().i();
            if (TextUtils.isEmpty(i7) || ".none.".equals(i7)) {
                B0();
                max = Math.max(0L, ((Long) c5.J.b(null)).longValue());
            } else {
                B0();
                max = Math.max(0L, ((Long) c5.K.b(null)).longValue());
            }
        } else {
            B0();
            max = Math.max(0L, ((Long) c5.I.b(null)).longValue());
        }
        long a9 = this.f22495i.f22864h.a();
        long a10 = this.f22495i.f22865i.a();
        long j8 = 0;
        boolean z8 = z7;
        long max3 = Math.max(F0().y(), F0().A());
        if (max3 == 0) {
            j7 = 0;
        } else {
            long abs2 = a8 - Math.abs(max3 - a8);
            long abs3 = a8 - Math.abs(a9 - a8);
            long abs4 = a8 - Math.abs(a10 - a8);
            j7 = max2 + abs2;
            long max4 = Math.max(abs3, abs4);
            if (z8 && max4 > 0) {
                j7 = Math.min(abs2, max4) + max;
            }
            if (!K0().S(max4, max)) {
                j7 = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i8 = 0;
                while (true) {
                    B0();
                    if (i8 >= Math.min(20, Math.max(0, ((Integer) c5.R.b(null)).intValue()))) {
                        j7 = 0;
                        break;
                    }
                    B0();
                    j7 += Math.max(j8, ((Long) c5.Q.b(null)).longValue()) * (1 << i8);
                    if (j7 > abs4) {
                        break;
                    }
                    i8++;
                    j8 = 0;
                }
            }
            j8 = 0;
        }
        if (j7 == j8) {
            a().w().a("Next upload time is 0");
            G0().b();
            H0().n();
            return;
        }
        if (!E0().m()) {
            a().w().a("No network");
            G0().a();
            H0().n();
            return;
        }
        long a11 = this.f22495i.f22863g.a();
        B0();
        long max5 = Math.max(0L, ((Long) c5.G.b(null)).longValue());
        if (!K0().S(a11, max5)) {
            j7 = Math.max(j7, a11 + max5);
        }
        G0().b();
        long a12 = j7 - f().a();
        if (a12 <= 0) {
            B0();
            a12 = Math.max(0L, ((Long) c5.L.b(null)).longValue());
            this.f22495i.f22864h.b(f().a());
        }
        a().w().b("Upload scheduled in approximately ms", Long.valueOf(a12));
        H0().m(a12);
    }

    private final void S() {
        b().h();
        if (this.f22506t || this.f22507u || this.f22508v) {
            a().w().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f22506t), Boolean.valueOf(this.f22507u), Boolean.valueOf(this.f22508v));
            return;
        }
        a().w().a("Stopping uploading service(s)");
        List list = this.f22502p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) p3.o.m(this.f22502p)).clear();
    }

    private final Boolean T(v5 v5Var) {
        try {
            if (v5Var.F0() != -2147483648L) {
                if (v5Var.F0() == u3.e.a(this.f22498l.e()).f(v5Var.o0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = u3.e.a(this.f22498l.e()).f(v5Var.o0(), 0).versionName;
                String D0 = v5Var.D0();
                if (D0 != null && D0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final ae U(String str) {
        v5 J0 = F0().J0(str);
        if (J0 == null || TextUtils.isEmpty(J0.D0())) {
            a().v().b("No app data available; dropping", str);
            return null;
        }
        Boolean T = T(J0);
        if (T == null || T.booleanValue()) {
            return new ae(str, J0.r0(), J0.D0(), J0.F0(), J0.H0(), J0.J0(), J0.L0(), (String) null, J0.d(), false, J0.x0(), 0L, 0, J0.P(), false, J0.R(), J0.b(), J0.T(), g(str).l(), "", (String) null, J0.V(), J0.X(), g(str).b(), R0(str).e(), J0.b0(), J0.j0(), J0.l0(), J0.I(), 0L, J0.M());
        }
        a().o().b("App version does not match; dropping. appId", p5.x(str));
        return null;
    }

    private final boolean V(String str, String str2) {
        c0 v02 = F0().v0(str, str2);
        return v02 == null || v02.f21920c < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W(Context context, Intent intent) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
            return;
        }
        makeBasic = BroadcastOptions.makeBasic();
        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
        bundle = shareIdentityEnabled.toBundle();
        context.sendBroadcast(intent, null, bundle);
    }

    private static final boolean X(ae aeVar) {
        return !TextUtils.isEmpty(aeVar.f21862r);
    }

    private static final ad Y(ad adVar) {
        if (adVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (adVar.i()) {
            return adVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(adVar.getClass())));
    }

    private static final Boolean Z(ae aeVar) {
        Boolean bool = aeVar.F;
        String str = aeVar.S;
        if (!TextUtils.isEmpty(str)) {
            t4.u a8 = c3.c(str).a();
            t4.u uVar = t4.u.UNINITIALIZED;
            int ordinal = a8.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r21 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void A(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.A(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    protected final void A0() {
        b().h();
        F0().u();
        u F0 = F0();
        F0.h();
        F0.j();
        if (F0.a0()) {
            b5 b5Var = c5.f21990w0;
            if (((Long) b5Var.b(null)).longValue() != 0) {
                SQLiteDatabase u02 = F0.u0();
                w6 w6Var = F0.f22928a;
                int delete = u02.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(w6Var.f().a()), String.valueOf(b5Var.b(null))});
                if (delete > 0) {
                    w6Var.a().w().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        if (this.f22495i.f22864h.a() == 0) {
            this.f22495i.f22864h.b(f().a());
        }
        R();
    }

    final void B(v5 v5Var) {
        b().h();
        if (TextUtils.isEmpty(v5Var.r0())) {
            C((String) p3.o.m(v5Var.o0()), 204, null, null, null);
            return;
        }
        String str = (String) p3.o.m(v5Var.o0());
        a().w().b("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.a5 w7 = D0().w(str);
        String y7 = D0().y(str);
        r.a aVar = null;
        if (w7 != null) {
            if (!TextUtils.isEmpty(y7)) {
                aVar = new r.a();
                aVar.put("If-Modified-Since", y7);
            }
            String z7 = D0().z(str);
            if (!TextUtils.isEmpty(z7)) {
                if (aVar == null) {
                    aVar = new r.a();
                }
                aVar.put("If-None-Match", z7);
            }
        }
        this.f22506t = true;
        E0().o(v5Var, aVar, new r5() { // from class: com.google.android.gms.measurement.internal.od
            @Override // com.google.android.gms.measurement.internal.r5
            public final /* synthetic */ void a(String str2, int i7, Throwable th, byte[] bArr, Map map) {
                pd.this.C(str2, i7, th, bArr, map);
            }
        });
    }

    public final m B0() {
        return ((w6) p3.o.m(this.f22498l)).w();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void C(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.C(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final cd C0() {
        return this.f22496j;
    }

    final void D(Runnable runnable) {
        b().h();
        if (this.f22502p == null) {
            this.f22502p = new ArrayList();
        }
        this.f22502p.add(runnable);
    }

    public final o6 D0() {
        o6 o6Var = this.f22487a;
        Y(o6Var);
        return o6Var;
    }

    final void E() {
        b().h();
        O0();
        if (this.f22500n) {
            return;
        }
        this.f22500n = true;
        if (a0()) {
            FileChannel fileChannel = this.f22510x;
            b().h();
            int i7 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                a().o().a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i7 = allocate.getInt();
                    } else if (read != -1) {
                        a().r().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e8) {
                    a().o().b("Failed to read from channel", e8);
                }
            }
            int t7 = this.f22498l.L().t();
            b().h();
            if (i7 > t7) {
                a().o().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i7), Integer.valueOf(t7));
                return;
            }
            if (i7 < t7) {
                FileChannel fileChannel2 = this.f22510x;
                b().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    a().o().a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(t7);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            a().o().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        a().w().c("Storage version upgraded. Previous, current version", Integer.valueOf(i7), Integer.valueOf(t7));
                        return;
                    } catch (IOException e9) {
                        a().o().b("Failed to write to channel", e9);
                    }
                }
                a().o().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i7), Integer.valueOf(t7));
            }
        }
    }

    public final u5 E0() {
        u5 u5Var = this.f22488b;
        Y(u5Var);
        return u5Var;
    }

    public final u F0() {
        u uVar = this.f22489c;
        Y(uVar);
        return uVar;
    }

    public final x5 G0() {
        x5 x5Var = this.f22490d;
        if (x5Var != null) {
            return x5Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final uc H0() {
        uc ucVar = this.f22491e;
        Y(ucVar);
        return ucVar;
    }

    public final e I0() {
        e eVar = this.f22492f;
        Y(eVar);
        return eVar;
    }

    public final ba J0() {
        ba baVar = this.f22494h;
        Y(baVar);
        return baVar;
    }

    public final td K0() {
        td tdVar = this.f22493g;
        Y(tdVar);
        return tdVar;
    }

    public final xb L0() {
        return this.f22495i;
    }

    public final i5 M0() {
        return this.f22498l.D();
    }

    public final yd N0() {
        return ((w6) p3.o.m(this.f22498l)).C();
    }

    final void O0() {
        if (!this.f22499m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void P0(ae aeVar) {
        b().h();
        O0();
        String str = aeVar.f21861q;
        p3.o.g(str);
        d8 f8 = d8.f(aeVar.I, aeVar.N);
        g(str);
        a().w().c("Setting storage consent for package", str, f8);
        d(str, f8);
    }

    final void Q0(ae aeVar) {
        b().h();
        O0();
        String str = aeVar.f21861q;
        p3.o.g(str);
        y g8 = y.g(aeVar.O);
        a().w().c("Setting DMA consent for package", str, g8);
        b().h();
        O0();
        t4.u c8 = y.h(S0(str), 100).c();
        this.C.put(str, g8);
        F0().V(str, g8);
        t4.u c9 = y.h(S0(str), 100).c();
        b().h();
        O0();
        t4.u uVar = t4.u.DENIED;
        boolean z7 = c8 == uVar && c9 == t4.u.GRANTED;
        boolean z8 = c8 == t4.u.GRANTED && c9 == uVar;
        if (z7 || z8) {
            a().w().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (F0().L0(h(), str, false, false, false, false, false, false, false).f22518f < B0().E(str, c5.f21972n0)) {
                bundle.putLong("_r", 1L);
                a().w().c("_dcu realtime event count", str, Long.valueOf(F0().L0(h(), str, false, false, false, false, false, true, false).f22518f));
            }
            this.J.a(str, "_dcu", bundle);
        }
    }

    final y R0(String str) {
        b().h();
        O0();
        Map map = this.C;
        y yVar = (y) map.get(str);
        if (yVar != null) {
            return yVar;
        }
        y U = F0().U(str);
        map.put(str, U);
        return U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Bundle S0(String str) {
        b().h();
        O0();
        if (D0().R(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        d8 g8 = g(str);
        bundle.putAll(g8.n());
        bundle.putAll(T0(str, R0(str), g8, new o()).f());
        wd B0 = F0().B0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (B0 != null ? B0.f22834e.equals(1L) : I(str, new o())) ? "granted" : "denied");
        return bundle;
    }

    final y T0(String str, y yVar, d8 d8Var, o oVar) {
        t4.u uVar;
        int i7 = 90;
        if (D0().R(str) == null) {
            if (yVar.c() == t4.u.DENIED) {
                i7 = yVar.b();
                oVar.b(t4.v.AD_USER_DATA, i7);
            } else {
                oVar.c(t4.v.AD_USER_DATA, n.FAILSAFE);
            }
            return new y(Boolean.FALSE, i7, Boolean.TRUE, "-");
        }
        t4.u c8 = yVar.c();
        t4.u uVar2 = t4.u.GRANTED;
        if (c8 == uVar2 || c8 == (uVar = t4.u.DENIED)) {
            i7 = yVar.b();
            oVar.b(t4.v.AD_USER_DATA, i7);
        } else {
            if (c8 == t4.u.POLICY) {
                o6 o6Var = this.f22487a;
                t4.v vVar = t4.v.AD_USER_DATA;
                t4.u m7 = o6Var.m(str, vVar);
                if (m7 != t4.u.UNINITIALIZED) {
                    oVar.c(vVar, n.REMOTE_ENFORCED_DEFAULT);
                    c8 = m7;
                }
            }
            o6 o6Var2 = this.f22487a;
            t4.v vVar2 = t4.v.AD_USER_DATA;
            t4.v Q = o6Var2.Q(str, vVar2);
            t4.u p7 = d8Var.p();
            boolean z7 = p7 == uVar2 || p7 == uVar;
            if (Q == t4.v.AD_STORAGE && z7) {
                oVar.c(vVar2, n.REMOTE_DELEGATION);
                c8 = p7;
            } else {
                oVar.c(vVar2, n.REMOTE_DEFAULT);
                c8 = true != o6Var2.P(str, vVar2) ? uVar : uVar2;
            }
        }
        boolean S = this.f22487a.S(str);
        SortedSet T = D0().T(str);
        if (c8 == t4.u.DENIED || T.isEmpty()) {
            return new y(Boolean.FALSE, i7, Boolean.valueOf(S), "-");
        }
        return new y(Boolean.TRUE, i7, Boolean.valueOf(S), S ? TextUtils.join("", T) : "");
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final p5 a() {
        return ((w6) p3.o.m(this.f22498l)).a();
    }

    final boolean a0() {
        b().h();
        FileLock fileLock = this.f22509w;
        if (fileLock != null && fileLock.isValid()) {
            a().w().a("Storage concurrent access okay");
            return true;
        }
        this.f22489c.f22928a.w();
        File filesDir = this.f22498l.e().getFilesDir();
        com.google.android.gms.internal.measurement.z0.a();
        int i7 = com.google.android.gms.internal.measurement.f1.f20937b;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.f22510x = channel;
            FileLock tryLock = channel.tryLock();
            this.f22509w = tryLock;
            if (tryLock != null) {
                a().w().a("Storage concurrent access okay");
                return true;
            }
            a().o().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e8) {
            a().o().b("Failed to acquire storage lock", e8);
            return false;
        } catch (IOException e9) {
            a().o().b("Failed to access storage lock file", e9);
            return false;
        } catch (OverlappingFileLockException e10) {
            a().r().b("Storage lock already acquired", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final s6 b() {
        return ((w6) p3.o.m(this.f22498l)).b();
    }

    final void b0(ae aeVar) {
        if (this.f22511y != null) {
            ArrayList arrayList = new ArrayList();
            this.f22512z = arrayList;
            arrayList.addAll(this.f22511y);
        }
        u F0 = F0();
        String str = (String) p3.o.m(aeVar.f21861q);
        p3.o.g(str);
        F0.h();
        F0.j();
        try {
            SQLiteDatabase u02 = F0.u0();
            String[] strArr = {str};
            int delete = u02.delete("apps", "app_id=?", strArr) + u02.delete("events", "app_id=?", strArr) + u02.delete("events_snapshot", "app_id=?", strArr) + u02.delete("user_attributes", "app_id=?", strArr) + u02.delete("conditional_properties", "app_id=?", strArr) + u02.delete("raw_events", "app_id=?", strArr) + u02.delete("raw_events_metadata", "app_id=?", strArr) + u02.delete("queue", "app_id=?", strArr) + u02.delete("audience_filter_values", "app_id=?", strArr) + u02.delete("main_event_params", "app_id=?", strArr) + u02.delete("default_event_params", "app_id=?", strArr) + u02.delete("trigger_uris", "app_id=?", strArr) + u02.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.ae.a();
            w6 w6Var = F0.f22928a;
            if (w6Var.w().H(null, c5.f21959i1)) {
                delete += u02.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (delete > 0) {
                w6Var.a().w().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e8) {
            F0.f22928a.a().o().c("Error resetting analytics data. appId, error", p5.x(str), e8);
        }
        if (aeVar.f21868x) {
            h0(aeVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final f c() {
        return this.f22498l.c();
    }

    final void c0(ud udVar, ae aeVar) {
        wd B0;
        long j7;
        b().h();
        O0();
        if (X(aeVar)) {
            if (!aeVar.f21868x) {
                o0(aeVar);
                return;
            }
            yd N0 = N0();
            String str = udVar.f22701r;
            int y02 = N0.y0(str);
            if (y02 != 0) {
                yd N02 = N0();
                B0();
                N0().B(this.J, aeVar.f21861q, y02, "_ev", N02.q(str, 24, true), str != null ? str.length() : 0);
                return;
            }
            int y7 = N0().y(str, udVar.M0());
            if (y7 != 0) {
                yd N03 = N0();
                B0();
                String q7 = N03.q(str, 24, true);
                Object M0 = udVar.M0();
                if (M0 != null && ((M0 instanceof String) || (M0 instanceof CharSequence))) {
                    r13 = M0.toString().length();
                }
                N0().B(this.J, aeVar.f21861q, y7, "_ev", q7, r13);
                return;
            }
            Object z7 = N0().z(str, udVar.M0());
            if (z7 != null) {
                if ("_sid".equals(str)) {
                    long j8 = udVar.f22702s;
                    String str2 = udVar.f22705v;
                    String str3 = (String) p3.o.m(aeVar.f21861q);
                    wd B02 = F0().B0(str3, "_sno");
                    if (B02 != null) {
                        Object obj = B02.f22834e;
                        if (obj instanceof Long) {
                            j7 = ((Long) obj).longValue();
                            c0(new ud("_sno", j8, Long.valueOf(j7 + 1), str2), aeVar);
                        }
                    }
                    if (B02 != null) {
                        a().r().b("Retrieved last session number from database does not contain a valid (long) value", B02.f22834e);
                    }
                    c0 v02 = F0().v0(str3, "_s");
                    if (v02 != null) {
                        n5 w7 = a().w();
                        long j9 = v02.f21920c;
                        w7.b("Backfill the session number. Last used session number", Long.valueOf(j9));
                        j7 = j9;
                    } else {
                        j7 = 0;
                    }
                    c0(new ud("_sno", j8, Long.valueOf(j7 + 1), str2), aeVar);
                }
                String str4 = aeVar.f21861q;
                wd wdVar = new wd((String) p3.o.m(str4), (String) p3.o.m(udVar.f22705v), str, udVar.f22702s, z7);
                n5 w8 = a().w();
                w6 w6Var = this.f22498l;
                String str5 = wdVar.f22832c;
                w8.c("Setting user property", w6Var.D().c(str5), z7);
                F0().r0();
                try {
                    if ("_id".equals(str5) && (B0 = F0().B0(str4, "_id")) != null && !wdVar.f22834e.equals(B0.f22834e)) {
                        F0().z0(str4, "_lair");
                    }
                    o0(aeVar);
                    boolean A0 = F0().A0(wdVar);
                    if ("_sid".equals(str)) {
                        long U = K0().U(aeVar.K);
                        v5 J0 = F0().J0(str4);
                        if (J0 != null) {
                            J0.a0(U);
                            if (J0.A()) {
                                F0().K0(J0, false, false);
                            }
                        }
                    }
                    F0().s0();
                    if (!A0) {
                        a().o().c("Too many unique user properties are set. Ignoring user property", w6Var.D().c(str5), wdVar.f22834e);
                        N0().B(this.J, str4, 9, null, null, 0);
                    }
                    F0().t0();
                } catch (Throwable th) {
                    F0().t0();
                    throw th;
                }
            }
        }
    }

    final void d(String str, d8 d8Var) {
        b().h();
        O0();
        this.B.put(str, d8Var);
        F0().L(str, d8Var);
    }

    final void d0(String str, ae aeVar) {
        b().h();
        O0();
        if (X(aeVar)) {
            if (!aeVar.f21868x) {
                o0(aeVar);
                return;
            }
            Boolean Z = Z(aeVar);
            if ("_npa".equals(str) && Z != null) {
                a().v().a("Falling back to manifest metadata value for ad personalization");
                c0(new ud("_npa", f().a(), Long.valueOf(true != Z.booleanValue() ? 0L : 1L), "auto"), aeVar);
                return;
            }
            n5 v7 = a().v();
            w6 w6Var = this.f22498l;
            v7.b("Removing user property", w6Var.D().c(str));
            F0().r0();
            try {
                o0(aeVar);
                if ("_id".equals(str)) {
                    F0().z0((String) p3.o.m(aeVar.f21861q), "_lair");
                }
                F0().z0((String) p3.o.m(aeVar.f21861q), str);
                F0().s0();
                a().v().b("User property removed", w6Var.D().c(str));
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final Context e() {
        return this.f22498l.e();
    }

    final void e0() {
        this.f22504r++;
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final com.google.android.gms.common.util.e f() {
        return ((w6) p3.o.m(this.f22498l)).f();
    }

    final void f0() {
        this.f22505s++;
    }

    final d8 g(String str) {
        d8 d8Var = d8.f22051c;
        b().h();
        O0();
        d8 d8Var2 = (d8) this.B.get(str);
        if (d8Var2 == null) {
            d8Var2 = F0().J(str);
            if (d8Var2 == null) {
                d8Var2 = d8.f22051c;
            }
            d(str, d8Var2);
        }
        return d8Var2;
    }

    final w6 g0() {
        return this.f22498l;
    }

    final long h() {
        long a8 = f().a();
        xb xbVar = this.f22495i;
        xbVar.j();
        xbVar.h();
        a6 a6Var = xbVar.f22866j;
        long a9 = a6Var.a();
        if (a9 == 0) {
            a9 = xbVar.f22928a.C().q0().nextInt(86400000) + 1;
            a6Var.b(a9);
        }
        return ((((a8 + a9) / 1000) / 60) / 60) / 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c0, code lost:
    
        if (true == r12.booleanValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00c2, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c7, code lost:
    
        r15 = new com.google.android.gms.measurement.internal.ud("_npa", r17, java.lang.Long.valueOf(r23), "auto");
        r24 = 1;
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00da, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00e4, code lost:
    
        if (r11.f22834e.equals(r15.f22703t) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00e6, code lost:
    
        c0(r15, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00c5, code lost:
    
        r23 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x040b A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011a A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0106 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void h0(com.google.android.gms.measurement.internal.ae r28) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.h0(com.google.android.gms.measurement.internal.ae):void");
    }

    final void i(g0 g0Var, String str) {
        v5 J0 = F0().J0(str);
        if (J0 == null || TextUtils.isEmpty(J0.D0())) {
            a().v().b("No app data available; dropping event", str);
            return;
        }
        Boolean T = T(J0);
        if (T == null) {
            if (!"_ui".equals(g0Var.f22160q)) {
                a().r().b("Could not find package. appId", p5.x(str));
            }
        } else if (!T.booleanValue()) {
            a().o().b("App version does not match; dropping event. appId", p5.x(str));
            return;
        }
        j(g0Var, new ae(str, J0.r0(), J0.D0(), J0.F0(), J0.H0(), J0.J0(), J0.L0(), (String) null, J0.d(), false, J0.x0(), 0L, 0, J0.P(), false, J0.R(), J0.b(), J0.T(), g(str).l(), "", (String) null, J0.V(), J0.X(), g(str).b(), R0(str).e(), J0.b0(), J0.j0(), J0.l0(), J0.I(), 0L, J0.M()));
    }

    final void i0(ae aeVar) {
        b().h();
        O0();
        p3.o.m(aeVar);
        String str = aeVar.f21861q;
        p3.o.g(str);
        int i7 = 0;
        if (B0().H(null, c5.A0)) {
            long a8 = f().a();
            int E = B0().E(null, c5.f21961j0);
            B0();
            long n7 = a8 - m.n();
            while (i7 < E && M(null, n7)) {
                i7++;
            }
        } else {
            B0();
            long p7 = m.p();
            while (i7 < p7 && M(str, 0L)) {
                i7++;
            }
        }
        if (B0().H(null, c5.B0)) {
            b().h();
            v0();
        }
        if (this.f22496j.j(str, com.google.android.gms.internal.measurement.e7.c(aeVar.U))) {
            a().w().b("[sgtm] Going background, trigger client side upload. appId", str);
            s(str, f().a());
        }
    }

    final void j(g0 g0Var, ae aeVar) {
        String str = aeVar.f21861q;
        p3.o.g(str);
        q5 a8 = q5.a(g0Var);
        N0().w(a8.f22528d, F0().G(str));
        N0().u(a8, B0().w(str));
        g0 b8 = a8.b();
        if (!B0().H(null, c5.f21953g1) && "_cmp".equals(b8.f22160q)) {
            e0 e0Var = b8.f22161r;
            if ("referrer API v2".equals(e0Var.P0("_cis"))) {
                String P0 = e0Var.P0("gclid");
                if (!TextUtils.isEmpty(P0)) {
                    c0(new ud("_lgclid", b8.f22163t, P0, "auto"), aeVar);
                }
            }
        }
        k(b8, aeVar);
    }

    final void j0(i iVar) {
        ae U = U((String) p3.o.m(iVar.f22220q));
        if (U != null) {
            k0(iVar, U);
        }
    }

    final void k(g0 g0Var, ae aeVar) {
        g0 g0Var2;
        List<i> I0;
        List<i> I02;
        List<i> I03;
        String str;
        p3.o.m(aeVar);
        String str2 = aeVar.f21861q;
        p3.o.g(str2);
        b().h();
        O0();
        long j7 = g0Var.f22163t;
        q5 a8 = q5.a(g0Var);
        b().h();
        yd.k0((this.F == null || (str = this.G) == null || !str.equals(str2)) ? null : this.F, a8.f22528d, false);
        g0 b8 = a8.b();
        K0();
        if (td.p(b8, aeVar)) {
            if (!aeVar.f21868x) {
                o0(aeVar);
                return;
            }
            List list = aeVar.H;
            if (list != null) {
                String str3 = b8.f22160q;
                if (!list.contains(str3)) {
                    a().v().d("Dropping non-safelisted event. appId, event name, origin", str2, b8.f22160q, b8.f22162s);
                    return;
                } else {
                    Bundle R0 = b8.f22161r.R0();
                    R0.putLong("ga_safelisted", 1L);
                    g0Var2 = new g0(str3, new e0(R0), b8.f22162s, b8.f22163t);
                }
            } else {
                g0Var2 = b8;
            }
            F0().r0();
            try {
                String str4 = g0Var2.f22160q;
                if ("_s".equals(str4) && !F0().C(str2, "_s") && g0Var2.f22161r.N0("_sid").longValue() != 0) {
                    if (!F0().C(str2, "_f") && !F0().C(str2, "_v")) {
                        F0().I(str2, Long.valueOf(f().a() - 15000), "_sid", l(str2, g0Var2));
                    }
                    F0().I(str2, null, "_sid", l(str2, g0Var2));
                }
                u F0 = F0();
                p3.o.g(str2);
                F0.h();
                F0.j();
                if (j7 < 0) {
                    F0.f22928a.a().r().c("Invalid time querying timed out conditional properties", p5.x(str2), Long.valueOf(j7));
                    I0 = Collections.EMPTY_LIST;
                } else {
                    I0 = F0.I0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j7)});
                }
                for (i iVar : I0) {
                    if (iVar != null) {
                        a().w().d("User property timed out", iVar.f22220q, this.f22498l.D().c(iVar.f22222s.f22701r), iVar.f22222s.M0());
                        g0 g0Var3 = iVar.f22226w;
                        if (g0Var3 != null) {
                            m(new g0(g0Var3, j7), aeVar);
                        }
                        F0().G0(str2, iVar.f22222s.f22701r);
                    }
                }
                u F02 = F0();
                p3.o.g(str2);
                F02.h();
                F02.j();
                if (j7 < 0) {
                    F02.f22928a.a().r().c("Invalid time querying expired conditional properties", p5.x(str2), Long.valueOf(j7));
                    I02 = Collections.EMPTY_LIST;
                } else {
                    I02 = F02.I0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j7)});
                }
                ArrayList arrayList = new ArrayList(I02.size());
                for (i iVar2 : I02) {
                    if (iVar2 != null) {
                        a().w().d("User property expired", iVar2.f22220q, this.f22498l.D().c(iVar2.f22222s.f22701r), iVar2.f22222s.M0());
                        F0().z0(str2, iVar2.f22222s.f22701r);
                        g0 g0Var4 = iVar2.A;
                        if (g0Var4 != null) {
                            arrayList.add(g0Var4);
                        }
                        F0().G0(str2, iVar2.f22222s.f22701r);
                    }
                }
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    m(new g0((g0) obj, j7), aeVar);
                }
                u F03 = F0();
                p3.o.g(str2);
                p3.o.g(str4);
                F03.h();
                F03.j();
                if (j7 < 0) {
                    w6 w6Var = F03.f22928a;
                    w6Var.a().r().d("Invalid time querying triggered conditional properties", p5.x(str2), w6Var.D().a(str4), Long.valueOf(j7));
                    I03 = Collections.EMPTY_LIST;
                } else {
                    I03 = F03.I0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j7)});
                }
                ArrayList arrayList2 = new ArrayList(I03.size());
                for (i iVar3 : I03) {
                    if (iVar3 != null) {
                        ud udVar = iVar3.f22222s;
                        wd wdVar = new wd((String) p3.o.m(iVar3.f22220q), iVar3.f22221r, udVar.f22701r, j7, p3.o.m(udVar.M0()));
                        if (F0().A0(wdVar)) {
                            a().w().d("User property triggered", iVar3.f22220q, this.f22498l.D().c(wdVar.f22832c), wdVar.f22834e);
                        } else {
                            a().o().d("Too many active user properties, ignoring", p5.x(iVar3.f22220q), this.f22498l.D().c(wdVar.f22832c), wdVar.f22834e);
                        }
                        g0 g0Var5 = iVar3.f22228y;
                        if (g0Var5 != null) {
                            arrayList2.add(g0Var5);
                        }
                        iVar3.f22222s = new ud(wdVar);
                        iVar3.f22224u = true;
                        F0().E0(iVar3);
                    }
                }
                m(g0Var2, aeVar);
                int size2 = arrayList2.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    m(new g0((g0) obj2, j7), aeVar);
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    final void k0(i iVar, ae aeVar) {
        p3.o.m(iVar);
        p3.o.g(iVar.f22220q);
        p3.o.m(iVar.f22221r);
        p3.o.m(iVar.f22222s);
        p3.o.g(iVar.f22222s.f22701r);
        b().h();
        O0();
        if (X(aeVar)) {
            if (!aeVar.f21868x) {
                o0(aeVar);
                return;
            }
            i iVar2 = new i(iVar);
            boolean z7 = false;
            iVar2.f22224u = false;
            F0().r0();
            try {
                i F0 = F0().F0((String) p3.o.m(iVar2.f22220q), iVar2.f22222s.f22701r);
                if (F0 != null && !F0.f22221r.equals(iVar2.f22221r)) {
                    a().r().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f22498l.D().c(iVar2.f22222s.f22701r), iVar2.f22221r, F0.f22221r);
                }
                if (F0 != null && F0.f22224u) {
                    iVar2.f22221r = F0.f22221r;
                    iVar2.f22223t = F0.f22223t;
                    iVar2.f22227x = F0.f22227x;
                    iVar2.f22225v = F0.f22225v;
                    iVar2.f22228y = F0.f22228y;
                    iVar2.f22224u = true;
                    ud udVar = iVar2.f22222s;
                    iVar2.f22222s = new ud(udVar.f22701r, F0.f22222s.f22702s, udVar.M0(), F0.f22222s.f22705v);
                } else if (TextUtils.isEmpty(iVar2.f22225v)) {
                    ud udVar2 = iVar2.f22222s;
                    iVar2.f22222s = new ud(udVar2.f22701r, iVar2.f22223t, udVar2.M0(), iVar2.f22222s.f22705v);
                    iVar2.f22224u = true;
                    z7 = true;
                }
                if (iVar2.f22224u) {
                    ud udVar3 = iVar2.f22222s;
                    wd wdVar = new wd((String) p3.o.m(iVar2.f22220q), iVar2.f22221r, udVar3.f22701r, udVar3.f22702s, p3.o.m(udVar3.M0()));
                    if (F0().A0(wdVar)) {
                        a().v().d("User property updated immediately", iVar2.f22220q, this.f22498l.D().c(wdVar.f22832c), wdVar.f22834e);
                    } else {
                        a().o().d("(2)Too many active user properties, ignoring", p5.x(iVar2.f22220q), this.f22498l.D().c(wdVar.f22832c), wdVar.f22834e);
                    }
                    if (z7 && iVar2.f22228y != null) {
                        m(new g0(iVar2.f22228y, iVar2.f22223t), aeVar);
                    }
                }
                if (F0().E0(iVar2)) {
                    a().v().d("Conditional property added", iVar2.f22220q, this.f22498l.D().c(iVar2.f22222s.f22701r), iVar2.f22222s.M0());
                } else {
                    a().o().d("Too many conditional properties, ignoring", p5.x(iVar2.f22220q), this.f22498l.D().c(iVar2.f22222s.f22701r), iVar2.f22222s.M0());
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    final Bundle l(String str, g0 g0Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", g0Var.f22161r.N0("_sid").longValue());
        wd B0 = F0().B0(str, "_sno");
        if (B0 != null) {
            Object obj = B0.f22834e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    final void l0(i iVar) {
        ae U = U((String) p3.o.m(iVar.f22220q));
        if (U != null) {
            m0(iVar, U);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:358|(2:360|(10:362|363|364|(1:366)|58|(0)(0)|61|(0)(0)|67|68))|367|368|369|370|371|363|364|(0)|58|(0)(0)|61|(0)(0)|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(65:(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))(1:330)|84|85|(1:87)|88|(2:92|(1:94))|95|(2:101|(2:103|104))|107|(3:108|109|110)|111|(1:113)|114|(2:116|(1:120)(1:119))(1:326)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(6:143|(1:147)|148|(1:150)(1:183)|151|(1:153)(15:154|(1:156)(1:182)|157|(1:159)(1:181)|160|(1:162)(1:180)|163|(1:165)(1:179)|166|(1:168)(1:178)|169|(1:171)(1:177)|172|(1:174)(1:176)|175))|184|(1:186)|187|(1:189)(1:325)|(34:193|(4:196|(3:198|199|(3:201|202|(3:204|205|207)(1:316))(1:318))(1:322)|317|194)|323|208|(1:210)|(1:212)|213|(1:215)|216|(2:220|(4:222|(1:224)|225|(28:233|(1:235)(1:314)|236|(1:238)|239|240|(2:242|(1:244))|245|(3:247|(1:249)|250)(1:313)|251|(1:255)|256|(1:258)|259|(4:262|(2:268|269)|270|260)|274|275|276|277|278|(2:279|(2:281|(1:283)(1:298))(3:299|300|(1:305)(1:304)))|285|286|287|(1:289)(2:294|295)|290|291|292)))|315|240|(0)|245|(0)(0)|251|(2:253|255)|256|(0)|259|(1:260)|274|275|276|277|278|(3:279|(0)(0)|298)|285|286|287|(0)(0)|290|291|292)|324|(0)|213|(0)|216|(3:218|220|(0))|315|240|(0)|245|(0)(0)|251|(0)|256|(0)|259|(1:260)|274|275|276|277|278|(3:279|(0)(0)|298)|285|286|287|(0)(0)|290|291|292) */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0a32, code lost:
    
        r30 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0ae5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0aec, code lost:
    
        r2.f22928a.a().o().c("Error storing raw event. appId", com.google.android.gms.measurement.internal.p5.x(r3.f21873a), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0b02, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0b1d, code lost:
    
        a().o().c("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.p5.x(r8.H()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x028a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x028b, code lost:
    
        r12.f22928a.a().o().c("Error pruning currencies. appId", com.google.android.gms.measurement.internal.p5.x(r10), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07af A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07bf A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07f6 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x08ae A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08c5 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x092c A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x094d A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0969 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a28 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0ad1 A[Catch: all -> 0x0176, SQLiteException -> 0x0ae5, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0ae5, blocks: (B:287:0x0ac0, B:289:0x0ad1), top: B:286:0x0ac0, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a35 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0306 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x02c5 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0366 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038b  */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m(com.google.android.gms.measurement.internal.g0 r45, com.google.android.gms.measurement.internal.ae r46) {
        /*
            Method dump skipped, instructions count: 2923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.m(com.google.android.gms.measurement.internal.g0, com.google.android.gms.measurement.internal.ae):void");
    }

    final void m0(i iVar, ae aeVar) {
        p3.o.m(iVar);
        p3.o.g(iVar.f22220q);
        p3.o.m(iVar.f22222s);
        p3.o.g(iVar.f22222s.f22701r);
        b().h();
        O0();
        if (X(aeVar)) {
            if (!aeVar.f21868x) {
                o0(aeVar);
                return;
            }
            F0().r0();
            try {
                o0(aeVar);
                String str = (String) p3.o.m(iVar.f22220q);
                i F0 = F0().F0(str, iVar.f22222s.f22701r);
                if (F0 != null) {
                    a().v().c("Removing conditional user property", iVar.f22220q, this.f22498l.D().c(iVar.f22222s.f22701r));
                    F0().G0(str, iVar.f22222s.f22701r);
                    if (F0.f22224u) {
                        F0().z0(str, iVar.f22222s.f22701r);
                    }
                    g0 g0Var = iVar.A;
                    if (g0Var != null) {
                        e0 e0Var = g0Var.f22161r;
                        m((g0) p3.o.m(N0().R(str, ((g0) p3.o.m(g0Var)).f22160q, e0Var != null ? e0Var.R0() : null, F0.f22221r, g0Var.f22163t, true, true)), aeVar);
                    }
                } else {
                    a().r().c("Conditional user property doesn't exist", p5.x(iVar.f22220q), this.f22498l.D().c(iVar.f22222s.f22701r));
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    final void n(v5 v5Var, com.google.android.gms.internal.measurement.t6 t6Var) {
        com.google.android.gms.internal.measurement.l7 l7Var;
        b().h();
        O0();
        o d8 = o.d(t6Var.Y());
        String o02 = v5Var.o0();
        b().h();
        O0();
        d8 g8 = g(o02);
        t4.u uVar = t4.u.UNINITIALIZED;
        int ordinal = g8.p().ordinal();
        if (ordinal == 1) {
            d8.c(t4.v.AD_STORAGE, n.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal == 2 || ordinal == 3) {
            d8.b(t4.v.AD_STORAGE, g8.b());
        } else {
            d8.c(t4.v.AD_STORAGE, n.FAILSAFE);
        }
        int ordinal2 = g8.q().ordinal();
        if (ordinal2 == 1) {
            d8.c(t4.v.ANALYTICS_STORAGE, n.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            d8.b(t4.v.ANALYTICS_STORAGE, g8.b());
        } else {
            d8.c(t4.v.ANALYTICS_STORAGE, n.FAILSAFE);
        }
        String o03 = v5Var.o0();
        b().h();
        O0();
        y T0 = T0(o03, R0(o03), g(o03), d8);
        t6Var.b0(((Boolean) p3.o.m(T0.j())).booleanValue());
        if (!TextUtils.isEmpty(T0.k())) {
            t6Var.d0(T0.k());
        }
        b().h();
        O0();
        Iterator it = t6Var.Y0().iterator();
        while (true) {
            if (it.hasNext()) {
                l7Var = (com.google.android.gms.internal.measurement.l7) it.next();
                if ("_npa".equals(l7Var.H())) {
                    break;
                }
            } else {
                l7Var = null;
                break;
            }
        }
        if (l7Var != null) {
            t4.v vVar = t4.v.AD_PERSONALIZATION;
            if (d8.a(vVar) == n.UNSET) {
                wd B0 = F0().B0(v5Var.o0(), "_npa");
                if (B0 != null) {
                    String str = B0.f22831b;
                    if ("tcf".equals(str)) {
                        d8.c(vVar, n.TCF);
                    } else if ("app".equals(str)) {
                        d8.c(vVar, n.API);
                    } else {
                        d8.c(vVar, n.MANIFEST);
                    }
                } else {
                    Boolean R = v5Var.R();
                    if (R == null || ((R.booleanValue() && l7Var.L() != 1) || !(R.booleanValue() || l7Var.L() == 0))) {
                        d8.c(vVar, n.API);
                    } else {
                        d8.c(vVar, n.MANIFEST);
                    }
                }
            }
        } else {
            int I = I(v5Var.o0(), d8);
            com.google.android.gms.internal.measurement.k7 Q = com.google.android.gms.internal.measurement.l7.Q();
            Q.y("_npa");
            Q.x(f().a());
            Q.B(I);
            t6Var.c1((com.google.android.gms.internal.measurement.l7) Q.s());
            a().w().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(I));
        }
        t6Var.Z(d8.toString());
        boolean S = this.f22487a.S(v5Var.o0());
        List P0 = t6Var.P0();
        int i7 = 0;
        for (int i8 = 0; i8 < P0.size(); i8++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.i6) P0.get(i8)).I())) {
                com.google.android.gms.internal.measurement.h6 h6Var = (com.google.android.gms.internal.measurement.h6) ((com.google.android.gms.internal.measurement.i6) P0.get(i8)).s();
                List x7 = h6Var.x();
                int i9 = 0;
                while (true) {
                    if (i9 >= x7.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.m6) x7.get(i9)).G())) {
                        String I2 = ((com.google.android.gms.internal.measurement.m6) x7.get(i9)).I();
                        if (S && I2.length() > 4) {
                            char[] charArray = I2.toCharArray();
                            int i10 = 1;
                            while (true) {
                                if (i10 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10)) {
                                    i7 = i10;
                                    break;
                                }
                                i10++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 | 1);
                            I2 = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.l6 R2 = com.google.android.gms.internal.measurement.m6.R();
                        R2.y("_tcfd");
                        R2.A(I2);
                        h6Var.B(i9, R2);
                    } else {
                        i9++;
                    }
                }
                t6Var.T0(i8, h6Var);
                return;
            }
        }
    }

    final void n0(ae aeVar, long j7) {
        v5 J0 = F0().J0((String) p3.o.m(aeVar.f21861q));
        if (J0 != null && N0().p(aeVar.f21862r, J0.r0())) {
            a().r().b("New GMP App Id passed in. Removing cached database data. appId", p5.x(J0.o0()));
            u F0 = F0();
            String o02 = J0.o0();
            F0.j();
            F0.h();
            p3.o.g(o02);
            try {
                SQLiteDatabase u02 = F0.u0();
                String[] strArr = {o02};
                int delete = u02.delete("events", "app_id=?", strArr) + u02.delete("user_attributes", "app_id=?", strArr) + u02.delete("conditional_properties", "app_id=?", strArr) + u02.delete("apps", "app_id=?", strArr) + u02.delete("raw_events", "app_id=?", strArr) + u02.delete("raw_events_metadata", "app_id=?", strArr) + u02.delete("event_filters", "app_id=?", strArr) + u02.delete("property_filters", "app_id=?", strArr) + u02.delete("audience_filter_values", "app_id=?", strArr) + u02.delete("consent_settings", "app_id=?", strArr) + u02.delete("default_event_params", "app_id=?", strArr) + u02.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.ae.a();
                w6 w6Var = F0.f22928a;
                if (w6Var.w().H(null, c5.f21959i1)) {
                    delete += u02.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (delete > 0) {
                    w6Var.a().w().c("Deleted application data. app, records", o02, Integer.valueOf(delete));
                }
            } catch (SQLiteException e8) {
                F0.f22928a.a().o().c("Error deleting application data. appId, error", p5.x(o02), e8);
            }
            J0 = null;
        }
        if (J0 != null) {
            boolean z7 = (J0.F0() == -2147483648L || J0.F0() == aeVar.f21870z) ? false : true;
            String D0 = J0.D0();
            if (z7 || ((J0.F0() != -2147483648L || D0 == null || D0.equals(aeVar.f21863s)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", D0);
                g0 g0Var = new g0("_au", new e0(bundle), "auto", j7);
                if (B0().H(null, c5.f21944d1)) {
                    j(g0Var, aeVar);
                } else {
                    k(g0Var, aeVar);
                }
            }
        }
    }

    final void o(v5 v5Var, com.google.android.gms.internal.measurement.t6 t6Var) {
        b().h();
        O0();
        com.google.android.gms.internal.measurement.m5 f02 = com.google.android.gms.internal.measurement.q5.f0();
        byte[] K2 = v5Var.K();
        if (K2 != null) {
            try {
                f02 = (com.google.android.gms.internal.measurement.m5) td.W(f02, K2);
            } catch (com.google.android.gms.internal.measurement.gb unused) {
                a().r().b("Failed to parse locally stored ad campaign info. appId", p5.x(v5Var.o0()));
            }
        }
        for (com.google.android.gms.internal.measurement.i6 i6Var : t6Var.P0()) {
            if (i6Var.I().equals("_cmp")) {
                String str = (String) td.v(i6Var, "gclid", "");
                String str2 = (String) td.v(i6Var, "gbraid", "");
                String str3 = (String) td.v(i6Var, "gad_source", "");
                String[] split = ((String) c5.f21956h1.b(null)).split(",");
                K0();
                if (!td.s(i6Var, split).isEmpty()) {
                    long longValue = ((Long) td.v(i6Var, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = i6Var.K();
                    }
                    if ("referrer API v2".equals(td.u(i6Var, "_cis"))) {
                        if (longValue > f02.L()) {
                            if (str.isEmpty()) {
                                f02.G();
                            } else {
                                f02.F(str);
                            }
                            if (str2.isEmpty()) {
                                f02.I();
                            } else {
                                f02.H(str2);
                            }
                            if (str3.isEmpty()) {
                                f02.K();
                            } else {
                                f02.J(str3);
                            }
                            f02.M(longValue);
                            f02.P();
                            f02.Q(J(i6Var));
                        }
                    } else if (longValue > f02.D()) {
                        if (str.isEmpty()) {
                            f02.y();
                        } else {
                            f02.x(str);
                        }
                        if (str2.isEmpty()) {
                            f02.A();
                        } else {
                            f02.z(str2);
                        }
                        if (str3.isEmpty()) {
                            f02.C();
                        } else {
                            f02.B(str3);
                        }
                        f02.E(longValue);
                        f02.N();
                        f02.O(J(i6Var));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.q5) f02.s()).equals(com.google.android.gms.internal.measurement.q5.g0())) {
            t6Var.k0((com.google.android.gms.internal.measurement.q5) f02.s());
        }
        v5Var.J(((com.google.android.gms.internal.measurement.q5) f02.s()).c());
        if (v5Var.A()) {
            F0().K0(v5Var, false, false);
        }
        if (B0().H(null, c5.f21953g1)) {
            F0().z0(v5Var.o0(), "_lgclid");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.measurement.internal.v5 o0(com.google.android.gms.measurement.internal.ae r13) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.o0(com.google.android.gms.measurement.internal.ae):com.google.android.gms.measurement.internal.v5");
    }

    final String p(d8 d8Var) {
        if (!d8Var.o(t4.v.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        N0().q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String p0(ae aeVar) {
        try {
            return (String) b().r(new hd(this, aeVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            a().o().c("Failed to get app instance id. appId", p5.x(aeVar.f21861q), e8);
            return null;
        }
    }

    final void q(List list) {
        p3.o.a(!list.isEmpty());
        if (this.f22511y != null) {
            a().o().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f22511y = new ArrayList(list);
        }
    }

    final List q0(ae aeVar, Bundle bundle) {
        b().h();
        cf.a();
        m B0 = B0();
        String str = aeVar.f21861q;
        if (!B0.H(str, c5.Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().o().a("Uri sources and timestamps do not match");
                } else {
                    for (int i7 = 0; i7 < intArray.length; i7++) {
                        u F0 = F0();
                        int i8 = intArray[i7];
                        long j7 = longArray[i7];
                        p3.o.g(str);
                        F0.h();
                        F0.j();
                        try {
                            int delete = F0.u0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i8), String.valueOf(j7)});
                            n5 w7 = F0.f22928a.a().w();
                            StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(delete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            w7.d(sb.toString(), str, Integer.valueOf(i8), Long.valueOf(j7));
                        } catch (SQLiteException e8) {
                            F0.f22928a.a().o().c("Error pruning trigger URIs. appId", p5.x(str), e8);
                        }
                    }
                }
            }
        }
        u F02 = F0();
        String str2 = aeVar.f21861q;
        p3.o.g(str2);
        F02.h();
        F02.j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = F02.u0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new rc(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e9) {
                F02.f22928a.a().o().c("Error querying trigger uris. appId", p5.x(str2), e9);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        if (r1 == 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.pd] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void r() {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.r():void");
    }

    final void r0(String str, g gVar) {
        b().h();
        O0();
        u F0 = F0();
        long j7 = gVar.f22157q;
        sd n7 = F0.n(j7);
        if (n7 == null) {
            a().r().c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j7));
            return;
        }
        String e8 = n7.e();
        if (gVar.f22158r != t4.j0.SUCCESS.a()) {
            if (gVar.f22158r == t4.j0.BACKOFF.a()) {
                Map map = this.E;
                nd ndVar = (nd) map.get(e8);
                if (ndVar == null) {
                    ndVar = new nd(this);
                    map.put(e8, ndVar);
                } else {
                    ndVar.a();
                }
                a().w().d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, e8, Long.valueOf((ndVar.c() - f().a()) / 1000));
            }
            u F02 = F0();
            Long valueOf = Long.valueOf(gVar.f22157q);
            F02.w(valueOf);
            a().w().c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
            return;
        }
        Map map2 = this.E;
        if (map2.containsKey(e8)) {
            map2.remove(e8);
        }
        u F03 = F0();
        Long valueOf2 = Long.valueOf(j7);
        F03.q(valueOf2);
        a().w().c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
        long j8 = gVar.f22159s;
        if (j8 > 0) {
            u F04 = F0();
            F04.h();
            F04.j();
            Long valueOf3 = Long.valueOf(j8);
            p3.o.m(valueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(t4.k0.GOOGLE_SIGNAL.a()));
            w6 w6Var = F04.f22928a;
            contentValues.put("creation_timestamp", Long.valueOf(w6Var.f().a()));
            try {
                if (F04.u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j8), str, String.valueOf(t4.k0.GOOGLE_SIGNAL_PENDING.a())}) != 1) {
                    w6Var.a().r().c("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                }
                a().w().c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(gVar.f22159s));
                u(str);
            } catch (SQLiteException e9) {
                F04.f22928a.a().o().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j8), e9);
                throw e9;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0484, code lost:
    
        if (r23 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x022a, code lost:
    
        if (r10 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a05  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void s(java.lang.String r33, long r34) {
        /*
            Method dump skipped, instructions count: 2569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.s(java.lang.String, long):void");
    }

    final void s0(boolean z7) {
        R();
    }

    final boolean t(String str, String str2) {
        v5 J0 = F0().J0(str);
        if (J0 != null && N0().P(str, J0.l0())) {
            this.E.remove(str2);
            return true;
        }
        nd ndVar = (nd) this.E.get(str2);
        if (ndVar == null) {
            return true;
        }
        return ndVar.b();
    }

    public final void t0(String str, da daVar) {
        b().h();
        String str2 = this.G;
        if (str2 == null || str2.equals(str) || daVar != null) {
            this.G = str;
            this.F = daVar;
        }
    }

    final void u(String str) {
        com.google.android.gms.internal.measurement.s6 d8;
        b().h();
        O0();
        this.f22508v = true;
        try {
            w6 w6Var = this.f22498l;
            w6Var.c();
            Boolean x7 = w6Var.J().x();
            if (x7 == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (x7.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f22501o > 0) {
                R();
            } else if (!E0().m()) {
                a().w().a("Network not connected, ignoring upload request");
                R();
            } else if (F0().p(str)) {
                u F0 = F0();
                p3.o.g(str);
                F0.h();
                F0.j();
                List o7 = F0.o(str, t4.n0.M0(t4.k0.GOOGLE_SIGNAL), 1);
                sd sdVar = o7.isEmpty() ? null : (sd) o7.get(0);
                if (sdVar != null && (d8 = sdVar.d()) != null) {
                    a().w().d("[sgtm] Uploading data from upload queue. appId, type, url", str, sdVar.f(), sdVar.e());
                    byte[] c8 = d8.c();
                    if (Log.isLoggable(a().z(), 2)) {
                        a().w().d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(c8.length), K0().K(d8));
                    }
                    bd a8 = sdVar.a();
                    this.f22507u = true;
                    E0().n(str, a8, d8, new fd(this, str, sdVar));
                }
            } else {
                a().w().b("[sgtm] Upload queue has no batches for appId", str);
            }
            this.f22508v = false;
            S();
        } catch (Throwable th) {
            this.f22508v = false;
            S();
            throw th;
        }
    }

    final /* synthetic */ void u0(qd qdVar) {
        b().h();
        this.f22497k = new g6(this);
        u uVar = new u(this);
        uVar.k();
        this.f22489c = uVar;
        B0().t((l) p3.o.m(this.f22487a));
        xb xbVar = new xb(this);
        xbVar.k();
        this.f22495i = xbVar;
        e eVar = new e(this);
        eVar.k();
        this.f22492f = eVar;
        ba baVar = new ba(this);
        baVar.k();
        this.f22494h = baVar;
        uc ucVar = new uc(this);
        ucVar.k();
        this.f22491e = ucVar;
        this.f22490d = new x5(this);
        if (this.f22504r != this.f22505s) {
            a().o().c("Not all upload components initialized", Integer.valueOf(this.f22504r), Integer.valueOf(this.f22505s));
        }
        this.f22499m.set(true);
        a().w().a("UploadController is now fully initialized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void v(java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.sd r8) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.s6 r0 = r3.b()
            r0.h()
            r3.O0()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            com.google.android.gms.measurement.internal.u r6 = r3.F0()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.q(r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.p5 r6 = r3.a()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.n5 r6 = r6.w()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.c(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.u5 r5 = r3.E0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.m()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            com.google.android.gms.measurement.internal.u r5 = r3.F0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.p(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.u(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.R()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.p5 r1 = r3.a()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.n5 r1 = r1.t()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.d(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.u r4 = r3.F0()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.w(r5)     // Catch: java.lang.Throwable -> L10
            r3.R()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.f22507u = r0
            r3.S()
            return
        L9b:
            r3.f22507u = r0
            r3.S()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pd.v(java.lang.String, int, java.lang.Throwable, byte[], com.google.android.gms.measurement.internal.sd):void");
    }

    final void w(String str, boolean z7, Long l7, Long l8) {
        v5 J0 = F0().J0(str);
        if (J0 != null) {
            J0.e0(z7);
            J0.g0(l7);
            J0.i0(l8);
            if (J0.A()) {
                F0().K0(J0, false, false);
            }
        }
    }

    final void x(String str, com.google.android.gms.internal.measurement.t6 t6Var) {
        int X;
        int indexOf;
        Set F = D0().F(str);
        if (F != null) {
            t6Var.L0(F);
        }
        if (D0().J(str)) {
            t6Var.D();
        }
        if (D0().K(str)) {
            String A = t6Var.A();
            if (!TextUtils.isEmpty(A) && (indexOf = A.indexOf(".")) != -1) {
                t6Var.B(A.substring(0, indexOf));
            }
        }
        if (D0().L(str) && (X = td.X(t6Var, "_id")) != -1) {
            t6Var.f1(X);
        }
        if (D0().M(str)) {
            t6Var.C0();
        }
        if (D0().N(str)) {
            t6Var.U();
            if (g(str).o(t4.v.ANALYTICS_STORAGE)) {
                Map map = this.D;
                md mdVar = (md) map.get(str);
                if (mdVar == null || mdVar.f22380b + B0().D(str, c5.f21967l0) < f().b()) {
                    mdVar = new md(this, (byte[]) null);
                    map.put(str, mdVar);
                }
                t6Var.M0(mdVar.f22379a);
            }
        }
        if (D0().O(str)) {
            t6Var.K0();
        }
    }

    final /* synthetic */ w6 x0() {
        return this.f22498l;
    }

    final void y(com.google.android.gms.internal.measurement.t6 t6Var, ld ldVar) {
        for (int i7 = 0; i7 < t6Var.Q0(); i7++) {
            com.google.android.gms.internal.measurement.h6 h6Var = (com.google.android.gms.internal.measurement.h6) t6Var.R0(i7).s();
            Iterator it = h6Var.x().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.m6) it.next()).G())) {
                    if (ldVar.f22339a.X0() >= B0().E(ldVar.f22339a.F(), c5.f21970m0)) {
                        int E = B0().E(ldVar.f22339a.F(), c5.f21996z0);
                        String str = null;
                        if (E <= 0) {
                            if (B0().H(ldVar.f22339a.F(), c5.S0)) {
                                str = N0().l0();
                                com.google.android.gms.internal.measurement.l6 R = com.google.android.gms.internal.measurement.m6.R();
                                R.y("_tu");
                                R.A(str);
                                h6Var.C((com.google.android.gms.internal.measurement.m6) R.s());
                            }
                            com.google.android.gms.internal.measurement.l6 R2 = com.google.android.gms.internal.measurement.m6.R();
                            R2.y("_tr");
                            R2.C(1L);
                            h6Var.C((com.google.android.gms.internal.measurement.m6) R2.s());
                            rc I = K0().I(ldVar.f22339a.F(), t6Var, h6Var, str);
                            if (I != null) {
                                a().w().c("Generated trigger URI. appId, uri", ldVar.f22339a.F(), I.f22580q);
                                F0().K(ldVar.f22339a.F(), I);
                                Deque deque = this.f22503q;
                                if (!deque.contains(ldVar.f22339a.F())) {
                                    deque.add(ldVar.f22339a.F());
                                }
                            }
                        } else if (F0().L0(h(), ldVar.f22339a.F(), false, false, false, false, false, false, true).f22519g > E) {
                            com.google.android.gms.internal.measurement.l6 R3 = com.google.android.gms.internal.measurement.m6.R();
                            R3.y("_tnr");
                            R3.C(1L);
                            h6Var.C((com.google.android.gms.internal.measurement.m6) R3.s());
                        } else {
                            if (B0().H(ldVar.f22339a.F(), c5.S0)) {
                                str = N0().l0();
                                com.google.android.gms.internal.measurement.l6 R4 = com.google.android.gms.internal.measurement.m6.R();
                                R4.y("_tu");
                                R4.A(str);
                                h6Var.C((com.google.android.gms.internal.measurement.m6) R4.s());
                            }
                            com.google.android.gms.internal.measurement.l6 R5 = com.google.android.gms.internal.measurement.m6.R();
                            R5.y("_tr");
                            R5.C(1L);
                            h6Var.C((com.google.android.gms.internal.measurement.m6) R5.s());
                            rc I2 = K0().I(ldVar.f22339a.F(), t6Var, h6Var, str);
                            if (I2 != null) {
                                a().w().c("Generated trigger URI. appId, uri", ldVar.f22339a.F(), I2.f22580q);
                                F0().K(ldVar.f22339a.F(), I2);
                                Deque deque2 = this.f22503q;
                                if (!deque2.contains(ldVar.f22339a.F())) {
                                    deque2.add(ldVar.f22339a.F());
                                }
                            }
                        }
                    }
                    t6Var.S0(i7, (com.google.android.gms.internal.measurement.i6) h6Var.s());
                }
            }
        }
    }

    final /* synthetic */ Deque y0() {
        return this.f22503q;
    }

    final void z(String str, com.google.android.gms.internal.measurement.l6 l6Var, Bundle bundle, String str2) {
        List b8 = com.google.android.gms.common.util.f.b("_o", "_sn", "_sc", "_si");
        long y7 = (yd.N(l6Var.x()) || yd.N(str)) ? B0().y(str2, true) : B0().x(str2, true);
        long codePointCount = l6Var.z().codePointCount(0, l6Var.z().length());
        yd N0 = N0();
        String x7 = l6Var.x();
        B0();
        String q7 = N0.q(x7, 40, true);
        if (codePointCount <= y7 || b8.contains(l6Var.x())) {
            return;
        }
        if ("_ev".equals(l6Var.x())) {
            bundle.putString("_ev", N0().q(l6Var.z(), B0().y(str2, true), true));
            return;
        }
        a().t().c("Param value is too long; discarded. Name, value length", q7, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", q7);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(l6Var.x());
    }

    final /* synthetic */ void z0(long j7) {
        this.I = j7;
    }
}
