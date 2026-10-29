package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: MyApplication */
final class qa {

    /* renamed from: a, reason: collision with root package name */
    public final String f14326a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14327b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14328c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14329d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14330e;

    /* renamed from: f, reason: collision with root package name */
    public final wa f14331f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f14332g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14333h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14334i;

    /* renamed from: j, reason: collision with root package name */
    public final qa f14335j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap f14336k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap f14337l;

    /* renamed from: m, reason: collision with root package name */
    private List f14338m;

    private qa(String str, String str2, long j7, long j8, wa waVar, String[] strArr, String str3, String str4, qa qaVar) {
        this.f14326a = str;
        this.f14327b = str2;
        this.f14334i = str4;
        this.f14331f = waVar;
        this.f14332g = strArr;
        this.f14328c = str2 != null;
        this.f14329d = j7;
        this.f14330e = j8;
        str3.getClass();
        this.f14333h = str3;
        this.f14335j = qaVar;
        this.f14336k = new HashMap();
        this.f14337l = new HashMap();
    }

    public static qa a(String str) {
        return new qa(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static qa b(String str, long j7, long j8, wa waVar, String[] strArr, String str2, String str3, qa qaVar) {
        return new qa(str, null, j7, j8, waVar, strArr, str2, str3, qaVar);
    }

    private final void i(TreeSet treeSet, boolean z7) {
        String str = this.f14326a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z7 || equals || (equals2 && this.f14334i != null)) {
            long j7 = this.f14329d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j8 = this.f14330e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f14338m != null) {
            for (int i7 = 0; i7 < this.f14338m.size(); i7++) {
                qa qaVar = (qa) this.f14338m.get(i7);
                boolean z8 = true;
                if (!z7 && !equals) {
                    z8 = false;
                }
                qaVar.i(treeSet, z8);
            }
        }
    }

    private final void j(long j7, String str, List list) {
        String str2;
        String str3 = this.f14333h;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (c(j7) && "div".equals(this.f14326a) && (str2 = this.f14334i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < f(); i7++) {
            e(i7).j(j7, str, list);
        }
    }

    private final void k(long j7, boolean z7, String str, Map map) {
        long j8;
        boolean z8;
        HashMap hashMap = this.f14336k;
        hashMap.clear();
        HashMap hashMap2 = this.f14337l;
        hashMap2.clear();
        String str2 = this.f14326a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f14333h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f14328c && z7) {
            SpannableStringBuilder l7 = l(str4, map);
            String str5 = this.f14327b;
            str5.getClass();
            l7.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z7) {
            l(str4, map).append('\n');
            return;
        }
        if (c(j7)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence b8 = ((uv0) entry.getValue()).b();
                b8.getClass();
                hashMap.put(str6, Integer.valueOf(b8.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i7 = 0; i7 < f(); i7++) {
                qa e8 = e(i7);
                if (z7 || equals) {
                    j8 = j7;
                    z8 = true;
                } else {
                    j8 = j7;
                    z8 = false;
                }
                e8.k(j8, z8, str4, map);
            }
            if (equals) {
                SpannableStringBuilder l8 = l(str4, map);
                int length = l8.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (l8.charAt(length) == ' ');
                if (length >= 0 && l8.charAt(length) != '\n') {
                    l8.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence b9 = ((uv0) entry2.getValue()).b();
                b9.getClass();
                hashMap2.put(str7, Integer.valueOf(b9.length()));
            }
        }
    }

    private static SpannableStringBuilder l(String str, Map map) {
        if (!map.containsKey(str)) {
            uv0 uv0Var = new uv0();
            uv0Var.a(new SpannableStringBuilder());
            map.put(str, uv0Var);
        }
        CharSequence b8 = ((uv0) map.get(str)).b();
        b8.getClass();
        return (SpannableStringBuilder) b8;
    }

    private final void m(long j7, Map map, Map map2, String str, Map map3) {
        Iterator it;
        qa qaVar;
        wa a8;
        int i7;
        boolean z7;
        int i8;
        Map map4 = map;
        if (c(j7)) {
            String str2 = this.f14333h;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.f14337l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap = this.f14336k;
                int intValue = hashMap.containsKey(str4) ? ((Integer) hashMap.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    uv0 uv0Var = (uv0) map3.get(str4);
                    uv0Var.getClass();
                    ua uaVar = (ua) map2.get(str3);
                    uaVar.getClass();
                    int i9 = uaVar.f16666j;
                    wa a9 = va.a(this.f14331f, this.f14332g, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) uv0Var.b();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        uv0Var.a(spannableStringBuilder);
                    }
                    if (a9 != null) {
                        qa qaVar2 = this.f14335j;
                        if (a9.o() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(a9.o()), intValue, intValue2, 33);
                        }
                        if (a9.p()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (a9.r()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (a9.z()) {
                            b31.a(spannableStringBuilder, new ForegroundColorSpan(a9.x()), intValue, intValue2, 33);
                        }
                        if (a9.C()) {
                            b31.a(spannableStringBuilder, new BackgroundColorSpan(a9.A()), intValue, intValue2, 33);
                        }
                        if (a9.v() != null) {
                            b31.a(spannableStringBuilder, new TypefaceSpan(a9.v()), intValue, intValue2, 33);
                        }
                        if (a9.e() != null) {
                            pa e8 = a9.e();
                            e8.getClass();
                            int i10 = e8.f13754a;
                            it = it2;
                            if (i10 == -1) {
                                i10 = (i9 == 2 || i9 == 1) ? 3 : 1;
                                i8 = 1;
                            } else {
                                i8 = e8.f13755b;
                            }
                            int i11 = e8.f13756c;
                            if (i11 == -2) {
                                i11 = 1;
                            }
                            b31.a(spannableStringBuilder, new c41(i10, i8, i11), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int J = a9.J();
                        if (J == 2) {
                            while (true) {
                                if (qaVar2 == null) {
                                    qaVar2 = null;
                                    break;
                                }
                                wa a10 = va.a(qaVar2.f14331f, qaVar2.f14332g, map4);
                                if (a10 != null && a10.J() == 1) {
                                    break;
                                } else {
                                    qaVar2 = qaVar2.f14335j;
                                }
                            }
                            if (qaVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(qaVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        qaVar = null;
                                        break;
                                    }
                                    qa qaVar3 = (qa) arrayDeque.pop();
                                    wa a11 = va.a(qaVar3.f14331f, qaVar3.f14332g, map4);
                                    if (a11 != null && a11.J() == 3) {
                                        qaVar = qaVar3;
                                        break;
                                    }
                                    for (int f8 = qaVar3.f() - 1; f8 >= 0; f8--) {
                                        arrayDeque.push(qaVar3.e(f8));
                                    }
                                }
                                if (qaVar != null) {
                                    if (qaVar.f() != 1 || qaVar.e(0).f14327b == null) {
                                        gv1.b("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = qaVar.e(0).f14327b;
                                        String str6 = hi2.f9535a;
                                        wa a12 = va.a(qaVar.f14331f, qaVar.f14332g, map4);
                                        int L = a12 != null ? a12.L() : -1;
                                        if (L == -1 && (a8 = va.a(qaVar2.f14331f, qaVar2.f14332g, map4)) != null) {
                                            L = a8.L();
                                        }
                                        spannableStringBuilder.setSpan(new a21(str5, L), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (J == 3 || J == 4) {
                            spannableStringBuilder.setSpan(new oa(), intValue, intValue2, 33);
                        }
                        if (a9.c()) {
                            i7 = 33;
                            b31.a(spannableStringBuilder, new z01(), intValue, intValue2, 33);
                        } else {
                            i7 = 33;
                        }
                        int i12 = a9.i();
                        if (i12 != 1) {
                            if (i12 == 2) {
                                b31.a(spannableStringBuilder, new RelativeSizeSpan(a9.j()), intValue, intValue2, i7);
                            } else if (i12 == 3) {
                                b31.b(spannableStringBuilder, a9.j() / 100.0f, intValue, intValue2, i7);
                            }
                            z7 = true;
                        } else {
                            z7 = true;
                            b31.a(spannableStringBuilder, new AbsoluteSizeSpan((int) a9.j(), true), intValue, intValue2, i7);
                        }
                        if ("p".equals(this.f14326a)) {
                            if (a9.E() != Float.MAX_VALUE) {
                                uv0Var.p((a9.E() * (-90.0f)) / 100.0f);
                            }
                            if (a9.M() != null) {
                                uv0Var.d(a9.M());
                            }
                            if (a9.a() != null) {
                                uv0Var.e(a9.a());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            int i13 = 0;
            while (i13 < f()) {
                e(i13).m(j7, map4, map2, str3, map3);
                i13++;
                map4 = map;
            }
        }
    }

    public final boolean c(long j7) {
        long j8 = this.f14329d;
        if (j8 == -9223372036854775807L) {
            if (this.f14330e == -9223372036854775807L) {
                return true;
            }
            j8 = -9223372036854775807L;
        }
        if (j8 <= j7 && this.f14330e == -9223372036854775807L) {
            return true;
        }
        if (j8 != -9223372036854775807L || j7 >= this.f14330e) {
            return j8 <= j7 && j7 < this.f14330e;
        }
        return true;
    }

    public final void d(qa qaVar) {
        if (this.f14338m == null) {
            this.f14338m = new ArrayList();
        }
        this.f14338m.add(qaVar);
    }

    public final qa e(int i7) {
        List list = this.f14338m;
        if (list != null) {
            return (qa) list.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int f() {
        List list = this.f14338m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] g() {
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    public final List h(long j7, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        String str = this.f14333h;
        j(j7, str, arrayList);
        TreeMap treeMap = new TreeMap();
        k(j7, false, str, treeMap);
        m(j7, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Pair pair = (Pair) arrayList.get(i7);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                ua uaVar = (ua) map2.get(pair.first);
                uaVar.getClass();
                uv0 uv0Var = new uv0();
                uv0Var.c(decodeByteArray);
                uv0Var.i(uaVar.f16658b);
                uv0Var.j(0);
                uv0Var.f(uaVar.f16659c, 0);
                uv0Var.g(uaVar.f16661e);
                uv0Var.m(uaVar.f16662f);
                uv0Var.n(uaVar.f16663g);
                uv0Var.o(uaVar.f16666j);
                arrayList2.add(uv0Var.r());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ua uaVar2 = (ua) map2.get(entry.getKey());
            uaVar2.getClass();
            uv0 uv0Var2 = (uv0) entry.getValue();
            CharSequence b8 = uv0Var2.b();
            b8.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) b8;
            for (oa oaVar : (oa[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), oa.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(oaVar), spannableStringBuilder.getSpanEnd(oaVar), (CharSequence) "");
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length()) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i10 = i9;
                    while (i10 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i10) == ' ') {
                        i10++;
                    }
                    int i11 = i10 - i9;
                    if (i11 > 0) {
                        spannableStringBuilder.delete(i8, i11 + i8);
                    }
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i12 = 0;
            while (i12 < spannableStringBuilder.length() - 1) {
                int i13 = i12 + 1;
                if (spannableStringBuilder.charAt(i12) == '\n' && spannableStringBuilder.charAt(i13) == ' ') {
                    spannableStringBuilder.delete(i13, i12 + 2);
                }
                i12 = i13;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == ' ' && spannableStringBuilder.charAt(i15) == '\n') {
                    spannableStringBuilder.delete(i14, i15);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            uv0Var2.f(uaVar2.f16659c, uaVar2.f16660d);
            uv0Var2.g(uaVar2.f16661e);
            uv0Var2.i(uaVar2.f16658b);
            uv0Var2.m(uaVar2.f16662f);
            uv0Var2.l(uaVar2.f16665i, uaVar2.f16664h);
            uv0Var2.o(uaVar2.f16666j);
            arrayList2.add(uv0Var2.r());
        }
        return arrayList2;
    }
}
