package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
public final class tp0 extends qp0 {

    /* renamed from: v, reason: collision with root package name */
    private static final Set f16277v = Collections.synchronizedSet(new HashSet());

    /* renamed from: w, reason: collision with root package name */
    private static final DecimalFormat f16278w = new DecimalFormat("#,###");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f16279x = 0;

    /* renamed from: t, reason: collision with root package name */
    private File f16280t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f16281u;

    public tp0(bo0 bo0Var) {
        super(bo0Var);
        File cacheDir = this.f14547q.getCacheDir();
        if (cacheDir == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(se3.a().a(cacheDir, "admobVideoStreams"));
        this.f16280t = file;
        if (!file.isDirectory() && !this.f16280t.mkdirs()) {
            String valueOf = String.valueOf(this.f16280t.getAbsolutePath());
            int i8 = v2.n1.f26802b;
            w2.p.f("Could not create preload cache directory at ".concat(valueOf));
            this.f16280t = null;
            return;
        }
        if (this.f16280t.setReadable(true, false) && this.f16280t.setExecutable(true, false)) {
            return;
        }
        String valueOf2 = String.valueOf(this.f16280t.getAbsolutePath());
        int i9 = v2.n1.f26802b;
        w2.p.f("Could not set cache file permissions at ".concat(valueOf2));
        this.f16280t = null;
    }

    private final File x(File file) {
        return new File(se3.a().a(this.f16280t, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x03cc, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03d4, code lost:
    
        if (w2.p.j(3) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03d6, code lost:
    
        r0 = r10.format(r4);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r34).length());
        r5.append(r17);
        r5.append(r0);
        r5.append(" bytes from ");
        r5.append(r34);
        w2.p.a(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0408, code lost:
    
        r13.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0412, code lost:
    
        if (r7.isFile() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0414, code lost:
    
        r7.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0420, code lost:
    
        r7.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0484  */
    @Override // com.google.android.gms.internal.ads.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(final java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tp0.g(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final void q() {
        this.f16281u = true;
    }
}
