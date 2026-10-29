package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class uq5 implements zu5, mp5 {

    /* renamed from: a, reason: collision with root package name */
    private final long f16907a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f16908b;

    /* renamed from: c, reason: collision with root package name */
    private final ka4 f16909c;

    /* renamed from: d, reason: collision with root package name */
    private final sq5 f16910d;

    /* renamed from: e, reason: collision with root package name */
    private final p2 f16911e;

    /* renamed from: f, reason: collision with root package name */
    private final sg1 f16912f;

    /* renamed from: g, reason: collision with root package name */
    private final n3 f16913g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f16914h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16915i;

    /* renamed from: j, reason: collision with root package name */
    private long f16916j;

    /* renamed from: k, reason: collision with root package name */
    private cq3 f16917k;

    /* renamed from: l, reason: collision with root package name */
    private a4 f16918l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16919m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ dr5 f16920n;

    public uq5(dr5 dr5Var, Uri uri, yl3 yl3Var, sq5 sq5Var, p2 p2Var, sg1 sg1Var) {
        Objects.requireNonNull(dr5Var);
        this.f16920n = dr5Var;
        this.f16908b = uri;
        this.f16909c = new ka4(yl3Var);
        this.f16910d = sq5Var;
        this.f16911e = p2Var;
        this.f16912f = sg1Var;
        this.f16913g = new n3();
        this.f16915i = true;
        this.f16907a = op5.a();
        this.f16917k = i(0L);
    }

    private final cq3 i(long j7) {
        Map map;
        bp3 bp3Var = new bp3();
        bp3Var.a(this.f16908b);
        bp3Var.c(j7);
        bp3Var.d(6);
        map = dr5.f7267d0;
        bp3Var.b(map);
        return bp3Var.e();
    }

    @Override // com.google.android.gms.internal.ads.mp5
    public final void a(y82 y82Var) {
        long max = !this.f16919m ? this.f16916j : Math.max(this.f16920n.y(true), this.f16916j);
        int C = y82Var.C();
        a4 a4Var = this.f16918l;
        a4Var.getClass();
        a4Var.e(y82Var, C);
        a4Var.a(max, 1, C, 0, null);
        this.f16919m = true;
    }

    @Override // com.google.android.gms.internal.ads.zu5
    public final void b() {
        this.f16914h = true;
    }

    final /* synthetic */ void c(long j7, long j8) {
        this.f16913g.f12555a = j7;
        this.f16916j = j8;
        this.f16915i = true;
        this.f16919m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014c A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0160 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019e A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #3 {all -> 0x0092, blocks: (B:105:0x0060, B:107:0x0066, B:17:0x00a4, B:19:0x00af, B:20:0x00bb, B:22:0x00c5, B:23:0x00d1, B:25:0x00db, B:26:0x00e7, B:28:0x00f1, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:37:0x014c, B:38:0x0153, B:40:0x0160, B:42:0x0169, B:43:0x0184, B:45:0x0197, B:46:0x019a, B:48:0x019e, B:93:0x011d, B:96:0x013d, B:112:0x0072, B:115:0x0096), top: B:104:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[LOOP:0: B:2:0x0002->B:80:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01df A[EDGE_INSN: B:90:0x01df->B:69:0x01df BREAK  A[LOOP:1: B:50:0x01a6->B:61:0x01a6], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uq5.d():void");
    }

    final /* synthetic */ long e() {
        return this.f16907a;
    }

    final /* synthetic */ ka4 f() {
        return this.f16909c;
    }

    final /* synthetic */ long g() {
        return this.f16916j;
    }

    final /* synthetic */ cq3 h() {
        return this.f16917k;
    }
}
