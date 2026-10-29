package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.cf;
import com.google.android.gms.internal.measurement.qf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import q3.b;

/* compiled from: MyApplication */
public final class td extends ad {
    td(pd pdVar) {
        super(pdVar);
    }

    private static final String A(boolean z7, boolean z8, boolean z9) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("Dynamic ");
        }
        if (z8) {
            sb.append("Sequence ");
        }
        if (z9) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final Object B(com.google.android.gms.internal.measurement.m6 m6Var) {
        if (m6Var.H()) {
            return m6Var.I();
        }
        if (m6Var.J()) {
            return Long.valueOf(m6Var.K());
        }
        if (m6Var.N()) {
            return Double.valueOf(m6Var.O());
        }
        if (m6Var.Q() > 0) {
            return Y(m6Var.P());
        }
        return null;
    }

    private static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    private static final void D(StringBuilder sb, int i7, String str, com.google.android.gms.internal.measurement.z6 z6Var) {
        if (z6Var == null) {
            return;
        }
        y(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (z6Var.I() != 0) {
            y(sb, 4);
            sb.append("results: ");
            int i8 = 0;
            for (Long l7 : z6Var.H()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(l7);
                i8 = i9;
            }
            sb.append('\n');
        }
        if (z6Var.G() != 0) {
            y(sb, 4);
            sb.append("status: ");
            int i10 = 0;
            for (Long l8 : z6Var.F()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (z6Var.K() != 0) {
            y(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i12 = 0;
            for (com.google.android.gms.internal.measurement.g6 g6Var : z6Var.J()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(g6Var.F() ? Integer.valueOf(g6Var.G()) : null);
                sb.append(":");
                sb.append(g6Var.H() ? Long.valueOf(g6Var.I()) : null);
                i12 = i13;
            }
            sb.append("}\n");
        }
        if (z6Var.M() != 0) {
            y(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.b7 b7Var : z6Var.L()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(b7Var.F() ? Integer.valueOf(b7Var.G()) : null);
                sb.append(": [");
                Iterator it = b7Var.H().iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i16 = i17;
                }
                sb.append("]");
                i14 = i15;
            }
            sb.append("}\n");
        }
        y(sb, 3);
        sb.append("}\n");
    }

    private static final void E(StringBuilder sb, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb, i7 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void F(StringBuilder sb, int i7, String str, com.google.android.gms.internal.measurement.z3 z3Var) {
        if (z3Var == null) {
            return;
        }
        y(sb, i7);
        sb.append(str);
        sb.append(" {\n");
        if (z3Var.F()) {
            int Q = z3Var.Q();
            E(sb, i7, "comparison_type", Q != 1 ? Q != 2 ? Q != 3 ? Q != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (z3Var.G()) {
            E(sb, i7, "match_as_float", Boolean.valueOf(z3Var.H()));
        }
        if (z3Var.I()) {
            E(sb, i7, "comparison_value", z3Var.J());
        }
        if (z3Var.K()) {
            E(sb, i7, "min_comparison_value", z3Var.L());
        }
        if (z3Var.M()) {
            E(sb, i7, "max_comparison_value", z3Var.N());
        }
        y(sb, i7);
        sb.append("}\n");
    }

    static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean P(List list, int i7) {
        if (i7 < list.size() * 64) {
            return ((1 << (i7 % 64)) & ((Long) list.get(i7 / 64)).longValue()) != 0;
        }
        return false;
    }

    static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j7 = 0;
            for (int i8 = 0; i8 < 64; i8++) {
                int i9 = (i7 * 64) + i8;
                if (i9 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i9)) {
                    j7 |= 1 << i8;
                }
            }
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    static com.google.android.gms.internal.measurement.wb W(com.google.android.gms.internal.measurement.wb wbVar, byte[] bArr) {
        com.google.android.gms.internal.measurement.la a8 = com.google.android.gms.internal.measurement.la.a();
        return a8 != null ? wbVar.e(bArr, a8) : wbVar.j(bArr);
    }

    static int X(com.google.android.gms.internal.measurement.t6 t6Var, String str) {
        for (int i7 = 0; i7 < t6Var.Z0(); i7++) {
            if (str.equals(t6Var.a1(i7).H())) {
                return i7;
            }
        }
        return -1;
    }

    static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.m6 m6Var = (com.google.android.gms.internal.measurement.m6) it.next();
            if (m6Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.m6 m6Var2 : m6Var.P()) {
                    if (m6Var2.H()) {
                        bundle.putString(m6Var2.G(), m6Var2.I());
                    } else if (m6Var2.J()) {
                        bundle.putLong(m6Var2.G(), m6Var2.K());
                    } else if (m6Var2.N()) {
                        bundle.putDouble(m6Var2.G(), m6Var2.O());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static final void o(com.google.android.gms.internal.measurement.h6 h6Var, String str, Object obj) {
        List x7 = h6Var.x();
        int i7 = 0;
        while (true) {
            if (i7 >= x7.size()) {
                i7 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.m6) x7.get(i7)).G())) {
                break;
            } else {
                i7++;
            }
        }
        com.google.android.gms.internal.measurement.l6 R = com.google.android.gms.internal.measurement.m6.R();
        R.y(str);
        R.C(((Long) obj).longValue());
        if (i7 >= 0) {
            h6Var.B(i7, R);
        } else {
            h6Var.D(R);
        }
    }

    static final boolean p(g0 g0Var, ae aeVar) {
        p3.o.m(g0Var);
        p3.o.m(aeVar);
        return !TextUtils.isEmpty(aeVar.f21862r);
    }

    static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.m6 m6Var = (com.google.android.gms.internal.measurement.m6) it.next();
            String G = m6Var.G();
            if (m6Var.N()) {
                bundle.putDouble(G, m6Var.O());
            } else if (m6Var.L()) {
                bundle.putFloat(G, m6Var.M());
            } else if (m6Var.H()) {
                bundle.putString(G, m6Var.I());
            } else if (m6Var.J()) {
                bundle.putLong(G, m6Var.K());
            }
        }
        return bundle;
    }

    static final com.google.android.gms.internal.measurement.m6 r(com.google.android.gms.internal.measurement.i6 i6Var, String str) {
        for (com.google.android.gms.internal.measurement.m6 m6Var : i6Var.F()) {
            if (m6Var.G().equals(str)) {
                return m6Var;
            }
        }
        return null;
    }

    static final Map s(com.google.android.gms.internal.measurement.i6 i6Var, String... strArr) {
        Object B;
        HashMap hashMap = new HashMap();
        for (com.google.android.gms.internal.measurement.m6 m6Var : i6Var.F()) {
            if (Arrays.asList(strArr).contains(m6Var.G()) && (B = B(m6Var)) != null) {
                hashMap.put(m6Var.G(), B);
            }
        }
        return hashMap;
    }

    static final Map t(com.google.android.gms.internal.measurement.i6 i6Var, String str) {
        Object B;
        HashMap hashMap = new HashMap();
        for (com.google.android.gms.internal.measurement.m6 m6Var : i6Var.F()) {
            if (m6Var.G().startsWith("gad_") && (B = B(m6Var)) != null) {
                hashMap.put(m6Var.G(), B);
            }
        }
        return hashMap;
    }

    static final Object u(com.google.android.gms.internal.measurement.i6 i6Var, String str) {
        com.google.android.gms.internal.measurement.m6 r7 = r(i6Var, str);
        if (r7 == null) {
            return null;
        }
        return B(r7);
    }

    static final Object v(com.google.android.gms.internal.measurement.i6 i6Var, String str, Object obj) {
        Object u7 = u(i6Var, str);
        return u7 == null ? obj : u7;
    }

    private final void w(StringBuilder sb, int i7, List list) {
        if (list == null) {
            return;
        }
        int i8 = i7 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.m6 m6Var = (com.google.android.gms.internal.measurement.m6) it.next();
            if (m6Var != null) {
                y(sb, i8);
                sb.append("param {\n");
                E(sb, i8, "name", m6Var.F() ? this.f22928a.D().b(m6Var.G()) : null);
                E(sb, i8, "string_value", m6Var.H() ? m6Var.I() : null);
                E(sb, i8, "int_value", m6Var.J() ? Long.valueOf(m6Var.K()) : null);
                E(sb, i8, "double_value", m6Var.N() ? Double.valueOf(m6Var.O()) : null);
                if (m6Var.Q() > 0) {
                    w(sb, i8, m6Var.P());
                }
                y(sb, i8);
                sb.append("}\n");
            }
        }
    }

    private final void x(StringBuilder sb, int i7, com.google.android.gms.internal.measurement.v3 v3Var) {
        String str;
        if (v3Var == null) {
            return;
        }
        y(sb, i7);
        sb.append("filter {\n");
        if (v3Var.J()) {
            E(sb, i7, "complement", Boolean.valueOf(v3Var.K()));
        }
        if (v3Var.L()) {
            E(sb, i7, "param_name", this.f22928a.D().b(v3Var.M()));
        }
        if (v3Var.F()) {
            int i8 = i7 + 1;
            com.google.android.gms.internal.measurement.f4 G = v3Var.G();
            if (G != null) {
                y(sb, i8);
                sb.append("string_filter {\n");
                if (G.F()) {
                    switch (G.O()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    E(sb, i8, "match_type", str);
                }
                if (G.G()) {
                    E(sb, i8, "expression", G.H());
                }
                if (G.I()) {
                    E(sb, i8, "case_sensitive", Boolean.valueOf(G.J()));
                }
                if (G.L() > 0) {
                    y(sb, i7 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : G.K()) {
                        y(sb, i7 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                y(sb, i8);
                sb.append("}\n");
            }
        }
        if (v3Var.H()) {
            F(sb, i7 + 1, "number_filter", v3Var.I());
        }
        y(sb, i7);
        sb.append("}\n");
    }

    private static final void y(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
    }

    private static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    final void G(com.google.android.gms.internal.measurement.k7 k7Var, Object obj) {
        p3.o.m(obj);
        k7Var.A();
        k7Var.C();
        k7Var.E();
        if (obj instanceof String) {
            k7Var.z((String) obj);
            return;
        }
        if (obj instanceof Long) {
            k7Var.B(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            k7Var.D(((Double) obj).doubleValue());
        } else {
            this.f22928a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void H(com.google.android.gms.internal.measurement.l6 l6Var, Object obj) {
        p3.o.m(obj);
        l6Var.B();
        l6Var.D();
        l6Var.F();
        l6Var.J();
        if (obj instanceof String) {
            l6Var.A((String) obj);
            return;
        }
        if (obj instanceof Long) {
            l6Var.C(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            l6Var.E(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f22928a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.l6 R = com.google.android.gms.internal.measurement.m6.R();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.l6 R2 = com.google.android.gms.internal.measurement.m6.R();
                    R2.y(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        R2.C(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        R2.A((String) obj2);
                    } else if (obj2 instanceof Double) {
                        R2.E(((Double) obj2).doubleValue());
                    }
                    R.H(R2);
                }
                if (R.G() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.m6) R.s());
                }
            }
        }
        l6Var.I(arrayList);
    }

    final rc I(String str, com.google.android.gms.internal.measurement.t6 t6Var, com.google.android.gms.internal.measurement.h6 h6Var, String str2) {
        int indexOf;
        cf.a();
        w6 w6Var = this.f22928a;
        if (!w6Var.w().H(str, c5.Q0)) {
            return null;
        }
        long a8 = w6Var.f().a();
        Set a9 = t4.p0.a(w6Var.w().C(str, c5.f21988v0).split(","));
        pd pdVar = this.f22755b;
        cd C0 = pdVar.C0();
        String x7 = C0.f22755b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        w6 w6Var2 = C0.f22928a;
        builder.scheme(w6Var2.w().C(str, c5.f21974o0));
        if (TextUtils.isEmpty(x7)) {
            builder.authority(w6Var2.w().C(str, c5.f21976p0));
        } else {
            String C = w6Var2.w().C(str, c5.f21976p0);
            StringBuilder sb = new StringBuilder(String.valueOf(x7).length() + 1 + String.valueOf(C).length());
            sb.append(x7);
            sb.append(".");
            sb.append(C);
            builder.authority(sb.toString());
        }
        builder.path(w6Var2.w().C(str, c5.f21978q0));
        z(builder, "gmp_app_id", t6Var.r0(), a9);
        w6Var.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), a9);
        String S = t6Var.S();
        m w7 = w6Var.w();
        b5 b5Var = c5.T0;
        if (w7.H(str, b5Var) && pdVar.D0().N(str)) {
            S = "";
        }
        z(builder, "app_instance_id", S, a9);
        z(builder, "rdid", t6Var.M(), a9);
        z(builder, "bundle_id", t6Var.H(), a9);
        String H = h6Var.H();
        String a10 = t4.w.a(H);
        if (true != TextUtils.isEmpty(a10)) {
            H = a10;
        }
        z(builder, "app_event_name", H, a9);
        z(builder, "app_version", String.valueOf(t6Var.x0()), a9);
        String A = t6Var.A();
        if (w6Var.w().H(str, b5Var) && pdVar.D0().K(str) && !TextUtils.isEmpty(A) && (indexOf = A.indexOf(".")) != -1) {
            A = A.substring(0, indexOf);
        }
        z(builder, "os_version", A, a9);
        z(builder, "timestamp", String.valueOf(h6Var.K()), a9);
        if (t6Var.P()) {
            z(builder, "lat", "1", a9);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(t6Var.e0()), a9);
        z(builder, "trigger_uri_source", "1", a9);
        z(builder, "trigger_uri_timestamp", String.valueOf(a8), a9);
        z(builder, "request_uuid", str2, a9);
        List<com.google.android.gms.internal.measurement.m6> x8 = h6Var.x();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.m6 m6Var : x8) {
            String G = m6Var.G();
            if (m6Var.N()) {
                bundle.putString(G, String.valueOf(m6Var.O()));
            } else if (m6Var.L()) {
                bundle.putString(G, String.valueOf(m6Var.M()));
            } else if (m6Var.H()) {
                bundle.putString(G, m6Var.I());
            } else if (m6Var.J()) {
                bundle.putString(G, String.valueOf(m6Var.K()));
            }
        }
        C(builder, w6Var.w().C(str, c5.f21986u0).split("\\|"), bundle, a9);
        List<com.google.android.gms.internal.measurement.l7> Y0 = t6Var.Y0();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.l7 l7Var : Y0) {
            String H2 = l7Var.H();
            if (l7Var.O()) {
                bundle2.putString(H2, String.valueOf(l7Var.P()));
            } else if (l7Var.M()) {
                bundle2.putString(H2, String.valueOf(l7Var.N()));
            } else if (l7Var.I()) {
                bundle2.putString(H2, l7Var.J());
            } else if (l7Var.K()) {
                bundle2.putString(H2, String.valueOf(l7Var.L()));
            }
        }
        C(builder, w6Var.w().C(str, c5.f21984t0).split("\\|"), bundle2, a9);
        z(builder, "dma", true != t6Var.a0() ? "0" : "1", a9);
        if (!t6Var.c0().isEmpty()) {
            z(builder, "dma_cps", t6Var.c0(), a9);
        }
        if (t6Var.i0()) {
            com.google.android.gms.internal.measurement.q5 j02 = t6Var.j0();
            if (!j02.Q().isEmpty()) {
                z(builder, "dl_gclid", j02.Q(), a9);
            }
            if (!j02.S().isEmpty()) {
                z(builder, "dl_gbraid", j02.S(), a9);
            }
            if (!j02.U().isEmpty()) {
                z(builder, "dl_gs", j02.U(), a9);
            }
            if (j02.W() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(j02.W()), a9);
            }
            if (!j02.Y().isEmpty()) {
                z(builder, "mr_gclid", j02.Y(), a9);
            }
            if (!j02.a0().isEmpty()) {
                z(builder, "mr_gbraid", j02.a0(), a9);
            }
            if (!j02.c0().isEmpty()) {
                z(builder, "mr_gs", j02.c0(), a9);
            }
            if (j02.e0() > 0) {
                z(builder, "mr_click_ts", String.valueOf(j02.e0()), a9);
            }
        }
        return new rc(builder.build().toString(), a8, 1);
    }

    final com.google.android.gms.internal.measurement.i6 J(b0 b0Var) {
        com.google.android.gms.internal.measurement.h6 P = com.google.android.gms.internal.measurement.i6.P();
        P.N(b0Var.f21877e);
        e0 e0Var = b0Var.f21878f;
        d0 d0Var = new d0(e0Var);
        while (d0Var.hasNext()) {
            String next = d0Var.next();
            com.google.android.gms.internal.measurement.l6 R = com.google.android.gms.internal.measurement.m6.R();
            R.y(next);
            Object M0 = e0Var.M0(next);
            p3.o.m(M0);
            H(R, M0);
            P.D(R);
        }
        String str = b0Var.f21875c;
        if (!TextUtils.isEmpty(str) && e0Var.M0("_o") == null) {
            com.google.android.gms.internal.measurement.l6 R2 = com.google.android.gms.internal.measurement.m6.R();
            R2.y("_o");
            R2.A(str);
            P.C((com.google.android.gms.internal.measurement.m6) R2.s());
        }
        return (com.google.android.gms.internal.measurement.i6) P.s();
    }

    final String K(com.google.android.gms.internal.measurement.s6 s6Var) {
        com.google.android.gms.internal.measurement.u5 Z0;
        if (s6Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (s6Var.K()) {
            E(sb, 0, "upload_subdomain", s6Var.L());
        }
        if (s6Var.I()) {
            E(sb, 0, "sgtm_join_id", s6Var.J());
        }
        for (com.google.android.gms.internal.measurement.u6 u6Var : s6Var.F()) {
            if (u6Var != null) {
                y(sb, 1);
                sb.append("bundle {\n");
                if (u6Var.f0()) {
                    E(sb, 1, "protocol_version", Integer.valueOf(u6Var.g1()));
                }
                qf.a();
                w6 w6Var = this.f22928a;
                if (w6Var.w().H(u6Var.F(), c5.N0) && u6Var.M0()) {
                    E(sb, 1, "session_stitching_token", u6Var.N0());
                }
                E(sb, 1, "platform", u6Var.A2());
                if (u6Var.H()) {
                    E(sb, 1, "gmp_version", Long.valueOf(u6Var.I()));
                }
                if (u6Var.J()) {
                    E(sb, 1, "uploading_gmp_version", Long.valueOf(u6Var.K()));
                }
                if (u6Var.I0()) {
                    E(sb, 1, "dynamite_version", Long.valueOf(u6Var.J0()));
                }
                if (u6Var.b0()) {
                    E(sb, 1, "config_version", Long.valueOf(u6Var.c0()));
                }
                E(sb, 1, "gmp_app_id", u6Var.U());
                E(sb, 1, "app_id", u6Var.F());
                E(sb, 1, "app_version", u6Var.G());
                if (u6Var.Z()) {
                    E(sb, 1, "app_version_major", Integer.valueOf(u6Var.a0()));
                }
                E(sb, 1, "firebase_instance_id", u6Var.Y());
                if (u6Var.P()) {
                    E(sb, 1, "dev_cert_hash", Long.valueOf(u6Var.Q()));
                }
                E(sb, 1, "app_store", u6Var.G2());
                if (u6Var.q2()) {
                    E(sb, 1, "upload_timestamp_millis", Long.valueOf(u6Var.r2()));
                }
                if (u6Var.s2()) {
                    E(sb, 1, "start_timestamp_millis", Long.valueOf(u6Var.t2()));
                }
                if (u6Var.u2()) {
                    E(sb, 1, "end_timestamp_millis", Long.valueOf(u6Var.v2()));
                }
                if (u6Var.w2()) {
                    E(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(u6Var.x2()));
                }
                if (u6Var.y2()) {
                    E(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(u6Var.z2()));
                }
                E(sb, 1, "app_instance_id", u6Var.O());
                E(sb, 1, "resettable_device_id", u6Var.L());
                E(sb, 1, "ds_id", u6Var.e0());
                if (u6Var.M()) {
                    E(sb, 1, "limited_ad_tracking", Boolean.valueOf(u6Var.N()));
                }
                E(sb, 1, "os_version", u6Var.B2());
                E(sb, 1, "device_model", u6Var.C2());
                E(sb, 1, "user_default_language", u6Var.D2());
                if (u6Var.E2()) {
                    E(sb, 1, "time_zone_offset_minutes", Integer.valueOf(u6Var.F2()));
                }
                if (u6Var.R()) {
                    E(sb, 1, "bundle_sequential_index", Integer.valueOf(u6Var.S()));
                }
                if (u6Var.a1()) {
                    E(sb, 1, "delivery_index", Integer.valueOf(u6Var.b1()));
                }
                if (u6Var.V()) {
                    E(sb, 1, "service_upload", Boolean.valueOf(u6Var.W()));
                }
                E(sb, 1, "health_monitor", u6Var.T());
                if (u6Var.G0()) {
                    E(sb, 1, "retry_counter", Integer.valueOf(u6Var.H0()));
                }
                if (u6Var.K0()) {
                    E(sb, 1, "consent_signals", u6Var.L0());
                }
                if (u6Var.T0()) {
                    E(sb, 1, "is_dma_region", Boolean.valueOf(u6Var.U0()));
                }
                if (u6Var.V0()) {
                    E(sb, 1, "core_platform_services", u6Var.W0());
                }
                if (u6Var.R0()) {
                    E(sb, 1, "consent_diagnostics", u6Var.S0());
                }
                if (u6Var.O0()) {
                    E(sb, 1, "target_os_version", Long.valueOf(u6Var.P0()));
                }
                cf.a();
                if (w6Var.w().H(u6Var.F(), c5.Q0)) {
                    E(sb, 1, "ad_services_version", Integer.valueOf(u6Var.X0()));
                    if (u6Var.Y0() && (Z0 = u6Var.Z0()) != null) {
                        y(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        E(sb, 2, "eligible", Boolean.valueOf(Z0.F()));
                        E(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(Z0.G()));
                        E(sb, 2, "pre_r", Boolean.valueOf(Z0.H()));
                        E(sb, 2, "r_extensions_too_old", Boolean.valueOf(Z0.I()));
                        E(sb, 2, "adservices_extension_too_old", Boolean.valueOf(Z0.J()));
                        E(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(Z0.K()));
                        E(sb, 2, "measurement_manager_disabled", Boolean.valueOf(Z0.L()));
                        y(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (u6Var.c1()) {
                    com.google.android.gms.internal.measurement.q5 d12 = u6Var.d1();
                    y(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (d12.P()) {
                        E(sb, 2, "deep_link_gclid", d12.Q());
                    }
                    if (d12.R()) {
                        E(sb, 2, "deep_link_gbraid", d12.S());
                    }
                    if (d12.T()) {
                        E(sb, 2, "deep_link_gad_source", d12.U());
                    }
                    if (d12.V()) {
                        E(sb, 2, "deep_link_session_millis", Long.valueOf(d12.W()));
                    }
                    if (d12.X()) {
                        E(sb, 2, "market_referrer_gclid", d12.Y());
                    }
                    if (d12.Z()) {
                        E(sb, 2, "market_referrer_gbraid", d12.a0());
                    }
                    if (d12.b0()) {
                        E(sb, 2, "market_referrer_gad_source", d12.c0());
                    }
                    if (d12.d0()) {
                        E(sb, 2, "market_referrer_click_millis", Long.valueOf(d12.e0()));
                    }
                    y(sb, 2);
                    sb.append("}\n");
                }
                if (u6Var.g0()) {
                    E(sb, 1, "batching_timestamp_millis", Long.valueOf(u6Var.h0()));
                }
                if (u6Var.e1()) {
                    com.google.android.gms.internal.measurement.j7 f12 = u6Var.f1();
                    y(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int K = f12.K();
                    E(sb, 2, "upload_type", K != 1 ? K != 2 ? K != 3 ? K != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    E(sb, 2, "client_upload_eligibility", f12.F().name());
                    int L = f12.L();
                    E(sb, 2, "service_upload_eligibility", L != 1 ? L != 2 ? L != 3 ? L != 4 ? L != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    y(sb, 2);
                    sb.append("}\n");
                }
                if (u6Var.i0()) {
                    com.google.android.gms.internal.measurement.e6 j02 = u6Var.j0();
                    y(sb, 2);
                    sb.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.b6 b6Var : j02.F()) {
                        y(sb, 3);
                        sb.append("limited_data_modes {\n");
                        int H = b6Var.H();
                        E(sb, 3, "type", H != 1 ? H != 2 ? H != 3 ? H != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int I = b6Var.I();
                        E(sb, 3, "mode", I != 1 ? I != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb, 3);
                        sb.append("}\n");
                    }
                    y(sb, 2);
                    sb.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.l7> n22 = u6Var.n2();
                if (n22 != null) {
                    for (com.google.android.gms.internal.measurement.l7 l7Var : n22) {
                        if (l7Var != null) {
                            y(sb, 2);
                            sb.append("user_property {\n");
                            E(sb, 2, "set_timestamp_millis", l7Var.F() ? Long.valueOf(l7Var.G()) : null);
                            E(sb, 2, "name", w6Var.D().c(l7Var.H()));
                            E(sb, 2, "string_value", l7Var.J());
                            E(sb, 2, "int_value", l7Var.K() ? Long.valueOf(l7Var.L()) : null);
                            E(sb, 2, "double_value", l7Var.O() ? Double.valueOf(l7Var.P()) : null);
                            y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.w5> X = u6Var.X();
                if (X != null) {
                    for (com.google.android.gms.internal.measurement.w5 w5Var : X) {
                        if (w5Var != null) {
                            y(sb, 2);
                            sb.append("audience_membership {\n");
                            if (w5Var.F()) {
                                E(sb, 2, "audience_id", Integer.valueOf(w5Var.G()));
                            }
                            if (w5Var.K()) {
                                E(sb, 2, "new_audience", Boolean.valueOf(w5Var.L()));
                            }
                            D(sb, 2, "current_data", w5Var.H());
                            if (w5Var.I()) {
                                D(sb, 2, "previous_data", w5Var.J());
                            }
                            y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.i6> h22 = u6Var.h2();
                if (h22 != null) {
                    for (com.google.android.gms.internal.measurement.i6 i6Var : h22) {
                        if (i6Var != null) {
                            y(sb, 2);
                            sb.append("event {\n");
                            E(sb, 2, "name", w6Var.D().a(i6Var.I()));
                            if (i6Var.J()) {
                                E(sb, 2, "timestamp_millis", Long.valueOf(i6Var.K()));
                            }
                            if (i6Var.L()) {
                                E(sb, 2, "previous_timestamp_millis", Long.valueOf(i6Var.M()));
                            }
                            if (i6Var.N()) {
                                E(sb, 2, "count", Integer.valueOf(i6Var.O()));
                            }
                            if (i6Var.G() != 0) {
                                w(sb, 2, i6Var.F());
                            }
                            y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                y(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    final String L(com.google.android.gms.internal.measurement.t3 t3Var) {
        if (t3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (t3Var.F()) {
            E(sb, 0, "filter_id", Integer.valueOf(t3Var.G()));
        }
        E(sb, 0, "event_name", this.f22928a.D().a(t3Var.H()));
        String A = A(t3Var.N(), t3Var.O(), t3Var.Q());
        if (!A.isEmpty()) {
            E(sb, 0, "filter_type", A);
        }
        if (t3Var.L()) {
            F(sb, 1, "event_count_filter", t3Var.M());
        }
        if (t3Var.J() > 0) {
            sb.append("  filters {\n");
            Iterator it = t3Var.I().iterator();
            while (it.hasNext()) {
                x(sb, 2, (com.google.android.gms.internal.measurement.v3) it.next());
            }
        }
        y(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String M(com.google.android.gms.internal.measurement.b4 b4Var) {
        if (b4Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (b4Var.F()) {
            E(sb, 0, "filter_id", Integer.valueOf(b4Var.G()));
        }
        E(sb, 0, "property_name", this.f22928a.D().c(b4Var.H()));
        String A = A(b4Var.J(), b4Var.K(), b4Var.M());
        if (!A.isEmpty()) {
            E(sb, 0, "filter_type", A);
        }
        x(sb, 1, b4Var.I());
        sb.append("}\n");
        return sb.toString();
    }

    final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (b.a unused) {
                this.f22928a.a().o().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    final List R(List list, List list2) {
        int i7;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f22928a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f22928a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i8 = size2;
            i7 = size;
            size = i8;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    final boolean S(long j7, long j8) {
        return j7 == 0 || j8 <= 0 || Math.abs(this.f22928a.f().a() - j7) > j8;
    }

    final long T(byte[] bArr) {
        p3.o.m(bArr);
        w6 w6Var = this.f22928a;
        w6Var.C().h();
        MessageDigest C = yd.C();
        if (C != null) {
            return yd.D(C.digest(bArr));
        }
        w6Var.a().o().a("Failed to get MD5");
        return 0L;
    }

    final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName("UTF-8")));
    }

    final byte[] V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            this.f22928a.a().o().b("Failed to gzip content", e8);
            throw e8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(Z((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map Z(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Z(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Z(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.Z(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.td.Z(android.os.Bundle, boolean):java.util.Map");
    }

    @Override // com.google.android.gms.measurement.internal.ad
    protected final boolean l() {
        return false;
    }

    final g0 m(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle n7 = n(bVar.f(), true);
        String obj2 = (!n7.containsKey("_o") || (obj = n7.get("_o")) == null) ? "app" : obj.toString();
        String b8 = t4.w.b(bVar.b());
        if (b8 == null) {
            b8 = bVar.b();
        }
        return new g0(b8, new e0(n7), obj2, bVar.a());
    }

    final Bundle n(Map map, boolean z7) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z7) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add(n((Map) arrayList.get(i7), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }
}
