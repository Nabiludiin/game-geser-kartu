package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public abstract class cn extends an {
    protected static final Object O = new Object();
    private static final String P = "cn";
    static boolean Q = false;
    private static long R;
    private static ln S;
    private static uo T;
    private static lo U;
    private static am V;
    private static in W;
    protected final bn L;
    ro M;
    private final Map N;

    protected cn(Context context, bn bnVar) {
        super(context);
        this.N = new HashMap();
        this.L = bnVar;
    }

    protected static synchronized void q(Context context, bn bnVar) {
        synchronized (cn.class) {
            try {
                if (Q) {
                    return;
                }
                R = System.currentTimeMillis() / 1000;
                an.K = r(context, bnVar.f5862a);
                if (((Boolean) s2.b0.c().d(uy.S3)).booleanValue()) {
                    S = ln.a(context);
                }
                ExecutorService d8 = an.K.d();
                if (((Boolean) s2.b0.c().d(uy.T3)).booleanValue() && d8 != null) {
                    T = uo.a(context, d8);
                }
                if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
                    U = new lo();
                }
                if (((Boolean) s2.b0.c().d(uy.f17112h3)).booleanValue() || bnVar.f5864c.h0()) {
                    W = new in(context, d8);
                }
                if (((Boolean) s2.b0.c().d(uy.f17067c3)).booleanValue() || bnVar.f5864c.f0()) {
                    V = new am(context, d8, bnVar.f5864c, W);
                }
                Q = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected static ko r(Context context, boolean z7) {
        if (an.K == null) {
            synchronized (O) {
                try {
                    if (an.K == null) {
                        ko a8 = ko.a(context, "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", z7, W);
                        if (a8.c()) {
                            try {
                                if (((Boolean) s2.b0.c().d(uy.O3)).booleanValue()) {
                                    a8.n("hTLiiIA7LJpRCIVGwbLw56sBtWYdpFA3KN/lVIAoqlyIo4UMQoQK3mH52LWi8hnG", "S64wW/9/kcrI6i+T76YThiZ/p514KjvGlvxi0Ei4eDg=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            a8.n("Fl0NzymWHJhyDpr9GrhyVi62KX+d2kj13lp1AwiYQHKKCKe1X2FxmeM5KLeNR5D2", "WhU/3eeIEz43+QqYTIKNH8p88w1+Uh4fQMNHsNTU34U=", Context.class);
                            if (((Boolean) s2.b0.c().d(uy.W3)).booleanValue()) {
                                a8.n("gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", new Class[0]);
                            }
                            a8.n("yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", Context.class);
                            a8.n("JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", Context.class);
                            a8.n("0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", Context.class);
                            a8.n("01PVhP+doaGKdC1W6GrY+2IWUVFKtg3RWpQDin/wN/cS8wkuezVXqSDwZNREySxt", "hY1jxg+6DUCngCe0vbxb4cMsyHNENce67SGKWd6hzv8=", Context.class);
                            Class cls = Boolean.TYPE;
                            a8.n("8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", Context.class, cls);
                            a8.n("f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", Context.class);
                            a8.n("Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", Context.class);
                            a8.n("6ZjnfgvB9wgS+Y8hZDivPhgjxRZbCY4q7zFEc6BukViF66w3fH7pDgMpCmaLCsbG", "yV5Ezpu/FJ5eBLvg/Gvr42qBX8KcXLyHBG0rFZzzuBY=", MotionEvent.class, DisplayMetrics.class);
                            a8.n("0F2tRPtJ+oackwCEaR1ilzSWBDq3birdEdy954kTVJ/3hlaiiP5kh1SmVilvcwVI", "bSUQaKDGEujzsstvFAmuaLuv9mtefCQQKWZn9uZj/LI=", MotionEvent.class, DisplayMetrics.class);
                            a8.n("6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", new Class[0]);
                            a8.n("VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", new Class[0]);
                            a8.n("MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", new Class[0]);
                            a8.n("N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", new Class[0]);
                            a8.n("b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", new Class[0]);
                            a8.n("cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", new Class[0]);
                            a8.n("yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", Context.class, cls, String.class);
                            a8.n("ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", StackTraceElement[].class);
                            a8.n("UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", View.class, DisplayMetrics.class, cls, cls);
                            a8.n("i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", Context.class, cls);
                            a8.n("YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", View.class, Activity.class, cls);
                            a8.n("7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", Long.TYPE);
                            a8.n("zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", new Class[0]);
                            try {
                                if (((Boolean) s2.b0.c().d(uy.R3)).booleanValue()) {
                                    a8.n("ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            a8.n("71OvRH8RKLL5CGPm3dKOf5cGs3Y2jxvT4WismqAQzm1qJBvyLIz7vuBnvO3+wiyt", "6gmo4xnyZNalDG+/4eFYRg3H75rhcg0JPASG/y34gQ8=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) s2.b0.c().d(uy.S3)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        a8.n("1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) s2.b0.c().d(uy.f17137k3)).booleanValue()) {
                                    a8.n("sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                                if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
                                    Class cls3 = Long.TYPE;
                                    a8.n("OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", cls3, cls3, cls3, cls3);
                                }
                            } catch (IllegalStateException unused5) {
                            }
                            try {
                                if (((Boolean) s2.b0.c().d(uy.f17049a3)).booleanValue()) {
                                    a8.n("ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", long[].class, Context.class, View.class);
                                }
                            } catch (IllegalStateException unused6) {
                            }
                        }
                        an.K = a8;
                    }
                } finally {
                }
            }
        }
        return an.K;
    }

    static mo s(ko koVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method o7 = koVar.o("6ZjnfgvB9wgS+Y8hZDivPhgjxRZbCY4q7zFEc6BukViF66w3fH7pDgMpCmaLCsbG", "yV5Ezpu/FJ5eBLvg/Gvr42qBX8KcXLyHBG0rFZzzuBY=");
        if (o7 == null || motionEvent == null) {
            throw new yn();
        }
        try {
        } catch (IllegalAccessException | InvocationTargetException e8) {
            e = e8;
        }
        try {
            return new mo((String) o7.invoke(null, motionEvent, displayMetrics));
        } catch (InvocationTargetException e9) {
            e = e9;
            throw new yn(e);
        }
    }

    protected static final void u(List list) {
        ExecutorService d8;
        if (an.K == null || (d8 = an.K.d()) == null || list.isEmpty()) {
            return;
        }
        try {
            d8.invokeAll(list, ((Long) s2.b0.c().d(uy.W2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            String str = P;
            int i7 = no.f12821b;
            StringWriter stringWriter = new StringWriter();
            e8.printStackTrace(new PrintWriter(stringWriter));
            Log.d(str, String.format("class methods got exception: %s", stringWriter.toString()));
        }
    }

    private final synchronized void v(ko koVar, ak akVar) {
        MotionEvent motionEvent;
        try {
            try {
                mo s7 = s(koVar, this.f5048q, this.I);
                Long l7 = s7.f12319b;
                if (l7 != null) {
                    akVar.v0(l7.longValue());
                }
                Long l8 = s7.f12320c;
                if (l8 != null) {
                    akVar.w0(l8.longValue());
                }
                Long l9 = s7.f12321d;
                if (l9 != null) {
                    akVar.x0(l9.longValue());
                }
                if (this.H) {
                    Long l10 = s7.f12322e;
                    if (l10 != null) {
                        akVar.J0(l10.longValue());
                    }
                    Long l11 = s7.f12323f;
                    if (l11 != null) {
                        akVar.K0(l11.longValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (yn unused) {
        }
        tk d02 = uk.d0();
        if (this.f5050s > 0 && no.e(this.I)) {
            d02.P(no.f(this.f5057z, 1, this.I));
            d02.Q(no.f(this.E - this.C, 1, this.I));
            d02.R(no.f(this.F - this.D, 1, this.I));
            d02.U(no.f(this.C, 1, this.I));
            d02.V(no.f(this.D, 1, this.I));
            if (this.H && (motionEvent = this.f5048q) != null) {
                long f8 = no.f(((this.C - this.E) + motionEvent.getRawX()) - this.f5048q.getX(), 1, this.I);
                if (f8 != 0) {
                    d02.S(f8);
                }
                long f9 = no.f(((this.D - this.F) + this.f5048q.getRawY()) - this.f5048q.getY(), 1, this.I);
                if (f9 != 0) {
                    d02.T(f9);
                }
            }
        }
        try {
            mo d8 = d(this.f5048q);
            Long l12 = d8.f12319b;
            if (l12 != null) {
                d02.E(l12.longValue());
            }
            Long l13 = d8.f12320c;
            if (l13 != null) {
                d02.F(l13.longValue());
            }
            d02.L(d8.f12321d.longValue());
            if (this.H) {
                Long l14 = d8.f12323f;
                if (l14 != null) {
                    d02.G(l14.longValue());
                }
                Long l15 = d8.f12322e;
                if (l15 != null) {
                    d02.J(l15.longValue());
                }
                Long l16 = d8.f12324g;
                if (l16 != null) {
                    d02.W(l16.longValue() != 0 ? 2 : 1);
                }
                if (this.f5051t > 0) {
                    Long valueOf = no.e(this.I) ? Long.valueOf(Math.round(this.f5056y / this.f5051t)) : null;
                    if (valueOf != null) {
                        d02.H(valueOf.longValue());
                    } else {
                        d02.I();
                    }
                    d02.K(Math.round(this.f5055x / this.f5051t));
                }
                Long l17 = d8.f12327j;
                if (l17 != null) {
                    d02.N(l17.longValue());
                }
                Long l18 = d8.f12328k;
                if (l18 != null) {
                    d02.M(l18.longValue());
                }
                Long l19 = d8.f12329l;
                if (l19 != null) {
                    d02.X(l19.longValue() != 0 ? 2 : 1);
                }
            }
        } catch (yn unused2) {
        }
        long j7 = this.f5054w;
        if (j7 > 0) {
            d02.O(j7);
        }
        akVar.M((uk) d02.A());
        long j8 = this.f5050s;
        if (j8 > 0) {
            akVar.N0(j8);
        }
        long j9 = this.f5051t;
        if (j9 > 0) {
            akVar.M0(j9);
        }
        long j10 = this.f5052u;
        if (j10 > 0) {
            akVar.L0(j10);
        }
        long j11 = this.f5053v;
        if (j11 > 0) {
            akVar.E(j11);
        }
        try {
            LinkedList linkedList = this.f5049r;
            int size = linkedList.size() - 1;
            if (size > 0) {
                akVar.P();
                for (int i7 = 0; i7 < size; i7++) {
                    mo s8 = s(an.K, (MotionEvent) linkedList.get(i7), this.I);
                    tk d03 = uk.d0();
                    d03.E(s8.f12319b.longValue());
                    d03.F(s8.f12320c.longValue());
                    akVar.O((uk) d03.A());
                }
            }
        } catch (yn unused3) {
            akVar.P();
        }
    }

    private static final void w() {
        uo uoVar = T;
        if (uoVar != null) {
            uoVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.an
    protected final ak a(Context context, lj ljVar) {
        long j7;
        long j8;
        w();
        if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
            U.a();
        }
        bn bnVar = this.L;
        ak g12 = xk.g1();
        String str = bnVar.f5863b;
        if (!TextUtils.isEmpty(str)) {
            g12.p0(str);
        }
        ko r7 = r(context, bnVar.f5862a);
        if (r7.d() == null) {
            return g12;
        }
        int q7 = r7.q();
        ArrayList arrayList = new ArrayList();
        if (r7.c()) {
            arrayList.add(new zo(r7, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", g12, q7, 27, context, null, bnVar.f5864c, V));
            arrayList.add(new cp(r7, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", g12, R, q7, 25));
            arrayList.add(new op(r7, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", g12, q7, 1));
            arrayList.add(new rp(r7, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", g12, q7, 31, context));
            arrayList.add(new wp(r7, "VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", g12, q7, 33));
            arrayList.add(new yo(r7, "yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", g12, q7, 29, context));
            arrayList.add(new ap(r7, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", g12, q7, 5));
            arrayList.add(new np(r7, "01PVhP+doaGKdC1W6GrY+2IWUVFKtg3RWpQDin/wN/cS8wkuezVXqSDwZNREySxt", "hY1jxg+6DUCngCe0vbxb4cMsyHNENce67SGKWd6hzv8=", g12, q7, 12));
            arrayList.add(new pp(r7, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", g12, q7, 3));
            arrayList.add(new bp(r7, "N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", g12, q7, 44));
            arrayList.add(new hp(r7, "b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", g12, q7, 22));
            arrayList.add(new xp(r7, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", g12, q7, 48));
            arrayList.add(new xo(r7, "Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", g12, q7, 49));
            arrayList.add(new up(r7, "cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", g12, q7, 51));
            arrayList.add(new sp(r7, "i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", g12, q7, 61));
            if (Build.VERSION.SDK_INT >= 24) {
                if (((Boolean) s2.b0.c().d(uy.S3)).booleanValue()) {
                    uo uoVar = T;
                    if (uoVar != null) {
                        long c8 = uoVar.c();
                        j8 = uoVar.d();
                        j7 = c8;
                    } else {
                        j7 = -1;
                        j8 = -1;
                    }
                    arrayList.add(new mp(r7, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", g12, q7, 11, S, j7, j8));
                }
            }
            if (((Boolean) s2.b0.c().d(uy.R3)).booleanValue()) {
                arrayList.add(new qp(r7, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", g12, q7, 73));
            }
            arrayList.add(new kp(r7, "71OvRH8RKLL5CGPm3dKOf5cGs3Y2jxvT4WismqAQzm1qJBvyLIz7vuBnvO3+wiyt", "6gmo4xnyZNalDG+/4eFYRg3H75rhcg0JPASG/y34gQ8=", g12, q7, 76));
            if (((Boolean) s2.b0.c().d(uy.V3)).booleanValue()) {
                arrayList.add(new wo(r7, "zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", g12, q7, 89));
            }
            if (((Boolean) s2.b0.c().d(uy.W3)).booleanValue()) {
                arrayList.add(new dp(r7, "gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", g12, q7, 82));
            }
        } else {
            g12.z0(16384L);
        }
        u(arrayList);
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.an
    protected final ak b(Context context, View view, Activity activity) {
        w();
        if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
            U.c();
        }
        bn bnVar = this.L;
        ak g12 = xk.g1();
        String str = bnVar.f5863b;
        if (!TextUtils.isEmpty(str)) {
            g12.p0(str);
        }
        t(r(context, bnVar.f5862a), g12, view, activity, true, context);
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.an
    protected final ak c(Context context, View view, Activity activity) {
        w();
        if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
            U.b(context, view);
        }
        bn bnVar = this.L;
        ak g12 = xk.g1();
        g12.p0(bnVar.f5863b);
        t(r(context, bnVar.f5862a), g12, view, activity, false, context);
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.an
    protected final mo d(MotionEvent motionEvent) {
        Method o7 = an.K.o("0F2tRPtJ+oackwCEaR1ilzSWBDq3birdEdy954kTVJ/3hlaiiP5kh1SmVilvcwVI", "bSUQaKDGEujzsstvFAmuaLuv9mtefCQQKWZn9uZj/LI=");
        if (o7 == null || motionEvent == null) {
            throw new yn();
        }
        try {
            return new mo((String) o7.invoke(null, motionEvent, this.I));
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new yn(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void k(View view) {
        if (((Boolean) s2.b0.c().d(uy.Z2)).booleanValue()) {
            if (this.M == null) {
                ko koVar = an.K;
                this.M = new ro(koVar.f11151a, koVar.k());
            }
            this.M.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.an
    protected final long n(StackTraceElement[] stackTraceElementArr) {
        Method o7 = an.K.o("ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=");
        if (o7 == null || stackTraceElementArr == null) {
            throw new yn();
        }
        try {
            return new zn((String) o7.invoke(null, stackTraceElementArr)).f20231b.longValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new yn(e8);
        }
    }

    protected final void t(ko koVar, ak akVar, View view, Activity activity, boolean z7, Context context) {
        List list;
        long j7;
        long j8;
        ak akVar2 = akVar;
        if (koVar.c()) {
            v(koVar, akVar);
            ArrayList arrayList = new ArrayList();
            if (koVar.d() != null) {
                int q7 = koVar.q();
                if (((Boolean) s2.b0.c().d(uy.f17129j3)).booleanValue()) {
                    arrayList.add(new zo(koVar, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", akVar2, q7, 27, context, null, this.L.f5864c, V));
                    arrayList.add(new yo(koVar, "yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", akVar, q7, 29, context));
                    arrayList.add(new rp(koVar, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", akVar, q7, 31, context));
                    arrayList.add(new wp(koVar, "VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", akVar, q7, 33));
                    uo uoVar = T;
                    if (uoVar != null) {
                        j7 = uoVar.c();
                        j8 = uoVar.d();
                    } else {
                        j7 = -1;
                        j8 = -1;
                    }
                    akVar2 = akVar;
                    arrayList.add(new mp(koVar, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", akVar2, q7, 11, S, j7, j8));
                    arrayList.add(new qp(koVar, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", akVar2, q7, 73));
                }
                arrayList.add(new ep(koVar, akVar));
                arrayList.add(new op(koVar, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", akVar2, q7, 1));
                arrayList.add(new cp(koVar, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", akVar, R, q7, 25));
                arrayList.add(new bp(koVar, "N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", akVar, q7, 44));
                arrayList.add(new np(koVar, "01PVhP+doaGKdC1W6GrY+2IWUVFKtg3RWpQDin/wN/cS8wkuezVXqSDwZNREySxt", "hY1jxg+6DUCngCe0vbxb4cMsyHNENce67SGKWd6hzv8=", akVar, q7, 12));
                arrayList.add(new pp(koVar, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", akVar, q7, 3));
                arrayList.add(new hp(koVar, "b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", akVar, q7, 22));
                arrayList.add(new ap(koVar, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", akVar, q7, 5));
                arrayList.add(new xp(koVar, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", akVar, q7, 48));
                arrayList.add(new xo(koVar, "Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", akVar, q7, 49));
                arrayList.add(new up(koVar, "cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", akVar, q7, 51));
                arrayList.add(new tp(koVar, "ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", akVar, q7, 45, new Throwable().getStackTrace()));
                arrayList.add(new yp(koVar, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", akVar, q7, 57, view));
                arrayList.add(new sp(koVar, "i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", akVar, q7, 61));
                if (((Boolean) s2.b0.c().d(uy.X2)).booleanValue()) {
                    arrayList.add(new vo(koVar, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", akVar, q7, 62, view, activity));
                }
                if (((Boolean) s2.b0.c().d(uy.V3)).booleanValue()) {
                    arrayList.add(new wo(koVar, "zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", akVar, q7, 89));
                }
                if (!z7) {
                    try {
                        if (((Boolean) s2.b0.c().d(uy.f17049a3)).booleanValue()) {
                            arrayList.add(new gp(koVar, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", akVar, q7, 85, this.N, view, context));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
                            arrayList.add(new fp(koVar, "OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", akVar, q7, 85, U));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    if (((Boolean) s2.b0.c().d(uy.f17137k3)).booleanValue()) {
                        arrayList.add(new lp(koVar, "sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", akVar, q7, 94, this.J));
                    }
                } else if (((Boolean) s2.b0.c().d(uy.Z2)).booleanValue()) {
                    arrayList.add(new vp(koVar, "7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", akVar, q7, 53, this.M));
                }
            }
            list = arrayList;
        } else {
            akVar.z0(16384L);
            list = Arrays.asList(new ep(koVar, akVar));
        }
        u(list);
    }
}
