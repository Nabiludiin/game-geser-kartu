package m1;

import android.os.Build;

/* compiled from: MyApplication */
public abstract class v {

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24753a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f24754b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f24755c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f24756d;

        static {
            int[] iArr = new int[e1.n.values().length];
            f24756d = iArr;
            try {
                iArr[e1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24756d[e1.n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e1.k.values().length];
            f24755c = iArr2;
            try {
                iArr2[e1.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24755c[e1.k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24755c[e1.k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24755c[e1.k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24755c[e1.k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[e1.a.values().length];
            f24754b = iArr3;
            try {
                iArr3[e1.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24754b[e1.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[e1.s.values().length];
            f24753a = iArr4;
            try {
                iArr4[e1.s.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24753a[e1.s.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24753a[e1.s.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24753a[e1.s.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24753a[e1.s.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24753a[e1.s.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(e1.a aVar) {
        int i7 = a.f24754b[aVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e1.c b(byte[] r6) {
        /*
            e1.c r0 = new e1.c
            r0.<init>()
            if (r6 != 0) goto L8
            goto L4e
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.a(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L4f
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L4e
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L4e
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L4f
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L37
            goto L2f
        L4e:
            return r0
        L4f:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r0 = move-exception
            r0.printStackTrace()
        L59:
            r1.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r0 = move-exception
            r0.printStackTrace()
        L61:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.v.b(byte[]):e1.c");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|6|7|8|(5:10|11|(2:14|12)|15|16)|17|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        r4.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(e1.c r4) {
        /*
            int r0 = r4.c()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            int r1 = r4.c()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            r2.writeInt(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            java.util.Set r4 = r4.b()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
        L21:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            if (r1 == 0) goto L46
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            e1.c$a r1 = (e1.c.a) r1     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            android.net.Uri r3 = r1.a()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            r2.writeUTF(r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            boolean r1 = r1.b()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            r2.writeBoolean(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            goto L21
        L40:
            r4 = move-exception
            r1 = r2
            goto L68
        L43:
            r4 = move-exception
            r1 = r2
            goto L5a
        L46:
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r4 = move-exception
            r4.printStackTrace()
        L4e:
            r0.close()     // Catch: java.io.IOException -> L52
            goto L63
        L52:
            r4 = move-exception
            r4.printStackTrace()
            goto L63
        L57:
            r4 = move-exception
            goto L68
        L59:
            r4 = move-exception
        L5a:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L63:
            byte[] r4 = r0.toByteArray()
            return r4
        L68:
            if (r1 == 0) goto L72
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r1 = move-exception
            r1.printStackTrace()
        L72:
            r0.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r0 = move-exception
            r0.printStackTrace()
        L7a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.v.c(e1.c):byte[]");
    }

    public static e1.a d(int i7) {
        if (i7 == 0) {
            return e1.a.EXPONENTIAL;
        }
        if (i7 == 1) {
            return e1.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to BackoffPolicy");
    }

    public static e1.k e(int i7) {
        if (i7 == 0) {
            return e1.k.NOT_REQUIRED;
        }
        if (i7 == 1) {
            return e1.k.CONNECTED;
        }
        if (i7 == 2) {
            return e1.k.UNMETERED;
        }
        if (i7 == 3) {
            return e1.k.NOT_ROAMING;
        }
        if (i7 == 4) {
            return e1.k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i7 == 5) {
            return e1.k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to NetworkType");
    }

    public static e1.n f(int i7) {
        if (i7 == 0) {
            return e1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i7 == 1) {
            return e1.n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to OutOfQuotaPolicy");
    }

    public static e1.s g(int i7) {
        if (i7 == 0) {
            return e1.s.ENQUEUED;
        }
        if (i7 == 1) {
            return e1.s.RUNNING;
        }
        if (i7 == 2) {
            return e1.s.SUCCEEDED;
        }
        if (i7 == 3) {
            return e1.s.FAILED;
        }
        if (i7 == 4) {
            return e1.s.BLOCKED;
        }
        if (i7 == 5) {
            return e1.s.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to State");
    }

    public static int h(e1.k kVar) {
        int i7 = a.f24755c[kVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        if (i7 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && kVar == e1.k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + kVar + " to int");
    }

    public static int i(e1.n nVar) {
        int i7 = a.f24756d[nVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + nVar + " to int");
    }

    public static int j(e1.s sVar) {
        switch (a.f24753a[sVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + sVar + " to int");
        }
    }
}
