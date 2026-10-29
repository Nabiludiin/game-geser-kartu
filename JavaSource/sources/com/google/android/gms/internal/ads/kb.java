package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public abstract class kb {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f10948a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f10949b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map f10950c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f10951d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10950c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10951d = Collections.unmodifiableMap(hashMap2);
    }

    public static eb a(y82 y82Var, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String n7 = y82Var.n(charset);
        if (n7 != null) {
            Pattern pattern = f10948a;
            Matcher matcher = pattern.matcher(n7);
            if (matcher.matches()) {
                return d(null, matcher, y82Var, list);
            }
            String n8 = y82Var.n(charset);
            if (n8 != null) {
                Matcher matcher2 = pattern.matcher(n8);
                if (matcher2.matches()) {
                    return d(n7.trim(), matcher2, y82Var, list);
                }
            }
        }
        return null;
    }

    static uv0 b(String str) {
        jb jbVar = new jb();
        e(str, jbVar);
        return jbVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.text.SpannedString c(java.lang.String r13, java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kb.c(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    private static eb d(String str, Matcher matcher, y82 y82Var, List list) {
        jb jbVar = new jb();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            jbVar.f10436a = nb.a(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            jbVar.f10437b = nb.a(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, jbVar);
            StringBuilder sb = new StringBuilder();
            String n7 = y82Var.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n7)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n7.trim());
                n7 = y82Var.n(StandardCharsets.UTF_8);
            }
            jbVar.f10438c = c(str, sb.toString(), list);
            return new eb(jbVar.a().r(), jbVar.f10436a, jbVar.f10437b);
        } catch (IllegalArgumentException unused) {
            gv1.c("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0076, code lost:
    
        if (r8.equals("middle") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x007d, code lost:
    
        if (r8.equals("center") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0185, code lost:
    
        if (r9.equals("middle") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x018e, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x018c, code lost:
    
        if (r9.equals("center") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        if (r9.equals("start") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0144, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r9.equals("end") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r9.equals("middle") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        if (r9.equals("line-right") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        if (r9.equals("center") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        if (r9.equals("line-left") != false) goto L78;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(java.lang.String r16, com.google.android.gms.internal.ads.jb r17) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kb.e(java.lang.String, com.google.android.gms.internal.ads.jb):void");
    }

    private static void f(String str, hb hbVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        Comparator comparator;
        int i7 = hbVar.f9407b;
        int length = spannableStringBuilder.length();
        String str2 = hbVar.f9406a;
        int hashCode = str2.hashCode();
        int i8 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int g8 = g(list2, str, hbVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        comparator = gb.f8754c;
                        Collections.sort(arrayList, comparator);
                        int i9 = i7;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < arrayList.size()) {
                            if ("rt".equals(((gb) arrayList.get(i10)).c().f9406a)) {
                                gb gbVar = (gb) arrayList.get(i10);
                                int g9 = g(list2, str, gbVar.c());
                                if (g9 == i8) {
                                    g9 = g8 != i8 ? g8 : 1;
                                }
                                int i12 = gbVar.c().f9407b - i11;
                                int d8 = gbVar.d() - i11;
                                CharSequence subSequence = spannableStringBuilder.subSequence(i12, d8);
                                spannableStringBuilder.delete(i12, d8);
                                spannableStringBuilder.setSpan(new a21(subSequence.toString(), g9), i9, i12, 33);
                                i11 += subSequence.length();
                                i9 = i12;
                            }
                            i10++;
                            i8 = -1;
                        }
                    } else if (hashCode != 98) {
                        if (hashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : hbVar.f9409d) {
                                Map map = f10950c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i7, length, 33);
                                } else {
                                    Map map2 = f10951d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i7, length, 33);
                                    }
                                }
                            }
                        } else if (hashCode != 117) {
                            if (hashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new d51(hbVar.f9408c), i7, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i7, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i7, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List h8 = h(list2, str, hbVar);
        for (int i13 = 0; i13 < h8.size(); i13++) {
            db dbVar = ((ib) h8.get(i13)).f9949r;
            if (dbVar != null) {
                if (dbVar.g() != -1) {
                    b31.a(spannableStringBuilder, new StyleSpan(dbVar.g()), i7, length, 33);
                }
                if (dbVar.h()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                }
                if (dbVar.p()) {
                    b31.a(spannableStringBuilder, new ForegroundColorSpan(dbVar.n()), i7, length, 33);
                }
                if (dbVar.s()) {
                    b31.a(spannableStringBuilder, new BackgroundColorSpan(dbVar.q()), i7, length, 33);
                }
                if (dbVar.l() != null) {
                    b31.a(spannableStringBuilder, new TypefaceSpan(dbVar.l()), i7, length, 33);
                }
                int v7 = dbVar.v();
                if (v7 == 1) {
                    b31.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dbVar.w(), true), i7, length, 33);
                } else if (v7 == 2) {
                    b31.a(spannableStringBuilder, new RelativeSizeSpan(dbVar.w()), i7, length, 33);
                } else if (v7 == 3) {
                    b31.a(spannableStringBuilder, new RelativeSizeSpan(dbVar.w() / 100.0f), i7, length, 33);
                }
                if (dbVar.A()) {
                    spannableStringBuilder.setSpan(new z01(), i7, length, 33);
                }
            }
        }
    }

    private static int g(List list, String str, hb hbVar) {
        List h8 = h(list, str, hbVar);
        for (int i7 = 0; i7 < h8.size(); i7++) {
            db dbVar = ((ib) h8.get(i7)).f9949r;
            if (dbVar.y() != -1) {
                return dbVar.y();
            }
        }
        return -1;
    }

    private static List h(List list, String str, hb hbVar) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            db dbVar = (db) list.get(i7);
            int f8 = dbVar.f(str, hbVar.f9406a, hbVar.f9409d, hbVar.f9408c);
            if (f8 > 0) {
                arrayList.add(new ib(f8, dbVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
