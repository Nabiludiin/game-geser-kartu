package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class ia implements s9 {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f9928g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9929a;

    /* renamed from: b, reason: collision with root package name */
    private final ha f9930b;

    /* renamed from: d, reason: collision with root package name */
    private Map f9932d;

    /* renamed from: e, reason: collision with root package name */
    private float f9933e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    private float f9934f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    private final y82 f9931c = new y82();

    public ia(List list) {
        if (list == null || list.isEmpty()) {
            this.f9929a = false;
            this.f9930b = null;
            return;
        }
        this.f9929a = true;
        String F = hi2.F((byte[]) list.get(0));
        rx3.a(F.startsWith("Format:"));
        ha a8 = ha.a(F);
        a8.getClass();
        this.f9930b = a8;
        b(new y82((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final void b(y82 y82Var, Charset charset) {
        while (true) {
            String n7 = y82Var.n(charset);
            if (n7 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(n7)) {
                while (true) {
                    String n8 = y82Var.n(charset);
                    if (n8 != null && (y82Var.C() == 0 || y82Var.O(charset) != 91)) {
                        String[] split = n8.split(":");
                        if (split.length == 2) {
                            String a8 = zw3.a(split[0].trim());
                            switch (a8.hashCode()) {
                                case 1879649548:
                                    if (!a8.equals("playresx")) {
                                        break;
                                    } else {
                                        this.f9933e = Float.parseFloat(split[1].trim());
                                        break;
                                    }
                                case 1879649549:
                                    if (!a8.equals("playresy")) {
                                        break;
                                    } else {
                                        try {
                                            this.f9934f = Float.parseFloat(split[1].trim());
                                            break;
                                        } catch (NumberFormatException unused) {
                                            break;
                                        }
                                    }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(n7)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ja jaVar = null;
                while (true) {
                    String n9 = y82Var.n(charset);
                    if (n9 != null && (y82Var.C() == 0 || y82Var.O(charset) != 91)) {
                        if (n9.startsWith("Format:")) {
                            jaVar = ja.a(n9);
                        } else if (n9.startsWith("Style:")) {
                            if (jaVar == null) {
                                gv1.c("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(n9));
                            } else {
                                ma a9 = ma.a(n9, jaVar);
                                if (a9 != null) {
                                    linkedHashMap.put(a9.f12141a, a9);
                                }
                            }
                        }
                    }
                }
                this.f9932d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(n7)) {
                gv1.b("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(n7)) {
                return;
            }
        }
    }

    private static long c(String str) {
        Matcher matcher = f9928g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = hi2.f9535a;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float d(int i7) {
        if (i7 == 0) {
            return 0.05f;
        }
        if (i7 != 1) {
            return i7 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int e(long j7, List list, List list2) {
        int i7;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j7) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j7) {
                i7 = size + 1;
                break;
            }
        }
        list.add(i7, Long.valueOf(j7));
        list2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i7 - 1)));
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    @Override // com.google.android.gms.internal.ads.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(byte[] r23, int r24, int r25, com.google.android.gms.internal.ads.r9 r26, com.google.android.gms.internal.ads.th1 r27) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ia.a(byte[], int, int, com.google.android.gms.internal.ads.r9, com.google.android.gms.internal.ads.th1):void");
    }
}
